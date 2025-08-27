// 문제 1
// 100까지의 수 중에서 3의 배수이면서 4의 배수인 수를 출력

let a=1;
console.log("문제1. 100까지의 수 중에서 3의 배수이면서 4의 배수인 수를 출력");

while(a<=100){
    if(a%12 == 0){
        console.log(a);
    }
    a++;
}


// 문제 2
// 524의 약수의 개수를 구하시오.
let b = 524;
let i = 1;
let count = 0;
while(i<=b){
    if(b%i == 0) count++;
    i++;
}
console.log("문제2. 524의 약수의 개수는 ",count,"개");

// 문제 3
// 100까지의 수 중에서 9의 배수의 합계
let c = 100;
i = 1;
let sum = 0;
while(i<=c){
    if(i%9 == 0){
        sum += i;
    }
    i++;
}
console.log("문제3. 100까지의 수 중 9의 배수의 합계는 ", sum);