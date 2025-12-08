import { useState, useEffect } from "react";

function HookEffect(){

  const [name, setName] = useState('');
  const [age, setAge] = useState('');

  // mount된 이후에 실행됨
  // useEffect(()=>{
  //   console.log(`렌더링 완료: ${name}, ${age}`);
  // });

  // 첫번째 mount 이후에만 딱 한번 실행하려면, 두번째 매개변수 []을 넣어주면 된다.
  useEffect(()=>{
    console.log(`렌더링 완료: ${name}, ${age}`);
  }, [name]);

  // 특정 state가 변경될 때마다 실행시키고 싶으면 [state, state...] 을 넣으면 된다,
  // useEffect(()=>{
  //   console.log(`렌더링 완료: ${name}, ${age}`);
  // }, [name]);
  // console.log(1);
  
  // unmount 되기 이전에 실행시킬 구문이 있으면 return에 함수를 걸어준다.
  // useEffect(() => {
  //   console.log(`렌더링 완료: ${name}. ${age}`);
    
  //   return () => {
  //     console.log("unmount에 실행됨");
  //     console.log(`소멸되기 직전 name값: ${name}`);
  //   } 
  // }, [name])

  return (
    <>
      <input type="text" onChange={(e) => setName(e.target.value)} value={name}/><br/>
      <input type="text" onChange={(e) => setAge(e.target.value)} value={age}/><br/>  
    </>
  )
}

export default HookEffect;