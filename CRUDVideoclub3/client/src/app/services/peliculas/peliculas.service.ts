
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pelicula } from 'src/app/models/peliculaStruct';
import { Observable } from 'rxjs';
import {Router} from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class PeliculasService {
  private id: any;


  constructor(private http: HttpClient,
              private router: Router) {
  }

  API_URI = 'http://localhost:3000/api';

  peliculas: Pelicula[];

  getPeliculas(): Observable <Pelicula[]> {
    return  this.http.get<Pelicula[]>(`${this.API_URI}/peliculas`);
  }

  getPelicula(id: number): Observable<Pelicula> {
      console.log ('En peliculas.service: ' + id);
      return this.http.get<Pelicula>(`${this.API_URI}/peliculas/${id}`);
  }

  // getPelicula(idx: number) {
  //   return this.peliculas[idx];
  // }

  // getHero(id: number): Observable<Hero> {
  //   const url = `${this.heroesUrl}/${id}`;
  //   return this.http.get<Hero>(url).pipe(
  //     tap(_ => this.log(`fetched hero id=${id}`)),
  //     catchError(this.handleError<Hero>(`getHero id=${id}`))
  //   );
  // }

  deletePelicula(id: string) {
    return this.http.delete(`${this.API_URI}/peliculas/${id}`);
  }

  savePelicula(peliculas: Pelicula) {
    return this.http.post(`${this.API_URI}/peliculas`, peliculas);
  }

  // updatePelicula(id: string | number, updatePelicula: Peliculas): Observable<Peliculas> {
  //   return this.http.put(`${this.API_URI}/peliculas/${id}`, updatePelicula);
  // }

  buscarPelicula(title: string) {
    const peliculasArr: Pelicula[] = [];
    title = title.toLowerCase();
    {
      // for (const pelicula of this.peliculas ) {
      for (let i = 0; i < this.peliculas.length; i++) {
        const pelicula = this.peliculas[i];
        const titulo = pelicula.titulo.toLowerCase();
        if (titulo.indexOf(title) >= 0) {
          pelicula.idx = i;
          peliculasArr.push(pelicula);
        }
      }
      return peliculasArr;
    }
  }
}

export class Peliculas {
}
