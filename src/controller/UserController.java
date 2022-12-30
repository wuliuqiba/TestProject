package controller;

import pojo.TestPojo;

public class UserController {

    public boolean addUser(TestPojo testPojo){
        if (testPojo.getAge() < 16){
            System.out.println(testPojo.toString());
        }
        return true;
    }
}
