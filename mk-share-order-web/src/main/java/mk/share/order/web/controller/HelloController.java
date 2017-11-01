package mk.share.order.web.controller;

import mk.share.order.web.constant.HelloConstant;
import mk.share.order.web.utils.ECCCoder;
import mk.share.order.web.vo.PhysicVo;
import mk.share.order.web.vo.RequestVo;
import mk.share.order.web.vo.ResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * hello
 *
 * @author wanghao
 * @create 2017-09-10 13:35
 */
@Controller
public class HelloController {

    @RequestMapping("/hello/index.htm")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value="/devECC.do",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResultVo<PhysicVo> dev(@RequestBody RequestVo requestVo) {
        ResultVo<PhysicVo> resultVo = new ResultVo<PhysicVo>();
        // check param
        String data = requestVo.getData();
        String publicKey = requestVo.getPublicKey();
        String signature = requestVo.getSignature();
        if (StringUtils.isEmpty(data) ||
                StringUtils.isEmpty(publicKey) ||
                StringUtils.isEmpty(signature)){
            resultVo.setRetCode("100001");
            resultVo.setRetMessage("参数错误");
            return resultVo;
        }
        try {

            // 验签
            boolean verify = ECCCoder.verify(data.getBytes(), publicKey, signature);

            System.out.println(String.format("验签结果：%s",verify));

            if (verify) {
                System.out.println("验签成功。。。");
                String decrypt = ECCCoder.decrypt(data, HelloConstant.PRIVATE_KEY).toString();
                System.out.println(String.format("获得解密后数据:",decrypt));

                // 操作数据并返回结果
                System.out.println("省略。。。。");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        String data = "原始数据-国家机密信息";
        System.out.println(String.format("原始数据:%s",data));

        // 生成加密数据
        String encryptData = ECCCoder.encrypt(data.getBytes(), HelloConstant.PUBLIC_KEY);
        System.out.println(String.format("加密数据:%s",encryptData));

        // 生成签名
        String signature = ECCCoder.generate(HelloConstant.PRIVATE_KEY, encryptData.getBytes());
        System.out.println(String.format("生成签名:%s",signature));

        // 创建入参
        RequestVo requestVo = new RequestVo();
        requestVo.setData(encryptData);
        requestVo.setPublicKey(HelloConstant.PUBLIC_KEY);
        requestVo.setSignature(signature);

        // 模拟调用controller 获得返回结果
        HelloController controller = new HelloController();
        ResultVo<PhysicVo> dev = controller.dev(requestVo);
    }

}
