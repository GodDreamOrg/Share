/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/11/12 11:42:35                          */
/*==============================================================*/


drop table if exists T_APPLY_SWAP_ORDER;

drop index ORDER_HEAD_CODE on T_HEADER_ORDER;

drop table if exists T_HEADER_ORDER;

drop index LOGISTICS_ORDER_CODE on T_LOGISTICS_INFO;

drop index DISTRIBUTION_STATUS on T_LOGISTICS_INFO;

drop table if exists T_LOGISTICS_INFO;

drop index T_ORDER_SUPPLIER_CODE on T_ORDER;

drop index T_ORDER_MEMBER_ID on T_ORDER;

drop index T_ORDER_HEAD_CODE on T_ORDER;

drop index T_ORDER_CREATE_TIME on T_ORDER;

drop index T_ORDER_CODE on T_ORDER;

drop table if exists T_ORDER;

drop index ORDER_ITEM_CODE on T_ORDER_COUPON;

drop index COUPON_CODE on T_ORDER_COUPON;

drop table if exists T_ORDER_COUPON;

drop table if exists T_ORDER_ITEM;

drop table if exists T_ORDER_LOG;

drop index IDX_TSOP_ORDER_HEAD_CODE on T_ORDER_PAYMENT;

drop table if exists T_ORDER_PAYMENT;

drop table if exists T_REFUND_CERT;

drop index RETURN_GOODS_CODE on T_RETURN_GOODS;

drop index ORDER_CODE on T_RETURN_GOODS;

drop table if exists T_RETURN_GOODS;

drop index RETURN_GOODS_ITEM_ID on T_RETURN_GOODS_INFO;

drop table if exists T_RETURN_GOODS_INFO;

drop index RETURN_GOODS_ID on T_RETURN_GOODS_ITEM;

drop table if exists T_RETURN_GOODS_ITEM;

drop index REWARD_STATUS on T_REWARD_INFO;

drop index INDEX_BUS_CODE_REWARD on T_REWARD_INFO;

drop index CONFIRMED_TIME on T_REWARD_INFO;

drop table if exists T_REWARD_INFO;

drop index SETTLE_CERT_ORDER_CODE on T_SETTLE_CERT;

drop table if exists T_SETTLE_CERT;

/*==============================================================*/
/* Table: T_APPLY_SWAP_ORDER                                    */
/*==============================================================*/
create table T_APPLY_SWAP_ORDER
(
   ID                   bigint not null auto_increment comment '主键ID',
   ORDER_CODE           varchar(64) comment '订单编号（子项）',
   APPLY_BY             bigint comment '申请人',
   SKU_CODE             varchar(64) comment '商品skuCode',
   QUANTITY             int comment '数量',
   APPLY_REASON         varchar(1024) comment '申请换货原因',
   APPLY_TIME           datetime comment '申请时间',
   PROCESS_TIME         datetime comment '换货处理时间',
   PROCESS_BY           bigint comment '换货处理人',
   PROCESS_APPLY_COMMENT varchar(1024) comment '换货处理注释',
   AUDIT_STATUS         int comment '审核状态',
   OPER_STATUS          int comment '子站审核状态',
   primary key (ID)
);

alter table T_APPLY_SWAP_ORDER comment '换货';

/*==============================================================*/
/* Table: T_HEADER_ORDER                                        */
/*==============================================================*/
create table T_HEADER_ORDER
(
   ID                   bigint not null auto_increment comment '主键ID',
   MEMBER_ID            bigint comment '会员ID',
   MEMBER_NAME          varchar(128) comment '会员姓名',
   CASH_PRICE           decimal(19,2) comment '应付现金价格',
   POINT_PRICE          decimal(8,0) comment '应付积分价格',
   STATUS               int comment '订单状态',
   PAYMENT_SUCC_TIME    datetime comment '支付成功时间',
   PAYMENT_TYPE         int comment '支付类型（CHEXIANG_PAY ： 在线支付
            POINT_PAY ： 货到付款
            CX_PAY_OR_POINT ： 在线付款+货到付款
            CX_PAY_AND_POINT ： 积分支付',
   PAID_CASH            decimal(19,2) comment '实际支付的现金',
   PAID_POINT           decimal(8,0) comment '实际支付的积分',
   ORDER_SOURCE         varchar(20) comment '订单来源',
   ORDER_HEAD_CODE      varchar(64) comment '父订单编号',
   REDUCE_AMOUNT        decimal(19,2) comment '减免现金',
   REDUCE_POINT         decimal(8,0) comment '减免积分',
   PROMOTION_CODE       varchar(64) comment '促销编码',
   DEADLINE_TIME        datetime comment '订单支付有效时间',
   CREATE_TIME          datetime comment '创建时间',
   CREATE_BY            bigint comment '创建人',
   UPDATE_TIME          datetime comment '更新时间',
   UPDATE_BY            bigint comment '更新人',
   IS_DEDUCT_INVENTORY  int comment '是否扣减库存',
   EXECUTION_STATUS     int comment '执行状态',
   EXECUTION_NAME       varchar(128) comment '执行名称',
   SETTLE_STATUS        int comment '推送结算状态',
   primary key (ID)
);

