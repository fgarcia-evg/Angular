import { Component, OnInit } from '@angular/core';
import { PeliculasService, Peliculas} from '../../services/peliculas/peliculas.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-peliculas',
  templateUrl: './peliculas.component.html',
  styleUrls: ['./peliculas.component.css']
})
export class PeliculasComponent implements OnInit {

  peliculas: Peliculas[] = [];

  constructor(private peliculasService: PeliculasService,
              private router: Router) { }

  ngOnInit() {
    this.peliculas = this.peliculasService.getPeliculas();
  }

  verPelicula(idx: number) {
    this.router.navigate(['/pelicula', idx]);
  }
}
