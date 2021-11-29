import React, { Component } from 'react';
import api from '../../api';
import Headers from '../../Headers';
import './index.css';


class FindRegistroSemanal extends Component {

    state = {
        veiculos: [],
    }

    async componentDidMount() {
        const response = await api.get('/find/registroSemanal');

        this.setState({ veiculos: response.data });

    }

    render() {

        const { veiculos } = this.state;

        return (
            <div>
                <Headers />
                <div className="conteudo">
                    <h1>/find/registroSemanal - Veiculos registrados nos ultimos 7 dias </h1>
                    {console.log(veiculos)}
                    {veiculos.map(veiculo => (
                        <li key={veiculo.id}>
                            <h3>Veiculo: {veiculo.nome} </h3>
                            <p>Marca: {veiculo.marca} </p>
                            <p>Ano: {veiculo.ano} </p>
                            <p>Descricao: {veiculo.descricao}</p>
                            <p>Vendido: {veiculo.vendido}</p>
                            <p>Criado em: {veiculo.criado}</p>
                            <p>Atualizado em: {veiculo.atualizado}</p>

                        </li>
                    ))}
                </div>


            </div>
        );
    };
};

export default FindRegistroSemanal;