alter table T_HEADER_ORDER comment '父订单表';

/*==============================================================*/
/* Index: ORDER_HEAD_CODE                                       */
/*==============================================================*/
create unique index ORDER_HEAD_CODE on T_HEADER_ORDER
(
   ORDER_HEAD_CODE
);

/*==============================================================*/
/* Table: T_LOGISTICS_INFO                                      */
/*==============================================================*/
create table T_LOGISTICS_INFO
(
   ID                   bigint not null auto_increment comment '主键ID',
   DELIVERY_NO          varchar(64) comment '物流单号',
   EMAIL                varchar(300) comment '邮箱',
   PROVINCE_CODE        varchar(20) comment '省code',
   CITY_CODE            varchar(20) comment '市code',
   RECEIVER_MOBILE      varchar(20) comment '收货人电话',
   RECEIVER_ADDRESS     varchar(500) comment '收货人地址',
   RECEIVER_NAME        varchar(50) comment '收货人姓名',
   LOGISTICS_COMPANY_NAME varchar(200) comment '物流公司名称',
   LOGISTICS_COMPANY_CODE varchar(64) comment '物流公司编号',
   DISTRIBUTION_TIME    datetime comment '发货时间',
   PROVINCE_DESCRIPTION varchar(200) comment '省中文描述',
   CITY_DESCRIPTION     varchar(200) comment '市中文描述',
   AREA_DESCRIPTION     varchar(200) comment '区(县)中文描述',
   DISTRIBUTION_MODE    int comment '配送方式',
   ORDER_CODE           varchar(64) comment '订单编号',
   DISTRIBUTION_STATUS  int comment '发货状态(未发货、备货中、已发货)',
   DISTRIBUTION_REMARK  varchar(1024) comment '发货备注',
   AREA_CODE            varchar(20) comment '区(县)CODE',
   ZIP_CODE             varchar(6) comment '邮编',
   CREATE_DATE          datetime comment '创建时间',
   primary key (ID)
);

alter table T_LOGISTICS_INFO comment '物流收货信息';

/*==============================================================*/
/* Index: DISTRIBUTION_STATUS                                   */
/*==============================================================*/
create index DISTRIBUTION_STATUS on T_LOGISTICS_INFO
(
   DISTRIBUTION_STATUS
);

/*==============================================================*/
/* Index: LOGISTICS_ORDER_CODE                                  */
/*==============================================================*/
create index LOGISTICS_ORDER_CODE on T_LOGISTICS_INFO
(
   ORDER_CODE
);

