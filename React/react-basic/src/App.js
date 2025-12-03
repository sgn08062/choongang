import IterationComponent from "./component/IterationComponent";
import IterationComponent2 from "./component/IterationComponent2";
import IterationComponentQ from "./component/IterationComponentQ";
import IterationComponentQ2 from "./component/IterationComponentQ2";
function App() {

  return (
    <div>
      <h1>컴포넌트 반복</h1>
      <IterationComponent/>
      <hr/>
      <h1>컴포넌트 반복2</h1>
      <IterationComponent2/>
      <hr/>
      <h1>실습</h1>
      <IterationComponentQ/>
      <hr/>
      <h1>실습2</h1>
      <IterationComponentQ2/>
    </div>
  )
}

export default App;