package com.awelee.model;

import javax.persistence.Table;

/***
 *
 * @描述: City.
 * @作者: Awelee.
 * @创建时间: 2018/2/4, 16:53 .
 * @版本: V1.0.
 *
 */
@Table(name = "city")
public class City extends BaseEntity {

    private String name;

    private String state;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }
}