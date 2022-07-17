package practice09;
//Create a Java programme to calculate the volume of cylinder and rectangular prism. (Use inheritance)
public class Q03_Geometry
{
public double volumeOfCylinder(double radius,double height){
    return 3.14*radius*radius*height;

}
public double volumeOfRectangularPrism(double height,double length,double weight){
    return height*length*weight;
}
}
