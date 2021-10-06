import Calendar from 'pages/Calendar';
import Termo from 'pages/Termo';
import Config from 'pages/Config';
import Home from 'pages/Home';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

const Routes = () => {
    return (
        <div>
            <BrowserRouter>
                <Switch>
                    <Route path="/" exact>
                        <Home/>
                    </Route>
                    <Route path="/calendar">
                        <Calendar/>
                    </Route>
                    <Route path="/termo">
                        <Termo/>
                    </Route>
                    <Route path="/config">
                        <Config/>
                    </Route>
                </Switch>
            </BrowserRouter>
        </div>
    );
}

export default Routes;