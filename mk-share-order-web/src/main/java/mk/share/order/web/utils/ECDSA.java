package mk.share.order.web.utils;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import mk.share.order.web.constant.HelloConstant;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class ECDSA {  
    private static String src = "ecdsa security";  
    public static void main(String[] args) {  
        jdkECDSA();  
    }  
      
    public static void jdkECDSA(){  
        try {  
//            //1.初始化密钥
//            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
//            keyPairGenerator.initialize(256);
//            KeyPair keyPair = keyPairGenerator.generateKeyPair();
//            ECPublicKey ecPublicKey = (ECPublicKey)keyPair.getPublic();
//            ECPrivateKey ecPrivateKey = (ECPrivateKey)keyPair.getPrivate();

            //2.执行签名  
//            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(ecPrivateKey.getEncoded());
            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(ECCCoder.decryptBASE64(HelloConstant.PRIVATE_KEY));
            KeyFactory keyFactory = KeyFactory.getInstance("EC");  
            PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);  
            Signature signature = Signature.getInstance("SHA1withECDSA");  
            signature.initSign(privateKey);
            signature.update("5Y6f5aeL5pWw5o2uLeWbveWutuacuuWvhuS/oeaBrw==".getBytes());
            byte[] res = signature.sign();
            System.out.println("签名："+HexBin.encode(res));  
              
            //3.验证签名  
//            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(ecPublicKey.getEncoded());
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(ECCCoder.decryptBASE64(HelloConstant.PUBLIC_KEY));
            keyFactory = KeyFactory.getInstance("EC");
            PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);  
            signature = Signature.getInstance("SHA1withECDSA");  
            signature.initVerify(publicKey);
            signature.update("5Y6f5aeL5pWw5o2uLeWbveWutuacuuWvhuS/oeaBrw==".getBytes());
            boolean bool = signature.verify(res);
            System.out.println("验证："+bool);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
}