/*==============================================================*/
/* Table: T_ORDER                                               */
/*==============================================================*/
create table T_ORDER
(
   ID                   bigint not null auto_increment comment '主键',
   MEMBER_ID            bigint comment '会员ID',
   MEMBER_NAME          varchar(128) comment '会员姓名',
   RELATED_MEMBER_ID    varchar(64) comment 'OEM的SSOID',
   CHANNEL_TYPE         varchar(20) comment '渠道类型',
   POINT_PRICE          decimal(8,0) comment '应付积分价格',
   PAYMENT_STATUS       int comment '支付状态',
   MOBILE               varchar(20) comment '客户移动电话',
   CLIENT_EMAIL         varchar(300) comment '客户邮箱',
   FAIL_REASON          varchar(1024) comment '失败原因',
   STATUS               decimal(8,0) comment '订单状态',
   CASH_PRICE           decimal(19,2) comment '应付现金价格',
   PAYMENT_SUCC_TIME    datetime comment '支付成功时间',
   REMARK               varchar(1024) comment '备注',
   PAYMENT_TYPE         int comment '支付类型（CHEXIANG_PAY ： 车享付
            POINT_PAY ： 积分支付
            CX_PAY_OR_POINT ： 车享付+积分  自由比例混合
            CX_PAY_AND_POINT ： 车享付+积分 固定比例混合                      NO_PAY：不支付）',
   PAID_CASH            decimal(19,2) comment '实际支付现金',
   PAID_POINT           decimal(8,0) comment '实际支付积分',
   EXTERNAL_ORDER_CODE  varchar(100) comment '外部订单编号',
   ORDER_SOURCE         varchar(20) comment '订单来源',
   DISTRIBUTION_TYPE    int comment '配送方式  0:非物流   1:物流',
   ORDER_CODE           varchar(64) comment '订单编号',
   ORDER_HEAD_CODE      varchar(64) comment '父订单编号（合并支付凭证号）',
   STORE_CODE           varchar(50) comment '经销商Code-商户编号',
   STORE_NAME           varchar(200) comment '经销商名称-商户名称',
   IS_AFTER_SALES       int comment '是否申请售后',
   TOP_ACTUAL_ID        bigint comment '动态模型ID',
   ORDER_BUSINESS_TYPE  varchar(20) comment '订单业务类型',
   ORDER_TERMINAL       int comment '下单终端(PC,微信)',
   SUPPLIER_CODE        varchar(64) comment '供应商CODE',
   SUPPLIER_NAME        varchar(1024) comment '供应商名称',
   COMBINED_ORDER_CODE  varchar(64) comment '组合商品订单号',
   DEADLINE_TIME        datetime comment '订单支付有效时间',
   FREIGHT              decimal(19,2) comment '运费',
   CREATE_BY            bigint comment '创建人',
   CREATE_TIME          datetime default CURRENT_TIMESTAMP comment '创建时间',
   UPDATE_TIME          datetime comment '更新时间',
   UPDATE_BY            bigint comment '更新人',
   EXECUTION_STATUS     int comment '执行状态',
   EXECUTION_NAME       varchar(128) comment '执行名称',
   OFFLINE_STORE_CODE   varchar(64) comment '线下门店编码',
   OFFLINE_STORE_NAME   varchar(256) comment '线下门店名称',
   EXECUTE_STATUS       int comment '订单执行状态',
   primary key (ID)
);

alter table T_ORDER comment '订单主表';

/*==============================================================*/
/* Index: T_ORDER_CODE                                          */
/*==============================================================*/
create unique index T_ORDER_CODE on T_ORDER
(
   ORDER_CODE
);

/*==============================================================*/
/* Index: T_ORDER_CREATE_TIME                                   */
/*==============================================================*/
create index T_ORDER_CREATE_TIME on T_ORDER
(
   CREATE_TIME
);

/*==============================================================*/
/* Index: T_ORDER_HEAD_CODE                                     */
/*==============================================================*/
create index T_ORDER_HEAD_CODE on T_ORDER
(
   ORDER_HEAD_CODE
);

/*==============================================================*/
/* Index: T_ORDER_MEMBER_ID                                     */
/*==============================================================*/
create index T_ORDER_MEMBER_ID on T_ORDER
(
   MEMBER_ID
);

/*==============================================================*/
/* Index: T_ORDER_SUPPLIER_CODE                                 */
/*==============================================================*/
create index T_ORDER_SUPPLIER_CODE on T_ORDER
(
   SUPPLIER_CODE
);

/*==============================================================*/
/* Table: T_ORDER_COUPON                                        */
/*==============================================================*/
create table T_ORDER_COUPON
(
   ID                   bigint not null auto_increment comment '主键',
   ORDER_CODE           varchar(64) comment '订单Code',
   ORDER_ITEM_CODE      varchar(64) comment '订单子项编号',
   SKU_CODE             varchar(64) comment '商品skuCode',
   COUPON_CODE          varchar(20) comment '券码编号',
   COUPON_STATUS        int comment '券码状态',
   SERVICE_CODE         varchar(64) comment '服务商Code',
   SERVICE_NAME         varchar(300) comment '服务商名称',
   START_VALID_TIME     datetime comment '有效期开始时间',
   END_VALID_TIME       datetime comment '有效期结束时间',
   SOURCE               int comment '券码来源',
   COUPON_TYPE          int comment '券码类型 1、抵价劵  2、商品劵',
   SETTLE_STATUS        int comment '结算状态',
   CREATE_TIME          datetime comment '创建时间',
   CREATE_BY            bigint comment '创建人',
   UPDATE_TIME          datetime comment '更新时间',
   UPDATE_BY            bigint comment '更新人',
   primary key (ID)
);

