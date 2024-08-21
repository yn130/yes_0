// 1. 아래와 같이 오브젝트, 불리언(boolean) 데이터 타입 순으로 설정하는 튜플 만들어보기

// let olimpic_newgame: (object | boolean) = [
//       {
//         name: "쇼트트랙",
//         type: "혼성 계주",
//       },
//       true,
//     ];
    
// console.log(olimpic_newgame);

//2. olimpic_newgame[1]=false; 를 했을 때 변경되지 않도록 수정할 수 없는 데이터 만들기

let olimpic_newgame: readonly [object, boolean] = [
  {
    name: "쇼트트랙",
    type: "혼성 계주",
  },
  true,
];
// olimpic_newgame[1]=false;
console.log(olimpic_newgame);



// --------------------------------------------------------------------------------- //

interface Game {
    title : string
    price : number
    desc? :string
    category : string
    platform : string
  }


let heroGame_A: Game = {
    title: 'DC 언체인드',
    price: 50000,
    desc: 'DC 히어로 & 빌런 각각의 개성은 물론, 액션의 재미까지!',
    category: '액션',
    platform: '모바일',
  }
  
  let heroGame_B: Game = {
    title: 'MARVEL 퓨처파이트',
    price: 65000,
    category: '롤플레잉',
    platform: '모바일',
  }

// --------------------------------------------------------------------------------- //
// 두 개의 수를 매개 변수로 받고 합을 console.log 로 출력하는 함수 sum1 만들기
// sum1(5, 11); // 테스트는 이렇게 하기!

function sum1(a: number, b: number): void {
    console.log(a + b);
}

sum1(5, 11); 


// 매개 변수로 여러 개의 수를 받고 전달된 값을 모두 더하는 함수 sum2
// 모두 합산한 값을 "return" 합니다.
// Hint: 전개 연산자 이용하기

function sum2(...numbers: number[]): number {
    let total: number = 0;  
    numbers.forEach((num) => {
        total += num;
    });
return total;
}
    


console.log(sum2(1, 2, 3, 4, 10)); 
