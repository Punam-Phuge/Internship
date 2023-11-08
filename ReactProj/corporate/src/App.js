
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import AppHeader from './components/header';
import AppHero from './components/home';
import AppAbout from './components/about';
import AppServices from './components/services';
import AppServiceDetails from './components/servicedetails';
import AppContact from './components/contact';
import AppBlog from './components/blog';
import AppFooter from './components/footer';

function App() {
  return (
    <div className="App">
     <header id="header">
      <AppHeader/>
     </header>
     <main>
      <AppHero/>
      <AppAbout/>
      <AppServices/>
      <AppServiceDetails/>
      <AppBlog/>
      <AppContact/>
      <AppFooter/>
     </main>
    </div>
  );
}

export default App;
