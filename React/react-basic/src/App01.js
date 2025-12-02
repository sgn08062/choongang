import logo from './logo.svg';

import { Fragment } from 'react/jsx-runtime';
import './App.css';

function App() {

  const name = "홍길동";
  const age = '30'

  // const myStyle = {
  //   color: "red",
  //   fontSize: 15,
  //   backgroundColor: "blue"
  // }

  return (
    <Fragment>
      <ul>
        <li>1. jsx의 주석은 alt + shift + a {/*  */}</li>
        <li>2. jsx는 반드시 하나의 태그를 return 해주어야 한다</li>
        <li>3. div 태그를 쓰고 싶지 않다면 Fragment 컴포넌트를 사용하면 된다.</li>
        <li>4. 함수 안에서 만들어진 변수는 {name}로 참조할 수 있다.</li>
        <li>5. if문 대신에 3항연산자를 사용한다.</li>
        <li>5. 화면에 보여주고 싶은게 없다면 null을 이용하면 된다.</li>
        <li>7. undefined을 반환하는 상황을 피하는게 좋다.(렌더링은 가능한데, 나중에 부분적인 에러가 발생)</li>
        <li>8. class속성 대신에 className으로 사용한다.</li>
        <li>9. DOM 요소에 css style을 넣을 때는 객체형으로 묶고 속성은 카멜표기법을 사용한다(단위 생략시 px).</li>
        <li>10. 홀로 사용되는 태그는 반드시 닫는 태그를 작성해야 한다</li>
      </ul>

      <div className="my-app" style={{ color: "red", fontSize: 15, backgroundColor: "blue" }}>
        {age >= 20 ? <b>성인입니다</b> : <b>미성년자입니다</b>}
        {name === '이순신' ? <b>이순신입니다</b> : null}
        <img src={logo} width="100" height="100"/>
      </div>
    </Fragment>
  );
}

export default App;
