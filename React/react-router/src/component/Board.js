import { NavLink, Link, Outlet } from "react-router-dom";

function Board(){

  const styling = {
    color: 'red',
    backgroundColor: 'yellow'
  }

  return (
    <>
      <h2> 글 목록 화면</h2>

      {/* <ul>
        <li><Link to='/board/1'>글1</Link></li>
        <li><Link to='/board/2'>글2</Link></li>
        <li><Link to='/board/3'>글3</Link></li>
      </ul> */}

      <ul>
        <li><NavLink to='/board/1' style={({isActive}) => isActive ? styling : undefined}>글1</NavLink></li>
        <li><NavLink to='/board/2' style={({isActive}) => isActive ? styling : undefined}>글2</NavLink></li>
        <li><NavLink to='/board/3' style={({isActive}) => isActive ? styling : undefined}>글3</NavLink></li>
      </ul>
      {/* 중첩 라우팅에서 자식태그가 보여질 영역 */}
      <Outlet/>
    </>
  )
}

export default Board;