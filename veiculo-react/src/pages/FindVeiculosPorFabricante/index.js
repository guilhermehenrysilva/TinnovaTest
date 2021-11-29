import React, { Component } from 'react';
import api from '../../api';
import Headers from '../../Headers';
import './index.css';


class FindVeiculosPorFabricante extends Component {

    state = {
        veiculos: [],
    }

    async componentDidMount() {
        const response = await api.get('/find/fabricante');

        this.setState({ veiculos: response.data });

    }

    render() {

        const { veiculos } = this.state;

        return (
            <div>
                <Headers />
                <div className="conteudo">
                    <h1>/find/fabricante - Veiculos por Fabricante </h1>
                    {console.log(veiculos)}
                    {veiculos.map(veiculo => (
                        <li key={veiculo.id}>
                            <p>Marca: {veiculo.marca} </p>
                            <p>Quantidade: {veiculo.quantidade} </p>
                        </li>
                    ))}
                </div>


            </div>
        );
    };
};

export default FindVeiculosPorFabricante;

