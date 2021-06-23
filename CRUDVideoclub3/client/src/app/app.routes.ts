
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { PeliculasComponent } from './components/peliculas/peliculas.component';
import { PeliculaComponent } from './components/pelicula/pelicula.component';
import { BuscadorComponent } from './components/buscador/buscador.component';
import {LoginComponent} from './views/login/login.component';

// import {  AboutComponent } from './components/about/about.component';
// import {  HeroesComponent } from './components/heroes/heroes.component';
// import {  HeroeComponent } from './components/heroe/heroe.component';


const APP_ROUTES: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'peliculas', component: PeliculasComponent },
  { path: 'pelicula/:id', component: PeliculaComponent },
  { path: 'buscador/:titulo', component: BuscadorComponent },
  // { path: 'heroes', component: HeroesComponent },
  // { path: 'heroe/:id', component: HeroeComponent },
  { path: '', pathMatch: 'full', redirectTo: '/home' },
  { path: 'login', component: LoginComponent}
];

export  const  APP_ROUTING = RouterModule.forRoot(APP_ROUTES);
