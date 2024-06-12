
function cal() {
        
    let firstValue = parseInt(document.getElementById("value1").value);
    let secondValue = parseInt(document.getElementById("value2").value);
    let operatorValue = document.getElementById("operator").value;
    let result;

    switch(operatorValue){
      case '+': 
        result = firstValue + secondValue;
        break;
      case '-': 
        result = firstValue - secondValue;
        break;
      case '/': 
       result = firstValue / secondValue;
        break;
      case '*': 
       result = firstValue * secondValue;
        break;
      default :
        result = '오류';
    }
    document.getElementById('result').value = result;
  };

  function reset() {
    document.getElementById('value1').value = '';
    document.getElementById('value2').value = '';
    document.getElementById('operator').value = '';
    document.getElementById('result').value = '';
  }




////실습 정답

//   <script>
//   function cal() {
//     let v1 = Number(document.getElementById('value1').value);
//     let v2 = Number(document.getElementById('value2').value);
//     let op = document.getElementById('operator').value;
//     let result;

//     if (op === '+') {
//       result = v1 + v2;
//     } else if (op === '-') {
//       result = v1 - v2;
//     } else if (op === '*') {
//       result = v1 * v2;
//     } else if (op === '/') {
//       result = v1 / v2;
//     } else {
//       result = '오류 발생';
//     }
//     document.getElementById('result').value = result;
//   }

//   function resetInput() {
//     document.getElementById('value1').value = '';
//     document.getElementById('value2').value = '';
//     document.getElementById('operator').value = '';
//     document.getElementById('result').value = '';
//   }
// </script>






