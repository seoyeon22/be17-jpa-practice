package org.example.jpapractice.reviews.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.jpapractice.book.model.Book;

public class ReviewDto {
    @Getter
    @NoArgsConstructor
    @Setter
    public static class Register {
        private String content;
        private Integer rating;
        private Integer book_id;

        public Review toEntity() {
            Review entity = Review.builder()
                    .content(content)
                    .rating(rating)
                    .book(Book.builder().idx(book_id).build())
                    .build();
            return entity;
        }
    }

    @Getter
    @Builder
    public static class ReviewRes {
        private Integer idx;
        private String content;
        private Integer rating;

        public static ReviewDto.ReviewRes from(Review entity) {
            ReviewDto.ReviewRes dto = ReviewDto.ReviewRes.builder()
                    .idx(entity.getIdx())
                    .content(entity.getContent())
                    .rating(entity.getRating())
                    .build();

            return dto;
        }
    }
}
