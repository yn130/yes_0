import logo from './logo.svg';
import './App.css';
import { FunctionComponent } from './Component';
import { FunctionC } from './FunctionC';
import Console from './Console';

function App() {
  // const name = "로이";
  // const animal = "강아지";
  // const style = {
  //   span: {
  //     textDecoration: "underline",
  //   }
  // }

  // const a = 4
  // const b = 3

  // return (
  //   <div className="App">

  //     <h2> 제 반려 동물의 이름은 <span style={style.span} > {name} </span> 입니다. </h2>
  //     <h2> <span style={style.span} > {name} </span>  는 <span style={style.span} > {animal} </span>  입니다. </h2>


  //     <div>
  //         { 3 + 5 == 8 ? (<div> 정답입니다! </div>) : (<div> 오답입니다!s </div>) }
  //     </div>

  //     <div>
  //         { a > b && <span> a가 b보다 큽니다.$ </span> }
  //     </div>

  //   </div>
  // );


  // ---------------------------------------------------------------------- // 

  // const title = "Hello World";

  // return (
  //   <div className="App">
  //     <h1> {title} </h1>


  //   <div>
  //     아이디 : <input></input>
  //   </div><br></br>
  //   <div>
  //     비밀번호 : <input></input>
  //   </div>
  //   </div>
  // )


  // ---------------------------------------------------------------------- // 
  
  return (

    <div className="App">
      <FunctionComponent />
      <FunctionComponent name = '햄버거'/>

      <hr />

      <FunctionC title = '더 좋은 삶을 위한 철학 (리커버)' author = "마이클 슈어" price = '18,000원' type = "인문학"/>

      <hr />
      <Console text = "text값 가져오기" />
    
    </div>


  )


}

export default App;