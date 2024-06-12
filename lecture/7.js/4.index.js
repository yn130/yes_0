
const x =5;
const result = x || 100;  // || 연산자이기 때문에 앞의 값이 true면 뒤에 있는 값을 볼 필요 x 따라서 왼쪽값만 출력되고, 100이 출력되지 않음, 
console.log(result); //5 

const y = 7;
const result1 = x<y && 'y가 큼' // && 연산자면 오른쪽 값만 출력됨
console.log(result1); //y가 큼 

//falsy인 경우 = undefined, null, 0, false, '',NaN
let userColor = undefined;
let defaultColor = 'blue';
let currentColor = userColor || defaultColor;
console.log(currentColor);