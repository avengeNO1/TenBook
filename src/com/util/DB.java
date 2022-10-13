package com.util;

import com.poji.Admin;
import com.poji.Book;

/**
 * @author HuAng
 *
 *数据库类，用于模拟数据库提供的数据
 */
public class DB {

    //数据的初始化
    private Admin admin1 = new Admin("李白","ac001","123456");
    private Admin admin2 = new Admin("杜甫","ac002","123456");
    private Admin admin3 = new Admin("白居易","ac003","123456");


    private Admin [] admins = {admin1,admin2,admin3};

    private Book book1 = new Book(10001,"三国演义",9.8);
    private Book book2 = new Book(10002,"红楼梦",12.8);
    private Book book3 = new Book(10003,"水浒传",5.2);
    private Book book4 = new Book(10004,"西游记",11.2);

    private Book[] books = {book1,book2,book3,book4};



    public Admin[] getAdmins() {
        return admins;
    }

    public void setAdmins(Admin[] admins) {
        this.admins = admins;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}

   