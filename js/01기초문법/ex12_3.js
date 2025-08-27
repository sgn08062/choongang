// 반복문에서 조건식의 다양성

let x = 12311;
let i = 2;
while(x%i !== 0){
    i++;
}

if(x === i){
    console.log("x는 소수입니다");
}else{
    console.log("x는 소수가 아닙니다.");
    console.log(i);
    
}