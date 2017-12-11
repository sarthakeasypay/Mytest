package com.pojo;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class IMPSTransaction {

	
	@JsonProperty("CLIENTKEY")
	private String CLIENTKEY;
	
	@JsonProperty("MERCHANTID")
	private String MERCHANTID;
	
	@JsonProperty("CPTRANSID")
	private String CPTRANSID;
	
	@JsonProperty("AGENTID")
	private String AGENTID;
	
	@JsonProperty("TRANSTYPE")
	private String TRANSTYPE;
	
	@JsonProperty("CBSDEBIT")
	private String CBSDEBIT;
	
	@JsonProperty("DEBITACCOUNT")
	private String DEBITACCOUNT;
	
	@JsonProperty("CREDITACCOUNT")
	private String CREDITACCOUNT;
	
	@JsonProperty("OTP")
	private String OTP;
	
	@JsonProperty("BENEMOBILE")
	private String BENEMOBILE;
	
	@JsonProperty("BENEACCOUNT")
	private String BENEACCOUNT;
	
	@JsonProperty("BENEIFSC")
	private String BENEIFSC;
	
	@JsonProperty("TRANSAMOUNT")
	private String TRANSAMOUNT;
	
	@JsonProperty("SERVICECHARGE")
	private String SERVICECHARGE;
	
	@JsonProperty("SERVICETAX")
	private String SERVICETAX;
	
	@JsonProperty("REMARKS")
	private String REMARKS;
	
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
	public String getTRANSTYPE() {
		return TRANSTYPE;
	}
	public void setTRANSTYPE(String tRANSTYPE) {
		TRANSTYPE = tRANSTYPE;
	}
	public String getCBSDEBIT() {
		return CBSDEBIT;
	}
	public void setCBSDEBIT(String cBSDEBIT) {
		CBSDEBIT = cBSDEBIT;
	}
	public String getDEBITACCOUNT() {
		return DEBITACCOUNT;
	}
	public void setDEBITACCOUNT(String dEBITACCOUNT) {
		DEBITACCOUNT = dEBITACCOUNT;
	}
	public String getCREDITACCOUNT() {
		return CREDITACCOUNT;
	}
	public void setCREDITACCOUNT(String cREDITACCOUNT) {
		CREDITACCOUNT = cREDITACCOUNT;
	}
	public String getOTP() {
		return OTP;
	}
	public void setOTP(String oTP) {
		OTP = oTP;
	}
	public String getBENEMOBILE() {
		return BENEMOBILE;
	}
	public void setBENEMOBILE(String bENEMOBILE) {
		BENEMOBILE = bENEMOBILE;
	}
	public String getBENEACCOUNT() {
		return BENEACCOUNT;
	}
	public void setBENEACCOUNT(String bENEACCOUNT) {
		BENEACCOUNT = bENEACCOUNT;
	}
	public String getBENEIFSC() {
		return BENEIFSC;
	}
	public void setBENEIFSC(String bENEIFSC) {
		BENEIFSC = bENEIFSC;
	}
	public String getTRANSAMOUNT() {
		return TRANSAMOUNT;
	}
	public void setTRANSAMOUNT(String tRANSAMOUNT) {
		TRANSAMOUNT = tRANSAMOUNT;
	}
	public String getSERVICECHARGE() {
		return SERVICECHARGE;
	}
	public void setSERVICECHARGE(String sERVICECHARGE) {
		SERVICECHARGE = sERVICECHARGE;
	}
	public String getSERVICETAX() {
		return SERVICETAX;
	}
	public void setSERVICETAX(String sERVICETAX) {
		SERVICETAX = sERVICETAX;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
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
