import { useEffect, useState } from "react";


function App(){
  //const [data, setData] = useState({userId: '', userPw: '', userName: ''});
  const [data, setData] = useState(null);
  const [raw, setRaw] = useState(null);
  
  // 1. 이벤트로 데이터 가져오기
  const fetchData = () => {
    fetch("https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json")
    .then(response => {
      return response.json();
    })
    .then(data => {
      setData(data);
    })
  }

  // 2. 화면 로딩 시에 데이터 가져오기
  useEffect(() => {
    fetch("https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json")
    .then(response => {
      return response.json();
    })
    .then(raw => {
      setRaw(raw);
    })
  }, []);
  

  return(
    <>
      <h3>fetch로 데이터 가져오기</h3>
      <button type="button" onClick={fetchData}>데이터 가져오기</button>

      {
        data !== null ? <div>
        결과: {data.userId} / {data.userName} / {data.userPw}
        </div>
        :
        <div>데이터 준비중</div>
      }

      <h3>화면 로딩시에 데이터 가져오기</h3>
      {
        raw && <div>
          결과: {raw.userId} / {raw.userName} / {raw.userPw}
        </div>
      }
    </>
  )
}

export default App;