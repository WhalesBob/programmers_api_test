package com.github.prgrms.orders;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
public class ReviewRestController {
  
  private final ReviewService reviewService;

  public ReviewRestController(ReviewService reviewService){
    this.reviewService = reviewService;
  }

  @PostMapping("/{id}/review")
  public void writeReview(@PathVariable String id, @RequestBody ReviewDto dto){
    reviewService.writeReview(null, id);
  }
}