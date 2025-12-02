import { useState } from "react";

function MyStateQ(){
  const [count, setCount] = useState(0);

  const btnStyle = { marginLeft: 10}
  return(
    <div>
      <b style={{paddingLeft: 10, fontSize: 20}}>카운트: {count}</b>
      {/*<button type="button" style={btnStyle} onClick={() => setCount(count+1)}>증가</button> */}
      <button style={btnStyle} onClick={() => setCount( prev => 
      {
        console.log(prev); 
        return prev+1;
      })}>증가</button>
      <button type="button" style={btnStyle} onClick={() => setCount(prev => {
        console.log(prev);
        return prev-1;
      })}>감소</button>
    </div>
  )
}

export default MyStateQ