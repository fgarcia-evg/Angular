import { Component, OnInit } from '@angular/core';
import { PeliculasService } from '../../services/peliculas/peliculas.service';
import { Pelicula } from 'src/app/models/peliculaStruct';
import { Router } from '@angular/router';

@Component({
  selector: 'app-peliculas',
  templateUrl: './peliculas.component.html',
  styleUrls: ['./peliculas.component.css']
})
export class PeliculasComponent implements OnInit {

  peliculas: Pelicula[] = [];
  pelicula: Pelicula;
  idx: number;

  constructor(private peliculasService: PeliculasService,
              private router: Router) { }

  ngOnInit() {
    this.peliculasService.getPeliculas().subscribe(result => this.peliculas = result);
  }

  verPelicula(idx: number) {
    this.peliculasService.getPelicula(idx).subscribe(result => this.pelicula = result);
    this.router.navigate(['/pelicula', idx]);
  }

}
