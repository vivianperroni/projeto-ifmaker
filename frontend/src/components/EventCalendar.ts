export class EventCalendar {

    getEvents() {
        return fetch('assets/data/events.json').then(res => res.json())
                .then(d => d.data);
    }
}