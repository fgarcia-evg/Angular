import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PeliculasService } from '../../services/peliculas/peliculas.service';

@Component({
  selector: 'app-pelicula',
  templateUrl: './pelicula.component.html',
  styleUrls: ['./pelicula.component.css']
})
export class PeliculaComponent {

  pelicula: any = {};


  // tslint:disable-next-line:variable-name
  constructor( private _activatedRoute: ActivatedRoute,
               // tslint:disable-next-line:variable-name
               private _peliculasService: PeliculasService) {
    this._activatedRoute.params.subscribe(params => {
      this.pelicula = this._peliculasService.getPelicula(params.id);
    });
  }
}
