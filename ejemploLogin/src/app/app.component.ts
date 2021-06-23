import { Component } from '@angular/core';
import { CookieService } from 'ng2-cookies';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
})
export class AppComponent {
  title = 'ejemploLogin';
  cookies: Object;
}
