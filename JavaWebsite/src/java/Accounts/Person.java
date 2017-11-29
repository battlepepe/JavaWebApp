/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Alex Forget
 */
@Named(value = "person")
@SessionScoped
public class Person implements Serializable {

    /**
     * Creates a new instance of Person
     */
    public Person() {   
    }
    
        private String address;

    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    
    
        private String lastName;

    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    
        private String firstName;

    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    
        protected String username;

    /**
     * Get the value of username
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the value of username
     *
     * @param username new value of username
     */
    protected void setUsername(String username) {
        this.username = username;
    }
    
    
    
        protected String hashPwd;

    /**
     * Get the value of hashPwd
     *
     * @return the value of hashPwd
     */
    protected String getHashPwd() {
        return hashPwd;
    }

    /**
     * Set the value of hashPwd
     *
     * @param hashPwd new value of hashPwd
     */
    protected void setHashPwd(String hashPwd) {
        this.hashPwd = hashPwd;
    }
}
