// 매개변수 - 함수가 전달받는 변수값
// 매개변수는 여러개 일 수도 있다.
function sayHello(name, age){
    console.log(`안녕하세요. ${name}님~`);
    if(age > 19){
        console.log(`${age}살 이시군요. 들어가셔도 됩니다.`);
    }
    else console.log("꺼져");
    
}

// 구구단 수를 매개변수로 전달받아서, 구구단을 출력하는 함수
function gugudan(num){
    console.log(`==== ${num}단 ====`);
    for(let i=1; i<=9; i++){
        console.log(`${num} x ${i} = ${num*i}`);
        
    }
}
sayHello("길동", 18);
sayHello("헬로", 79);
sayHello("경훈", 27);
sayHello("철수");

gugudan(2);
gugudan(5);