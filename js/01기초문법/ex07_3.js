let a = 3;
a += 3;
a =+ 3; // a = +3. 그래서 a는 최종적으로 3이 대입된다.
console.log(a);

let score = 10;
score -= 5;
console.log(score);
score *= 6;
console.log(score);
score /= 4;
console.log(score);
score %= 3;
console.log(score);

// 프로그램에는 랜덤한 값을 만드는 경우가 필요하다
let ran = parseInt(Math.random()*10); // 0 이상 1 미만의 랜덤한 실수값을 만들어 준다.
console.log(ran);
let result = ran % 2 === 0 ? "짝수" : "홀수";
console.log(result);
