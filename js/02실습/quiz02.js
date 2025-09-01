// 1. 이 배열의 합계와 평균을 출력해주세요
let number = [10, 20, 30, 40, 50];
let sum = 0, avg;
for(let value of number){
    sum+=value;
}
avg = sum / number.length;
console.log(`number의 합계: ${sum}, 평균: ${avg}`);

console.log(`===================================`);

// 2. 이 배열에서 최대값, 최솟값 찾아서 출력
let score = [85, 92, 70, 96, 91, 60, 100];
let min=score[0], max=0;
for(let value of score){
    if(value > max) max = value;
    else if(value < min) min = value;
}
console.log(`score의 최솟값: ${min}, 최대값: ${max}`);
console.log(`===================================`);

//3. 짝수 필터링
let numbers = [1,2,3,4,5,6,7,8,9,10];
let evenNum=[];

for(let num of numbers){
    if(num%2===0) evenNum.push(num)
}
console.log(evenNum);
console.log(`===================================`);

// 4. 배열의 값을 뒤집어서 reverse 배열에 저장하시오
let arr = [1,2,3,4,5];
let reverse = [];
for(let i = arr.length-1;i>-1;i--){
    reverse.push(arr[i]);
}
console.log(reverse);

console.log(`===================================`);

// 5. target 값이 배열에 포함되어 있으면 해당 인덱스를 출력, 없으면 -1을 출력
let search = ['a', 'b', 'c', 'd', 'e'];
let target  = 'e';

for(let i in search){
    if(target === search[i]){
        console.log(i);
        break;
    }
    else if(i == search.length - 1) console.log(-1);
}
console.log(`===================================`);

// 6. word배열의 문자열의 길이를 저장하는 wordlength배열을 만들어주세요.
let word = ['apple', 'banana', 'melon', 'grape','orange'];
let wordLength = []; // 5,6,5,5,6 문자열 길이는 문자열.length로 확인

for(let w of word){
    wordLength.push(w.length);
}
console.log(wordLength);


console.log(`===================================`);