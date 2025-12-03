import { useState } from "react";

function EventComponent(){

  let [ name, setName] = useState('');
  let [topic, setTopic] = useState('');

  // 이벤트 함수의 첫번째 매개변수에는 event 객체가 전달됨
  const handleChange = (e) => {
    // console.log(e);
    // console.log(e.currentTarget);
    // console.log(e.target);
    // console.log(e.target.value);
    
    setName(e.target.value);
  }

  const handleClick = () => {
    alert(`${name}님의 메모 ${topic}`);
    setName('');
    setTopic('');
  }

  const handleKeyUp = (e) => {
    // 엔터값 감지
    if(e.key === "Enter"){
      handleClick();
    }
  }

  return (
    <>
      현재 state: {name}, {topic}
      <br/>
      이름: <input type="text" name="name" onChange={handleChange} value={name}></input><br/>
      메모: <input 
                  type="text" 
                  name="topic" 
                  onChange={e => setTopic(e.target.value)}
                  value={topic}
                  onKeyUp={handleKeyUp}></input>

      <button type="button" onClick={handleClick}>클릭</button>
    </>
  )
}

export default EventComponent;