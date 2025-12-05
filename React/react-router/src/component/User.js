import { Navigate, useLocation, useSearchParams } from "react-router-dom";

function User(){

  // 쿼리스트링을 받는 방법
  // 1. useLocation 훅을 사용
  // const location = useLocation();
  // console.log(location);
  
  // 2. useSearchParam 사용
  const [obj, func] = useSearchParams();
  console.log(obj);
  let age = obj.get("age");
  let id = obj.get("id");

  // 권한이 없으면 접근하지 못함
  const auth = true; // 권한이 없는 상태라고 가정
  if(!auth){
    // 강제이동 컴포넌트 - replace 속성 true면 현재페이지를 기록에 남기지 않겠음
    return <Navigate to="/" replace={true}/>
  }

  return (
    <>
     <h2>유저 화면</h2>
     쿼리스크림 값: {id}, {age}
    </>
  )
}

export default User;