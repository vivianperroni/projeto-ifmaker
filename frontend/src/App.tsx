import Calendario from "components/Calendario";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div>
        <h1 className="text-primary">IFMAKER</h1>
        <Calendario/>
      </div>
      <Footer />
    </>
  );
}

export default App;
