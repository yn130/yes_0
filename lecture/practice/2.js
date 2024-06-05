//기존 
function writeNote() {

    let writer = document.getElementById("writer");
    let content = document.getElementById("content");
    let writerValue = writer.value;
    let contentValue = content.value;

    let currentDate = new Date();
    // let year = currentDate.getFullYear();
    // let month = String(currentDate.getMonth() + 1).padStart(2, '0');
    // let day = String(currentDate.getDate()).padStart(2, '0');
    // let hours = String(currentDate.getHours()).padStart(2, '0');
    // let minutes = String(currentDate.getMinutes()).padStart(2, '0');
    // let formattedDate = `${year}-${month}-${day} ${hours}:${minutes}`;
    let formattedDate = `${currentDate.getFullYear()}-${currentDate.getMonth() + 1}-${currentDate.getDate()} ${currentDate.getHours()}:${currentDate.getMinutes()}`;
 

    let table = document.getElementById("table");
    let newRow = table.insertRow();

    let cell1 = newRow.insertCell(0); 
    let cell2 = newRow.insertCell(1);
    let cell3 = newRow.insertCell(2); 

    cell1.innerHTML = writerValue;
    cell2.innerHTML = contentValue;
    cell3.innerHTML = formattedDate;

    document.getElementById('writer').value = '';
    document.getElementById('content').value = '';

  }




// //실습 정답

// function writeNote() {
//   let name = document.getElementById('writer').value; // name input 값 가져오기
//   let content = document.getElementById('content').value; // conent input 값 가져오기

//   let table = document.getElementById('table'); // table 요소 선택
//   let tr = document.createElement('tr'); // tr 생성 (td, td, td, td 넣기 위함)

//   // 번호 cell 만들기
// //   let tdNumber = document.createElement('td');
// //   tdNumber.innerHTML = document.querySelectorAll('tr').length;

//   // 작성자 cell 만들기
//   let tdWriter = document.createElement('td');
//   tdWriter.innerText = name;

//   // 내용 cell 만들기
//   let tdContent = document.createElement('td');
//   tdContent.innerText = content;

//   // 작성일 cell 만들기
//   let tdDate = document.createElement('td');
//   let now = new Date();
//   tdDate.innerText = `${now.getFullYear()}-${
//     now.getMonth() + 1
//   }-${now.getDate()} ${now.getHours()}:${now.getMinutes()}`;

//   // tr에 위에서 만든 4개의 td 추가
//   tr.append(tdNumber, tdWriter, tdContent, tdDate);

//   // table에 tr 추가
//   table.append(tr);

//   // input 창 초기화
//   document.getElementById('writer').value = '';
//   document.getElementById('content').value = '';
// };
