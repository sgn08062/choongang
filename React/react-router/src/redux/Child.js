import { useSelector, useDispatch } from "react-redux";
import { decrement, increment } from "./CountReducer";

function Child(){

  // 매개변수 - store에 관리되고 있는 reducer 선택, 반환 - 리듀서 관리되는 값
  const countValue = useSelector( reducer => {
    return reducer.count.value;
  })

  // 리듀서의 상태를 변경하기 위한 함수 dispatch
  const dispatch = useDispatch();

  return(
    <>
      <h3>child 컴포넌트</h3>
      <h3>결과값: {countValue}</h3>
      <button type="button" onClick={() => dispatch(increment())}>증가</button>
      <button type="button" onClick={() => dispatch(decrement())}>감소</button>
    </>
  )
}

export default Child;