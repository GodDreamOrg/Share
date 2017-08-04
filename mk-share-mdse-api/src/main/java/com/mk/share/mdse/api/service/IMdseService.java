package com.mk.share.mdse.api.service;

import com.mk.share.mdse.api.vo.MdseVo;

import java.util.List;

/**
 * 商品接口
 *
 * @author wanghao
 * @create 2017-08-02 19:33
 */
public interface IMdseService {
    List<MdseVo> queryAllMdseVO();
}
