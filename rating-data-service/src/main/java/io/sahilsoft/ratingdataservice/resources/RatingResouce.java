package io.sahilsoft.ratingdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sahilsoft.ratingdataservice.models.Rating;
import io.sahilsoft.ratingdataservice.models.UserRatings;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResouce {

	@RequestMapping("/{userId}")
	public UserRatings getUserRating(@PathVariable String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4),
				new Rating("1234", 3)
				);
		UserRatings userRatings = new UserRatings();
		userRatings.setUserRating(ratings);
		return userRatings;
	}
}
