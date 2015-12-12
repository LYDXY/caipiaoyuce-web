package com.web.utils;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.spec.DESKeySpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * DES加密介绍 DES是一种对称加密算法，所谓对称加密算法即：加密和解密使用相同密钥的算法。DES加密算法出自IBM的研究，
 * 后来被美国政府正式采用，之后开始广泛流传，但是近些年使用越来越少，因为DES使用56位密钥，以现代计算能力，
 * 24小时内即可被破解。虽然如此，在某些简单应用中，我们还是可以使用DES加密算法，本文简单讲解DES的JAVA实现 。
 * 注意：DES加密和解密过程中，密钥长度都必须是8的倍数
 */
public class DES {
	
	
	public static String crypt(String content, String password, int i) {
		try {
			KeyGenerator generator = KeyGenerator.getInstance("AES");
			generator.init(new SecureRandom(password.getBytes()));
			Key key = generator.generateKey();
			generator = null;
			if (i == 1) {
				return getEncString(content, key);
			} else if (i == 2) {
				return getDesString(content, key);
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	private static String getEncString(String strMing, Key key) {
		byte[] byteMi = null;
		byte[] byteMing = null;
		String strMi = "";
		BASE64Encoder base64en = new BASE64Encoder();
		try {
			byteMing = strMing.getBytes("UTF8");
			byteMi = getEncCode(byteMing, key);
			strMi = base64en.encode(byteMi);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			base64en = null;
			byteMing = null;
			byteMi = null;
		}
		return strMi;
	}

	private static String getDesString(String strMi, Key key) {
		BASE64Decoder base64De = new BASE64Decoder();
		byte[] byteMing = null;
		byte[] byteMi = null;
		String strMing = "";
		try {
			byteMi = base64De.decodeBuffer(strMi);
			byteMing = getDesCode(byteMi, key);
			strMing = new String(byteMing, "UTF8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			base64De = null;
			byteMing = null;
			byteMi = null;
		}
		return strMing;
	}

	private static byte[] getEncCode(byte[] byteS, Key key) {
		byte[] byteFina = null;
		Cipher cipher;
		try {
			cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byteFina = cipher.doFinal(byteS);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cipher = null;
		}
		return byteFina;
	}

	private static byte[] getDesCode(byte[] byteD, Key key) {
		Cipher cipher;
		byte[] byteFina = null;
		try {
			cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, key);
			byteFina = cipher.doFinal(byteD);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cipher = null;
		}
		return byteFina;
	}

	public static void main(String[] args) {
		String mi = DES.crypt("13023130171","中文", 1);
		System.out.println(mi);
		String ming = DES
				.crypt("GT+F0fcFNGiq73/+FaX9pK9n9zqxwqz9sZ7MQdSp1BxWJXWn7EwnvniQpAOaGi0W","bbbbb", 2);
		System.out.println(ming);
	}
}
