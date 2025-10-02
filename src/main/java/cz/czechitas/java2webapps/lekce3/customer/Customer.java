package cz.czechitas.java2webapps.lekce3.customer;

import java.time.LocalDate;
import java.time.Period;

public class Customer {
  private String firstName;
  private String lastName;
  private LocalDate birthDate;
  private String picturePath;
  private Address address;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getPicturePath() {
    return picturePath;
  }

  public void setPicturePath(String picturePath) {
    this.picturePath = picturePath;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Integer getAge() {
    if (birthDate == null) {
      return null;
    }

    Period period = birthDate.until(LocalDate.now());
    return period.getYears();
  }

  public boolean isEligibleToDrink() {
    return getAge() >= 18;
  }
}