alter table T_ORDER_COUPON comment '订单券码表';

/*==============================================================*/
/* Index: COUPON_CODE                                           */
/*==============================================================*/
create index COUPON_CODE on T_ORDER_COUPON
(
   COUPON_CODE
);

/*==============================================================*/
/* Index: ORDER_ITEM_CODE                                       */
/*==============================================================*/
create index ORDER_ITEM_CODE on T_ORDER_COUPON
(
   ORDER_ITEM_CODE
);

/*==============================================================*/
/* Table: T_ORDER_ITEM                                          */
/*==============================================================*/
create table T_ORDER_ITEM
(
   ID                   bigint not null comment 'ID',
   ORDER_CODE           varchar(64) comment '订单号',
   ORDER_HEAD_CODE      varchar(64) comment '父订单号',
   ORDER_ITEM_CODE      varchar(64) comment '订单详情编号',
   SKU_CODE             varchar(64) comment 'SKU_CODE',
   SPU_CODE             varchar(64) comment 'SPU_CODE',
   CATELOG_CODE         varchar(64) comment 'CATELOG_CODE',
   MDSE_NAME            varchar(128) comment '商品名称',
   BRAND_CODE           varchar(64) comment '品牌编号',
   BRAND_NAME           varchar(64) comment '品牌名称',
   CASH_PRICE           decimal(19.2) comment '现金单价',
   REAL_PRICE           decimal(19.2) comment '实际支付单价',
   POINT_PRICE          decimal(8.0) comment '积分单价',
   TOTAL_CASH_PRICE     decimal(19.2) comment '现金总价',
   TOTAL_REAL_PRICE     decimal(19.2) comment '实际支付总价',
   TOTAL_POINT_PRICE    decimal(8.0) comment '实际支付积分总价',
   QUANTITY             int comment '数量',
   CREATE_BY            bigint comment '创建人',
   CREATE_TIME          datetime comment '创建时间',
   UPDATE_BY            bigint comment '更新人',
   UPDATE_TIME          datetime comment '更新时间',
   primary key (ID)
);

alter table T_ORDER_ITEM comment '订单详情表';

/*==============================================================*/
/* Table: T_ORDER_LOG                                           */
/*==============================================================*/
create table T_ORDER_LOG
(
   ID                   bigint not null auto_increment comment '主键',
   ORDER_CODE           varchar(64) comment '订单编号',
   OPERATOR_ID          varchar(256) comment '操作人',
   OPERATOR_SOURCE      int comment '操作来源',
   OPERATION_TYPE       int comment '更新类型（1创建，2更新）',
   METHOD_NAME          varchar(1024) comment '被调用方法名',
   CREATE_BY            varchar(256) comment '创建人',
   CREATE_TIME          datetime comment '创建时间',
   UPDATE_BY            varchar(256) comment '更新人',
   UPDATE_TIME          datetime comment '更新时间',
   primary key (ID)
);

alter table T_ORDER_LOG comment '订单主表,操作日志表';

/*==============================================================*/
/* Table: T_ORDER_PAYMENT                                       */
/*==============================================================*/
create table T_ORDER_PAYMENT
(
   ID                   bigint not null auto_increment comment '主键',
   ORDER_HEAD_CODE      varchar(64) comment '父订单编号',
   PAYMENT_NO           varchar(64) comment '支付流水号',
   CX_CARD_NO           varchar(64) comment '卡号',
   PAY_AMOUNT           decimal(19,2) comment '实付金额',
   PAYMENT_TIME         datetime comment '支付时间',
   PAY_CHANNEL          int comment '支付渠道',
   CREATE_TIME          datetime comment '创建时间',
   COUPON_CODE          varchar(20) comment '抵价券号',
   PAY_TYPE             int comment '支付类型    1:抵价券支付、2:外部积分支付、3:内部积分支付、4:现金支付、5:车享金支付',
   PUSH_CLEARING_FLAG   int not null default 2 comment '是否推清结算标识 1、是  2、否',
   REVERSE_FLAG         int not null default 1 comment '是否逆向标识 1、是  2、否',
   IS_DISABLE           int not null default 0 comment '是否被禁用、是否被逻辑删除,0:否、1:是,该字段为空代表"否"',
   PAY_STATUS           int not null default 1 comment '状态:1:支付、2:锁定',
   primary key (ID)
);

