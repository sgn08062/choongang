// 중첩 반복문
// for(let i=1; i<=10; i++){
//     for(let j=1;j<=5; j++)
//         console.log(`${i}와 ${j}`);
//     console.log(`--------------`);
// }

// 2단부터 9단까지 모두 출력
for(let i=2; i<10;i++){
    console.log(`=== ${i}단 ===`);
    for(let j=1;j<10;j++){
        console.log(`${i} x ${j} = ${i*j}`);
    }
    console.log();
    
}