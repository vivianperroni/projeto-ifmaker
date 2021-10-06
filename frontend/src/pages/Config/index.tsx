import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Config = () => {
    return (
        <div>
            <>
                <NavBar />
                    <div className="container caixa">
                        <h3 className="py-2">ADICIONAR EQUIPAMENTO</h3>
                        <form>
                            <div className="row">
                                <label><p><strong>Titulo:</strong></p><input type="text" name="titulo" /></label>
                            </div>
                            <div className="row desc">
                                <label><p><strong>Descrição:</strong></p><input type="text" name="descricao" /></label>
                            </div>
                            <div className="row sub">
                                <p><input className="btn btn-nav btn-primary-nav" type="submit" value="Enviar" /></p>
                            </div>
                        </form>
                    </div>
                <Footer />
            </>
        </div>
    );
}

export default Config;