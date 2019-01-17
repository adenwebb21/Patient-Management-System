/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author adenw
 */
public abstract class User {

    protected String iD;
    protected String password;
    protected String givenName;
    protected String surName;
    protected int age;
    protected String sex;

    public User(String iD) {
        this.iD = iD;
    }

    public User(String iD, String password) {
        this.iD = iD;
        this.password = password;
    }
    
    public User(String iD, String givenName, String surName) {
        this.iD = iD;
        this.givenName = givenName;
        this.surName = surName;
    }

    public User(String givenName, String surName, String sex, int age, String password) {
        this.givenName = givenName;
        this.surName = surName;
        this.sex = sex;
        this.password = password;
    }

    public User(String iD, String givenName, String surName, String sex, int age, String password) {
        this.iD = iD;
        this.password = password;
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.sex = sex;
    }
    
    

    public String getiD() {
        return iD;
    }

    public String getPassword() {
        return password;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
    
    
    
    
    
    
    
}
