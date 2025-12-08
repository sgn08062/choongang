import {createSlice} from '@reduxjs/toolkit' // 리덕스를 편리하게 관리하는 모듈

const useSlice = createSlice({
  name: 'user',
  initialState: {name: '이런'},
  reducers: {
    setName: (state, action) => {
      // (스테이트값, dispatch로 전달하는 매개값)
      // action의 payload 속성에 전달받은 매개값이 들어옴
      console.log(action);
      
      state.name = action.payload;
    }
  }
})

export const {setName} = useSlice.actions;
export default useSlice.reducer;