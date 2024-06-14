// setTimeout(code,deley) 
// : deley(단위 : ms) 시간동안 기다리다가 code 함수를 실행 

// 실행 결과 : 1 -> 3 -> 2
// -> js에서는 setTimeout 함수를 사용했을 때, 기다리지 않고 바로 다음 구문을 실행함
// console.log(1);
// setTimeout(function(){
//  console.log(2);
// }, 2000);
// console.log(3);

/** ---------------비동기 처리 --------------- */

// let product;
// let price;

// function goMart(){
//     console.log('마트에 가서 어떤 음료를 살지 고민한다');
// }

// function pickDrink() {
//     setTimeout(function () {
//         console.log('고민 끝!');
//         product = '제로콜라';
//         price = 2000;
//     }, 3000); 
// }

// function pay(product, price){
//     console.log(`상품명 : ${product} // 가격: ${price}`);
// }

// goMart();
// pickDrink();
// pay(product, price);

// 왜 undefiend가 뜰까? 컴퓨터 입장에서 해석해보자
// 1. product, price 전역 변수 확인
// 2. goMart(), pickDrink(), pay() 함수 정의부
// 3. goMart() 함수 실행: 콘솔 로그 찍음
// 4. pickDrink() 함수 실행
// 4-1. setTimeout 함수에 의해 3초 대기
//      그런데!! JS는 비동기 -> 이 코드가 끝날 때까지 기다리지 않고, 다음 코드 바로 실행~
// 5. pay() 함수 실행 => !!! undefined 출력(문제)
// 5-1. 3초가 지나서
// 5-2. setTimeout의 첫번째 인자인 함수를 실행 
// 5-2-1. 고민 끝 문장이 출력
// 5-2-2. product, price 변수에 값이 할당

/** -----------------------------------------*/ 

// 콜백함수(callback)로 문제를 해결해보자 
// - 다른 함수의 실행이 끝난 뒤에 실행되는 함수
// - js 에서 어떤 함수의 매개변수로 대입되는 함수 

let product;
let price;

function goMart(){
    console.log('마트에 가서 어떤 음료를 살지 고민한다');
}

function pickDrink(callback) {
    //* callback 매개변수 : 콜백함수가 들어올 예정 
    setTimeout(function () {
        console.log('고민 끝!');
        product = '제로콜라';
        price = 2000;
        callback(product, price);
    }, 3000); 
}

goMart();
pickDrink(function pay(product, price){
    console.log(`상품명 : ${product} // 가격: ${price}`);
});










