package com.mk.share.mdse.service.impl;

import com.mk.share.mdse.api.service.IMdseService;
import com.mk.share.mdse.api.vo.MdseVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品服务实现
 *
 * @author MonkeyKing
 * @create 2017-08-03 16:20
 */
@Service("mdseService")
public class MdseServiceImpl implements IMdseService{

    @Override
    public List<MdseVo> queryAllMdseVO() {
        List<MdseVo> mdseVoList = new ArrayList<>();
        MdseVo mdseVo = new MdseVo();
        mdseVo.setMdseCode("123");
        mdseVo.setMdseName("高达");
        mdseVoList.add(mdseVo);
        return mdseVoList;
    }
}
