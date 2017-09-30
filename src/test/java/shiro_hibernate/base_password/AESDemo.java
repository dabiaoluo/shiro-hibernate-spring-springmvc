package shiro_hibernate.base_password;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.util.UUID;

import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.AesCipherService;
import org.junit.Assert;
import org.junit.Test;

public class AESDemo {
	
	@Test
	public void isit() throws UnsupportedEncodingException{
		AesCipherService aesCipherService = new AesCipherService();
		aesCipherService.setKeySize(128); //���� key ����
		//���� key
		Key key = aesCipherService.generateNewKey();
		String text = "hello";
		//����
		String encrptText = aesCipherService.encrypt(text.getBytes(), key.getEncoded()).toHex();
		//����
		String text2 = new String(aesCipherService.decrypt(Hex.decode(encrptText), key.getEncoded()).getBytes());
		System.out.println("key:"+new String(key.getEncoded(),"ISO8859-1").toString());
		System.out.println("����֮��:"+encrptText);
		System.out.println("����֮��:"+text2);
		Assert.assertEquals(text, text2);
	}
	
	@Test
	public void uuidKey(){
		String password = "123456";
		AesCipherService aesCipherService = new AesCipherService();
		aesCipherService.setKeySize(15); //���� key ����
		//key
		byte[] bs = UUID.randomUUID().toString().substring(0,15).getBytes();
		//���� 
		String encrptText = aesCipherService.encrypt(password.getBytes(),bs).toHex();
		//����
		String pass = new String(aesCipherService.decrypt(Hex.decode(encrptText),bs).getBytes());
		boolean flag = pass.equals(password);
		System.out.println("password:"+password);
		System.out.println("pass:"+pass);
		System.out.println(flag?"yes":"no");
	}
}
