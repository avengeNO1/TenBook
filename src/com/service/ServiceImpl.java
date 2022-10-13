package com.service;

import com.poji.Admin;
import com.poji.Book;
import com.util.DB;

import java.util.Scanner;

/**
 * @author HuAng
 */
public class ServiceImpl implements BookService {
    //共用 加载数据库
    DB db = new DB();
    Scanner sc = new Scanner(System.in);


    @Override
    public Admin login() {
        System.out.println("请输入账号：");
        String acc = sc.next();
        System.out.println("请输入密码：");
        String pwd  = sc.next();

        for (int i = 0;i < db.getAdmins().length;i++){
            if (db.getAdmins()[i].getAdminAcc().equals(acc) && db.getAdmins()[i].getAdminPwd().equals(pwd)){
                return db.getAdmins()[i];
            }
        }

        return null;//没有找到就是null
    }

    @Override
    public void showAllBook() {

        for (int i = 0;i < db.getBooks().length;i++){//遍历书籍的数组
            System.out.println(db.getBooks()[i].getBookId()+" "+db.getBooks()[i].getBookName()+" "+db.getBooks()[i].getBookPrice());
        }

    }

    @Override
    public int checkBookId(int id) {

        for (int i = 0;i < db.getBooks().length;i++){
            if (id == db.getBooks()[i].getBookId()){
                return i;
            }
        }

        return -1;
    }

    @Override
    public void addBook() {

        while (true){
            System.out.println("请输入新增的图书编号");
            int bookId = sc.nextInt();
            int flag = checkBookId(bookId);
            if (flag == -1){
                System.out.println("请输入新增的图书书名");
                String bookName = sc.next();//输入书名

                System.out.println("请输入新增的图书价格");
                double bookPrice = sc.nextDouble();//输入价格
                //实例化这本书
                Book book = new Book(bookId,bookName,bookPrice);
                //创建新数组
                Book [] newBook = new Book[db.getBooks().length + 1];
                //将旧的数据传入新数组
                for (int i = 0;i < db.getBooks().length;i++) {
                    newBook[i] = db.getBooks()[i];
                }
                newBook[newBook.length-1] = book;
                db.setBooks(newBook);//把新数组传给旧数组
                System.out.println("新增成功");
                break;
            }else {
                System.out.println("书籍编号已经存在，请重新输入");
            }

        }
    }

    @Override
    public void setPrice() {

        System.out.println("请输入要修改的图书编号：");
        int bookID = sc.nextInt();
        int flag = checkBookId(bookID);
        if (flag == -1){
            System.out.println("书籍不存在请检查再输入");
        }else{
            //获取到id相同的图书下标
            System.out.println("请输入要修改的图书价格");
            db.getBooks()[flag].setBookPrice(sc.nextDouble());
            System.out.println("修改价格成功");
        }

    }
}

   