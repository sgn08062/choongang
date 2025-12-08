import {createSlice} from '@reduxjs/toolkit' // 리덕스를 편리하게 관리하는 모듈

// slice 생성(이름, 초기상태, 리듀서 정의) 하는 객체

const counterSlice = createSlice({
  name: 'counter', // 이름
  initialState: {value: 0}, // 초기 state 값
  reducers: {
    increment: (state) => { state.value += 1; },
    decrement: (state) => { state.value -= 1; }
  }
});

// 액션 생성자 export -> 컴포넌트에서 dispatch할 때 사용
export const {increment, decrement} = counterSlice.actions;
// 리듀서 export -> store에 등록
export default counterSlice.reducer;