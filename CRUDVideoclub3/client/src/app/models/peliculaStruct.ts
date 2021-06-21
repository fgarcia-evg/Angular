export interface Pelicula {
  codPelicula?: number;
  titulo?: string;
  anio?: string;
  duracion?: number;
  pais?: string;
  director?: string;
  guion?: string;
  productor?: string;
  genero?: string;
  portada?: string;
  sinopsis?: string;
  fechaLanzamiento?: Date;
  precioVenta?: number;
  precioAlquiler?: number;
  numEjemplares?: number;
  numEjemplaresPrestados?: number;
  idx?: number;
}
