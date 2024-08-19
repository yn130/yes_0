import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { addNumber, removeNumber } from "./store/Counter";


function App() {
  const dispatch = useDispatch();
    const [number, setNumber] = useState(0);
    const globalNumber = useSelector((state) => state.counter.number);
    const onChangeHandler = (e) => {
        const { value } = e.target;
        setNumber(+value);
    };
    const onClickAddNumberHandler = () => {
        dispatch(addNumber(number));
    };
    const onClickSubstractNumberHandler = () => {
        dispatch(removeNumber(number));
    };
    return (
        <div>
            {globalNumber}
            <input type="number" onChange={onChangeHandler} />
            <button onClick={onClickAddNumberHandler}>더하기</button>
            <button onClick={onClickSubstractNumberHandler}>빼기</button>
        </div>
    );
};

export default App;