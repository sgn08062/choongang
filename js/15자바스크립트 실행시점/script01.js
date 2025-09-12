// 1. window.onload - 화면이 완전히 그려진 이후에 실행
// window.addEventListener("load", () => {
    // let box = document.getElementById("box");

    // box.onclick = function(e){
    //     alert(e.target);
    // }
// })


// 2. document.DOMContentLoaded - 태그가 그려진 이후에 실행(css, 이미지 상관 x)
// document.addEventListener("DOMContentLoaded", () => {
//     let box = document.getElementById("box");
//     box.addEventListener("mouseenter", (e) => {
//         console.log(e.target);
        
//     })
// })

    let box = document.getElementById("box");

    box.onclick = function(e){
        alert(e.target);
    }