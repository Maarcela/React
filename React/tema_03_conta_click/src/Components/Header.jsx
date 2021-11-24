import { Component } from 'react';
import PropTypes from 'prop-types';

export class Header extends Component {
    render() {
        return (
            <div>
                <h1>Olá, {this.props.nome}, seja bem-vinda!</h1>
            </div>
        );
    }
}

Header.defaultProps = {
    nome: 'Mah',
};

Header.propTypes = {
    nome: PropTypes.string,
};

export default Header;

