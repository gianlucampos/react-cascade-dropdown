import React, { Component } from 'react'
import axios from 'axios';
import './App.css';

export class CascadingDropdown extends Component {

    constructor(props) {
        super(props)
        this.state = {
            idEstado: '',
            idPais: '',
            paises: [],
            estados: [],
            cidades: []
        }
    }

    componentDidMount() {
        axios.get('http://localhost:8082/app/v1/paises/').then(response => {
            this.setState({
                paises: response.data
            });
        });
    }

    ChangeEstado = (e) => {
        this.setState({ idPais: e.target.value, idEstado: '', cidades: [] });
        axios.get(`http://localhost:8082/app/v1/paises/${e.target.value}/estados`).then(response => {
            this.setState({
                estados: response.data,
            });
        }
        );
    }

    ChangeCidade = (e) => {
        this.setState({ idEstado: e.target.value });
        axios.get(`http://localhost:8082/app/v1/estados/${e.target.value}/cidades`).then(response => {
            this.setState({
                cidades: response.data
            });
        }
        );
    }

    render() {
        return (
            <div>
                <div className="hdr">
                    <div className="col-sm-12 btn btn-info">
                        Dropdown em cascata com React JS
                    </div>
                </div>

                <div className="col-sm-12">
                    <label>País</label>
                    <select className="form-control" name="country" value={this.state.idPais} onChange={this.ChangeEstado}>
                        <option defaultValue={this.state.cidades} hidden>Selecione um País</option>
                        {this.state.paises.map((e, key) => {
                            return <option key={key} value={e.id}>{e.nome}</option>;
                        })}
                    </select>
                    <br/>
                    <label>Cidade</label>
                    <select className="form-control" name="state" value={this.state.idEstado} onChange={this.ChangeCidade} >
                        <option defaultValue={this.state.cidades} hidden>Selecione um Estado</option>
                        {this.state.estados.map((e, key) => {
                            return <option key={key} value={e.id}>{e.nome}</option>;
                        })}
                    </select>
                    <br/>
                    <label>Estado</label>
                    <select className="form-control" name="city">
                        <option defaultValue={this.state.cidades} hidden>Selecione uma Cidade</option>
                        {this.state.cidades.map((e, key) => {
                            return <option key={key} value={e.id}>{e.nome}</option>;
                        })}
                    </select>
                </div>
            </div>
        )
    }
}

export default CascadingDropdown;