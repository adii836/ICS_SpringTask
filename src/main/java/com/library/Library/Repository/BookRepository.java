package com.library.Library.Repository;

import com.library.Library.Dto.BookDto;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookDto,Integer> {

    public BookDto findById(int BookId);

}
