import { useParams } from "react-router-dom";

function BoardContent(){

  const obj = useParams();
  console.log(obj);
  
  
  return (
    <>
      <h3>글 상세화면</h3>
      {obj.num}번 글입니다.
    </>
  )
}

export default BoardContent;