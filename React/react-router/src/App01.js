import { Route, Routes } from "react-router-dom";
import Header from "./layout/Header";
import Home from "./component/Home";
import User from "./component/User";
import Info from "./component/Info";
import Board from "./component/Board";
import BoardContent from "./component/BoardContent";
function App() {
  return (
    <Routes>
     {/* 최상 index.js를 BrowserRouter컴포넌트로 감싸줍니다 */}
      <Route element={<Header/>}>
        <Route path="/" element={<Home/>}/>
        <Route path="/user" element={<User/>}/>
        {/* 쿼리 파라미터를 넘길 때 변수 설정 */}
        <Route path="/info/:age/:name" element={<Info/>}/>
      </Route>

      {/* 각각 다른 화면을 보여주게 하려면 */}
      {/* <Route path="/board" element={<Board/>}/>
      <Route path="/board/:num" element={<BoardContent/>}/> */}

      {/* 중첩 라우팅 설정 - 자식이 보여줄 영역 Outlet 선언 */}
      <Route path="/board" element={<Board/>}>
        <Route path=":num" element={<BoardContent/>}/>
      </Route>
    </Routes>
  );
}

export default App;