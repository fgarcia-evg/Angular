import {Request, Response, text} from 'express';
import pool from '../database';

class PeliculasController {
    public async list(req: Request, res: Response): Promise<void>{
        const peli = await pool.query('SELECT * FROM peliculas');
        res.json(peli);
    }
    public async getOne(req: Request, res: Response): Promise<any> {
        const { codPelicula } = req.params;
        const peli = await pool.query('SELECT * FROM peliculas WHERE codPelicula = ?', [codPelicula]);
        console.log(peli.length);
        if (peli.length > 0) {
            return res.json(peli[0]);
        }
        res.status(404).json({ text: "LA PELICULA NO EXISTE"});
    }

    public async create(req: Request, res: Response): Promise<void> {
        const result = await pool.query('INSERT INTO peliculas set ?', [req.body]);
        res.json({message:'Pelicula Guardada'});
    }

    public async update(req: Request, res: Response): Promise<void> {
        const { codPelicula } = req.params;
        const oldGame = req.body;
        await pool.query('UPDATE peliculas set ? WHERE codPelicula = ?', [req.body, codPelicula]);
        res.json({ message: "Pelicula modificada" });
    }
    public async delete( req: Request, res: Response): Promise<void> {
        const { codPelicula } = req.params;
        await pool.query('DELETE FROM peliculas WHERE codPelicula = ?', [codPelicula]);
        res.json({ message: "Pelicula borrada" });
    }
}

export const peliculasController = new  PeliculasController();
