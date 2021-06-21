"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const database_1 = __importDefault(require("../database"));
class PeliculasController {
    list(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const peli = yield database_1.default.query('SELECT * FROM peliculas');
            res.json(peli);
        });
    }
    getOne(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const { codPelicula } = req.params;
            const peli = yield database_1.default.query('SELECT * FROM peliculas WHERE codPelicula = ?', [codPelicula]);
            console.log(peli.length);
            if (peli.length > 0) {
                return res.json(peli[0]);
            }
            res.status(404).json({ text: "LA PELICULA NO EXISTE" });
        });
    }
    create(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const result = yield database_1.default.query('INSERT INTO peliculas set ?', [req.body]);
            res.json({ message: 'Pelicula Guardada' });
        });
    }
    update(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const { codPelicula } = req.params;
            const oldGame = req.body;
            yield database_1.default.query('UPDATE peliculas set ? WHERE codPelicula = ?', [req.body, codPelicula]);
            res.json({ message: "Pelicula modificada" });
        });
    }
    delete(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const { codPelicula } = req.params;
            yield database_1.default.query('DELETE FROM peliculas WHERE codPelicula = ?', [codPelicula]);
            res.json({ message: "Pelicula borrada" });
        });
    }
}
exports.peliculasController = new PeliculasController();
