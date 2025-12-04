// 리듀서 함수
export const myReducer = (state, action) => {
  console.log(state);
  console.log(action);

  if(action.type === '증가'){
    state = {count: state.count + 1};
  }else if(action.type === '감소'){
    state = {count: state.count - 1};
  }else if(action.type === '초기화'){
    state = {count : 0};
  }
  
  return state; // 결과 state를 반환
}


// 실습
export const yourReducer = (state, action) => {
  // 1. clear 액션을 받으면 state를 초기화
  // 2. change 액션을 받으면 state를 인풋값으로 변경
  if(action.type === 'change'){
    return {value: action.payload};
  }else if(action.type === 'init'){
    return {value: action.payload};
  }
  
  return state;
}