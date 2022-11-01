package com.library.Library.Service;

import com.library.Library.Dto.BookDto;
import com.library.Library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    @Autowired
    public BookRepository bookRepository;

    public List<BookDto> getAllBookDto(){
       List<BookDto> list = (List<BookDto>)this.bookRepository.findAll();
        return list;
    }

    public BookDto getBookDtoById(int id){
        BookDto book=null;
        try {
            book =this.bookRepository.findById(id);

        }catch (Exception e){
            System.out.println(e);

        }
        return book;
    }

    public BookDto addBook(BookDto b){
        BookDto result = this.bookRepository.save(b);
        return result;
    }

    //delete book
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }


    //update
    public BookDto updateBookDto(BookDto bookDto, int id){
        bookDto.setBookId(id);
        bookRepository.save(bookDto);
        return bookDto;
    }

}
