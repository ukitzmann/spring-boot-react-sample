import React from 'react';
import ReactDOM from 'react-dom';

class App extends React.Component {
    render() {
        return (
            <div className="box">
                Hello World, Uwe!
            </div>
        );
    }
}

ReactDOM.render(<App/>, document.getElementById('app'));