import { useState, useEffect } from "react";
import axios from 'axios';

function App(){

  /*
    아래 요구사항을 충족하는 코드를 작성하시오.
    https://raw.githubusercontent.com/yopy0817/data_example/refs/heads/master/data.json

    1. 이 페이지가 mount된 이후에 해당 주소로 fetch 요청을 보내 데이터를 받아오세요
    2. 받아온 데이터는 state에 저장하시오.
    3. 화면에는 컴포넌트 반복을 통해서 받아온 데이터를 출력하라.
    4. 이 데이터가 도착하기 전까지는 "데이터 로딩중...."이라는 문구가 보이도록 처리하시오.
  */

  const [board, setBoard] = useState(null);
  useEffect(() => {
    (async() => {
      const data = await axios.get("https://raw.githubusercontent.com/yopy0817/data_example/refs/heads/master/data.json");
      console.log(data.data);
      setBoard(data.data);
    })();
  }, []);


  return(
    <>
      <h3>실습 문제</h3>

      <ul>
        {
          board !== null ? (
            board.map((item, index) => (
              <li key={index}>
                게시물 제목: {item.title}<br/>
                게시물 내용: {item.content}<br/>
                <img src={item.src}/>
              </li>
            ))
          ) : (
            <li>데이터 로딩중....</li>
          )
        }
      </ul>
    </>
  )
}

export default App;