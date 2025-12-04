import { useRef } from "react";

function HookRef(){

  // 버튼 클릭 시에 select 태그의 선택되어 있는 값이 필요한 경우.
  // 1. select 태그를 state관리
  // 2. ref를 이용해서 직접 접근


  // 특정 태그에 이름 달기
  const sel = useRef(null); // 사용할 이름 반환

  const handleClick = () => {
    console.log(sel);
    // ref의 current 속성으로 접근하면 태그에 접근이 가능함
    alert(`선택된 값: ${sel.current.value}`)
    
  }

  return (

    <>
      <select ref={sel}>
        <option>피자</option>
        <option>치킨</option>
        <option>햄버거</option>
      </select>

      <button type="button" onClick={handleClick}>클릭</button>
    </>
  )
}

export default HookRef