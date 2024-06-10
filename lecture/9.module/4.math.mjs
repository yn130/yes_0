// es6 모듈 형식으로 확장자가 mjs 임 
// 이 모듈은 가저올 때 import를 사용한다.
// 실행 시 확장자를 적어야함. 
// 프로젝트로 es6를 작성할 때에는 package.json에 "type" : "module"을 적어야 함. 

const add = (a,b) =>{
    return a+b
}
export default add;