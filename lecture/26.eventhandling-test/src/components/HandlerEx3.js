import React, { useState } from 'react'

const HandlerEx3 = () => {


    const [message, setMessage] = useState("안녕하세요");

    const [btn, setbtn] = useState("사라져라")

    const onClick = () => {

      setMessage((currentMessage) => {
        return currentMessage === '안녕하세요' ? "" : "안녕하세요";
      })

      setbtn((currentbtn) => {
        return currentbtn === '사라져라' ? "보여라" : "사라져라";
      })
    }


  return (
    <div>
        <button onClick={onClick}> {btn} </button>
        <h1>{message}</h1>
    </div>
  )
}

export default HandlerEx3