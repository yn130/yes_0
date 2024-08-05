import React, { Component } from 'react'

export default class HandlerEx extends Component {


    state = {
        text: "Hello World!"
    };


  render() {
    const {text} = this.state;
    return (
      <div>
        <h1> {this.state.text} </h1>
        <button onClick={() => {
          this.setState({text: "Goodbye World! "})

        }}>클릭</button>
      </div>
    )
  }


// ----------------------------------------------------  //



}
