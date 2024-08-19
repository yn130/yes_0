
import { createSlice } from '@reduxjs/toolkit';

const isVisibleSlice = createSlice({
    name: 'isVisible', 
    initialState: true,
    reducers: {
        changeVisibility: (state) => {
                return !state;
        },
    },
});

export const { changeVisibility } = isVisibleSlice.actions;

export default isVisibleSlice.reducer;






