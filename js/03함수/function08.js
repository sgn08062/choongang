// 고차함수 - 함수의 매개변수로 함수가 들어가는 유형 (js가 좋아하는 문법)
// forEach
let arr = [1,2,3,4,5,6,7];
// let mySome =  function(item, index){
//     console.log(`값: ${item}, 인덱스: ${index}`);
// }
// arr.forEach(mySome);

arr.forEach((item, index) => {
    console.log(`값: ${item}, 인덱스: ${index}`);
});

arr.forEach(item => console.log(`값: ${item}`));


console.log(`------------------------`);
//map - 반환에 담긴 값으로 새로운 배열을 만들어서 돌려줌
// let newArr = arr.map(function(item, index){
//     return item * item;
// });

newArr = arr.map(item => item*item);

console.log(newArr);
console.log(`------------------------`);

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// 짝수만 필터링
const evens = numbers.filter(num => num % 2 === 0);
console.log(evens); // [2, 4, 6, 8, 10]

// 5보다 큰 수만 필터링
const greaterThan5 = numbers.filter(num => num > 5);
console.log(greaterThan5); // [6, 7, 8, 9, 10]

// 5보다 크고 짝수만 필터링
const evensGreaterThan5 = numbers
  .filter(num => num > 5)       // 첫 번째 조건: 5보다 큰 수 필터링
  .filter(num => num % 2 === 0);  // 두 번째 조건: 짝수 필터링
console.log(evensGreaterThan5);

