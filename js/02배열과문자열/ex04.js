// let x = 100;
// let y = 54;

// let temp = x;
// x = y;
// y = temp;

// console.log(`x = ${[x]}, y = ${y}`);


let arr = [100, 64, 30, 22, 54, 88, 76];

for(let i = 0; i< arr.length; i++){
    for(let j=i+1; j<arr.length; j++){
        if(arr[i]>arr[j]){
            let temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
console.log(arr);
