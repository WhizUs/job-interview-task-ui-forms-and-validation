import { Routes } from '@angular/router';
import { IndexComponent } from './pages/index/index.component';
import { RegisterEventComponent } from './pages/register-event/register-event.component';

export const routes: Routes = [
  {
    path: '',
    component: IndexComponent,
  },
  {
    path: 'register-event',
    component: RegisterEventComponent,
  }
];
