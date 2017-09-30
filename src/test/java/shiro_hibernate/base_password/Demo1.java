package shiro_hibernate.base_password;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Assert;
import org.junit.Test;

public class Demo1 {
	
	@Test
	public void isit(){
		String str = "hello";
		String base64Encoded = Base64.encodeToString(str.getBytes());//����
		String str2 = Base64.decodeToString(base64Encoded);//��ԭ
		System.out.println(str2);
		System.out.println(base64Encoded);
		Assert.assertEquals(str, str2);//�Ƚ�
	}
	
	@Test
	public void isMd5(){
		String str = "hello";
		String salt = "123";
		String md5 = new Md5Hash(str, salt).toString();//������ת��Ϊ toBase64()/toHex()
		System.out.println(md5);
	}
	
	@Test
	public void isHash(){
		String str = "hello";
		String salt = "123";
		String sha1 = new Sha256Hash(str, salt).toString();
		System.out.println(sha1);
	}
	
	@Test
	public void isSha1(){
		String str = "hello";
		String salt = "123";
		//�ڲ�ʹ�� MessageDigest
		String simpleHash = new SimpleHash("SHA-1", str, salt).toString();
		System.out.println(simpleHash);
	}
}
