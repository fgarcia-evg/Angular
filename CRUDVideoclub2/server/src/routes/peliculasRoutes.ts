import express, { Router } from 'express';

import { peliculasController} from '../controllers/peliculasController';

class PeliculasRoutes {

  public router: Router = Router();

  constructor() {
    this.config();
  }

  config(): void {
    this.router.get('/', peliculasController.list);
    this.router.get('/:codPelicula', peliculasController.getOne);
    this.router.post('/', peliculasController.create);
    this.router.put('/:codPelicula', peliculasController.update);
    this.router.delete('/:codPelicula', peliculasController.delete);
   }

}

const peliculasRoutes = new PeliculasRoutes();
export default peliculasRoutes.router;


