package com.example.model;

import java.util.Date;
import java.util.List;

/**
 * @author mengqa
 * @create 2018-05-03 17:21
 **/
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private List<Address> address;

    private Date born;

    public Boolean isAdmin() {
        if (this.id == 1) {
            return true;
        }
        return false;
    }

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }
}
