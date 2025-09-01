/* 매개변수로 배열을 받고, 배열을 반환하는 함수
배열의 값 중에서 홀수만 필터링해서, 새로운 배열을 반환하는 함수
*/

function onlyOdd(arr){
    let oddArr = [];
    for(let num of arr){
        if(num%2 === 1) oddArr.push(num);
    }

    return oddArr;
}

let arr1= [4, 12, 20, 41, 29, 20, 76, 55, 8063, 3020];

let arr2 = onlyOdd(arr1);
console.log(arr2);