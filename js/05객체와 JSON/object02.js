// 배열안에 객체가 저장되는 형태
let list = [
    {id: 1, title: "hello", content:"아ㅏㅏㅏ", subject: ["java"]},
    {id: 2, title: "bye bye", content: "님아;;;", subject: ["css", "js"]},
    {id: 3, title: "say good bye", content: "집에 가고 싶다", subject: ["python", "c/c++"]}
];

console.log(list[0].title, list[0]["title"]);
console.log(list[1].subject[1]);

// 배열을 반복으로
for( let i = 0; i< list.length; i++){
    console.log(list[i].id);
    console.log(list[i].title);
    console.log(list[i].content);
    console.log(list[i].subject); 
}