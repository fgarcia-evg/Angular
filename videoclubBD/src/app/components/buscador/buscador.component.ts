import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PeliculasService } from '../../services/peliculas/peliculas.service';

@Component({
  selector: 'app-buscador',
  templateUrl: './buscador.component.html'

})
export class BuscadorComponent implements OnInit {

  peliculas: any[] = [];
  titulo: string;

  constructor( private activatedRoute: ActivatedRoute,
               private _peliculaServices: PeliculasService){


  }

  ngOnInit() {
    this.activatedRoute.params.subscribe( params => {
      this.titulo = params.titulo;
      this.peliculas = this._peliculaServices.buscarPelicula(params.titulo);
      console.log(this.titulo);
  });
  }

  // verPelicula(i: number) {
  //
  // }
}
