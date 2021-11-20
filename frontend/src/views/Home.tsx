import React from "react";
import Footer from "components/Footer"
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";
import 'bootswatch/dist/flatly/bootstrap.css'

class Home extends React.Component {
    render() {
        return (
            <>
                <NavBar />
                <div className="container">
                    <div className="row">
                        <h1 className="col-md-6" style={{ position: 'relative', left: '300px' }} >IFMaker</h1>
                        <p className="lead">Precisa usar algum equipamento? Agende um horário disponível no IFMaker!</p>
                        <hr />
                        <p>O IFMaker é um espaço para desenvolver a criatividade, curiosidade e proativadade de alunos
                            que desejam criar produtos de boa qualidade.</p>

                        <div className="card text-white bg-primary mb-3" style={{ maxWidth: '20rem' }}>
                            <div className="card-header">Header</div>
                            <div className="card-body">
                                <h4 className="card-title">Primary card title</h4>
                                <p className="card-text">Some quick example text to build on the card title
                                    and make up the bulk of the card's content.</p>
                                <Link className="btn btn-nav btn-primary-nav" to="/termo">Termo</Link>
                            </div>
                        </div>
                        <Link className="btn btn-nav btn-primary-nav" to="/calendario">Agendar</Link>
                        <button type="button" className="btn btn-primary">ACESSAR</button>
                    </div>
                </div>
                <Footer />
            </>
        );
    }
}

export default Home;