package org.example.jpapractice.reviews;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ReviewDto {
    @Getter
    @NoArgsConstructor
    @Setter
    public static class Register {
        private String content;
        private Integer rating;

        public Review toEntity(Book book) {
            Review entity = Review.builder()
                    .content(content)
                    .rating(rating)
                    .book(book)
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
