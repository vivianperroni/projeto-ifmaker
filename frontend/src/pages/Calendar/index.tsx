import Calendario from "components/Calendario";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Calendar = () => {
    return (
        <div>
            <>
                <NavBar />
                <div className="container">
                    <h1 className="text-primary py-3">IFMAKER</h1>
                    <Calendario />
                </div>
                <Footer />
            </>
        </div>
    );
}

export default Calendar;