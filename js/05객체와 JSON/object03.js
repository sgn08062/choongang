// JSON -> 자바스크립트 오브젝트 표기법(문자열)
// 네트워크 상에서 데이터를 교환할 때, 사용하는 표준

let obj = {name: "홍길동", age: 20}; // object
let json = '{"name":"홍길동", "age": 25}'; // json

// object => json 형변환
let result = JSON.stringify(obj);
console.log(result);

// json => object 형변환
let result2 = JSON.parse(json);
