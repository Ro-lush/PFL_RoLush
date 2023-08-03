package com.pflb.API;

public class User {
    private Integer age;
    private String firstName;
    private Integer id;
    private Double money;
    private String secondName;
    private String sex;

    public User() {
    }

    public User(Integer age, String firstName, Integer id, Double money, String secondName, String sex) {
        this.age = age;
        this.firstName = firstName;
        this.id = id;
        this.money = money;
        this.secondName = secondName;
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getId() {
        return id;
    }

    public Double getMoney() {
        return money;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSex() {
        return sex;
    }
}