package com.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLDecoder;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class ApacheHttpClientPost {
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;

	public static String soap = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\"> <soapenv:Header/> <soapenv:Body> <tem:FundTransfer> <tem:lstrRequestData> "
			+ "{ \"USERID\":\"00001012202\", \"DATA\":\"#DATA# \"}"
			+ " </tem:lstrRequestData> </tem:FundTransfer> </soapenv:Body> </soapenv:Envelope>";
	
	public static String requerysoap ="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\"> <soapenv:Header/> <soapenv:Body> <tem:Requery> <tem:lstrRequestData>{ \"USERID\":\"#USERUID#\", \"DATA\":\"#DATA#\" }</tem:lstrRequestData> </tem:Requery> </soapenv:Body> </soapenv:Envelope>";

	public static void call(String data) {

		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost("https://uatsky.yesbank.in/app/uat/PMPIMPSFundsTransfer");

			String requestData = soap.replaceAll("#DATA#", data);
			StringEntity input = new StringEntity(requestData);

			postRequest.setEntity(input);

			postRequest.setHeader("Content-Type", "text/xml");
			postRequest.setHeader("X-IBM-Client-Id", "493bdbcd-7bae-4d00-a308-743f8eff6c6d");
			postRequest.setHeader("X-IBM-Client-Secret", "tI4kT3lX1lP8sC5vT2hY1uP7yA7vK3nD7fF8yT6rN1yM8gT3bQ");
			postRequest.setHeader("Authorization", "Basic dGVzdGNsaWVudDp0ZXN0QDEyMw==");

			HttpResponse response = httpClient.execute(postRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}
			String output = IOUtils.toString(response.getEntity().getContent());

			try {
				JSONObject xmlJSONObj = XML.toJSONObject(output);
				String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
				System.out.println(jsonPrettyPrintString);

			/*	System.out.println("decrypted String::1"
						+ Encryptor.decrypt(URLDecoder.decode(xmlJSONObj.getJSONObject("soap:Envelope").getJSONObject("soap:Body")
								.getJSONObject("FundTransferResponse").getString("FundTransferResult"))));*/

				JSONArray responseArr = new JSONArray(
						Encryptor.decrypt(xmlJSONObj.getJSONObject("soap:Envelope").getJSONObject("soap:Body")
								.getJSONObject("FundTransferResponse").getString("FundTransferResult")));

				JSONObject jsObj = (JSONObject) responseArr.get(0);

				System.out.println(jsObj.toString());
				// System.out.println("decrypted
				// String::1"+Encryptor.decrypt(URLDecoder.decode(xmlJSONObj.getJSONObject("soap:Envelope").getJSONObject("soap:Body").getJSONObject("FundTransferResponse").getString("FundTransferResult"))));
			} catch (JSONException je) {
				System.out.println(je.toString());
			}

			httpClient.getConnectionManager().shutdown();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}