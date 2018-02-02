package com.lbh.controller;

import com.lbh.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Advancer on 2018/1/16 16:36.
 * auth: lbh
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private Book book;

    @RequestMapping("/getBook")
    public String getBookDetial(){
        return book.getAuthor()+" 《 "+ book.getName()+ " 》"+ book.getPrice();
    }

}
