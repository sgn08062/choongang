function sayHello(){
    console.log("안녕하세요!!");
}
sayHello();
sayHello();
sayHello();


gogodan();
// 구구단을 출력하는 함수
function gogodan(){
    console.log("====== 2단 =====");
    for(let i=1; i<=9; i++){
        console.log(`2 xx ${i} = ${2*i}`);
    }
}