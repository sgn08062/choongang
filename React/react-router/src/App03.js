import axios from 'axios';

function App(){
  /*
  axios의 실행 결과도 Promise 객체이므로 then() 메서드를 사용하여 후속 작업을 처리할 수 있다.
  */
  
  const fetchData = async () => {
    // 순서를 보장하면서 여러 개의 데이터를 가져올 때, 콜백 지옥이 발생할 수 있음.

    // axios.get("https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json")
    // .then(response => {
    //   console.log(response.data);
    //   console.log(1);

    //   axios.get("https://raw.githubusercontent.com/yopy0817/data_example/master/hello.json")
    //   .then(response => {
    //     console.log(response.data);
    //     console.log(2);
        
    //     axios.get("https://raw.githubusercontent.com/yopy0817/data_example/master/by.json")
    //     .then(response => {
    //       console.log(response.data);
    //       console.log(3);
    //     })
    //   })
    // })

    // 콜백 지옥 해결법 async await
    // 1. async 함수 안에서 await을 쓸 수 있음
    // 2. async를 적용하면 함수는 항상 Promise를 반환함.
    // 3. await을 사용하면 then을 생략하고 리턴으로 결과를 받음
    const response1 = await axios.get("https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json")
    console.log(response1.data);

    const response2 = await axios.get("https://raw.githubusercontent.com/yopy0817/data_example/master/hello.json")
    console.log(response2.data);
    
    const response3 = await axios.get("https://raw.githubusercontent.com/yopy0817/data_example/master/by.json")
    console.log(response3.data);

    const response4 = await fetch("https://raw.githubusercontent.com/yopy0817/data_example/master/by.json")
                            .then(response => response.json())
    console.log(response4);
    
    
    
  }

  return (
    <>
      <h3>axios 사용하기</h3>
      <button type="button" onClick={fetchData}>데이터 가져오기</button>
    </>
  )
}

export default App;