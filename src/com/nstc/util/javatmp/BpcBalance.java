package com.nstc.util.javatmp;

import java.io.Serializable;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: �����ź��ǿƼ��ɷ����޹�˾</p>
 *
 * @author shijiabo
 * 
 * @since��2018-10-25 ����03:04:00
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

	/** ��˾����  */
	public String BUKRS;
	
	/** 
	 * ������
	 */
	public String GJAHR;
	/**
	 * �����ڼ�
	 */
	public String MONAT;
	/**
	 * ��Ŀ����
	 */
	public String SAKNR;
	
	/** �������ͱ��� */
	public String FKBER;
	
	/** ��λ���ڳ����  */
	public String CAAMT;
	
	/** ��λ�ұ��ڽ跽��� */
	public String BDAMT;
	
	/** ��λ�ұ��ڴ������*/
	public String BCAMT;
	
	/** ��λ����ĩ��� */
	public String CTAMT;
	
	/** ��λ�ұ��� */
	public String LCURR;

	/** ���׻����ڳ���� */
	public String TMBSL;
	
	/** ���׻��ұ��ڽ跽��� */
	public String TMSOL;
	
	/** ���׻�����ĩ�ۼ����*/
	public String TMMSL;
	
	/** ���׻��ұ��ڴ������ */
	public String TMHAB;
	
	/** ���׻��ұ��� */
	public String PSWSL;
	
	/** �ڲ����� */
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
