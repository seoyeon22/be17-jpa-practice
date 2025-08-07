package org.example.jpapractice.book.service;

import lombok.RequiredArgsConstructor;
import org.example.jpapractice.book.model.Book;
import org.example.jpapractice.book.model.BookDto;
import org.example.jpapractice.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void register(BookDto.Register dto){
        Book book = bookRepository.save(dto.toEntity());
    }

    public List<BookDto.BookRes> list(){
        List<Book> result = bookRepository.findAll();
        return result.stream().map(BookDto.BookRes::from).toList();
    }

    public BookDto.BookRes read(Integer idx){
        Optional<Book> result = bookRepository.findById(idx);
        if(result.isPresent()){
            Book entity = result.get();
            return BookDto.BookRes.from(entity);
        }
        return null;
    }

    public List<BookDto.BookRes> search(String title){
        List<Book> result = bookRepository.findByTitle(title);
        return result.stream().map(BookDto.BookRes::from).toList();
    }
}
