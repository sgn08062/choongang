let star = 5;

let result1=""
for(let i=0; i<star;i++){
    for(let j=0;j<star-i;j++){
        result1 += "*";
    }
    result1+="\n";
}
console.log(result1);