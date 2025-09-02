try{  
    let str = '{name: "홍길동"}';
    let obj = JSON.parse(str);

    console.log(obj);
}catch(error){
    console.log(error, "\nJSON 타입이 아닙니다.");
}finally{ // 옵션 - 에러가 발생하던, 발생하지 않던 무조건 실행될 문장
    console.log("무조건 실행될 문장");
    
}

console.log("정상 종료");
