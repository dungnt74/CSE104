package coding.convetion;

public class Naming {
    public static void main(String[] args) {

        // manage income for saving
        class MonthlyIncome {
        }
        ;

        // compare class and interface
        class Bird {
            void eat() {
                System.out.println("Eating");
            }
        }

        interface Flyable {
            void fly();
        }
    }

    public static void NamingRules() {

        // Constant
        int MAX_INCOME = 100_000_000;

        // Variables, and arrays
        int[] taxOfEachPerson = new int[1];
        long totalOfTax = 0;

        // Boolean
        boolean isActive, isOnline, isVisible;
        boolean hasPermission, hasChildren, hasDiscount;
        boolean canLogin, canAccecss, canEdit;
    }
}