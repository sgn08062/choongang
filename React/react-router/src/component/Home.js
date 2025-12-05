import { Link } from "react-router-dom";

function Home(){

  return(
    <>
     <h2>홈 화면</h2>
      <Link to="/user?id=abc123&age=20">유저페이지</Link><br/>
      <Link to="/info/20/홍길동">인포페이지</Link>
    </>
  )
}

export default Home;