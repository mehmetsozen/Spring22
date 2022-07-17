package practice09;
/*
	Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
    */
public class Q05 {
    public static void main(String[] args) {
     calculateAverage("Ali",55,60,40,60,90,100);
        calculateAverage("Veli",100,80,40,100);
        calculateAverage("Ayşe",50,90,80);
        calculateAverage("Fatma",90,80,50,90,100);
    }

    public static void calculateAverage(String stdName, double... mark){
        double sum=0;
        for (double w:mark ) {
            sum+=w;

        }
        System.out.println(stdName+"'s Average of exams : "+String.format("%.1f",sum/mark.length));
    }

}
