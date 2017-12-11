package com.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.PropertyNamingStrategy;
import org.json.JSONArray;
import org.json.JSONObject;

import com.pojo.IMPSTransaction;

public class Encryptor {

	public static String key = "B897#&250136/WEE01254812"; // 128 bit key
	
	public static byte[] initVector ={ 8, 7, 5, 6, 4, 1, 2, 3, 18, 17, 15, 16, 14, 11, 12, 13 };
			//new byte[] { (byte) 8, (byte) 7, (byte) 5, (byte) 6, (byte) 4, (byte) 1, (byte) 2,
			//(byte) 3, (byte) 18, (byte) 17, (byte) 15, (byte) 16, (byte) 14, (byte) 11, (byte) 12, (byte) 13 };// RandomInitVector";
																												// // 16
																												// bytes
																												// IV

	public static String encrypt(String value) {
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector);
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal(value.getBytes());

			return new String(Base64.encodeBase64(encrypted));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public static String decrypt(String encrypted) {
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector);
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

			byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted.getBytes()));

			return new String(original);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		/*String instr="8, 7, 5, 6, 4, 1, 2, 3, 18, 17, 15, 16, 14, 11, 12, 13 ";

		String dataArray[] = instr.split(",");
	    byte[] bytes = new byte[dataArray.length];
	    int count = 0;
	    for(String str : dataArray)
	    {
	        bytes[count++] = Byte.parseByte(str.trim());
	    }
		*/
String s ="testclient:test@123";
		
		//String encoding = Base64.encodeBase64String(s.getBytes());
       // System.out.println(encoding);
		ObjectMapper mapper = new ObjectMapper();
		IMPSTransaction iMPSTransaction = new IMPSTransaction();

		// iMPSTransaction.setCLIENTKEY("5678910");
		iMPSTransaction.setCLIENTKEY("145118225");
		// iMPSTransaction.setMERCHANTID("1");

		iMPSTransaction.setMERCHANTID("1988");
		iMPSTransaction.setCPTRANSID("426730862161");
		iMPSTransaction.setAGENTID("1988");
		iMPSTransaction.setTRANSTYPE("2");
		iMPSTransaction.setCBSDEBIT("1");
		iMPSTransaction.setDEBITACCOUNT("041990600012876");
		iMPSTransaction.setCREDITACCOUNT("414010601");
		/*iMPSTransaction.setDEBITACCOUNT("041990600012876");
		iMPSTransaction.setCREDITACCOUNT("414010601");*/
		iMPSTransaction.setOTP("0");
		
		iMPSTransaction.setBENEMOBILE("919492174134");
		iMPSTransaction.setBENEIFSC("SBIN0012345");
		iMPSTransaction.setBENEACCOUNT("123786781234");
		
		iMPSTransaction.setTRANSAMOUNT("100");
		iMPSTransaction.setSERVICECHARGE("0");
		iMPSTransaction.setSERVICETAX("0");
		iMPSTransaction.setREMARKS("P2A Testing");
		iMPSTransaction.setPARAM1("");
		
		iMPSTransaction.setPARAM2("");
		iMPSTransaction.setPARAM3("");
		iMPSTransaction.setPARAM4("");
		iMPSTransaction.setPARAM5("");

		
		String jsonInString = mapper.writeValueAsString(iMPSTransaction);

		JSONObject transactionDetailObject = new JSONObject(jsonInString);
		JSONObject transactionRequestObject = new JSONObject();
		JSONArray transactionArr = new JSONArray();

		transactionArr.put(transactionDetailObject);

		transactionRequestObject.put("TRANSACTION", transactionArr);
		//System.out.println("----->" + transactionRequestObject.toString());

		//System.out.println(encrypt(transactionRequestObject.toString()));

		ApacheHttpClientPost.call(encrypt(transactionRequestObject.toString()));
		//System.out.println(decrypt("18z/oJc672lfyz3181IPrOu+vvJ5eNaNXhI5055BCrCj7seSzndCPbfOK1S7M67cBI61fzov30bUpS4CFlBiT0LNAYpo8zH/238BeWED34pv1XxJ2JWY5mER8P5ffRjcdN/WOu9t9IBdEPosQArXL8MaTxxjQnxPIDj3pHhllSO0fda+ZBfFRMWzCVmtJdTleoq6TFJPwsbSHCtROnqqtoE9RmhNdUMBRk/gJ0NM3JTmF1GTgPCptHFebxjCuZVKLRXE7v0hfmgh6Ub/sv7Sqkx/wDsiFtpf3gbLaYLoA/d0Fc45L9xUyqNgoEh08seLi9yHMIXoXdn1wGTTF78IXO62gR/67H6ETe7wHx69G6QKzhkLIBZRd6WM+StcH6hzR5QyUK4V18GprsB7wocvtlRFplNBj3Tc08tbazSn2D3ozSCLhCfzqa24L+1azls60iEvjwHiBmOOlbTcgnGUrkq344lf3YCDUZkM6+w3ZwDemx+FZggwTIl2/zFjiNH6G1geGHMDJ9tdha4Eil32aPwlaMbWedw1dCYU3qNjTRbSY6JVCuEG5aZUBVjtAcdYzZeTVRH4iGRfmJsJz++aTqssc2z5/6J5ebq0Boj0EDw="));
	//	System.out.println(decrypt("lP+sow9Tumm7aI35levuMzIUO6iwc4iaNEY5eRHRgfV4GUHrHJbXED/0kKytv5/pevPkXlhxCyagSuNOdhEs94wWnzVBQxh1oTHhd2utpNH8LalrmsfEtidJ59in1bmNkBYRHOEiqeUcWDi2EozDgqxC7u1uGdWs+277Dd7ve39/DWEnyF1cQCxuUWA4OHaIAJP68BW+hHK+eXrb5E2N7A=="));
	}
}