package com.restapi.springbootrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.springbootrestapi.entities.Book;
import com.restapi.springbootrestapi.services.BookService;

@RestController
public class BookController{
    
       //this autowire will automatically create here object of BookService
       @Autowired
       private BookService  bookservice;
       @GetMapping(value ="/books")
      //@ResponseBody//return string as it is as output 3.4.5 version.with restcontroller no resposnsebody
       public List<Book> getBooks()
       {
        //Book book = new Book();
        //book.setId(1234);
        //book.setTitile("java");
        //book.setAuthor("snehal");
        // here we are getting all this data 

        //now we have implemeted fake service BookService so that is our database as of nowto get data here
        //to call it now

        return this.bookservice.getAllBooks();
       }
}