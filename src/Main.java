import controller.UserController;
import pojo.TestPojo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        String s = a.nextLine();
//        System.out.println("输入的是：" + s);

        TestPojo testPojo = new TestPojo();
        testPojo.setName("张三");
        testPojo.setSex("M");
        testPojo.setAge(15);
        testPojo.setAddress("张家口");

        UserController userController = new UserController();
        boolean flag = userController.addUser(testPojo);
        System.out.println(flag);

    }
}