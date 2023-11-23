import Card from 'react-bootstrap/Card';
import CardImgOverlay from 'react-bootstrap/CardImgOverlay';
import CardTitle from 'react-bootstrap/esm/CardTitle';
import Navbarcomp from './Navvbar/Navbarcomp';
import {
    PrimeVideoContainer,
    MoviesContainer,
    MoviesHeading,
  } from "./PrimeVideo/styledComponents";
import { Footer } from './Footer';


function TYpeOfMovieCards() {
  return (
    <PrimeVideoContainer>
        <MoviesContainer> <Navbarcomp/> </MoviesContainer>
        <MoviesContainer>
        <MoviesHeading>
        Categories
        </MoviesHeading>   
        <CardTitle tag="h3" style={{color:'white',marginTop:20,marginBottom:10}}>
        Genres
      </CardTitle>
      <div class="row row-cols-3 g-4">
  <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
        Action And 
        <br/>Adventures
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Anime
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Comedy
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Documentry
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
      Drama
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Fantasy
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Horror
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Kids
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
   
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/genre_background_1/5d7d37ee-5e37-460a-9d94-7e611d99cacb._UR1920,1080_SX480_FMwebp_.png"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Romance
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
   </div>



   
   <CardTitle tag="h3" style={{color:'white',marginTop:20,marginBottom:10}}>
        Featured Collections
      </CardTitle>
      <div class="row row-cols-3 g-4">
      <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/FeaturedCollections_R1/b02c4f97-4ffb-4fb8-a11d-06d6dc2b6d8a._UR1920,1080_SX480_FMwebp_.jpeg"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
      Deals
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
   
    <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/FeaturedCollections_R1/b02c4f97-4ffb-4fb8-a11d-06d6dc2b6d8a._UR1920,1080_SX480_FMwebp_.jpeg"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Black Voices
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
   
   <div class="col">
    <Card style={{ width: '18rem' }}>
      <Card.Img  src="https://m.media-amazon.com/images/S/sonata-images-prod/FeaturedCollections_R1/b02c4f97-4ffb-4fb8-a11d-06d6dc2b6d8a._UR1920,1080_SX480_FMwebp_.jpeg"></Card.Img>
      <CardImgOverlay>
      <CardTitle tag="h3" style={{color:'white',marginTop:40}}>
       Home Premiere
      </CardTitle>
    </CardImgOverlay>
    </Card>
    </div>
   </div>
    </MoviesContainer>
    <Footer/>
    </PrimeVideoContainer>
  );
}

 

export default TYpeOfMovieCards;