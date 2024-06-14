class Shape {
    constructor(x,y){
        this.x = x;
        this.y = y;
    }
    getArea(){
        result = x * y;
        return result;
    }
}

let rec1 = new Shape(3,4);
console.log(rec1.getArea());