import EventComponent from "./component/EventComponent.";
import EventComponent2 from "./component/EventComponent2";
import EventComponentQ from "./component/EventComponentQ";
import EventComponentQ2 from "./component/EventComponentQ2";

function App(){
  return(
    <div>
      <h1>리엑트 이벤트</h1>
      <EventComponent/>
      <hr/>
      <h1>인풋태그 객체로 관리하기</h1>
      <EventComponent2/>
      <hr/>
      <h2>샐렉트 태그 핸들링(실습)</h2>
      <EventComponentQ/>
      <hr/>
      <h2>인풋데이터 핸들링(실습)</h2>
      <EventComponentQ2/>
    </div>
  )
}

export default App;