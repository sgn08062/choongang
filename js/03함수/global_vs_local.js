// var 변수의 scope는 함수이다.
if(true){
    var x = 10;
    let y = 20;
}

console.log(x);
console.log(y);

let a = "홍길동";
let some = function(){
    console.log(a);

    let b = "이순신"
}
console.log(b);
