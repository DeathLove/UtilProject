package com.nstc.util.javatmp;

import java.io.Serializable;

/**
 * <p>Title: </p>
 *
 * <p>Description: ������� </p>
 *
 * <p>Company: �����ź��ǿƼ��ɷ����޹�˾</p>
 *
 * @author shijiabo
 * 
 * @since��2018-10-25 ����03:02:10
 * 
 */
public class GlsBalance implements Serializable {

	private static final long serialVersionUID = 1L;

	/** ��˾���� */
	private String memberNo;

	/** ������ */
	private String year;

	/** �����ڼ� */
	private String month;

	/** ��Ŀ���� */
	private String km;

	/** �������ͱ��� */
	private String fyNo;

	/** ��λ���ڳ���� */
	private String b_qcAmount;

	/** ��λ�ұ��ڽ跽��� */
	private String b_jfAmonut;

	/** ��λ�ұ��ڴ������ */
	private String b_dfAmount;

	/** ��λ����ĩ��� */
	private String b_qmAmount;

	/** ��λ�ұ��� */
	private String b_cur;

	/** ���׻����ڳ���� */
	private String j_qcAmount;

	/** ���׻��ұ��ڽ跽��� */
	private String j_jfAmount;

	/** ���׻�����ĩ�ۼ���� */
	private String j_qmAmount;

	/** ���׻��ұ��ڴ������ */
	private String j_dfAmount;

	/** ���׻��ұ��� */
	private String j_cur;

	/** �ڲ����� */
	private String inNo;

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getFyNo() {
		return fyNo;
	}

	public void setFyNo(String fyNo) {
		this.fyNo = fyNo;
	}

	public String getB_qcAmount() {
		return b_qcAmount;
	}

	public void setB_qcAmount(String b_qcAmount) {
		this.b_qcAmount = b_qcAmount;
	}

	public String getB_jfAmonut() {
		return b_jfAmonut;
	}

	public void setB_jfAmonut(String b_jfAmonut) {
		this.b_jfAmonut = b_jfAmonut;
	}

	public String getB_dfAmount() {
		return b_dfAmount;
	}

	public void setB_dfAmount(String b_dfAmount) {
		this.b_dfAmount = b_dfAmount;
	}

	public String getB_qmAmount() {
		return b_qmAmount;
	}

	public void setB_qmAmount(String b_qmAmount) {
		this.b_qmAmount = b_qmAmount;
	}

	public String getB_cur() {
		return b_cur;
	}

	public void setB_cur(String b_cur) {
		this.b_cur = b_cur;
	}

	public String getJ_qcAmount() {
		return j_qcAmount;
	}

	public void setJ_qcAmount(String j_qcAmount) {
		this.j_qcAmount = j_qcAmount;
	}

	public String getJ_jfAmount() {
		return j_jfAmount;
	}

	public void setJ_jfAmount(String j_jfAmount) {
		this.j_jfAmount = j_jfAmount;
	}

	public String getJ_qmAmount() {
		return j_qmAmount;
	}

	public void setJ_qmAmount(String j_qmAmount) {
		this.j_qmAmount = j_qmAmount;
	}

	public String getJ_dfAmount() {
		return j_dfAmount;
	}

	public void setJ_dfAmount(String j_dfAmount) {
		this.j_dfAmount = j_dfAmount;
	}

	public String getJ_cur() {
		return j_cur;
	}

	public void setJ_cur(String j_cur) {
		this.j_cur = j_cur;
	}

	public String getInNo() {
		return inNo;
	}

	public void setInNo(String inNo) {
		this.inNo = inNo;
	}
}
