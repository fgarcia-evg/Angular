import { Component, OnInit, HostBinding } from '@angular/core';
import { Pelicula } from 'src/app/models/peliculaStruct';
import { ActivatedRoute, Router } from '@angular/router';
import { PeliculasService } from '../../services/peliculas/peliculas.service';

@Component({
  selector: 'app-peliculas-form',
  templateUrl: './peliculas-form.component.html',
  styleUrls: ['./peliculas-form.component.css']
})
export class PeliculasFormComponent implements OnInit {

  @HostBinding('class') classes = 'row';


  pelicula: Pelicula = {
    titulo: '',
    anio: '',
    duracion: 0,
    pais: '',
    director: '',
    guion: '',
    productor: '',
    genero: '',
    portada: '',
    sinopsis: '',
    fechaLanzamiento: new Date(),
    precioVenta: 0,
    precioAlquiler: 0
   };

  constructor(private peliculasService: PeliculasService,
              private router: Router, private  activedRoute: ActivatedRoute) { } // instanciar el servicio.

  ngOnInit(): void {
    const params = this.activedRoute.snapshot.params; // Sirve para recoger el parametro de la url.
    // console.log(params); // Devuelve la id, que consigue la url
  }

  // Envia los datos
  saveNewPelicula() {
    this.peliculasService.savePelicula(this.pelicula).subscribe(
      res => {
        console.log(res);
        this.router.navigate(['/peliculas']); // Guarda la array y lo regresa a /peliculas
      },
      err => console.error(err)
    );

    console.log(this.pelicula); // Muestra los datos por consulta
  }

}
