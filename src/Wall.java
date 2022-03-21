public class Wall {
//    Write a class with the name Wall. The class needs two fields (instance variables) with name width
//    and height of type double.
//    The class needs to have two constructors. The first constructor does not have any parameters (no-arg
//    constructor). The second constructor has parameters width and height of type double and it needs to
//    initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
//    height parameter is less than 0 it needs to set the height field value to 0.
//    Write the following methods (instance methods):
// * Method named getWidth without any parameters, it needs to return the value of width field.
//* Method named getHeight without any parameters, it needs to return the value of height field.
//* Method named setWidth with one parameter of type double, it needs to set the value of the width
// field. If the parameter is less than 0 it needs to set the width field value to 0.
// * Method named setHeight with one parameter of type double, it needs to set the value of the
//  height field. If the parameter is less than 0 it needs to set the height field value to 0.
// * Method named getArea without any parameters, it needs to return the area of the


    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
    //1. create 2 instance variable height and width
 double width , height;
    double area;
  // 2. craete 1st no args constructor
  Wall(){

  }
  // 3. 2nd constructor with parameter double dtype height and width
public Wall(double width, double height){
      // this param intialize the field by (this.)
this.height = height;
this.width = width;
if (width < 0){
    this.width = 0;
}
if(height < 0){
    this.height = 0;
}

}
// create instance method without any param , it returns value width
public double getWidth(){
      return width;
}
// create instance method without any param, ir returns value height
    public double getHeight(){
      return height;
    }
 //create instance method setWidth with one parameter of type double,
    // it needs to set the value of width field

    public double setWidth(double width){
    //If the parameter is less than 0 it needs to set the width field
    //value to 0
    if(width < 0){
        this.width = 0;
    }
    //or this.width = width;
    return width;
    }
    // Method named setHeight with one parameter of type double,
    // it needs to set the value of the
    ////  height field. If the parameter is less than 0 it needs
    // to set the height

public double setHeight(double height){
      if(height < 0){
          this.height = 0;
      }
  // OR    this.height=height;
      return height;
}

// Method named getArea without any parameters,
// it needs to return the area
    public double getArea(){
      area = width * height ;
      return area;
    }

}