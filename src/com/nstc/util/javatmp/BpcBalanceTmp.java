package com.nstc.util.javatmp;

import java.util.Date;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author shijiabo
 * 
 * @since：2018-10-25 下午03:03:24
 * 
 */
public class BpcBalanceTmp extends BpcBalance {

	private static final long serialVersionUID = 1L;

	private Integer STATE;
	
	private Integer SOURCE;
	
	private Date CREATETIME;

	public Integer getSTATE() {
		return STATE;
	}

	public void setSTATE(Integer sTATE) {
		STATE = sTATE;
	}

	public Integer getSOURCE() {
		return SOURCE;
	}

	public void setSOURCE(Integer sOURCE) {
		SOURCE = sOURCE;
	}

	public Date getCREATETIME() {
		return CREATETIME;
	}

	public void setCREATETIME(Date cREATETIME) {
		CREATETIME = cREATETIME;
	}
}
