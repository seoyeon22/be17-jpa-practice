package org.example.jpapractice.reviews.controller;

import lombok.RequiredArgsConstructor;
import org.example.jpapractice.reviews.model.Review;
import org.example.jpapractice.reviews.model.ReviewDto;
import org.example.jpapractice.reviews.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody ReviewDto.Register dto) {
        reviewService.register(dto);

        return ResponseEntity.status(200).body("리뷰 등록 성공");
    }
//
//    @GetMapping("/list")
//    public ResponseEntity list() {
//        List<ReviewDto.ReviewRes> response = reviewService.list();
//
//        return ResponseEntity.status(200).body(response);
//    }
//
//    @GetMapping("/read")
//    public ResponseEntity read(Integer idx) {
//        ReviewDto.ReviewRes response = reviewService.read(idx);
//
//        return ResponseEntity.status(200).body(response);
//    }
}
