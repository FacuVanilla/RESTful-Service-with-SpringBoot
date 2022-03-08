package com.oluwaseun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationsController {

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return Arrays.asList(new Movie(1, "Ice Age", 7.5),
                new Movie(2, "Happy Feet", 6.4),
                new Movie(3, "Shark Tales", 6.0),
                new Movie(4, "Dark Knight", 6.4),
                new Movie(5, "Lion Heart", 7.5),
                new Movie(6, "Django", 6.2),
                new Movie(7, "Troy", 8.4),
                new Movie(8, "King of Boys", 7.4),
                new Movie(9, "Odyssey", 5.0),
                new Movie(10, "Yes Man", 5.4));
    }
}
