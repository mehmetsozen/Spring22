package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
   1) "variable or variables or zero variable" -> "logic"
       The structure is called "Lambda Expression"
   2) In Functional Programming, we can use "Lambda Expression", it is allowed but not recommended.
       Instead of "Lambda Expression", we prefer to use "Method Reference"
   3) Method reference is "Class Name :: Method Name"
       For example: "String :: length" (Do not type method parenthesis, type just method name)
                    "Arrays :: toString"
       You can use your own class as well, for example you created Animal Class and you have eat() method in Animal Class
       "Animal :: eat"


    */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);
        printListElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printSquareOddElementsFunctional(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfSquareOfDistinctEvenElements01(l);
        sumOfSquareOfDistinctEvenElements02(l);
        productOfCubesOfDistinctEvenElements(l);
        getMaxElements(l);
        getMinGreaterThanSeven01(l);
        getHalfOfElementsReverseOrder(l);
    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional with method reference)
    public static void printListElementsFunctional(List<Integer> list) {
        list.stream().forEach(Utils::printInTheSameLineWithSpace);


    }

    public static void printEvenElementsStructured(List<Integer> list) {

        list.stream().filter(Utils::checkToBeEven).forEach(Utils::printInTheSameLineWithSpace);
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printSquareOddElementsFunctional(List<Integer> list) {
        list.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printInTheSameLineWithSpace);
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    public static void printCubeOfDistinctOddElements(List<Integer> list) {
        list.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInTheSameLineWithSpace);

    }
    //5)Create a method to calculate the sum of the squares of distinct even elements

    //1st way
    public static void sumOfSquareOfDistinctEvenElements01(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0, Math::addExact);
        System.out.println(sum);
    }

    //2nd way
    public static void sumOfSquareOfDistinctEvenElements02(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {
        Integer product = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).reduce(1, Math::multiplyExact);
        System.out.println(product);
    }

    //7)Create a method to find the maximum value from the list elements
    public static void getMaxElements(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);
    }
    //Homework
    //8)Create a method to find the minimum value from the list elements(Method reference)

    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void getMinGreaterThanSeven01(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(Utils::checkToBeEven).reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(min);
    }

    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    public static void getHalfOfElementsReverseOrder(List<Integer> list) {
        List<Double> result = list.
                                stream().
                                distinct().
                                filter(t -> t > 5).
                                map(Utils::getHalf).
                                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
    }


}