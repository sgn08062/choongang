// store - 리듀서를 통해서 상태를 관리하고, 상태들을 중앙에서 보관하는 저장소
// 리덕스 툴킷의 store
import {configureStore} from '@reduxjs/toolkit'
// 이전에 만들었던 리듀서
import CountReducer from './CountReducer'
import UserReducer from './UserReducer'
// 스토어 생성 - 리듀서를 등록
export const store = configureStore({
  reducer: {
    count: CountReducer, // 여기에 등록한 key는 컴포넌트에서 사용된다.
    // 여기에는 여러 리듀서들을 지정할 수 있음
    user: UserReducer
  }
})

// 1. 여러분이 사용하고 싶은 이름으로 UserReducer 등록
// 2. Child 컴포넌트에서는 input 태그의 값을 state로 관리
// 3. Child 컴포넌트에서 버튼을 클릭하면, dispatch를 통해서 2번의 값을 reducer로 전달