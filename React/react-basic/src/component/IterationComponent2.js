import { useState } from "react";

function IterationComponent2(){
  // 더미 데이터
  const data = [
    {id: 1, topic: "hello"},
    {id: 2, topic: "world"},
    {id: 3, topic: "good boy"}
  ];

  // state로 관리
  const [list, setList] = useState(data);

  // 반복시켜서 화면에 출력
  const newList = list.map((item) => 
    <li key={item.id} onDoubleClick={() => handleRemove(item.id)}>
      {item.topic}
    </li>)
  
  // 인풋데이터는 state로 관리
  const [inputData, setInputData] = useState("");

  // click 이벤트 추가
  const handleClick = () => {
    const obj = {id: list[list.length-1].id+1, topic: inputData};
    console.log(obj);
    // 배열의 합치기
    // 배열.concat(배열)
    setList(list.concat(obj));
    console.log(list);
    
    setInputData("");
  }

  const handleRemove = (index) => {
    const newItem = list.filter(item => item.id !== index)
    setList(newItem);
  }
  return(
    <>
      <input type="text" onChange={(e) => setInputData(e.target.value)} value={inputData}></input>
      <button type="button" onClick={handleClick}>할일목록추가</button>
      <ul>
        {newList}
      </ul>
    </>
  )
}

export default IterationComponent2;