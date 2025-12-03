

function IterationComponent(){

  // 맵함수
  //const arr = [1, 2, 3, 4, 5];
  // const newArr = arr.map((value, index) => {
  //   return value * 10;
  // })

  // const newArr = arr.filter((value, index) => {
  //   return value % 2 === 0;
  // })
  // console.log(newArr);
  
  const list = ["홍길동", "이순신", "신사임당", "정약용"];
  const newList = list.map((item, i) => <li key={i}>{item}</li>)

  return(
    <>
      <ul>
        {newList}
      </ul>
    </>
  )
}

export default IterationComponent;