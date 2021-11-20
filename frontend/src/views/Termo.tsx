import React from "react";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

class Termo extends React.Component {
    render() {
        return (
            <div>
                <>
                    <NavBar />
                    <div className="container">
                        <div className="row">
                            <div className="col-md-12" style={{ position: 'relative' }}>
                                <div className="bd-docs-section">
                                    <div className="card text-white bg-primary">
                                        <div className="card-header">Termo de Compromisso da Utilização de Equimamentos</div>
                                        <div className="card-body">
                                            <h5 className="card-title">Declaro para fins de RESPONSABILIDADE,
                                                que utilizarei o(s) equipamento(s) <strong>(Equipamentos)</strong>, em
                                                perfeitas condições de uso, na(s) datas previstas: <strong>(Data)</strong></h5>
                                            <p className="card-text">E me comprometo em substituí-lo em caso de perda
                                                ou estrago irreparável, por um idêntico ou similar.</p>

                                            <div className="form-group">
                                                <label className="form-label">Nome</label>
                                                <input type="label" className="form-control" style={{ maxWidth: '20rem' }} id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Digite o nome completo" />
                                                <small id="emailHelp" className="form-text text-muted">We'll never share your email with anyone else.</small>
                                            </div>
                                            <div className="form-group">
                                                <label className="form-label">Telefone</label>
                                                <input type="number" className="form-control" style={{ maxWidth: '20rem' }} id="exampleInputPassword1" placeholder="Telefone" />
                                            </div>
                                            <div className="form-group" style={{ maxWidth: '20rem' }}>
                                                <label /*for="exampleSelect2"*/ className="form-label mt-4" >Example multiple select</label>
                                                <select /*multiple=""*/ className="form-select" id="exampleSelect2">
                                                    <option>1</option>
                                                    <option>2</option>
                                                    <option>3</option>
                                                    <option>4</option>
                                                    <option>5</option>
                                                </select>
                                            </div>
                                            <div className="form-group" style={{ maxWidth: '20rem' }}>
                                                <label /*for="exampleTextarea"*/ className="form-label mt-4" >Example textarea</label>
                                                <textarea className="form-control" id="exampleTextarea" /*rows="3"*/></textarea>
                                            </div>
                                            <div className="form-group" style={{ maxWidth: '20rem' }}>
                                                <label /*for="formFile"*/ className="form-label mt-4">Default file input example</label>
                                                <input className="form-control" type="file" id="formFile" />
                                            </div>
                                            <button type="button" className="btn btn-secondary" 
                                                style={{ margin: '5px 5px 0 0' }}>Imprimir</button>
                                            <button type="button" className="btn btn-primary"
                                                style={{ margin: '5px 5px 0 0' }}>Imprimir</button>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <Footer />
                </>
            </div >

        );
    }
}

export default Termo;