import ImgIfmaker from 'assets/img/ifmaker.jpg';
import { Link } from 'react-router-dom';

const NavBar = () => {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 border-bottom shadow-sm">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <Link to="/">
                        <img src={ImgIfmaker} alt="DevSuperior" width="120" />
                    </Link>
                    <Link className="btn btn-nav btn-primary-nav" to="/calendar">
                        Agendamentos
                    </Link>                    
                    <Link className="btn btn-nav btn-primary-nav" to="/config">
                        + Equipamentos
                    </Link>                    
                </nav>
            </div>
        </div>

    );
}

export default NavBar;
