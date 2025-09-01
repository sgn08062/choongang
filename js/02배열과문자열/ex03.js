/* 
    배열의 반복 
    for문
*/
let arr = [1,2,3,4,5,6,7];
let sum = 0;
//합계
for(let i=0; i<arr.length; i++){
    sum+=arr[i];
    console.log(arr[i]);
    
}
console.log(sum);

// for ~in 구문
for(let i in arr){
    console.log(`인덱스 ${i}, 값 ${arr[i]}`);
}

//for-of 구문
for(let value of arr){
    console.log(`값 ${value}`);
    
}