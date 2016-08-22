package com.github.yuweiguocn.demo.greendao.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Entity mapped to table "TEST_DATA2".
 */
@Entity public class TestData2 {

  @Id(autoincrement = true) private Long id;
  @Property(nameInDb = "testString") private String testString;
  @Property(nameInDb = "testLong") private Long testLong;
  @Property(nameInDb = "testDate") private java.util.Date testDate;
  @Property(nameInDb = "testInt") private Integer testInt;
  @Property(nameInDb = "testBoolean") private Boolean testBoolean;

  @Generated(hash = 45570144)
  public TestData2(Long id, String testString, Long testLong, java.util.Date testDate,
      Integer testInt, Boolean testBoolean) {
    this.id = id;
    this.testString = testString;
    this.testLong = testLong;
    this.testDate = testDate;
    this.testInt = testInt;
    this.testBoolean = testBoolean;
  }

  @Generated(hash = 454843482) public TestData2() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTestString() {
    return testString;
  }

  public void setTestString(String testString) {
    this.testString = testString;
  }

  public Long getTestLong() {
    return testLong;
  }

  public void setTestLong(Long testLong) {
    this.testLong = testLong;
  }

  public java.util.Date getTestDate() {
    return testDate;
  }

  public void setTestDate(java.util.Date testDate) {
    this.testDate = testDate;
  }

  public Integer getTestInt() {
    return testInt;
  }

  public void setTestInt(Integer testInt) {
    this.testInt = testInt;
  }

  public Boolean getTestBoolean() {
    return testBoolean;
  }

  public void setTestBoolean(Boolean testBoolean) {
    this.testBoolean = testBoolean;
  }
}
