// 배열의 선언을 new Array() - 추천 방식은 아님

// let arr = new Array(3);
// console.log(arr);


let arr = [1,2,3,4,5];
arr.push(6);
console.log(arr);


let item1 = arr.pop();
console.log(arr);

arr.unshift(100); //배열 앞에서 추가
console.log(arr);


let item2 = arr.shift(); // 배열 앞에서 제거
console.log(item2);
console.log(arr);

//arr.splice(1, 2) //첫번재 인덱스에서, 2개를 제거
//arr.splice(1, 1) // 첫번째 인덱스에서, 1개를 제거
arr.splice(1, 0,'a', 'b', 'c', 'd','e') // 값을 3개 이상 주면, 추가한다.
console.log(arr);

// 탐색 관련 함수
let item3 = arr.indexOf(4); // 4가 있는 위치를 반환하고 없으면 -1을 반환
console.log(item3);

if(arr.includes('a')){ // a가 배열에 있으면 true 반환, 없으면 false 반환
    console.log("a는 존재한다");
}