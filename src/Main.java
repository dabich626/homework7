public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task7();
        task8();
    }

    private static void task8() {
        int cometYear = 1823;
        int yearAfter = 2123;
       while (cometYear < yearAfter) {
           cometYear = cometYear + 79;
           System.out.println("комета пролетит в  " + cometYear);

       }
    }

    private static void task7() {
        int friday = -2;
        while(friday<26) {
            friday = friday + 7;
            System.out.println("сегодня " + friday + " число, пятница. нужно сделать отчет");
        }

    }

    private static void task4() {
        int amountInBank = 15000;
        int percent = 7;
        int bankBonuse = (amountInBank / 100);
        bankBonuse = (bankBonuse * 7);
        System.out.println(bankBonuse + " составляет ежемесечные начисление по вкладу");
        int mounth = 0;
        int totalSaved = 0;
        while(totalSaved < 12000000) {
            totalSaved = totalSaved + bankBonuse;
            mounth = mounth + 6;
            System.out.println("сумма накоплений за " + mounth + " месяц составляет " + totalSaved);
        }
        System.out.println("=================================================");
    }

    private static void task3() {
        long totalPopulation = 12000000;
        int fertility = 1000/17;
        int mortality = 1000/8;
        int populationGrowth = 12000000/1000;
        float populationGrowthInYear = ((float)populationGrowth + (float)fertility - (float)mortality);
        System.out.println(populationGrowthInYear);
        int year = 0;
        while (year < 10) {
            year = year + 1;
            totalPopulation = (long) (totalPopulation + populationGrowthInYear);
            System.out.println("год " + year + ", численность населения составляет " + totalPopulation);
        }
        System.out.println("===========================================");

    }

    public static void task1 () {
        int totalMoney = 0;
        int mount = 0;
        while (totalMoney<2459000) {
            totalMoney = totalMoney + 15000;
            mount = mount + 1;
            System.out.println("месяц " + mount + " сумма накоплений равна " + totalMoney);
        }
        System.out.println("============================================");

    }

    public static void task2 () {
       int number = 0;
       while(number < 10) {
           number = number + 1;
           System.out.print(number);
       }
        System.out.println("    ");

       int number1 = 10;
       for(number1 = 10; number1>0; number1 = number1 - 1) {
           System.out.print(number1);
       }
        System.out.println("" +
                "" +
                "   ===================================   ");

    }
}