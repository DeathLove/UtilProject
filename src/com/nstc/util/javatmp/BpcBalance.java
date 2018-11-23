package com.nstc.util.javatmp;

import java.io.Serializable;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author shijiabo
 * 
 * @since：2018-10-25 下午03:04:00
 * 
 */
public class BpcBalance implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer ID;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	/** 公司编码  */
	public String BUKRS;
	
	/** 
	 * 会计年度
	 */
	public String GJAHR;
	/**
	 * 记账期间
	 */
	public String MONAT;
	/**
	 * 科目编码
	 */
	public String SAKNR;
	
	/** 费用类型编码 */
	public String FKBER;
	
	/** 本位币期初余额  */
	public String CAAMT;
	
	/** 本位币本期借方金额 */
	public String BDAMT;
	
	/** 本位币本期贷方金额*/
	public String BCAMT;
	
	/** 本位币期末余额 */
	public String CTAMT;
	
	/** 本位币币种 */
	public String LCURR;

	/** 交易货币期初余额 */
	public String TMBSL;
	
	/** 交易货币本期借方金额 */
	public String TMSOL;
	
	/** 交易货币期末累计余额*/
	public String TMMSL;
	
	/** 交易货币本期贷方金额 */
	public String TMHAB;
	
	/** 交易货币币种 */
	public String PSWSL;
	
	/** 内部编码 */
	public String ISNCD;

	public String getBUKRS() {
		return BUKRS;
	}

	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
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

	public String getSAKNR() {
		return SAKNR;
	}

	public void setSAKNR(String sAKNR) {
		SAKNR = sAKNR;
	}

	public String getFKBER() {
		return FKBER;
	}

	public void setFKBER(String fKBER) {
		FKBER = fKBER;
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

	public String getLCURR() {
		return LCURR;
	}

	public void setLCURR(String lCURR) {
		LCURR = lCURR;
	}

	public String getTMBSL() {
		return TMBSL;
	}

	public void setTMBSL(String tMBSL) {
		TMBSL = tMBSL;
	}

	public String getTMSOL() {
		return TMSOL;
	}

	public void setTMSOL(String tMSOL) {
		TMSOL = tMSOL;
	}

	public String getTMMSL() {
		return TMMSL;
	}

	public void setTMMSL(String tMMSL) {
		TMMSL = tMMSL;
	}

	public String getTMHAB() {
		return TMHAB;
	}

	public void setTMHAB(String tMHAB) {
		TMHAB = tMHAB;
	}

	public String getPSWSL() {
		return PSWSL;
	}

	public void setPSWSL(String pSWSL) {
		PSWSL = pSWSL;
	}

	public String getISNCD() {
		return ISNCD;
	}

	public void setISNCD(String iSNCD) {
		ISNCD = iSNCD;
	}
}
