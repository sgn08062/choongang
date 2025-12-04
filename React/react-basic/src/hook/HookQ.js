import { useEffect, useRef, useState } from "react";

const HookQ = () => {

    const idRef = useRef(null);
    const pwRef = useRef(null);
    const [idPw, setidPw] = useState({id: '', pw: ''});
    /*
    실습
    1. 이페이지가 mount된 즉시 useEffect를 사용하여 id태그에 포커스를 추가해주세요
    */
    useEffect(() => {
        idRef.current.focus();
    }, [])

    /*
    2. state를 활용해서 {id, pw}를 관리하고, 
    로그인 클릭시 공백이라면 공백인 태그에 포커스를 추가하세요.
    로그인 클릭시 공백이 아니라면 경고창으로 입력된 id, pw를 출력해주세요.
    */
    const handleClick = () => {
        console.log(idRef.current);

        const currentId = idRef.current.value;
        const currentPw = pwRef.current.value;
        
        if(currentId === '') return idRef.current.focus();
        else if(currentPw === '') return pwRef.current.focus();

        alert(`아이디: ${currentId}, 비밀번호: ${currentPw}`);
    }

    const handleChange = (e) => {
        setidPw({...idPw, [e.target.name] : e.target.value});
    }


    return (
        <div>
            <input type="text" name="id"     placeholder="아이디" ref={idRef} onChange={handleChange}/><br/>
            <input type="password" name="pw" placeholder="비밀번호" ref={pwRef} onChange={handleChange}/><br/>
            <button type="button" onClick={handleClick}>로그인</button>
        </div>
    )
}

export default HookQ;