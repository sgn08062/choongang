import { useState } from "react";

function EventComponentQ2(){

  const [inputCode, setInputCode] = useState("");
  const [secretCode, setSecretCode] = useState("");

  const handleSecret = () => {
    console.log(inputCode);

    let str = inputCode[0] + inputCode.length;
    
    setSecretCode(str);
    setInputCode('');
  }

  return(
    <>
      <i>시크릿코드 = 첫번째 문자 + 문자열 길이</i><br/>
      <i>abc123의 시크릿 코드 = a6</i><br/>
      <p>클릭시 input 데이터는 공백으로, 결과는 인풋의 시크릿 코드를 출력하시오</p>
    
      <input type="text" name="code" onChange={(e) => {setInputCode(e.target.value)}} value={inputCode}></input>
      <button type="button" onClick={handleSecret}>추가하기</button>
    
      <h3>결과</h3>
      <p>{secretCode}</p>
    </>
  )
}

export default EventComponentQ2;