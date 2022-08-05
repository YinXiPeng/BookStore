package com.turing.book.dao;

import com.turing.book.pojo.Book;

import java.math.BigDecimal;
import java.util.List;

public interface BookDAO {

    List<Book> bookList();

    int del(Integer bid);
    int update(Integer bid, String bname, String author, BigDecimal price);
    int add(Integer bid, String bname, String author, BigDecimal price);
    List<Book> queryId(Integer bid);
}
