package hr.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";

    int budgetLimit();
}

class FamilyMember {
//	~~Complete this line~~
    @FamilyBudget(userRole = "SENIOR", budgetLimit = 75)
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

//	~~Complete this line~~
    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 30)
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}





