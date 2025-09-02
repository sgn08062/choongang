// 화살표 함수
// 익명함수가 => 화살표 함수로 변경

// 익명 함수
// let add = function(a, b){
//     return a + b;
// }

// 화살표 함수
// let add = (a, b) => {
//     return a + b;
// }

// 규칙 1. 코드가 한줄이면 {}와 return 생략할 수 있다.
let add = (a, b) => a + b;
let hello = () => console.log("안녕하세요");


// 규칙2. 매개변수가 하나이면 소괄호 생략가능
let square = x => x*x;
let x = a => a%2 === 0 ? "짝수" : "홀수";

// 규칙3. 객체 반환 시  ()로 감싸야 함.
let person = () => ({name:"철수"});

console.log(person());
console.log("=====================");


// 선언적 함수
function myName(name, age){
    return `${name}님의 나이는 ${age}입니다`;
}
// 익명 함수
let myNameAnony = function(name, age) {
    return `${name}님의 나이는 ${age}입니다`;
}
// 화살표 함수
let myNamePoint = (name, age) => `${name}님의 나이는 ${age}입니다`;

console.log("---- 익명 함수 ----");
console.log(myNameAnony("이경훈", 25));
console.log();

console.log("---- 화살표 함수 ----");
console.log(myNamePoint("이경훈", 25));