import { Footer } from "./Footer";
import MoviesSlider from "./MoviesSlider";
import Navbarcomp from "./Navvbar/Navbarcomp";

import {
  PrimeVideoContainer,
  MoviesContainer,
  MoviesHeading
} from "./componentsstyle";

const MovieDetails = (props) => {
  const { moviesList } = props;

  const actionMoviesList = moviesList.filter(
    (eachMovie) => eachMovie.categoryId === "ACTION"
  );

  const comedyMoviesList = moviesList.filter(
    (eachMovie) => eachMovie.categoryId === "COMEDY"
  );

  return (
    <PrimeVideoContainer>
      
      <MoviesContainer>
      <Navbarcomp/>
        <MoviesHeading>Top Rated IMDB Movies</MoviesHeading>
        <MoviesSlider moviesList={actionMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={actionMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={actionMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={actionMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={actionMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={actionMoviesList} />
        <MoviesHeading></MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
      </MoviesContainer>
      <Footer/>
     </PrimeVideoContainer>
  );
};

export default MovieDetails;

