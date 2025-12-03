import MyState from "./component/MyState";
import Welcome from "./component/Welcome";
import WelcomeClass from "./component/WelcomeClass"
import MyStateQ from "./component/MyStateQ"

function App() {

  return (
    <div>
      <h2>Props 확인하기</h2>
      <b>상위 컴포넌트에서 하위 컴포넌트로 전달하는 매개변수이다.<br/>
      하위 컴포넌트에서는 첫번째 매개변수로 props를 받을 수 있다.<br/>
      하위 컴포넌트에서 사용할 때는 중괄호를 이용해서 받을 수 있다.</b>
      <Welcome name="홍길동" age={20} addr="서울시"/>
      <br/>
      <Welcome name="이순신" addr="경기도" age={40}/>
      <br/>
      <Welcome />

      <hr/>
      <h2>state값 확인하기</h2>
      <MyState/>
      <hr/>
      <h2>실습(MyStateQ)</h2>
      <MyStateQ/>
      <hr/>
      <WelcomeClass name={"홍길동"} age={20}/>
    </div>
  )
}

export default App;