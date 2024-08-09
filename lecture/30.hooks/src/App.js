import './App.css';
import UseMemo from './components/UseMemo';
import UseCallbackEx from './components/UseCallbackEx';
import UseCallbackEx2 from './components/UseCallbackEx2';
import UseReducerEx from './components/UseReducerEx';
import useTitle from './hooks/useTitle';
import Faq from './components/faq'

function App() {

  useTitle("React Hooks 학습중")

  return (
    <div className="App">
      <UseMemo />
      <hr />

      <UseCallbackEx />
      <hr />

      <UseCallbackEx2 postId = "7"/> 
      <hr />

      <UseReducerEx />

      <Faq />


    </div>
  );
}

export default App;