alter table T_ORDER_PAYMENT comment '支付记录表';

/*==============================================================*/
/* Index: IDX_TSOP_ORDER_HEAD_CODE                              */
/*==============================================================*/
create index IDX_TSOP_ORDER_HEAD_CODE on T_ORDER_PAYMENT
(
   ORDER_HEAD_CODE
);

/*==============================================================*/
/* Table: T_REFUND_CERT                                         */
/*==============================================================*/
create table T_REFUND_CERT
(
   ID                   bigint not null auto_increment comment 'ID',
   BATCH_ID             varchar(50) comment '批次ID',
   CREATE_USERID        varchar(50) comment '创建人ID',
   ORDER_ID             bigint comment '订单编号',
   RELATE_ORDER_ID      varchar(50) comment '相关订单编号',
   ORDER_TYPE           int comment '退款类型',
   STATUS               int comment '退款状态(1:待退款(默认) 2:退款中  3:退款成功 4:退换失败)',
   MEMBER_ID            varchar(50) comment '会员编码',
   MEMBER_NAME          varchar(200) comment '会员姓名',
   CUST_EMAIL           varchar(50) comment '会员邮箱',
   MOBILE_NO            varchar(50) comment '手机号码',
   TRADE_EXPIRED        int comment '是否超期',
   BANK_NAME            varchar(150) comment '收款人开户行行名称',
   BANK_ACCOUNT         varchar(50) comment '收款人账号',
   PROVINCE_CODE        varchar(20) comment '省份code',
   CITY_CODE            varchar(20) comment '城市Code',
   MDSE_NAME            varchar(200) comment '商品名称',
   SUPPLIER_ID          varchar(20) comment '提供商ID',
   SUPPLIER_TYPE        varchar(20) comment '提供商类型',
   REFUND_POINT_AMOUNT  decimal(8,0) comment '退款积分',
   REFUND_CASH_AMOUNT   decimal(19,2) comment '退款金额',
   BANK_USER_NAME       varchar(50) comment '收款人姓名',
   ERROR_CODE           varchar(50) comment '错误代码',
   ERROR_MSG            varchar(500) comment '错误信息',
   ERROR_TIME           datetime comment '错误发生时间',
   REFUND_MSG           varchar(500) comment '退款反馈信息',
   REFUND_PROCESS_TIME  datetime comment '退款处理时间',
   POINT_AMOUNT         decimal(8,0) default 0 comment '子项积分',
   CASH_AMOUNT          decimal(19,2) default 0 comment '子项金额',
   REFUND_LAUNCH_TIME   datetime comment '退款创建时间',
   SPU_CODE             varchar(50) comment '商品CODE',
   RETURN_GOODS_ITEM_ID bigint comment '退货子项ID',
   SOUCE_TYPE           int comment '目标来源 1 取消 2、退货 3、撤回',
   ORDER_CODE           varchar(50) comment '订单编号',
   SKU_CODE             varchar(64),
   ORDER_ITEM_ID        varchar(20),
   COUPON_CODE          varchar(20) comment '券码编号',
   PAYMENT_NO           varchar(64) comment '支付流水号',
   primary key (ID)
);

/*==============================================================*/
/* Table: T_RETURN_GOODS                                        */
/*==============================================================*/
create table T_RETURN_GOODS
(
   ID                   bigint not null auto_increment comment '主键',
   RETURN_GOODS_CODE    varchar(64) comment '退货单号',
   ORDER_CODE           varchar(64) comment '订单号',
   RETURN_REASON        varchar(1024) comment '退货原因',
   ORDER_BUSINESS_TYPE  varchar(20) comment '订单业务类型',
   CHANNEL_TYPE         varchar(20) comment '渠道来源',
   MEMBER_ID            bigint comment '会员ID',
   MEMBER_NAME          varchar(128) comment '会员姓名',
   SUPPLIER_CODE        varchar(50) comment '供应商编号',
   SUPPLIER_NAME        varchar(200) comment '供应商名称',
   CREATE_DATE          datetime comment '创建时间',
   REMARK               varchar(1024) comment '备注',
   MOBILE               varchar(20),
   CREATE_BY            bigint,
   UPDATE_TIME          datetime,
   UPDATE_BY            bigint,
   primary key (ID)
);

