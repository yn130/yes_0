import './App.css';
import UseMemo from './components/UseMemo';
import UseCallbackEx from './components/UseCallbackEx';
import UseCallbackEx2 from './components/UseCallbackEx2';

function App() {
  return (
    <div className="App">
      <UseMemo />
      <hr />

      <UseCallbackEx />
      <hr />

      <UseCallbackEx2 postId = "7"/> 

    </div>
  );
}

export default App;
