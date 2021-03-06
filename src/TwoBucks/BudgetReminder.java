package TwoBucks;

/**
 * @author Sawyer Kisha
 * @version 1.0
 * @since 1.0
 * BudgetReminder.java
 */
public class BudgetReminder
{
    EnterFinancialGoals enterFinancialGoals = new EnterFinancialGoals();
    double spendGoal  = enterFinancialGoals.enterSpendGoal();

    /**
     *  Takes the spendAmt from EnterFinancialGoals.java
     *  and the amount added to the budget in Budget.java
     *  and subtract both variables to come up with the amount
     *  of spending left for the specific user
     * @param amount
     */
    public void BudgetAddReminder(double amount)
    {
        if(spendGoal <= 0)
        {
            System.out.println("Create a financial goal to set up a weekly spending allowance.");
        }
        else
        {
            double goal = spendGoal - amount;
            System.out.println("Current spendings left: $" + goal);
            System.out.println("Current goal: $" + spendGoal);
        }
    }

    /**
     *  Takes the spendAmt from EnterFinancialGoals.java
     *  and the amount subtracted to the budget in Budget.java
     *  and adds both variables to come up with the amount
     *  of spending left for the specific user
     * @param amount
     */
    public void BudgetRemoveReminder(double amount)
    {
        if(spendGoal <= 0)
        {
            System.out.println("Create a financial goal to set up a weekly spending allowance.");
        }
        else
        {
            double goal = spendGoal + amount;
            System.out.println("Current spendings left: $" + goal);
            System.out.println("Current goal: $" + spendGoal);
        }
    }
}