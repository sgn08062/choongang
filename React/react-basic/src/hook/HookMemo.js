import { useState, useMemo } from "react"

function HookMemo(){
  const [num, setNum] = useState(0);
  const [text, setText] = useState('');

  // const calc = () => {
  //   console.log("calc start");
    
  //   let i = 0;
  //   while(i<1000000000) i++;

  //   console.log("calc end");

  //   return num % 2 == 0 ? "짝수" : "홀수";
  // }

  
  const calc = useMemo(() => {
    console.log("calc start");
    
    let i = 0;
    while(i<1000000000) i++;

    console.log("calc end");

    return num % 2 == 0 ? "짝수" : "홀수";
  }, [num]); // 종속성 지정 - num가 변할때만 실행

  return (
    <>
      <input type="number" onChange={(e) => setNum(e.target.value)} value={num}/>
      <input type="text" onChange={(e) => setText(e.target.value)} value={text}/>

      당신이 입력한 값은:  {calc}
    </>
  )
}

export default HookMemo