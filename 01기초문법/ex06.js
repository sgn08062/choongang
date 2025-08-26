<<<<<<< HEAD:js/01기초문법/ex06.js
// 자동형변환 -> 연산 시에 자동으로 타입이 변하게 된다.
let num = 10 + 3.14;
console.log(num);

let text = "10" + 3.14 + 5;
console.log(text);

let text2 = 3.14 + 5 + "10";
console.log(text2);

let num2 = "5" * 5; // 빼기, 곱하기, 나누기 시에는 숫자로 변경된다.
console.log(num2);


// 명시적 형변환 -> 강제로 타입을 바꾸는 과정
let result = parseInt("5") + 1;
console.log(result);
console.log(parseInt("바굴 수 없는 값이 들어가면?")); // Not a Number

console.log(parseInt(3.14));

console.log(5 + " ");
=======
// 자동형변환 -> 연산 시에 자동으로 타입이 변하게 된다.
let num = 10 + 3.14;
console.log(num);

let text = "10" + 3.14 + 5;
console.log(text);

let text2 = 3.14 + 5 + "10";
console.log(text2);

let num2 = "5" * 5; // 빼기, 곱하기, 나누기 시에는 숫자로 변경된다.
console.log(num2);


// 명시적 형변환 -> 강제로 타입을 바꾸는 과정
let result = parseInt("5") + 1;
console.log(result);
console.log(parseInt("바굴 수 없는 값이 들어가면?")); // Not a Number

console.log(parseInt(3.14));

console.log(5 + " ");
>>>>>>> 3588bbb52f958459cfd68237f913f4e6d9567b2a:01기초문법/ex06.js
