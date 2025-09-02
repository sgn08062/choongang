/* 
    1. registerUser(유저객체)를 하나 생성합니다.
    2. 전달된 유저객체의 name값이 2글자 이하이거나, 비어있으면 예외처리를 진행한다.
    3. 유저객체 안에 name값이 정상값이라면, 유저의 이름을 반환하는 함수를 생성.
*/

let user = {name: "", addr: "서울시"};

function registerUser(user){
    try{
        if(user.name.length <= 2){
            throw new Error("글자 수가 2 이하입니다.")
        }
        return user.name;
    }catch(error){
        console.log(error);
    }
}

console.log(registerUser(user));
