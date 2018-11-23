package com.nstc.util.javatmp;

import java.io.Serializable;

/**
 * 供应商余额表
 * @author shijiabo
 * @since：2018-10-29 下午06:32:39
 */
public class BpcSuBalance implements Serializable { 
	 /** 主键 */
	 private String ID;

	 /** 供应商编码 */
	 private String LIFNR;

	 /** 公司编码 */
	 private String BUKRS;

	 /** 科目编码 */
	 private String SAKNR;

	 /** 会计年度 */
	 private String GJAHR;

	 /** 记账期间 */
	 private String MONAT;

	 /** 本位币币种 */
	 private String LCURR;

	 /** 本位币期初余额 */
	 private String CAAMT;

	 /** 本位币本期借方金额 */
	 private String BDAMT;

	 /** 本位币本期贷方金额 */
	 private String BCAMT;

	 /** 本位币期末余额 */
	 private String CTAMT;

	 /** 内部编码 */
	 private String ISNCD;

	 /** 借/贷标识 */
	 private String SHKZG;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getLIFNR() {
		return LIFNR;
	}

	public void setLIFNR(String lIFNR) {
		LIFNR = lIFNR;
	}

	public String getBUKRS() {
		return BUKRS;
	}

	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
	}

	public String getSAKNR() {
		return SAKNR;
	}

	public void setSAKNR(String sAKNR) {
		SAKNR = sAKNR;
	}

	public String getGJAHR() {
		return GJAHR;
	}

	public void setGJAHR(String gJAHR) {
		GJAHR = gJAHR;
	}

	public String getMONAT() {
		return MONAT;
	}

	public void setMONAT(String mONAT) {
		MONAT = mONAT;
	}

	public String getLCURR() {
		return LCURR;
	}

	public void setLCURR(String lCURR) {
		LCURR = lCURR;
	}

	public String getCAAMT() {
		return CAAMT;
	}

	public void setCAAMT(String cAAMT) {
		CAAMT = cAAMT;
	}

	public String getBDAMT() {
		return BDAMT;
	}

	public void setBDAMT(String bDAMT) {
		BDAMT = bDAMT;
	}

	public String getBCAMT() {
		return BCAMT;
	}

	public void setBCAMT(String bCAMT) {
		BCAMT = bCAMT;
	}

	public String getCTAMT() {
		return CTAMT;
	}

	public void setCTAMT(String cTAMT) {
		CTAMT = cTAMT;
	}

	public String getISNCD() {
		return ISNCD;
	}

	public void setISNCD(String iSNCD) {
		ISNCD = iSNCD;
	}

	public String getSHKZG() {
		return SHKZG;
	}

	public void setSHKZG(String sHKZG) {
		SHKZG = sHKZG;
	}

}
