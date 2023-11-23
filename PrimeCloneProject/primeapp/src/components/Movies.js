
import MoviesSlider from "./MoviesSlider";
import { Link } from "react-router-dom";
import Navbarcomp from "./Navvbar/Navbarcomp";
import { Footer } from "./Footer";
import  Image3 from "./images/Rectangle13.png";
import {
  PrimeVideoContainer,
  MoviesContainer,
  Image,
  MoviesHeading
} from "./PrimeVideo/styledComponents";


const Movies = (props) => {
  const { moviesList } = props;

  const actionMoviesList = moviesList.filter(
    (eachMovie) => eachMovie.categoryId === "ACTION"
  );

  const comedyMoviesList = moviesList.filter(
    (eachMovie) => eachMovie.categoryId === "COMEDY"
  );
  
  return (
    <PrimeVideoContainer>
      <MoviesContainer> <Navbarcomp/> </MoviesContainer>
     
       <MoviesContainer>
       <MoviesHeading>
           Movies
        </MoviesHeading> 
        <Image 
        src={Image3}
        alt="prime video"
      /></MoviesContainer>
       <MoviesContainer> 
       <MoviesHeading>Recently Added Movies
       <span>
        <Link to="/MovieDetails">
         <span>See More</span>
       </Link>
       </span> 
      </MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
        <MoviesHeading>
          Action Movies
         
        </MoviesHeading>
        <MoviesSlider moviesList={actionMoviesList} />
        <MoviesHeading>Comedy Movies
        
        </MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
        <MoviesHeading>
           Watched Movies
          
        </MoviesHeading>
        <MoviesSlider moviesList={actionMoviesList} />
        <MoviesHeading>Recommended Movies
           
        </MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
       
      </MoviesContainer> 
      <Footer/>
      
    </PrimeVideoContainer>
    
  );
 
};

export default Movies;
