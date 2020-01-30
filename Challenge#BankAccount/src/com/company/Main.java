package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1234567, "Tim John", 2464646, "tj@tj.com", 0.00);
//
//        myAccount.deposit(50000.00);
//        myAccount.withdraw(100000.00);
//        System.out.println(myAccount.getBalance());
//        System.out.println(myAccount.getAccountNumber());
//        System.out.println(myAccount.getCustomerName());
//        System.out.println(myAccount.getEmail());
//        System.out.println(myAccount.getPhoneNumber());
//
//        VipCustomer customer1 = new VipCustomer();
//        System.out.println(customer1.getName());
//        System.out.println(customer1.getEmail());
//        VipCustomer customer2 = new VipCustomer("Bob", "b@b.com");
//        System.out.println(customer2.getName());
//        VipCustomer customer3 = new VipCustomer("Tim", "b@b.com", 25000d);
//        System.out.println(customer3.getName());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());


    }
}
