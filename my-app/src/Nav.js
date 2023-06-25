import React from 'react';
import './Nav.css';

const Nav = () => {
    return (
        <nav>
            <ul>
                <li><a href="/"><i className="fas fa-home"></i></a></li>
                <li><a href="/about"><i className="fas fa-info-circle"></i></a></li>
                <li><a href="/contact"><i className="fas fa-envelope"></i></a></li>
            </ul>
        </nav>
    );
};

export default Nav;