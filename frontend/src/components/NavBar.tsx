import React from 'react';
import ImgIfmaker from 'assets/img/ifmaker.jpg';

class NavBar extends React.Component {
    render() {
        return (
            <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 border-bottom shadow-sm" style={{marginBottom: '100px'}}>
                <div className="container">
                    <nav className="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
                        <div className="container">
                            <a className="navbar-brand" href="/"><img src={ImgIfmaker} alt="DevSuperior" width="120" /></a>
                            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
                                <span className="navbar-toggler-icon"></span>
                            </button>

                            <div className="collapse navbar-collapse" id="navbarColor01">
                                <ul className="navbar-nav me-auto">
                                    <li className="nav-item">
                                        <a className="nav-link active" href="/">IFMaker
                                            <span className="visually-hidden">(current)</span>
                                        </a>
                                    </li>
                                    <li className="nav-item">
                                        <a className="nav-link" href="/calendario">Agendamentos</a>
                                    </li>
                                    <li className="nav-item">
                                        <a className="nav-link" href="/material">Cadastro Equip</a>
                                    </li>
                                    <li className="nav-item">
                                        <a className="nav-link" href="/">About</a>
                                    </li>
                                    <li className="nav-item dropdown">
                                        <a className="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="/" role="button" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                                        <div className="dropdown-menu">
                                            <a className="dropdown-item" href="/">Action</a>
                                            <a className="dropdown-item" href="/">Another action</a>
                                            <a className="dropdown-item" href="/">Something else here</a>
                                            <div className="dropdown-divider">

                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>



                </div>
            </div>

        );
    }
}
/*                    <nav className="my-2 my-md-0 mr-md-3">
                        <Link to="/">
                            <img src={ImgIfmaker} alt="DevSuperior" width="120" />
                        </Link>
                        <Link className="btn btn-nav btn-primary-nav" to="/calendario">
                            Agendamentos
                        </Link>                    
                        <Link className="btn btn-nav btn-primary-nav" to="/material">
                            + Equipamentos
                        </Link>                    
                    </nav> */
export default NavBar;
