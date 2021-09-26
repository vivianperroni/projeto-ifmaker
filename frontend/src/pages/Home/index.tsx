import Footer from "components/Footer"
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
        <NavBar/>
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">IFMaker</h1>
                    <p className="lead">Precisa usar algum equipamento? Agende um horário disponível no IFMaker!</p>
                    <hr />
                    <p>O IFMaker é um espaço para desenvolver a criatividade, curiosidade e proativadade de alunos
                        que desejam criar produtos de boa qualidade.</p>
                    <Link className="btn btn-nav btn-primary-nav" to="/calendar">Agendar</Link>
                </div>
            </div>
        <Footer/>
        </>
    );
}

export default Home;