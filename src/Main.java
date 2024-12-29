public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println();
        System.out.println("Задача 1");
        byte mouse;
        mouse = 10;
        short cat;
        cat = 1000;
        int dog;
        dog = 100000;
        long grandDaughter;
        grandDaughter = 10000000000L;
        float grandMother;
        grandMother = 1.01f;
        double grandFather;
        grandFather = 1.000000001;

        System.out.println("Значение переменной mouse с типом byte = " + mouse);
        System.out.println("Значение переменной cat с типом short = " + cat);
        System.out.println("Значение переменной dog с типом int = " + dog);
        System.out.println("Значение переменной grandDaughter с типом long = " + grandDaughter);
        System.out.println("Значение переменной grandMother с типом float = " + grandMother);
        System.out.println("Значение переменной grandFather с типом double = " + grandFather);

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");
        float temperature = 27.12f;
        long money = 987678965549L;
        short height = 2786;
        short length = 569;
        short depth = -159;
        short distance = 27897;
        byte weight = 67;

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short paper =  480;
        int paperPerStudent;
        paperPerStudent = paper/(LP+AS+EA);

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        // Задача 4
        System.out.println();
        System.out.println("Задача 4");
        byte machineProductivityPerTwoMinute = 16;
        int machineProductivityPerOneMinute = (machineProductivityPerTwoMinute/2);
        byte twentyMinutes = 20;
        int day = (24*60*60);
        int threeDays = day*3;
        int oneMonth = day*30;
        int machineTwentyMinutesProductivity = twentyMinutes*machineProductivityPerOneMinute;
        int machineDayProductivity = day*machineProductivityPerOneMinute;
        int machineThreeDaysProductivity = threeDays*machineProductivityPerOneMinute;
        int machineOneMonthProductivity = oneMonth*machineProductivityPerOneMinute;

        System.out.println("За 20 минут машина произвела " + machineTwentyMinutesProductivity + " штук бутылок.");
        System.out.println("За сутки машина произвела " + machineDayProductivity + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + machineThreeDaysProductivity + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + machineOneMonthProductivity + " штук бутылок.");

        // Задача 5
        System.out.println();
        System.out.println("Задача 5");
        byte schoolPaintNeed = 120;
        byte classWhitePaintNeed = 2;
        byte classBraunPaintNeed = 4;
        int classPaintNeed = classWhitePaintNeed + classBraunPaintNeed;
        int schoolClassQuantity = schoolPaintNeed/classPaintNeed;
        int schoolWhitePaintNeed = schoolClassQuantity*classWhitePaintNeed;
        int schoolBraunPaintNeed = schoolClassQuantity*classBraunPaintNeed;

        System.out.println("В школе, где " + schoolClassQuantity + " классов, нужно " + schoolWhitePaintNeed
                + " банок белой краски и " + schoolBraunPaintNeed + " банок коричневой краски.");

        // Задача 6
        System.out.println();
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte icecreamWeight = 100;
        byte eggWeight = 70;
        int breakfastWeightGram = ((5 * bananaWeight) + (2 * milkWeight) + (2 * icecreamWeight) + (4 * eggWeight));
        int breakfastWeightKilogram = breakfastWeightGram / 1000;

        System.out.println("Вес завтрака спортсмена составляет " + breakfastWeightGram + " грамм, или " + breakfastWeightKilogram
                + " килограмм.");

        // Задача 7
        System.out.println();
        System.out.println("Задача 7");
        short weightToLooseTotal = 7000;
        short weightToLoosePerDay1 = 250;
        short weightToLoosePerDay2 = 500;
        int weightToLoosePerDayAverage = (weightToLoosePerDay1 + weightToLoosePerDay2)/2;
        int dayNeedToLooseWeight1 = (weightToLooseTotal/weightToLoosePerDay1);
        int dayNeedToLooseWeight2 = (weightToLooseTotal/weightToLoosePerDay2);
        int dayNeedToLooseWeightAverage = (weightToLooseTotal/weightToLoosePerDayAverage);

        System.out.println("Если спортсмен будет терять в весе " + weightToLoosePerDay1 + " грамм в день, то на похудение уйдёт "
                + dayNeedToLooseWeight1 + " дней.");
        System.out.println("Если спортсмен будет терять в весе " + weightToLoosePerDay2 + " грамм в день, то на похудение уйдёт "
                + dayNeedToLooseWeight2 + " дней.");
        System.out.println("В среднем на похудение может потребоваться " + dayNeedToLooseWeightAverage + " дней.");

        // Задача 8
        System.out.println();
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaSalaryAnnual = mashaSalary * 12;
        int denisSalaryAnnual = denisSalary * 12;
        int kristinaSalaryAnnual = kristinaSalary * 12;
        int mashaSalaryChanged = mashaSalary + (mashaSalary / 10);
        int denisSalaryChanged = denisSalary + (denisSalary / 10);
        int kristinaSalaryChanged = kristinaSalary + (kristinaSalary / 10);
        int mashaSalaryAnnualChanged = mashaSalaryChanged * 12;
        int denisSalaryAnnualChanged = denisSalaryChanged * 12;
        int kristinaSalaryAnnualChanged = kristinaSalaryChanged * 12;
        int mashaSalaryAnnualDifference = mashaSalaryAnnualChanged - mashaSalaryAnnual;
        int denisSalaryAnnualDifference = denisSalaryAnnualChanged - denisSalaryAnnual;
        int kristinaSalaryAnnualDifference = kristinaSalaryAnnualChanged - kristinaSalaryAnnual;

        System.out.println("Маша теперь получает " + mashaSalaryChanged + " рублей. Годовой доход вырос на "
                + mashaSalaryAnnualDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisSalaryChanged + " рублей. Годовой доход вырос на "
                + denisSalaryAnnualDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryChanged + " рублей. Годовой доход вырос на "
                + kristinaSalaryAnnualDifference + " рублей.");

        System.out.println("Конец");
    }
}