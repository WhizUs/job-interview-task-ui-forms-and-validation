import { AfterViewInit, Component } from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';
import { Event } from './types';
import { Location } from '../register-event/types';
import { NgFor } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-list-events',
  standalone: true,
  imports: [
    ReactiveFormsModule,
    NgFor,
    RouterLink,
  ],
  templateUrl: './list-events.component.html',
  styleUrl: './list-events.component.scss'
})
export class ListEventsComponent implements AfterViewInit {
  loading = true;
  error = false;
  events: Event[] = [];

  async ngAfterViewInit() {
    try {
      const eventsResponse = await fetch('/api/events')
      if (eventsResponse.ok) {
        this.events = await eventsResponse.json()
        const locationsResponse = await fetch('/api/locations')
        if (locationsResponse.ok) {
          const locations: Location[] = await locationsResponse.json()
          this.events = this.events.map(event => {
            event.location = locations.find(({ id }) => id === event.locationId)
            const startDate = new Date(event.startDate)
            event.startDate = `${startDate.toLocaleDateString()} ${startDate.toLocaleTimeString()}`

            const endDate = new Date(event.endDate)
            event.endDate = `${endDate.toLocaleDateString()} ${endDate.toLocaleTimeString()}`

            return event
          })
        } else {
          this.error = true;
        }
      } else {
        this.error = true;
      }
    } catch (error) {
      console.error(error)
      this.error = true;
    }
    this.loading = false;
  }
}
