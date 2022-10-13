package com.service;

import com.poji.Admin;

/**
 * @author HuAng
 *
 */
public interface BookService {

    /**
     * 管理员登录方法
     * @return 管理员对象
     */
    Admin login();

    /**
     *
     */
    //查询所有图书
    void showAllBook();

    /**
     * 判断添加书籍的id，id不能重复
     * @param id 传入需要比对的id
     * @return 返回的int类似的标记   i 代表找到相同id   -1代表id不重复
     */

    int checkBookId(int id);

    //新增图书
    void addBook();

    //修改价钱
    void setPrice();


}

   