package com.test;

import com.poji.Admin;
import com.service.BookService;
import com.service.ServiceImpl;

import java.util.Scanner;

/**
 * @author HuAng
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//系统输入
        ServiceImpl bookService = new ServiceImpl();//接口new是他的实现类
        System.out.println("----欢迎使用图书管理系统----");
        while (true){
            System.out.println("请输入：1--登录  0--退出");
            int input1 = sc.nextInt();
            if (input1 == 1) {
                //登录
                while (true){
                    Admin admin = bookService.login();
                    if (admin == null) {
                        System.out.println("登录失败，账号密码错误");
                        continue;
                    } else {

                        System.out.println("登录成功,欢迎" + admin.getAdminName());

                            while (true) {
                                System.out.println("1-- 查看所有书籍 2--新增书籍 3 -修改价钱 0- 退出 ");
                                int item = sc.nextInt();
                                if (item == 1) {

                                    bookService.showAllBook();
                                } else if (item == 2) {
                                    bookService.addBook();
                                } else if (item == 3) {
                                    bookService.setPrice();
                                } else if (item == 0) {
                                    System.out.println("返回");
                                    break;
                                } else {
                                    System.out.println("输入错误");
                                }
                            }
                               break;
                    }
                }
            }else if(input1 == 0){
                System.out.println("退出");
                break;
            }else {
                System.out.println("输入有误");
            }
        }
    }

}

   