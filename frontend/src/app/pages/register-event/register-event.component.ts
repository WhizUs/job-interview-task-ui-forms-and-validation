import { AfterViewInit, Component } from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';
import {FormControl} from '@angular/forms';
import { Location } from './types';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-register-event',
  standalone: true,
  imports: [
    ReactiveFormsModule,
    RouterLink,
  ],
  templateUrl: './register-event.component.html',
  styleUrl: './register-event.component.scss'
})
export class RegisterEventComponent implements AfterViewInit {
  loading = true;
  error = false;
  success = false;
  locations: Location[] = []

  type = new FormControl<'meeting' | 'event'>('meeting')
  startDate = new FormControl('')
  startTime = new FormControl('')
  endDate = new FormControl('')
  endTime = new FormControl('')
  numberOfAttendees = new FormControl<number>(2)
  title = new FormControl('')
  description = new FormControl('')
  locationId = new FormControl<number>(2)
  directions = new FormControl('')
  publicEvent = new FormControl(false)
  internalEventDescription = new FormControl('')

  async ngAfterViewInit() {
    try {
      const locationsResponse = await fetch('/api/locations')
      if (locationsResponse.ok) {
        this.locations = await locationsResponse.json()
        if (this.locations.findIndex(({ id }) => id === 2) !== -1) {
          this.locationId.setValue(2)
        } else {
          this.locationId.setValue(this.locations[0].id)
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

  async createEvent(event: Event) {
    this.loading = true;
    this.error = false
    this.success = false

    event.preventDefault();

    console.log(this.startDate.value)
    console.log(this.startTime.value)

    const data = {
      type: this.type.value,
      title: this.title.value,
      description: this.description.value,
      startDate: `${this.startDate.value}T${this.startTime.value}:00.000Z`,
      endDate: `${this.endDate.value}T${this.endTime.value}:00.000Z`,
      numberOfAttendees: this.numberOfAttendees.value,
      locationId: this.locationId.value,
      locationDirection: this.directions.value,
    }

    try {
      const response = await fetch('/api/events', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
      })

      if (response.ok) {
        this.success = true;

        this.resetForm();
      } else {
        this.error = true;
      }
    } catch (error) {
      console.error(error)
      this.error = true;
    }

    this.loading = false
  }

  resetForm() {
    this.type.setValue('meeting')
    this.startDate.setValue('')
    this.startTime.setValue('')
    this.endDate.setValue('')
    this.endTime.setValue('')
    this.numberOfAttendees.setValue(2)
    this.title.setValue('')
    this.description.setValue('')
    this.locationId.setValue(2)
    this.directions.setValue('')
  }
}
