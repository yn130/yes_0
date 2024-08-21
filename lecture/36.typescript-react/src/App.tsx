import { log } from "console";
import Student from "./components/Student";

function App() {
  // #1. 
  const handleClick = (name:string, grade: number): void => {
    console.log(`안녕 난 ${name}이고, ${grade}학년이야`);
    
  }
  return (
    <div className="App">
      <Student name="새싹" grade={3} handleClick = {handleClick}/>
    </div>
  );
}

export default App;
