package practice10;

/*
    Type code to calculate BMI (Do NOT ignore security).
    The BMI is defined as the body mass divided by the square of the body height.
    Major adult BMI classifications are underweight (under 18.5 kg/m2), normal weight (18.5 to 24.9),
     overweight (25 to 29.9), and obese (30 or more).
    */
public class Q03_BMI {
    private double weight;
    private double height;
    public Q03_BMI (double weight,double height){
        this.height=height;
        this.weight=weight;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateOfBMI(){

       double bmi=weight/(height*height);
        System.out.println("BMI : "+bmi);
       if(bmi<18.5){
           System.out.println( " You are underweight");
        }else if(bmi>18.5&&bmi<25){
           System.out.println("You are normal");
       }else if(bmi>25&&bmi<30){
           System.out.println(" You are fat");
       }else if(bmi>30){
           System.out.println("You are obese");
       }
       else{
           System.out.println("Enter valid input");
       }
    }
}
