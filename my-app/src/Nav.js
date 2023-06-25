import React, { useEffect, useState } from 'react';
import './Nav.css';
console.log("relod")
const Nav = () => {
    const [searchQuery, setSearchQuery] = useState('');
    useEffect(() => {
        if (searchQuery) {
            console.log(`${searchQuery}`);
        }
    }, [searchQuery]);
    console.log("relod")
    return (
        <nav>
            <ul>
                <li><a href="/"><i className="fas fa-home"></i></a></li>
                <li><a href="/about"><i className="fas fa-info-circle"></i></a></li>
                <li><a href="/contact"><i className="fas fa-envelope"></i></a></li>
            </ul>
            <div className="search-container">
                <input type="search"
                    placeholder="Search..."
                    value={searchQuery}
                    onChange={(e) => setSearchQuery(e.target.value)}
                />
            </div>
        </nav>
        
    );
};

export default Nav;