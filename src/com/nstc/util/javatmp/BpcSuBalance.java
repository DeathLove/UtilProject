package com.nstc.util.javatmp;

import java.io.Serializable;

/**
 * ��Ӧ������
 * @author shijiabo
 * @since��2018-10-29 ����06:32:39
 */
public class BpcSuBalance implements Serializable { 
	 /** ���� */
	 private String ID;

	 /** ��Ӧ�̱��� */
	 private String LIFNR;

	 /** ��˾���� */
	 private String BUKRS;

	 /** ��Ŀ���� */
	 private String SAKNR;

	 /** ������ */
	 private String GJAHR;

	 /** �����ڼ� */
	 private String MONAT;

	 /** ��λ�ұ��� */
	 private String LCURR;

	 /** ��λ���ڳ���� */
	 private String CAAMT;

	 /** ��λ�ұ��ڽ跽��� */
	 private String BDAMT;

	 /** ��λ�ұ��ڴ������ */
	 private String BCAMT;

	 /** ��λ����ĩ��� */
	 private String CTAMT;

	 /** �ڲ����� */
	 private String ISNCD;

	 /** ��/����ʶ */
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
