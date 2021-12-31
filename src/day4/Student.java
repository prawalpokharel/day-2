package day4;

import day3.student;

public class Student {


    private String phoneNumber;
    private String DOB;
    private String sClass;
    private String rollNumber;
    private String SSN;
    private static String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public static String getName() {

        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDOB() {
        return DOB;
    }

    public String getsClass() {
        return sClass;
    }

    public String getRollNumber() {
        return rollNumber;
    }



    public void playing() {
        System.out.println(student.name + " is playing...");
    }
    public void studying() {
        System.out.println(student.name + " is studying...");
    }
}
