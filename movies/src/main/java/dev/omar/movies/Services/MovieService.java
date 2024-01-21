package dev.omar.movies.Services;

import dev.omar.movies.Entites.Movie;
import dev.omar.movies.Repo.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    final
    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String impdbId){
        return movieRepository.findMovieByImdbId(impdbId);
    }
}
