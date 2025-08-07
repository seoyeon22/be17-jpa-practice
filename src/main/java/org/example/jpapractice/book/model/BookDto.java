package org.example.jpapractice.book.model;

import lombok.Builder;
import lombok.Getter;
import org.example.jpapractice.reviews.model.ReviewDto;

import java.util.List;

public class BookDto {

    @Getter
    public static class Register{
        private String title;
        private Integer pages;
        private Integer price;
        private List<ReviewDto.Register> reviewList;

        public Book toEntity(){
            Book entity = Book.builder()
                    .title(title)
                    .pages(pages)
                    .price(price)
                    .build();

            return entity;
        }
    }

    @Getter
    @Builder
    public static class BookRes {
        private Integer idx;
        private String title;
        private Integer pages;
        private Integer price;
        private List<ReviewDto.ReviewRes> reviewResList;

        public static BookRes from(Book entity){
            BookRes dto = BookRes.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .pages(entity.getPages())
                    .price(entity.getPrice())
                    .reviewResList(entity.getReviewList().stream().map(ReviewDto.ReviewRes::from).toList())
                    .build();

            return dto;
        }
    }
}
