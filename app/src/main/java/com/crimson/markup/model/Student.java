package com.crimson.markup.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Student extends RealmObject
{
    @PrimaryKey
    private String RollNumber;

    private String PhoneNumber;
    private String StudentName;

    public String getRollNumber() {return RollNumber;}
    public String getPhoneNumber() {return PhoneNumber;}
    public String getStudentName() {return StudentName;}

    public void setRollNumber(String Roll_number) {this.RollNumber = Roll_number;}
    public void setPhoneNumber(String Phone_no) {this.PhoneNumber = Phone_no;}
    public void setStudentName(String Student_name) {this.StudentName = Student_name;}

}
