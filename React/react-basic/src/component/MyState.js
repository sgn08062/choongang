import { useState } from "react";

function MyState(){
// state는 컴포넌트에서 상태를 관리하는 변수이다.
// 함수형 컴포넌트에서 useState 훅으로 관리한다.
// useState는 배열을 반환 [현재 state, set메서드]
  const [msg, setMsg] = useState('초기값');
  const [color, setColor] = useState("black");
  
  const handleMsg = () => {
    //msg = "값을 변경함" // error
    setMsg("값을 변경함");
  }

  const red = {
    color: "red"
  }

  const blue = {
    color: "blue"
  }

  const yellow = {
    color: "yellow"
  }
  
  return (
    <>
      메세지: {msg} <br/>
      메세지 변경: <button type="button" onClick={handleMsg}> 메시지 변경</button><br/>
      메세지 변경: <button type="button" onClick={() => setMsg("인사 꾸벅")}> 인사하기</button>

      <h3 style={{color: color}}>{msg}</h3>
      <button type="button" style={red} onClick={() => setColor("red")}>붉은색</button>
      <button type="button" style={blue} onClick={() => setColor("blue")}>푸른색</button>
      <button type="button" style={yellow} onClick={() => setColor("yellow")}>그 사이 3초 그 짧은 시간</button>
    </>
  )
}

export default MyState;