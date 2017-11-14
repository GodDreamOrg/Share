package mk.share.order.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import mk.share.order.web.vo.ParamVo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wanghao
 * @create 2017-11-13 16:39
 */
@Controller
@RequestMapping("/spring/")
public class SpringTestController {

    @RequestMapping(value = "noJosnConverter",method = RequestMethod.POST ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public JSONObject noJosnConverter(@RequestBody ParamVo paramVo){
        String jsonString = JSON.toJSONString(paramVo);
        System.out.println(jsonString);
        return JSON.parseObject(jsonString);
    }
}
