/* 
    배열 - 여러 값을 저장할 수 있는 상자
    배열은 순서를 가진다. 0부터 시작한다
*/

let arr = [];
arr.push(4);
arr.push(6);
arr.push(10);
arr.push(1);
arr.push(196);

for(let n in arr){
    console.log(arr[n]);
}

// 배열의 길이를 확인
console.log("배열의 길이: ", arr.length);


console.log("----------------------------");

// 문자열을 저장하는 배열
let arr2 = ["바나나", "사과", "수박"];
console.log(arr2);

// JS에서는 배열에 서로 다른 데이터타입을 저장할 수 있다.
// 하지만 데이터 안정성이 없어서 비추
let arr3 = [1, 2, 3, "홍길동", true];