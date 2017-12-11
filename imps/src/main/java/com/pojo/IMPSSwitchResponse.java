package com.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

public class IMPSSwitchResponse {
	
	@JsonProperty("STATUSCODE")
	private String STATUSCODE;
	
	@JsonProperty("STATUS")
	private String STATUS;
	
	@JsonProperty("RRN")
	private String RRN;
	
	@JsonProperty("RESPONSECODE")
	private String RESPONSECODE;
	
	@JsonProperty("RESPONSEDESC")
	private String RESPONSEDESC;
	
	@JsonProperty("CPTRANSID")
	private String CPTRANSID;
	
	@JsonProperty("BENENAME")
	private String BENENAME;
	
	public String getSTATUSCODE() {
		return STATUSCODE;
	}
	public void setSTATUSCODE(String sTATUSCODE) {
		STATUSCODE = sTATUSCODE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getRRN() {
		return RRN;
	}
	public void setRRN(String rRN) {
		RRN = rRN;
	}
	public String getRESPONSECODE() {
		return RESPONSECODE;
	}
	public void setRESPONSECODE(String rESPONSECODE) {
		RESPONSECODE = rESPONSECODE;
	}
	public String getRESPONSEDESC() {
		return RESPONSEDESC;
	}
	public void setRESPONSEDESC(String rESPONSEDESC) {
		RESPONSEDESC = rESPONSEDESC;
	}
	public String getCPTRANSID() {
		return CPTRANSID;
	}
	public void setCPTRANSID(String cPTRANSID) {
		CPTRANSID = cPTRANSID;
	}
	public String getBENENAME() {
		return BENENAME;
	}
	public void setBENENAME(String bENENAME) {
		BENENAME = bENENAME;
	}
	
	

}
