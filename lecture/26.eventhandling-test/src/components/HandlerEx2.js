import React, { useState } from 'react'

const HandlerEx2 = () => {


    const [message, setMessage] = useState("검정색 글씨");
    const [color, setColor] = useState('black')

    const onClickRed = () => { 
      setMessage('빨간색 글씨')
      setColor('red')
    }
    const onClickBlue = () => {
      setMessage('파랑색 글씨')
      setColor('blue')
    }


  return (
    <div>$
        <h1 style={{color}}>{message}</h1>
        <button onClick={onClickRed}> 빨간색 </button>
        <button onClick={onClickBlue}> 파랑색 </button>
    </div>
  )
}

export default HandlerEx2