function first(){
    console.log("first 함수");
    
}

function second(){
    console.log("second 함수");
    
}

// 즉시실행함수
// 1. 코드의 구조화 -  함수 단위로 묶는다.
// 2. 화면에서 초기에 가동되는 함수를 호출할 용도
(function(msg){
    console.log(msg);

    first();
    second();
})("즉시실행함수 실행");