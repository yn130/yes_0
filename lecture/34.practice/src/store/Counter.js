// src/modules/counter.js

//Action Value
const ADD_NUMBER = 'ADD_NUMBER';
const SUBSTRACT_NUMBER = 'SUBSTRACT_NUMBER';
//Action Creator
export const addNumber = (payload) => {
    return {
        type: ADD_NUMBER,
        payload: payload,
    };
};
export const removeNumber  = (payload) => {
    return {
        type: SUBSTRACT_NUMBER,
        payload: payload,
    };
};
//Initial State
const initialState = {
    number: 0,
};
//Reducer
const counter = (state = initialState, action) => {
    switch (action.type) {
        case ADD_NUMBER: {
            return {
                number: state.number + action.payload,
            };
        }
        case SUBSTRACT_NUMBER: {
            return {
                number: state.number - action.payload,
            };
        }
        default:
            return state;
    }
};
//export default reducer
export default counter;