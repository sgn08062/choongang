/* 
1. palindrome 매개변수로 String 값을 받아, 회문 여부를 검사하는 함수입니다.
2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
4. 문장은 공백을 포함하여 받을 수 있습니다.
5. 회문이라면 true, 아니라면 false 를 리턴합니다.
*/

function palindrome(param){
    let word = param.replaceAll(" ",  "");
    return word === word.split("").reverse().join("");
}