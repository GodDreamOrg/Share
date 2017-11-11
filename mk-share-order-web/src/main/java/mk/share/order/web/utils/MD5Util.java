package mk.share.order.web.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密工具类
 *
 * @author wanghao
 * @create 2017-11-11 10:30
 */
public class MD5Util {

    private static final String MD5 = "MD5";
    public static final String UTF8 = "utf-8";

    public static String normalEncode(String str) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        // 确定计算方法
        MessageDigest md5=MessageDigest.getInstance(MD5);
        BASE64Encoder base64en = new BASE64Encoder();
        // 返回加密后的字符串
        byte[] bytes = md5.digest(str.getBytes(UTF8));
        StringBuffer md5StrBuff = new StringBuffer();


        for (int i = 0; i < bytes.length; i++) {
            if (Integer.toHexString(0xFF & bytes[i]).length() == 1)
                md5StrBuff.append("0").append(
                        Integer.toHexString(0xFF & bytes[i]));
            else
                md5StrBuff.append(Integer.toHexString(0xFF & bytes[i]));
        }
        System.out.println(md5StrBuff.toString());
        System.out.println(new String(bytes));
        return base64en.encode(bytes);
    }

    public static void main(String[] args) {
        try {
            String str = "总是向你索取 却不曾说谢谢你 ;" +
                    "直到长大以后 才懂得你不容易 ;" +
                    "每次离开总是 装作轻松的样子 ;" +
                    "微笑着说回去吧 转身泪湿眼底 ;" +
                    "多想和从前一样 牵你温暖手掌 ;" +
                    "可是你不在我身旁 托清风捎去安康 ;" +
                    "时光时光慢些吧 不要再让你变老了 ;" +
                    "我愿用我一切 换你岁月长留 ;" +
                    "一生要强的爸爸 我能为你做些什么 ;" +
                    "微不足道的关心 收下吧 ;" +
                    "谢谢你做的一切 双手撑起我们的家 ;" +
                    "总是竭尽所有 把最好的给我 ;" +
                    "我是你的骄傲吗 还在为我而担心吗 ;" +
                    "你牵挂的孩子啊 长大啦 ;" +
                    "多想和从前一样 牵你温暖手掌 ;" +
                    "可是你不在我身旁 托清风捎去安康 ;" +
                    "时光时光慢些吧 不要再让你变老了 ;" +
                    "我愿用我一切 换你岁月长留 ;" +
                    "一生要强的爸爸 我能为你做些什么 ;" +
                    "微不足道的关心 收下吧 ;" +
                    "谢谢你做的一切 双手撑起我们的家 ;" +
                    "总是竭尽所有 把最好的给我 ;" +
                    "我是你的骄傲吗 还在为我而担心吗 ;" +
                    "你牵挂的孩子啊 长大啦 ;" +
                    "时光时光慢些吧 不要再让你变老啦 ;" +
                    "我愿用我一切 换你岁月长留 ;" +
                    "我是你的骄傲吗 还在为我而担心吗 ;" +
                    "你牵挂的孩子啊 长大啦 ;" +
                    "感谢一路上有你";
            System.out.println(str);
            String result = MD5Util.normalEncode(str);
            System.out.println(result);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
