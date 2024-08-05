import React, { Component } from 'react'
import PropTypes from 'prop-types';

export default class Console extends Component {

    render() {
      const {text} = this.props;

    return (
      <div>
        <h1> {text} </h1>
        <button onClick={() => {
            console.log("콘솔 띄우기 성공!");
        }}> 클릭 </button>
      </div>
    )
  }
}
Console.defaultProps = {
    text : '이건 기본 text props입니다.'
}

Console.propTypes = {
    text : PropTypes.string
}
