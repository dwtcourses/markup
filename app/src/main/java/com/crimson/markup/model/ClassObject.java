package com.crimson.markup.model;

public class ClassObject {
  public String batchID;
  public String subject;
  public String subjectCode;
  public int batch;
  public int semester;
  public String stream;
  public String section;
  public String Group;

  public ClassObject(String batchID,String subject,String subjectCode, int batch, int semester,String stream, String section, String group)
  {
    this.batchID = batchID;
    this.subject = subject;
    this.subjectCode = subjectCode;
    this.batch = batch;
    this.semester = semester;
    this.stream = stream;
    this.section = section;
    this.Group = group;
  }

  public String getBatchID() {
    return batchID;
  }

  public void setBatchID(String batchID) {
    this.batchID = batchID;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getSubjectCode() {
    return subjectCode;
  }

  public void setSubjectCode(String subjectCode) {
    this.subjectCode = subjectCode;
  }

  public int getBatch() {
    return batch;
  }

  public void setBatch(int batch) {
    this.batch = batch;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public String getStream() {
    return stream;
  }

  public void setStream(String stream) {
    this.stream = stream;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public String getGroup() {
    return Group;
  }

  public void setGroup(String group) {
    Group = group;
  }
}
