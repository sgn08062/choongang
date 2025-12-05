import { useParams } from "react-router-dom";

function Info(){

  const params = useParams();
  console.log(params);
  

  return(
    <>
     <h2>인포 화면</h2>
    </>
  )
}

export default Info;