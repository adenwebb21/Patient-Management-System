/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 * This is the abstract user class that all other user types inherit from
 * @author adenw
 */
public abstract class User {

    /**
     *
     */
    protected String iD;

    /**
     *
     */
    protected String password;

    /**
     *
     */
    protected String givenName;

    /**
     *
     */
    protected String surName;

    /**
     *
     */
    protected int age;

    /**
     *
     */
    protected String sex;

    /**
     *
     * @param iD
     */
    public User(String iD) {
        this.iD = iD;
    }

    /**
     *
     * @param iD
     * @param password
     */
    public User(String iD, String password) {
        this.iD = iD;
        this.password = password;
    }
    
    /**
     *
     * @param iD
     * @param givenName
     * @param surName
     */
    public User(String iD, String givenName, String surName) {
        this.iD = iD;
        this.givenName = givenName;
        this.surName = surName;
    }

    /**
     *
     * @param givenName
     * @param surName
     * @param sex
     * @param age
     * @param password
     */
    public User(String givenName, String surName, String sex, int age, String password) {
        this.givenName = givenName;
        this.surName = surName;
        this.sex = sex;
        this.password = password;
    }

    /**
     *
     * @param iD
     * @param givenName
     * @param surName
     * @param sex
     * @param age
     * @param password
     */
    public User(String iD, String givenName, String surName, String sex, int age, String password) {
        this.iD = iD;
        this.password = password;
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.sex = sex;
    }
    
    /**
     *
     * @return
     */
    public String getiD() {
        return iD;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     *
     * @return
     */
    public String getSurName() {
        return surName;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @param iD
     */
    public void setiD(String iD) {
        this.iD = iD;
    }
    
    
    
    
    
    
    
}
