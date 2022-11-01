package com.library.Library.Dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name="Book")
public class BookDto {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    private String title;
    private String authorName;
    private String publishedYear;
    private String publisher;
    private long isbn;
    private Integer price;


    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public BookDto() {
    }

    public BookDto(Integer bookId, String title, String authorName, String publishedYear, String publisher, long isbn, Integer price) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.publisher = publisher;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return isbn == bookDto.isbn && bookId.equals(bookDto.bookId) && title.equals(bookDto.title) && authorName.equals(bookDto.authorName) && publishedYear.equals(bookDto.publishedYear) && publisher.equals(bookDto.publisher) && price.equals(bookDto.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, authorName, publishedYear, publisher, isbn, price);
    }
}
