import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import {Router} from '@angular/router';
import { PeliculasService } from '../../services/peliculas/peliculas.service';
import { Pelicula } from '../../models/peliculaStruct';
import { PeliculasComponent } from '../peliculas/peliculas.component';

@Component({
  selector: 'app-pelicula-tarjeta',
  templateUrl: './pelicula-tarjeta.component.html',
  styleUrls: ['./pelicula-tarjeta.component.css']
})
export class PeliculaTarjetaComponent implements OnInit {

 // peli: any = [];

  @Input()  pelicula: Pelicula = {};
  @Input()  index: number;


  @Output() peliculaSeleccionada: EventEmitter<number>;

  constructor(private router: Router,
              private peliculasService: PeliculasService,
              private peliculasComponent: PeliculasComponent) {
              this.peliculaSeleccionada = new EventEmitter();
   }


  ngOnInit() {
    // this.peliculasService.getPeliculas().subscribe(result => this.pelicula = result);
    //  this.peliculasService.getPeliculas().subscribe (
    //   res => {
    //     console.log(res);
    //    // this.peli = res;
    //   },
    //    err => console.error(err)
    // );
  }

  verPelicula(index: number ) {
    this.index = index;
    console.log ('en pelicula-tarjeta ' + index);
    this.router.navigate(['/pelicula', this.index ]);
    this.peliculasService.getPelicula(this.index).subscribe(result => this.pelicula = result);
    this.peliculaSeleccionada.emit( this.index );
  }

}
