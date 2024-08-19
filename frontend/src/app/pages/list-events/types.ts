import { Location } from '../register-event/types';

export type Event = {
  type: string;
  title: string;
  description: string;
  startDate: string;
  endDate: string;
  numberOfAttendees: number;
  locationId: number;
  location?: Location;
  locationDirection: string;
  permissionState?: 'granted' | 'denied' | 'pending';
  publicEvent?: boolean;
  internalEventDescription?: string;
};
