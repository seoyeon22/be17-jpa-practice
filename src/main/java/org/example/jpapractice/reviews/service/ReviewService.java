package org.example.jpapractice.reviews.service;

import lombok.RequiredArgsConstructor;
import org.example.jpapractice.reviews.model.Review;
import org.example.jpapractice.reviews.model.ReviewDto;
import org.example.jpapractice.reviews.repository.ReviewRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public void register(ReviewDto.Register dto) {
        Review review = reviewRepository.save(dto.toEntity());
    }
}
