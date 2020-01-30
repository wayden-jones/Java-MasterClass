package com.company;

public class Person {
    private String firstName, lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen() {
        if (age < 20 && age > 12)
            return true;
        else
            return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty())
            return "";
        if (firstName.isEmpty())
            return lastName;
        if (lastName.isEmpty())
            return firstName;
        return (firstName + " " + lastName);

    }
}
