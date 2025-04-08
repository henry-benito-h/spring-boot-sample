package com.hesus.apphb.models;

public class Employee {
private String name, lastname, address, role;
private int age, telephone, id;
public Employee(String name, String lastname,String address, String role, int age, int telephone, int id) {
    this.name = name;
    this.lastname = lastname;
    this.address = address;
    this.role = role;
    this.age = age;
    this.telephone = telephone;
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getLastname() {
    return lastname;
}
public void setLastname(String lastname) {
    this.lastname = lastname;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getRole() {
    return role;
}
public void setRole(String role) {
    this.role = role;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public int getTelephone() {
    return telephone;
}
public void setTelephone(int telephone) {
    this.telephone = telephone;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}

}
