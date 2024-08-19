import { Routes } from '@angular/router';
import { IndexComponent } from './pages/index/index.component';
import { RegisterEventComponent } from './pages/register-event/register-event.component';
import { ListEventsComponent } from './pages/list-events/list-events.component';

export const routes: Routes = [
  {
    path: '',
    component: IndexComponent,
  },
  {
    path: 'register-event',
    component: RegisterEventComponent,
  },
  {
    path: 'list-events',
    component: ListEventsComponent,
  }
];
