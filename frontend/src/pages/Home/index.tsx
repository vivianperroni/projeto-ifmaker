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
                    <p className="lead">Agende horários disponíveis para os grupos que precisam utilizar as 
                    ferramentas do espaço do IFMaker</p>
                    <hr />
                    <p>O IFMaker é um espaço para desenvolver a criatividade, curiosidade e proativadade de alunos
                        que desejam criar produtos de boa qualidade.</p>
                    <Link className="btn btn-primary btn-lg" to="/calendar">Agendar</Link>
                </div>
            </div>
        <Footer/>
        </>
    );
}

export default Home;