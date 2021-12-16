/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Customer {
   private String name;
    private String ph_no;
    private String Gender;
    private int age;
//Constructor
    public Customer (String n, String p, int a,String G){
        this.name = n;
        this.ph_no = p;
        this.Gender = G;
        this.age= a;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ph_no
     */
    public String getPh_no() {
        return "09-"+ph_no;
    }

    /**
     * @param ph_no the ph_no to set
     */
    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return String.format("%-20s|%13s|%5d|%8s |",name,"09-"+ph_no,age,Gender);
    }  
}
