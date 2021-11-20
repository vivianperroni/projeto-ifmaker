import Calendario from '../views/Calendario';
import Termo from '../views/Termo';
import Material from '../views/Material';
import Home from '../views/Home';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import React from 'react';

function Rotas() {
    return (
        <div>
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Home/>}/>
                    <Route path="/calendario" element={<Calendario />}/>
                    <Route path="/termo" element={<Termo/>}/>
                    <Route path="/material" element={<Material/>}/>
                </Routes>
            </BrowserRouter>
        </div>
    );
}

export default Rotas;