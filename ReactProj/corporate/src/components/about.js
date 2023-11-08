import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Image from 'react-bootstrap/Image';
import img1 from '../assets/images/img1.jpg'

export default function AppAbout(){
    return(
        <section id="about" className=' block about-block'>
     <Container fluid>
        <div className='title-holder'>
            <h2>About Us</h2>
            <div className='subtitle'>Learn more about us</div>

        </div>
      <Row>
      <Col sm ={6}>
      <h2 className='title-holder'>
      Product  Development  For  Better Bussiness</h2>
            <p>An enim nullam tempor sapien gravida donec pretium ipsum porta justo integer and purus
                 velna vitae auctor integer undo congue diam purus pretium and ligula tempor primis libero at tempus, 
                blandit and cursus varius magnis at sapien egestas purus vitae purus an ipsum</p>
                <p>An enim nullam tempor sapien gravida donec pretium ipsum porta justo integer and purus
                 velna vitae auctor integer undo congue diam purus pretium and ligula tempor primis libero at tempus, 
                blandit and cursus varius magnis at sapien egestas purus vitae purus an ipsum</p>
            </Col>
        <Col sm ={6}>
            <Image src={img1}/>
            </Col>
           
      </Row>
    </Container>
        </section>

    )
}