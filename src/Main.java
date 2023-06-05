public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        byte a = 120;
        short b = 350;
        int c = 2000;
        long d = 3500L;
        float e = 56.8f;
        double f = 25.35468;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    public static void task2() {
        float b = 27.12f;
        long a = 987678965549L;
        double c = 2.786;
        short f = 569;
        short g = -159;
        int e = 27897;
        byte d = 67;
    }

    public static void task3() {
        short lP = 23;
        short aS = 27;
        short eA = 30;
        int students = lP + aS + eA;
        int paper = 480;
        System.out.println("На каждого ученика расчитано" + paper / students + "листов бумаги");
    }

    public static void task4() {
        short productivityTwoMinutes = 16;
        //   1 mese
        int twentyMinutes = productivityTwoMinutes * 10;
        System.out.println("За 20 мин машина произвнла " + twentyMinutes + " штук");
        int ora = (productivityTwoMinutes / 2) * 60;
        int day = ora * 24;
        System.out.println("За один день машина произвнла " + day + " штук");
        int threeDay = day * 3;
        System.out.println("За три дня машина произвнла " + threeDay + " штук");
        int month = day * 30;
        System.out.println("За один месяц машина произвнла " + month + " штук");
    }

    public static void task5() {
        int cansPaint = 120;
        int white = 2;
        int brown = 4;
        int paintRoom = white + brown;
        int room = cansPaint / paintRoom;
        int whiteRoom = room * white;
        int brownRoom = room * brown;
        System.out.println("В школе, где " + room + " классов, нужно " + whiteRoom + " банок белой краски и " + brownRoom + " банок коричневой краски");
    }

    public static void task6() {
        int banana = 5 * 80;
        int milk = (200 / 100) * 5 + 200;
        int eggs = 4 * 70;
        int iceCream = 2 * 100;
        int gramWeight = banana + milk + eggs + iceCream;
        System.out.println("коктель общей массой " + gramWeight + " грам");
        float kilogramWeight = gramWeight * 0.001f;
        System.out.println("коктель общей массой " + kilogramWeight + " килограм");
    }

    public static void task7() {
        int massa = 7000;
        int min = 250;
        int max = 500;
        double weightLossMin = (double) massa / min;
        double weightLossMax = (double) massa / max;
        double weightLossPerDeyAverage = (weightLossMin + weightLossMax) / 2D;

        System.out.println(" при условии потери 250 грам в день, 7 кг уйдет за " + weightLossMin + " дней");
        System.out.println(" при условии потери 500 грам в день, 7 кг уйдет за " + weightLossMax + " дней");
        System.out.println(" средне количество " + weightLossPerDeyAverage + " дней" );
    }

        public static void task8() {
        int masha = 67760; //доход
        int denis = 83690;
        int kristina = 76230;
        int mashaGod = masha * 12; //доход за 12 месяцев
        int denisGod = denis * 12;
        int kristinaGod = kristina * 12;
        int mashaRaise = masha + masha * 10 / 100; // повышение
        int denisRaise = denis + denis * 10 / 100;
        int kristinaRaise = kristina + kristina * 10 / 100;
        int mashaYearRaise = mashaRaise * 12; // доход за год с повышением
        int denisYearRaise = denisRaise * 12;
        int kristinaYearRaise = kristinaRaise * 12;
        int mashaDifference = mashaYearRaise - mashaGod;
        int denisDifference = denisYearRaise - denisGod;
        int kristinaDifference = kristinaYearRaise - kristinaGod;
        System.out.println("Маша теперь получает " + mashaRaise + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisRaise + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Маша теперь получает " + kristinaRaise + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}