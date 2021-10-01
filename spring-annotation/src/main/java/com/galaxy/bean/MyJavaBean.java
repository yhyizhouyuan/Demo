package com.galaxy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/26 10:57
 */

public class MyJavaBean implements InitializingBean {
    private String desc;
    private String remark;

    public MyJavaBean() {
        System.out.println("MyJavaBean的构造函数执行了");
    }

    public MyJavaBean(String desc, String remark) {
        System.out.println("MyJavaBean的有参构造函数执行了");
        this.desc = desc;
        this.remark = remark;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet方法");
        this.desc="在初始化方法修改之后的描述信息";
    }

    public void initMethod(){
        System.out.println("调用方法initMethod");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[描述：").append(desc);
        builder.append(".备注：").append(remark).append("]");
        return builder.toString();
    }
}
