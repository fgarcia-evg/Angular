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
               private peliculasServices: PeliculasService){


  }

  ngOnInit() {
    console.log('entra');
   // this.peliculasServices.getPeliculas().subscribe(result => this.peliculas = result);
      // this.activatedRoute.params.subscribe( params => {
    //    this.peliculas = this._peliculaServices.buscarPelicula(params.titulo);
    //    this.titulo = params.titulo;
    //    this.peliculas = this._peliculaServices.buscarPelicula(params.titulo);
    //    console.log(this.titulo);
   // });
  }

  // verPelicula(i: number) {
  //
  // }
}
