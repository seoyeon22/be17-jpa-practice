package org.example.jpapractice.reviews.repository;

import org.example.jpapractice.reviews.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
