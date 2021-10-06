import Calendario from "components/Calendario";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Calendar = () => {
    return (
        <div>
            <>
                <NavBar />
                <div className="container">
                <div className="table-responsive">
                    <table className="table table-striped table-sm">
                        <div className="mes">
                            <thead>
                                <tr>
                                    <th className="prev">&#10094;</th>
                                    <th>Agosto<p>2021</p></th>
                                    <th className="next">&#10095;</th>

                                </tr>
                            </thead>
                        </div>
                        <br></br>
                        <thead>
                            <tr className="diadasemana">
                                <th>Dom</th>
                                <th>Seg</th>
                                <th>Ter</th>
                                <th>Qua</th>
                                <th>Qui</th>
                                <th>Sex</th>
                                <th>Sab</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr className="dias">
                                <td>1</td>
                                <td>2</td>
                                <td>3</td>
                                <td>4</td>
                                <td>5</td>
                                <td>6</td>
                                <td>7</td>
                                <td>8</td>
                                <td>9</td>
                                <td>10</td>
                                <td>11</td>
                                <td>12</td>
                                <td>13</td>
                                <td>14</td>
                                <td><Link to="/Termo"><span className="active">15</span></Link></td>
                                <td>16</td>
                                <td>17</td>
                                <td>18</td>
                                <td>19</td>
                                <td>20</td>
                                <td>21</td>
                                <td>22</td>
                                <td>23</td>
                                <td>24</td>
                                <td>25</td>
                                <td>26</td>
                                <td>27</td>
                                <td>28</td>
                                <td>29</td>
                                <td>30</td>
                                <td>31</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <Calendario />
                </div>
                <Footer />
            </>
        </div>
    );
}

export default Calendar;