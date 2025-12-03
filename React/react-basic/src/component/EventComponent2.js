import { useState } from "react";

function EventComponent2(){

  // 객체 state 관리
  let [inputData, setInputData] = useState({name: '', topic: ''}); // 초기값

  const handleChange = (e) => {
    // 객체를 복사한 후에, 이벤트가 일어난 키값만 변경
    // 1번째 방법
    // const copy = {...inputData, [e.target.name]: e.target.value};
    // setInputData(copy);

    // 2번째 방법
    setInputData( (prev) => {
      console.log(prev);
      
      return {...prev, [e.target.name] : e.target.value}
    })
  }

  return (
    <>
      현재 state: {inputData.name}, {inputData.topic}
      <br/>
      이름: <input type="text" name="name" onChange={handleChange}></input><br/>
      메모: <input type="text" name="topic" onChange={handleChange}></input>

      <button type="button">클릭</button>
    </>
  )
}

export default EventComponent2;