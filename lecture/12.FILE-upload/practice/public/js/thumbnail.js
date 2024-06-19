function uploadThumbnail() {

    const formData = new FormData();

    const fileInput = document.querySelector('#thumbnail');
    const fileInput2 = document.querySelector('#title-name');
    // console.dir(fileInput);
    // console.dir(fileInput.files); 

    // FormData에 업로드한 파일 정보를 추가
    formData.append('thumbnail', fileInput.files[0]);
    formData.append('title-name', fileInput2.files[0]);

    // 서버로 요청 보내기
    axios({
        method: 'POST',
        url: '/dynamicFile',
        data: formData,
        // key
        headers: {
            'Content-Type': 'multipart/form-data', // enctype="multipart/form-data"
        }
    }).then(function (res) {
        // 서버의 req.file을 클라이언트의 res 변수가 받음
        console.log(res);
        console.log(res.data.path); // 이미지 주소

        // img태그의 src 속성값에 이미지 주소를 부여
        document.querySelector('img').src =`/${res.data.path}`;

        // img태그에 thumbnail 클래스명 부여
        document.querySelector('img').classList.add('thumbnail');
    })

}