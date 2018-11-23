package com.nstc.util.model;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author shijiabo
 * @since：2018-10-25 下午04:26:10
 */
public class Column implements Comparable<Column> {

    /**
     * 表名
     */
    private String columnName;

    /**
     * 注释
     */
    private String remark;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getDataScale() {
        return dataScale;
    }

    public void setDataScale(Integer dataScale) {
        this.dataScale = dataScale;
    }

    private String dataType;

    private Integer dataScale;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int compareTo(Column o) {
        return this.columnName.compareTo(o.getColumnName());
    }

}
