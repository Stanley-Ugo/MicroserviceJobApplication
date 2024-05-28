package com.embarkx.reviewms.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long id);
    Boolean addReview(Long companyId, Review review);
    Review getReview(Long reviewId);
    Boolean updateReview(Long reviewId, Review review);
    Boolean deleteReview(Long reviewId);
}
