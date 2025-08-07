package org.example.jpapractice.book.controller;

import lombok.RequiredArgsConstructor;
import org.example.jpapractice.book.model.BookDto;
import org.example.jpapractice.book.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody BookDto.Register dto){
        bookService.register(dto);
        return ResponseEntity.status(200).body("등록 성공");
    }

    @GetMapping("/read")
    public ResponseEntity read(Integer idx){
        BookDto.BookRes response = bookService.read(idx);
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity search(String title){
        List<BookDto.BookRes> response = bookService.search(title);
        return ResponseEntity.status(200).body(response);
    }
}
