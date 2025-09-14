//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Задача 1
            //Целочисленные значения
        byte smallNumber = 127;
        short mediumNumber = 32767;
        int perfectNumber = 2100000;
        long largeNumber = 1000000000;
            //С плавующей точкой
        float decimalNumber = 3.14f;
        double preciseNumber = 2.71828;

        System.out.println("Задача 1:");
            System.out.println("Значение переменной smallNumber с типом byte равно " + smallNumber);
            System.out.println("Значение переменной mediumNumber с типом short равно " + mediumNumber);
            System.out.println("Значение переменной perfectNumber с типом int равно " + perfectNumber);
            System.out.println("Значение переменной largeNumber с типом long равно " + largeNumber);
            System.out.println("Значение переменной decimalNumber с типом float равно " + decimalNumber);
            System.out.println("Значение переменной preciseNumber с типом double равно " + preciseNumber);
        System.out.println("----");

        //Задача 2
        float floatValue1 = 27.12f;
        long longValue2 = 987678965549L;
        double doubleValue3 = 2.786;
        short shortValue4 = 569;
        short shortValue5 = -159;
        int intValue6 = 27897;
        byte byteValue7 = 67;

        System.out.println("Задача 2:");
            System.out.println("Значение " + floatValue1 + " хранится в переменной типа float");
            System.out.println("Значение " + longValue2 + " хранится в переменной типа long");
            System.out.println("Значение " + doubleValue3 + " хранится в переменной типа double");
            System.out.println("Значение " + shortValue4 + " хранится в переменной типа short");
            System.out.println("Значение " + shortValue5 + " хранится в переменной типа short");
            System.out.println("Значение " + intValue6 + " хранится в переменной типа int");
            System.out.println("Значение " + byteValue7 + " хранится в переменной типа byte");
        System.out.println("----");

        //Задача 3
        int studentsEkaterinaAndreevna = 30;
        int studentsLyudmilaPavlovna = 23;
        int studentsAnnaSergeevna = 27;

        int studentsThreeGrades = studentsAnnaSergeevna + studentsEkaterinaAndreevna
                                        + studentsLyudmilaPavlovna;
        int sheetsPaper = 480;
        int sheetsForEachStudent = sheetsPaper / studentsThreeGrades;

        System.out.println("Задача 3:");
            System.out.println("На каждого ученика рассчитано " + sheetsForEachStudent + " листов бумаги");
        System.out.println("----");

        //Задача 4
        int bottlesPer2Minutes = 16;
        int baseTime = 2;
            int bottlesPer1Minutes = bottlesPer2Minutes / baseTime;

        int time20Minutes = 20;
        int timeDayMinutes = 1440;
            int bottlesPer20Minutes = bottlesPer1Minutes * time20Minutes;
            int bottlesPerDay = bottlesPer1Minutes * timeDayMinutes;
            int bottlesPer3Day = bottlesPerDay * 3;
            int bottlesPer30Day = bottlesPer3Day * 10;

        System.out.println("Задача 4:");
            System.out.println("За 20 машина произвела " + bottlesPer20Minutes + " штук бутылок ");
            System.out.println("За Сутки машина произвела " + bottlesPerDay + " штук бутылок ");
            System.out.println("За 3 дня машина произвела " + bottlesPer3Day + " штук бутылок ");
            System.out.println("За 30 дней машина произвела " + bottlesPer30Day + " штук бутылок ");
        System.out.println("----");

        //Задача 5
        int totalPaint = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
            int totalPaintClass = whitePerClass + brownPerClass;
            int totalClass = totalPaint / totalPaintClass;
            int totalWhitePaint = whitePerClass * totalClass;
            int totalBrownPaint = brownPerClass * totalClass;

        System.out.println("Задача 5:");
            System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint +
                                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println("----");

        //Задача 6
        double gramsInKilograms = 1000;

        int bananaCount = 5;
        int bananaWeight = 80;
            int bananaTotal = bananaWeight * bananaCount;

        int milkCount = 200;
        int milkWeight100ml = 105;
            int milkTotal = (milkCount / 100) * milkWeight100ml;

        int iceCreamCount = 2;
        int iceCreamWeight = 100;
            int iceCreamTotal = iceCreamWeight * iceCreamCount;

        int rawEggsCount = 4;
        int rawEggsWeight = 70;
            int rawEggesTotal = rawEggsWeight * rawEggsCount;

        double totalWeightGrams = bananaTotal + milkTotal + iceCreamTotal + rawEggesTotal;
        double totalWeightKilograms = totalWeightGrams / gramsInKilograms;

        System.out.println("Задача 6:");
            System.out.println("Вес спортивного завтрака:");
            System.out.println("В граммах: " + totalWeightGrams + " г");
            System.out.println("В килограммах: " + totalWeightKilograms + " кг");
        System.out.println("----");

        //Задача 7
        double kilogramsGrams = 1000;
        double needResetKg = 7;

        int weightLossDay250Gr = 250;
        int weightLossDay500Gr = 500;

            double resultTraining250Gr = (needResetKg * kilogramsGrams) / weightLossDay250Gr;
            double resultTraining500Gr = (needResetKg * kilogramsGrams) / weightLossDay500Gr;
            double averageNumberDays = (resultTraining250Gr + resultTraining500Gr) / 2;

        System.out.println("Задача 7:");
            System.out.println("Необходимо сбросить: " + needResetKg + " кг");
            System.out.println("При потере 250г в день потребуется: " + resultTraining250Gr + " дней");
            System.out.println("При потере 500г в день потребуется: " + resultTraining500Gr + " дней");
            System.out.println("Среднее количество дней: " + averageNumberDays + " дней");
        System.out.println("----");

        //Задача 8
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        double increasePercent = 1.10;

        double mashaNewSalary = mashaSalary * increasePercent;
        double mashaYearDiff = (mashaNewSalary - mashaSalary) * 12;

        double denisNewSalary = denisSalary * increasePercent;
        double denisYearDiff = (denisNewSalary - denisSalary) * 12;

        double kristinaNewSalary = kristinaSalary * increasePercent;
        double kristinaYearDiff = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Задача 8:");
            System.out.println("Результаты расчета повышения зарплат:");
            System.out.println("Маша теперь получает " + Math.round(mashaNewSalary) +
                " рублей. Годовой доход вырос на " + Math.round(mashaYearDiff) + " рублей");
            System.out.println("Денис теперь получает " + Math.round(denisNewSalary) +
                " рублей. Годовой доход вырос на " + Math.round(denisYearDiff) + " рублей");
            System.out.println("Кристина теперь получает " + Math.round(kristinaNewSalary) +
                " рублей. Годовой доход вырос на " + Math.round(kristinaYearDiff) + " рублей");
        System.out.println("----");
        }
    }