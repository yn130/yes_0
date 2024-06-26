const Visitor = require('../model/Visitor');

// (1) GET / => localhost:PORT/
exports.main = (req, res) => {
  res.render('index');
};

//조회
// (2) GET /visitors => localhost:PORT/visitors
exports.getVisitors = (req, res) => {
  // console.log(Visitor.getVisitors); // [Function (anonymous)]

  // [before]
  // res.render('visitor', { data: Visitor.getVisitors() });

  // [after]
  Visitor.getVisitors((result) => {
    // result 매개변수
    // : model/Visitor.js getVisitors함수의 callback(rows)의 "rows" 변수에 대응
  
    console.log('controller/CVisitor.js >> ', result);

    res.render('visitor', { data: result });
  })
};


// 등록
exports.postVisitor = (req, res) => {
  console.log(req.body);

  Visitor.postVisitor(req.body, (result) => {
    // result: rows.insertId
    console.log('controller/CVisitor.js >> ', result);
    // controller/CVisitor.js >>  4

    res.send({id: result, 
      name: req.body.name, 
      comment: req.body.comment})
  });
}

// 삭제
exports.deleteVisitor = (req, res) => {
  console.log(req.body);

  Visitor.deleteVisitor(req.body.id, (result) => {
    console.log('controller/CVisitor.js >> ', result);
    
    res.send({ result }); // { result: result }
  })
}


// 수정
exports.getVisitor = (req, res) => {
  // req.params.id: // 조회해야할 id
  Visitor.getVisitor(req.params.id, (result) => {
    res.send(result);
  }); 
}

exports.patchVisitor = (req, res) => {
  console.log(req.body);

  Visitor.patchVisitor(req.body, (result) => {
    console.log('controller/CVisitor.js >> ', result);

    res.send({result});
  })
}

