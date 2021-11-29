import { Link } from 'react-router-dom';
import React, { useState } from 'react';
import {
    Collapse,
    Navbar,
    NavbarToggler,
    NavbarBrand,
    Nav,
    NavItem,
    NavLink,
    UncontrolledDropdown,
    DropdownToggle,
    DropdownMenu,
    DropdownItem,
    NavbarText
} from 'reactstrap';

const Headers = (props) => {
    const [isOpen, setIsOpen] = useState(false);

    const toggle = () => setIsOpen(!isOpen);

    return (
        <div>
            <Navbar color="secondary" dark expand="md">
                <NavbarBrand href="/">Veiculo-React</NavbarBrand>
                <NavbarToggler onClick={toggle} />
                <Collapse isOpen={isOpen} navbar>
                    <Nav className="mr-auto" navbar>
                        <NavItem>
                            <NavLink href="https://tinnova.com.br/">Site Tinnova</NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink href="https://github.com/guilhermehenrysilva/TinnovaTest">GitHub</NavLink>
                        </NavItem>
                        <UncontrolledDropdown nav inNavbar>
                            <DropdownToggle nav caret>
                                EndPoints
                            </DropdownToggle>
                            <DropdownMenu right>
                                <DropdownItem>
                                    <Link to="/"> GET - Exibir todos os Veiculos </Link>
                                </DropdownItem>

                                <DropdownItem>
                                    <Link to="/naoVendidos"> GET - Exibir não Vendidos </Link>
                                </DropdownItem>

                                <DropdownItem>
                                    <Link to="/veiculosPorFabricante"> GET - Exibir Veiculos por Fabricante </Link>
                                </DropdownItem>

                                <DropdownItem>
                                    <Link to="/registroSemanal"> GET - Exibir Veiculos registrados nos ultimos 7 dias </Link>
                                </DropdownItem>

                                <DropdownItem>
                                    <Link to="#"> GET - Buscar um Veiculo //IMPLEMENTANDO </Link>
                                </DropdownItem>

                                <DropdownItem divider />

                                <DropdownItem>
                                    <Link to="#"> POST - Adicionar Veiculo //IMPLEMENTANDO </Link>
                                </DropdownItem>

                                <DropdownItem divider />

                                <DropdownItem>
                                    <Link to="#"> PUT - Atualizar Veiculo //IMPLEMENTANDO </Link>
                                </DropdownItem>

                                <DropdownItem divider />

                                <DropdownItem>
                                    <Link to="#"> PATCH - Atualizar campo especifico //IMPLE... </Link>
                                </DropdownItem>

                                <DropdownItem divider />

                                <DropdownItem>
                                    <Link to="#"> DEL - Remover um Veiculo //IMPLEMENTANDO </Link>
                                </DropdownItem>

                            </DropdownMenu>
                        </UncontrolledDropdown>
                    </Nav>
                    <NavbarText>Guilherme Silva</NavbarText>
                </Collapse>
            </Navbar>
        </div>
    );
}


export default Headers;