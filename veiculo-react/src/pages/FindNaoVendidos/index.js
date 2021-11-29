import React, { Component } from 'react';
import api from '../../api';
import Headers from '../../Headers';
import './index.css';


class FindNaoVendidos extends Component {

    state = {
        veiculos: [],
    }

    async componentDidMount() {
        const response = await api.get('/find/naoVendidos');

        this.setState({ veiculos: response.data });

    }

    render() {

        const { veiculos } = this.state;

        return (
            <div>
                <Headers />
                <div className="conteudo">
                    <h1>/find/naoVendidos - Exibir quantidade de Veiculos nao vendidos </h1>
                    <p> Quantidade de Veiculos Não Vendidos: {veiculos}  </p>
                </div>


            </div>
        );
    };
};

export default FindNaoVendidos;