alter table T_RETURN_GOODS comment '退货主表';

/*==============================================================*/
/* Index: ORDER_CODE                                            */
/*==============================================================*/
create index ORDER_CODE on T_RETURN_GOODS
(
   ORDER_CODE
);

/*==============================================================*/
/* Index: RETURN_GOODS_CODE                                     */
/*==============================================================*/
create index RETURN_GOODS_CODE on T_RETURN_GOODS
(
   RETURN_GOODS_CODE
);

/*==============================================================*/
/* Table: T_RETURN_GOODS_INFO                                   */
/*==============================================================*/
create table T_RETURN_GOODS_INFO
(
   ID                   bigint not null auto_increment comment '主键',
   RETURN_GOODS_ITEM_ID bigint comment '退货子项ID',
   REFUND_TYPE          int comment '退款类型（抵价券支付、2:外部积分支付、3:内部积分支付、4:现金支付、5:车享金支付）',
   REFUND_POINT         decimal(8,0) comment '退款积分',
   REFUND_CASH          decimal(19,2) comment '退款现金',
   REFUND_STATUS        int comment '退款状态',
   REFUND_SERIAL_NUMBER bigint comment '退款流水号',
   COUPON_CODE          varchar(20) comment '抵价券',
   ORDER_HEAD_CODE      varchar(64) comment '支付流水号',
   UPDATE_BY            bigint,
   CREATE_BY            bigint,
   UPDATE_TIME          datetime,
   CREATE_TIME          datetime,
   primary key (ID)
);

alter table T_RETURN_GOODS_INFO comment '退款信息';

/*==============================================================*/
/* Index: RETURN_GOODS_ITEM_ID                                  */
/*==============================================================*/
create index RETURN_GOODS_ITEM_ID on T_RETURN_GOODS_INFO
(
   RETURN_GOODS_ITEM_ID
);

/*==============================================================*/
/* Table: T_RETURN_GOODS_ITEM                                   */
/*==============================================================*/
create table T_RETURN_GOODS_ITEM
(
   ID                   bigint not null auto_increment comment '主键',
   RETURN_GOODS_ID      bigint comment '退货主表关联ID',
   SPU_CODE             varchar(64) comment '商品code',
   SKU_CODE             varchar(64) comment '商品规格code',
   MDSE_NAME            varchar(1024) comment '商品名称',
   QUANTITY             int comment '数量',
   RETURN_CASH          decimal(19,2) comment '退货金额',
   RETURN_POINT         decimal(8,0) comment '退货积分',
   AUDIT_STATUS         int comment '审核状态(pop，运营)',
   PRODUCT_SOURCE       int comment '商品录入方',
   ORDER_ITEM_CODE      varchar(64) not null comment '订单子项CODE',
   CASH_PRICE           decimal(19,2) comment '应付现金',
   POINT_PRICE          decimal(8,0) comment '应付积分',
   UPDATE_BY            bigint,
   CREATE_BY            bigint,
   UPDATE_TIME          datetime,
   CREATE_TIME          datetime,
   primary key (ID)
);

alter table T_RETURN_GOODS_ITEM comment '退货子项表';

/*==============================================================*/
/* Index: RETURN_GOODS_ID                                       */
/*==============================================================*/
create index RETURN_GOODS_ID on T_RETURN_GOODS_ITEM
(
   RETURN_GOODS_ID
);

