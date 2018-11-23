package com.nstc.util.javatmp;

import java.io.Serializable;

/**
 * <p>Title: </p>
 *
 * <p>Description: 总账余额 </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author shijiabo
 * 
 * @since：2018-10-25 下午03:02:10
 * 
 */
public class GlsBalance implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 公司编码 */
	private String memberNo;

	/** 会计年度 */
	private String year;

	/** 记账期间 */
	private String month;

	/** 科目编码 */
	private String km;

	/** 费用类型编码 */
	private String fyNo;

	/** 本位币期初余额 */
	private String b_qcAmount;

	/** 本位币本期借方金额 */
	private String b_jfAmonut;

	/** 本位币本期贷方金额 */
	private String b_dfAmount;

	/** 本位币期末余额 */
	private String b_qmAmount;

	/** 本位币币种 */
	private String b_cur;

	/** 交易货币期初余额 */
	private String j_qcAmount;

	/** 交易货币本期借方金额 */
	private String j_jfAmount;

	/** 交易货币期末累计余额 */
	private String j_qmAmount;

	/** 交易货币本期贷方金额 */
	private String j_dfAmount;

	/** 交易货币币种 */
	private String j_cur;

	/** 内部编码 */
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
