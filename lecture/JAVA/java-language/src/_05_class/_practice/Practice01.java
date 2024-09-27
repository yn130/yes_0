package _05_class._practice;

public class Practice01 {

//    public int width;
//    public int height;

//    public Practice01(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요. ");
//        this.width = sc.nextInt();
//        this.height = sc.nextInt();
//        sc.close();
//    }
//
//    public void area(){
//        int area = width * height;
//        System.out.println(area);
//
// ===================================================================================//

//    public Practice01(int width, int height){
//        this.width = width;
//        this.height = height;
//    }
//
//    public int area(){
//       return this.width * this.height;
//
//    }

// ===================================================================================//


    private int width;
    private int height;
    static int count = 0;

    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}

    public int getHeight() {return height;}
    public void setHeight(int height) {this.height = height;}


    public Practice01(int width) {
        this.width = width;
        count++;
    }
    public int area() {
        return this.width * this.height;
    }

    public static int getCount() {
        return count;
    }

}