/*==============================================================*/
/* Table: T_REWARD_INFO                                         */
/*==============================================================*/
create table T_REWARD_INFO
(
   ID                   bigint not null auto_increment comment '主键',
   REWARD_ORDER_TYPE    int comment '奖励业务类型（订单HEAD，订单，订单子项）',
   REWARD_TYPE          int comment '奖励类型（1礼品 2积分 3低价券）',
   BUSINESS_CODE        varchar(50) comment '业务编号(ORDER_HEAD_CODE,ORDER_CODE,ORDER_ITEM_CODE)',
   REWARD_AMOUNT        decimal(19,2) comment '金额，积分，券面值',
   REWARD_CODE          varchar(50) comment '奖励对象编号',
   REWARD_NAME          varchar(50) comment '奖励名称',
   REWARD_STATUS        int comment '奖励状态（1待确认，2已确认，3已完成 ,4奖励失败）',
   CONFIRMED_TIME       datetime comment '已确认时间 暂定为： 配送后15天 或 支付完成15天',
   CREATE_TIME          datetime comment '创建时间',
   UPDATE_TIME          datetime comment '更新时间',
   REWARD_DIRECTION     int comment '奖励方向  1、正向   2、逆向',
   CHANNEL_NO           varchar(50) comment '积分渠道一级',
   CHANNEL_SOURCE       varchar(50) comment '积分渠道二级',
   TRANSACTION_NO       varchar(50) comment '交易流水号',
   MEMBER_ID            bigint,
   BATCH_ID             varchar(50),
   primary key (ID)
);

/*==============================================================*/
/* Index: CONFIRMED_TIME                                        */
/*==============================================================*/
create index CONFIRMED_TIME on T_REWARD_INFO
(
   CONFIRMED_TIME
);

/*==============================================================*/
/* Index: INDEX_BUS_CODE_REWARD                                 */
/*==============================================================*/
create index INDEX_BUS_CODE_REWARD on T_REWARD_INFO
(
   BUSINESS_CODE
);

/*==============================================================*/
/* Index: REWARD_STATUS                                         */
/*==============================================================*/
create index REWARD_STATUS on T_REWARD_INFO
(
   REWARD_STATUS
);

/*==============================================================*/
/* Table: T_SETTLE_CERT                                         */
/*==============================================================*/
create table T_SETTLE_CERT
(
   ID                   bigint not null auto_increment comment 'id',
   BATCH_ID             varchar(50) comment '批次ID',
   ORDER_ID             bigint comment '订单id',
   RELATE_ORDER_ID      varchar(50) comment '相关订单编号',
   STATUS               int comment '结算状态（1：已生成结算单 2.已结算 3.审核拒绝 4.未生成结算单）',
   ORDER_ITEM_ID        varchar(100) comment '订单子项编号',
   MDSE_NAME            varchar(1024) comment '商品名称',
   SETTLOR_NAME         varchar(125) comment '结算方名称',
   SETTLOR_TYPE         int comment '结算方类型(1：供应商 2：经销商)',
   SETTLE_PRICE         decimal(18,2) comment '结算价',
   CASH_PRICE           decimal(18,2) comment '交易总金额',
   POINT_PRICE          decimal(8,0) comment '积分价',
   ORDER_STATUS         int comment '订单状态',
   MEMBER_NAME          varchar(125) comment '会员姓名',
   MEMBER_ID            bigint comment '会员编码',
   CUST_EMAIL           varchar(125) comment '邮箱',
   MOBILE_NO            varchar(20) comment '手机号码',
   SETTLE_TIME          datetime comment '结算时间',
   ORDER_TYPE           int comment '订单类型',
   CREATE_USER_ID       varchar(50) comment '创建人ID',
   ORDER_VERSION        int comment '订单版本号',
   SETTLOR_ID           varchar(50) comment '结算方ID',
   SETTLE_LAUNCH_TIME   datetime comment '结算发起时间',
   COMMISSION_PRICE     decimal(19,6) comment '合约价',
   CONTRACT_PRICE       decimal(19,6) comment '固定佣金比例',
   MSG                  varchar(1024) comment '反馈信息',
   PROCESS_TIME         datetime comment '处理时间',
   PRMT_NAME            varchar(512) comment '活动名称',
   BIZ_TYPE             int comment '1整车，2车享汇，3别克汇，4别克微信商城',
   SPU_CODE             varchar(50) comment '商品CODE',
   SETTLOR_CODE         varchar(50) comment '供应商CODE',
   ORDER_CODE           varchar(64),
   SKU_CODE             varchar(64),
   QUANTITY             int comment '结算数量',
   primary key (ID)
);

/*==============================================================*/
/* Index: SETTLE_CERT_ORDER_CODE                                */
/*==============================================================*/
create index SETTLE_CERT_ORDER_CODE on T_SETTLE_CERT
(
   ORDER_CODE
);

