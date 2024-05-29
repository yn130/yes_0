if (5 > 3) {
    console.log("집 go");
}

let number = Number(prompt('숫자로 입력해주세요'))
// let number2 = prompt('숫자로 입력해주세요')
// number2 = Number(number);
// if (number > 10) {
//     console.log('입력한 수는 10보다 크다');
// } else {
//     console.log('입력한 수는 10보다 작거나 같다');
// }


if (number > 10) {
    console.log('입력한 수는 10보다 크다');
} else if (number === 10) {
    console.log('입력한 수는 10이다.');
} else {
    console.log('입력한 수는 10보다 작다');
}