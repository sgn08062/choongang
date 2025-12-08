import HookEffect from "./hook/HookEffect"
import HookQ from "./hook/HookQ"
import HookRef from "./hook/HookRef"
import HookReducer from "./hook/HookReduecer"
import HookMemo from "./hook/HookMemo"
import HookCallback from "./hook/HookCallback"

function App(){
  return (
    <>
      <h1>HookEffect</h1>
      <HookEffect/>
      <hr/>

      <h1>HookRef - 이름 붙이기</h1>
      <HookRef/>
      <hr/>
      
      <h1>HookQ</h1>
      <HookQ/>
      <hr/>

      <h1>useReducer - 외부에서 state 관리</h1>
      <HookReducer/>
      <hr/>

      <h1>useMemo - 렌더링 최적화</h1>
      <HookMemo/>
      <hr/>

      <h1>useCallback - 렌더링 최적화</h1>
      <HookCallback/>
      <hr/>

    </>
  )
}

export default App