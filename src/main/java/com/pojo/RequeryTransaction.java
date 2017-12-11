package com.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

public class RequeryTransaction {
	
	@JsonProperty("CLIENTKEY")
	private String CLIENTKEY;
	
	@JsonProperty("MERCHANTID")
	private String MERCHANTID;
	
	@JsonProperty("CPTRANSID")
	private String CPTRANSID;
	
	@JsonProperty("AGENTID")
	private String AGENTID;
	
	@JsonProperty("PARAM1")
	private String PARAM1;
	
	@JsonProperty("PARAM2")
	private String PARAM2;
	
	@JsonProperty("PARAM3")
	private String PARAM3;
	
	@JsonProperty("PARAM4")
	private String PARAM4;
	
	@JsonProperty("PARAM5")
	private String PARAM5;
	
	public String getCLIENTKEY() {
		return CLIENTKEY;
	}
	public void setCLIENTKEY(String cLIENTKEY) {
		CLIENTKEY = cLIENTKEY;
	}
	public String getMERCHANTID() {
		return MERCHANTID;
	}
	public void setMERCHANTID(String mERCHANTID) {
		MERCHANTID = mERCHANTID;
	}
	public String getCPTRANSID() {
		return CPTRANSID;
	}
	public void setCPTRANSID(String cPTRANSID) {
		CPTRANSID = cPTRANSID;
	}
	public String getAGENTID() {
		return AGENTID;
	}
	public void setAGENTID(String aGENTID) {
		AGENTID = aGENTID;
	}
	public String getPARAM1() {
		return PARAM1;
	}
	public void setPARAM1(String pARAM1) {
		PARAM1 = pARAM1;
	}
	public String getPARAM2() {
		return PARAM2;
	}
	public void setPARAM2(String pARAM2) {
		PARAM2 = pARAM2;
	}
	public String getPARAM3() {
		return PARAM3;
	}
	public void setPARAM3(String pARAM3) {
		PARAM3 = pARAM3;
	}
	public String getPARAM4() {
		return PARAM4;
	}
	public void setPARAM4(String pARAM4) {
		PARAM4 = pARAM4;
	}
	public String getPARAM5() {
		return PARAM5;
	}
	public void setPARAM5(String pARAM5) {
		PARAM5 = pARAM5;
	}
	
	


}
