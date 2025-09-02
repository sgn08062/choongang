// 객체 - {키: 값} 형태로 여러값을 저장해놓은 구조.

let person = {
  name: "지민",
  age: 25,
  isStudent: true
};

console.log(person.name);      // 지민
console.log(person["age"]);    // 25

person.job = "개발자";           // 추가
person.age = 26;               // 수정
delete person.age;

// 객체에는 함수도 저장될 수 있다
// this키워드는 자기 자신을 의미한다.
let people = {
    name: "길동",
    sayHello: function(){
        console.log("저의 이름은" + this.name + " 입니다.");
    }
}

people.sayHello();

console.log(`---------------------`);
// 본인 이름의 객체를 생성
// 키값: name, age, cm, hello 함수, hobby 배열

let lkh = {
    name: "이경훈",
    age: "25",
    cm: "168",
    hello: function(){
        console.log("안녕하세요. 제 이름은 " + this.name + "이구요 나이는 " + this.age + "입니다.\n"
            + "취미는 " + this.hobby+"가 있습니다."
        );
        
    },
    hobby: ["게임", "쇼핑", "청소"]
}

lkh.hello();
