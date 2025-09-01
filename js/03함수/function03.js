// return - 함수가 실행한 결과를 호출구문으로 돌려주는 값
function add(a, b){
    let result = a + b;
    return result;
}


let result = add(4, 6);
console.log(result);
console.log(add(40, 2));

// 리턴이 있는 함수는 함수의 중첩이 가능하다.
console.log(add( add(1, 4), add(6, 9)));


// return