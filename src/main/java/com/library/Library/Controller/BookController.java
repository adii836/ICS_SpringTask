package com.library.Library.Controller;


import com.library.Library.Dto.BookDto;
import com.library.Library.Exception.HndbookException;
import com.library.Library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;




    @PostMapping("/add")
    public BookDto addBook(@RequestBody BookDto book){
        return this.bookService.addBook(book);
    }

    @PutMapping("/update/{id}")
    public BookDto updateBookDto(@RequestBody BookDto book, @PathVariable("id") int id){
        return this.bookService.updateBookDto(book,id);
    }
    @GetMapping("/get/{id}")
    public BookDto getBookDtoById(@PathVariable("id") int id){
        return this.bookService.getBookDtoById(id);
    }

    @GetMapping("/get")
    public List<BookDto> getAllBooks(){
           List<BookDto> list = this.bookService.getAllBookDto();
           return list;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable("id") int id) throws HndbookException {
        BookDto book=this.bookService.getBookDtoById(id);
        if(book==null){
            throw new HndbookException("Service.BOOK_NOT_FOUND");
        }else
            this.bookService.deleteBook(id);
    }

}
