import { useDispatch, useSelector } from "react-redux";
import { decrement, increment } from "./redux/CountReducer";
import Child from "./redux/Child";
import { setName } from "./redux/UserReducer";

function App() {
  // store에 등록된 리듀서를 가져올때는 useSelector훅
  // count키는 reducer 안에 정의된 key가 된다

  // 매개변수 - store에 관리되고 있는 reducer 선택, 반환 - 리듀서 관리되는 값
  const countValue = useSelector( reducer => {
    return reducer.count.value;
  })

  const userName = useSelector( reducer => { 
    return reducer.user.name;
  })

  // 리듀서의 상태를 변경하기 위한 함수 dispatch
  const dispatch = useDispatch();

  return(
    <>
      <h1>리덕스 예시</h1>

      <h3>결과값: {countValue}</h3>
      <button type="button" onClick={() => dispatch(increment())}>증가</button>
      <button type="button" onClick={() => dispatch(decrement())}>감소</button>
      <hr/>

      <Child/>
      <hr/>

      <h1>이름 수정 리덕스</h1>
      <h3>이름: {userName}</h3>
      <input type="text" onChange={(e) => dispatch(setName(e.target.value))}></input>
    </>
  )
}

export default App;