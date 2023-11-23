import React from 'react'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from "react-bootstrap/NavDropdown"

const Navbarcomp = () => {
  return (
    <div>
       <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="#home"><img height={25} src="https://m.media-amazon.com/images/G/01/digital/video/web/Logo-min.png"
            alt="prime video"/></Navbar.Brand>
          <Nav className="me-auto">
            <NavDropdown title="Home" id="basic-nav-dropdown">
              <NavDropdown.Item  href="/Movies">Movies</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.3">All</NavDropdown.Item>
            </NavDropdown>
            <Nav.Link href="#Store">Store</Nav.Link>
            <Nav.Link href="#LiveTv">LiveTv</Nav.Link>
            <Nav.Link href="/Categories">Categories</Nav.Link>
            <Nav.Link href="#MyStuff">My Stuff</Nav.Link>
          </Nav>
          <Navbar.Collapse className="justify-content-end">
          <Navbar.Text> 
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
          <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
          </svg>
            Punam <img height={25} src="https://m.media-amazon.com/images/G/02/CerberusPrimeVideo-FN38FSBD/adult-1.png"/>
          </Navbar.Text>
        </Navbar.Collapse>
        </Container>
      </Navbar>
    </div>
  )
}

export default Navbarcomp
