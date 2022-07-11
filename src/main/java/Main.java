package main.java;

import main.java.InnerClassExample.User;
import main.java.InnerClassExample.User.Supervisor;
import main.java.localClassExample.SendMoney;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        User.Manager manager = user.new Manager("Ana", 60_000_000d);
        System.out.println("Manager salary is " + manager.getSalary());

        User.Customer customer = user.new Customer();
        customer.name = "James";

        // static supervisor - available across the program, need to import
        Supervisor supervisor = new Supervisor();
        supervisor.name = "Tom";

        SendMoney sendMoney = new SendMoney();

        sendMoney.sendByCard(123, 1111110000L, 123, "02/24");


    }
}
