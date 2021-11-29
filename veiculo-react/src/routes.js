import React from 'react';
import {BrowserRouter, Switch, Route} from 'react-router-dom';

import Main from './pages/Main';
import FindNaoVendidos from './pages/FindNaoVendidos';
import FindRegistroSemanal from './pages/FindRegistroSemanal';
import FindVeiculosPorFabricante from './pages/FindVeiculosPorFabricante';

function Routes(){
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={Main} />
                <Route path="/naoVendidos" component={FindNaoVendidos} />
                <Route path="/veiculosPorFabricante" component={FindVeiculosPorFabricante} />
                <Route path="/registroSemanal" component={FindRegistroSemanal} />
            </Switch>        
        </BrowserRouter>
    );
};

export default Routes;