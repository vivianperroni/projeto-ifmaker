import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { useState, useEffect } from 'react';
import FullCalendar from '@fullcalendar/react';
import dayGridPlugin from '@fullcalendar/daygrid';
import timeGridPlugin from '@fullcalendar/timegrid';
import interactionPlugin from '@fullcalendar/interaction';
import { EventCalendar } from 'components/EventCalendar';

const Calendario = () => {
    const [events, setEvents] = useState([]);
    const eventCalendar = new EventCalendar();

    useEffect(() => {
        eventCalendar.getEvents().then(data => setEvents(data));
    }, []); // eslint-disable-line react-hooks/exhaustive-deps

    return (
        <div>
            <NavBar />
            <div className="container"></div>
            <div className="card" >
                <FullCalendar events={events} initialDate="2021-11-01" initialView='dayGridMonth' 
                plugins={[dayGridPlugin, timeGridPlugin, interactionPlugin]}
                    headerToolbar={{ left: 'prev,next today', center: 'title', right: 'dayGridMonth,timeGridWeek,timeGridDay' }} 
                    editable selectable selectMirror dayMaxEvents />
            </div>
            <Footer />
        </div>
    );
}


/*
class Calendario extends React.Component {
    render() {
        return (
            <div>
                <NavBar />
                <div className="container">

                </div>
                <Footer />
            </div >
        );

    }
}*/

export default Calendario;