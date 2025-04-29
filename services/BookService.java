package com.restapi.springbootrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restapi.springbootrestapi.entities.Book;

@Component
public class BookService {
    
    private static List<Book> list = new ArrayList();

    //as soon as obejct gets created this static block will run on its own .
    static{
           list.add(new Book(12,"java","snehal"));
           list.add(new Book(13,"python","ashish"));
           list.add(new Book(14,"sql","Sharvi"));
           list.add(new Book(15,"Machinelearning","terdale"));
    }

    //get all books method.
    public List<Book> getAllBooks()
    {
       return list; 
    }
    //get single book by id 
    public Book getBookById(int id)
    {
       //using java 8 stream api function to get id 
       Book book=null;
      book= list.stream().filter(e->e.getId()==id).findFirst().get();
      return book;
    }
        
}
