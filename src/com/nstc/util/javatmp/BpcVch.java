package com.nstc.util.javatmp;

import java.util.Date;

public class BpcVch {
	/** 主键id */
	private Integer ID;
	/**公司编码*/
	private String BUKRS;
	/**凭证编号*/
	private String BELNR;
	/**会计年度*/
	private Integer GJAHR;
	/**凭证类型*/
	private String BLART;
	/**记账期间*/
	private Integer MONAT;
	/**业务日期*/
	private Date BLDAT;
	/**记账日期*/
	private Date BUDAT;
	/**输入日期*/
	private Date CPUDT;
	/**记账人*/
	private String USNAM;
	/**凭证抬头文本*/	
	private String BKTXT;
	/**汇率*/
	private Double KURSF;
	/**本位币币种*/
	private String LCURR;
	/**行项目号*/
	private Integer BUZEI;
	/**借/贷标识*/
	private String SHKZG;
	/**科目编码*/
	private String SAKNR;
	/**本位币金额*/
	private Double DMBTR;
	/**交易货币金额*/
	private Double WRBTR;
	/**交易货币币种*/
	private String PSWSL;
	/**行项目文本*/
	private String SGTXT;
	/**项目类型*/
	private String AUART;
	/**项目维度编码*/
	private String POSNR;
	/**成本中心编码*/
	private String KOSTL;
	/**现金流量编码*/
	private String RSTGR;
	/**利润中心编码*/
	private String PRCTR;
	/**费用类型编码*/
	private String FKBER;
	/**变动类型编码*/
	private String ANBWA;
	/**客户编码*/
	private String KUNNR;
	/**供应商编码*/
	private String LIFNR;
	/**员工编码*/
	private String PERNR;
	/**时戳 (YYYYMMDDhhmmss)*/
	private String TIMESTAMP;
	/**凭证状态*/
	private String BSTAT;
	/**标识符: 删除数据记录*/
	private String DELFLG;
	/**标识符: 作废数据记录*/
	private String NULFLG;
	/**内部编码*/
	private String ISNCD;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getBUKRS() {
		return BUKRS;
	}
	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
	}
	public String getBELNR() {
		return BELNR;
	}
	public void setBELNR(String bELNR) {
		BELNR = bELNR;
	}
	public Integer getGJAHR() {
		return GJAHR;
	}
	public void setGJAHR(Integer gJAHR) {
		GJAHR = gJAHR;
	}
	public String getBLART() {
		return BLART;
	}
	public void setBLART(String bLART) {
		BLART = bLART;
	}
	public Integer getMONAT() {
		return MONAT;
	}
	public void setMONAT(Integer mONAT) {
		MONAT = mONAT;
	}
	public Date getBLDAT() {
		return BLDAT;
	}
	public void setBLDAT(Date bLDAT) {
		BLDAT = bLDAT;
	}
	public Date getBUDAT() {
		return BUDAT;
	}
	public void setBUDAT(Date bUDAT) {
		BUDAT = bUDAT;
	}
	public Date getCPUDT() {
		return CPUDT;
	}
	public void setCPUDT(Date cPUDT) {
		CPUDT = cPUDT;
	}
	public String getUSNAM() {
		return USNAM;
	}
	public void setUSNAM(String uSNAM) {
		USNAM = uSNAM;
	}
	public String getBKTXT() {
		return BKTXT;
	}
	public void setBKTXT(String bKTXT) {
		BKTXT = bKTXT;
	}
	public Double getKURSF() {
		return KURSF;
	}
	public void setKURSF(Double kURSF) {
		KURSF = kURSF;
	}
	public String getLCURR() {
		return LCURR;
	}
	public void setLCURR(String lCURR) {
		LCURR = lCURR;
	}
	public Integer getBUZEI() {
		return BUZEI;
	}
	public void setBUZEI(Integer bUZEI) {
		BUZEI = bUZEI;
	}
	public String getSHKZG() {
		return SHKZG;
	}
	public void setSHKZG(String sHKZG) {
		SHKZG = sHKZG;
	}
	public String getSAKNR() {
		return SAKNR;
	}
	public void setSAKNR(String sAKNR) {
		SAKNR = sAKNR;
	}
	public Double getDMBTR() {
		return DMBTR;
	}
	public void setDMBTR(Double dMBTR) {
		DMBTR = dMBTR;
	}
	public Double getWRBTR() {
		return WRBTR;
	}
	public void setWRBTR(Double wRBTR) {
		WRBTR = wRBTR;
	}
	public String getPSWSL() {
		return PSWSL;
	}
	public void setPSWSL(String pSWSL) {
		PSWSL = pSWSL;
	}
	public String getSGTXT() {
		return SGTXT;
	}
	public void setSGTXT(String sGTXT) {
		SGTXT = sGTXT;
	}
	public String getAUART() {
		return AUART;
	}
	public void setAUART(String aUART) {
		AUART = aUART;
	}
	public String getPOSNR() {
		return POSNR;
	}
	public void setPOSNR(String pOSNR) {
		POSNR = pOSNR;
	}
	public String getKOSTL() {
		return KOSTL;
	}
	public void setKOSTL(String kOSTL) {
		KOSTL = kOSTL;
	}
	public String getRSTGR() {
		return RSTGR;
	}
	public void setRSTGR(String rSTGR) {
		RSTGR = rSTGR;
	}
	public String getPRCTR() {
		return PRCTR;
	}
	public void setPRCTR(String pRCTR) {
		PRCTR = pRCTR;
	}
	public String getFKBER() {
		return FKBER;
	}
	public void setFKBER(String fKBER) {
		FKBER = fKBER;
	}
	public String getANBWA() {
		return ANBWA;
	}
	public void setANBWA(String aNBWA) {
		ANBWA = aNBWA;
	}
	public String getKUNNR() {
		return KUNNR;
	}
	public void setKUNNR(String kUNNR) {
		KUNNR = kUNNR;
	}
	public String getLIFNR() {
		return LIFNR;
	}
	public void setLIFNR(String lIFNR) {
		LIFNR = lIFNR;
	}
	public String getPERNR() {
		return PERNR;
	}
	public void setPERNR(String pERNR) {
		PERNR = pERNR;
	}
	public String getTIMESTAMP() {
		return TIMESTAMP;
	}
	public void setTIMESTAMP(String tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}
	public String getBSTAT() {
		return BSTAT;
	}
	public void setBSTAT(String bSTAT) {
		BSTAT = bSTAT;
	}
	public String getDELFLG() {
		return DELFLG;
	}
	public void setDELFLG(String dELFLG) {
		DELFLG = dELFLG;
	}
	public String getNULFLG() {
		return NULFLG;
	}
	public void setNULFLG(String nULFLG) {
		NULFLG = nULFLG;
	}
	public String getISNCD() {
		return ISNCD;
	}
	public void setISNCD(String iSNCD) {
		ISNCD = iSNCD;
	}
	
	
	

}