let str = "hello world javascript";

console.log(`문자열 길이: ${str.length}`);

let s1 = str.charAt(3);
console.log(s1);
console.log(`7번째 문자: ${str.charAt(7)}`);


let s4 = str.substring(6, 11);
console.log(`6~11 사이의 문자열: ${s4}`);

let s5 = str.substring(10);
console.log(`10 미만 문자열 절삭: ${s5}`);


// 특정 위치로 문자열 찾기
console.log(str.indexOf('o', 5)); // 5번째 이후부터 검색

console.log(str.replace("l", "헐")); // 첫번재로 발견되는 1을 헐로 바꿈
