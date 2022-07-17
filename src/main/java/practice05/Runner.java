package practice05;

public class Runner {
    public static void main(String[] args) {
        Budget son=new Budget();
        son.ownBudget(150);

        Budget daughter=new Budget();
        daughter.ownBudget(400);


        Budget.decreaseHouseBudget(2000);
        Budget.decreaseHouseBudget(4000);
        Budget.getsalary(20000);



        System.out.println("House Budget : "+Budget.houseBudget);
        System.out.println("Son Budget : "+son.ownBudget);
        System.out.println("Daughter Budget : "+daughter.ownBudget);

    }
}
