
import MoviesSlider from "../MoviesSlider";
import { Link } from "react-router-dom";
import Navbarcomp from "../Navvbar/Navbarcomp";
import { Footer } from "../Footer/Footer";
import  Image3 from "../images/image3.png";
import {
  PrimeVideoContainer,
  MoviesContainer,
  Image,
  MoviesHeading
} from "./styledComponents";


const PrimeVideo = (props) => {
  const { moviesList } = props;

  const actionMoviesList = moviesList.filter(
    (eachMovie) => eachMovie.categoryId === "ACTION"
  );

  const comedyMoviesList = moviesList.filter(
    (eachMovie) => eachMovie.categoryId === "COMEDY"
  );
  
  return (
    <PrimeVideoContainer>
      <div >
      <MoviesContainer> <Navbarcomp/> </MoviesContainer>
       <MoviesContainer> <Image 
        src={Image3}
        alt="prime video"
      /></MoviesContainer>
       <MoviesContainer> 
       <MoviesHeading>Continue Watching Movies
      </MoviesHeading>
        <MoviesSlider moviesList={comedyMoviesList} />
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
      </div>
    </PrimeVideoContainer>
    
  );
 
};

export default PrimeVideo;
