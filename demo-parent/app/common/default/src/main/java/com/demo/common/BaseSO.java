/**
 * Yixiu.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.demo.common;

import java.util.Date;

/**
 * 
 * @author YJ.yang
 * @version $Id: BaseSO.java, v 0.1 2016年7月26日 上午10:33:31 dev Exp $
 */
public abstract class BaseSO {
    /**业务编号*/
    private String bizNO ;
    /**创建时间*/
    private Date   gmtCreate;
    /**修改时间*/
    private Date   gmtModified;
    /**修改人*/
    private String modifier = "SYS";
    /**创建人*/
    private String creater  = "SYS";

    public String getBizNO() {
        return bizNO;
    }

    public void setBizNO(String bizNO) {
        this.bizNO = bizNO;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
    
}
