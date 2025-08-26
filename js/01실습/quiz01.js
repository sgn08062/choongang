// 어떤 수에서 랜덤한 값을 빼주면 음수값이 나올 수 있다.
// -5 ~ 5 사이의 랜덤한 값을 출력해줍니다.
// 이 값이 언제든 절대값으로 나오도록 3항 연산식을 세워보자.

var ran = parseInt(Math.random() * 11 - 5);
console.log("랜덤한 값:" + ran);

var abs = ran >= 0 ? ran : -ran;
console.log("절대값:" + abs + "\n");


var ran2 = parseInt(Math.random() * 10 + 1);
console.log(ran2);

var result = ran2 % 3 === 0 ? "3의 배수" : "3의배수가 아닙니다";
console.log(result);