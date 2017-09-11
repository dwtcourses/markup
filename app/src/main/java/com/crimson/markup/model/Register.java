package com.crimson.markup.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Register extends RealmObject
{
    @PrimaryKey
    private String batchID;

    private String subject;
    private String subjectCode;
    private int batch;
    private int semester;
    private String stream;
    private String section;
    private String group;
    private RealmList<Student> students;
    private RealmList<DateRegister> record;

    public String getBatchID() {return batchID;}
    public void setBatchID(String BatchID) {this.batchID = BatchID;}

    public String getSubject() {return subject;}
    public void setSubject(String Subject) {this.subject = Subject;}

    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }

    public int getBatch() {return batch;}

    public void setBatch(int batch) { this.batch = batch; }

    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }

    public String getStream() { return stream; }
    public void setStream(String stream) { this.stream = stream; }

    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group;}

    public RealmList<Student> getStudents() {return students;}
    public void setStudents(RealmList<Student> Students) {this.students = Students;}

    public RealmList<DateRegister> getRecord() {return record;}
    public void setRecord(RealmList<DateRegister> Record) {this.record = Record;}
}
