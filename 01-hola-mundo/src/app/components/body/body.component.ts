import { Component } from '@angular/core';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html'

})
export class BodyComponent {

  mostrar = "true";
  frase: any = {
    mensaje: ' una frase',
    autor: 'Su autor'
  };

  personajes: string[] = ['Spiderman', 'Venon', 'Superman'];
}
