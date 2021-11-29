import React, { Component } from 'react';
import api from '../../api';
import Headers from '../../Headers';
import './index.css';


class Main extends Component {

    state = {
        veiculos: [],
    }

    async componentDidMount() {
        const response = await api.get('');

        this.setState({ veiculos: response.data });

    }

    render() {

        const { veiculos } = this.state;

        async function remover(veiculo) {
            const response = await api.delete(`/${veiculo.id}`);
            this.setState({ veiculos: response.data });
        }
        
        return (
            <div>
                <Headers />
                <div className="conteudo">
                    <h1>/Veiculos - Todos os Veiculos </h1>
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

                            <button onClick={remover(veiculo.id)}>Remover Veiculo</button>
                        </li>
                    ))}
                </div>


            </div>
        );
    };
};

export default Main;

