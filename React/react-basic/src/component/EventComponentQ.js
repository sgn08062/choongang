import { useState } from "react";

function EventComponentQ () {

  const [menu, setMenu] = useState('');

  const handleMenu = (e) => {
    console.log(e);
    
    setMenu(e.target.value);
  }
  return(
    <>
      <i>샐렉트 태그가 체인지 될 때 선택한 결과를 아래에 출력</i>
      <br/>
      <br/>
      <select 
          id="user-food" 
          style={{marginLeft: 10}}
          onChange={handleMenu}>
        <option value="">메뉴 선택</option>
        <option value="피자">피자</option>
        <option value="치킨">치킨</option>
        <option value="햄버거">햄버거</option>
        <option value="국밥">국밥</option>
        <option value="김치찌개">김치찌개</option>
      </select>
      <br/>
      <h2>선택한 결과</h2>
      <p style={{marginLeft: 13}}>{menu}</p>
    </>
  )
}

export default EventComponentQ;