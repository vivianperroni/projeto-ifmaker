import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Termo = () => {
    return (
        <div>
            <>
                <NavBar />
                    <div className="container term">
                        <h3 className="py-2">Termo de Compromisso da Utilização de Equimamentos</h3>
                        <form>
                            <div className="row">
                                <p><h5>Declaro para fins de RESPONSABILIDADE,
                                que utilizarei o(s) equipamento(s) <strong>(Equipamentos)</strong>, em
                                perfeitas condições de uso, na(s) datas previstas: <strong>(Data)</strong>
                                </h5></p>
                                
                                <p><h5>E me comprometo em substituí-lo em caso de perda
                                ou estrago irreparável, por um idêntico ou similar.  
                                </h5></p>
                            </div>
                            <div className="container">
                            <div className="row">
                                <label><strong><p>Nome:</p></strong><input type="text" name="nome" /></label>
                                <label><strong><p>Telefone:</p></strong><input type="text" name="nome" /></label>
                                <div className="col-md-3">
                                <p>
                                    <select>
                                        <option value="">---Selecione---</option>
                                        <option value="lazer">Lazer de corte</option>
                                        <option value="impressora">Impressora 3D</option>
                                    </select>
                                </p>                                    
                                </div>
                            </div>
                            </div>
                            
                            <div className="row sub">
                                <p><input className="btn btn-nav btn-primary-nav" type="submit" value="Imprimir" /></p>
                            </div>
                        </form>
                    </div>
                <Footer />
            </>
        </div>
    );
}

export default Termo;