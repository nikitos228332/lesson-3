public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int firstWeight = 138492934;
        byte secondWeight = 127;
        short thirdWeight = 32767;
        long fourthWeight = 48327592385L;
        float fifthWeight = 5.4579264f;
        double sixthWeight = 73578.278342938479;
        System.out.println("Значение переменной 'первое значение' с типом int равно " + firstWeight);
        System.out.println("Значение переменной 'второе значение' с типом byte равно " + secondWeight);
        System.out.println("Значение переменной 'третье значение' с типом short равно " + thirdWeight);
        System.out.println("Значение переменной 'четвертое значение' с типом long равно " + fourthWeight);
        System.out.println("Значение переменной 'пятое значение' с типом float равно " + fifthWeight);
        System.out.println("Значение переменной 'шестое значение' с типом double равно " + sixthWeight);

        System.out.println("Задача 2");
        float potatoWeight = 27.12f;
        long starTrack = 987678965549L;
        float pearWeight = 2.786f;
        short washingPowderCost = 569;
        short differenceWeight = -159;
        int sugarWeight = 27897;
        byte years = 67;
        System.out.println("Вчера я купил " + potatoWeight + " кг картошки");
        System.out.println("Вес груш составил " + pearWeight + " кг");
        System.out.println("Стиральный порошек стоит " + washingPowderCost + " рублей");
        System.out.println("При приемке товара недовес составил " + differenceWeight + " кг");
        System.out.println("Путь до звезды составляет " + starTrack + " км");
        System.out.println("Вес сахара на поддонах составляет " + sugarWeight + " кг");
        System.out.println("Моей бабушке " + years + " лет");

        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekatirinaAndreevna = 30;
        short quantityPaper = 480;
        int paperToOnePupil = quantityPaper / (ludmilaPavlovna + annaSergeevna + ekatirinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paperToOnePupil + " листов бумаги");

        System.out.println("Задача 4");
        byte capacityFor2Minuets = 16;
        int capacityFor20Minuets = capacityFor2Minuets * 10;
        int capacityFor1Day = capacityFor20Minuets * 72;
        int capacityFor3Day = capacityFor1Day * 3;
        int capacityFor1Month = capacityFor3Day * 10;
        System.out.println("За 20 минут машина производит " + capacityFor20Minuets + " бутылок");
        System.out.println("За сутки машина производит " + capacityFor1Day + " бутылок");
        System.out.println("За 3 дня машина производит " + capacityFor3Day + " бутылок");
        System.out.println("За месяц машина производит " + capacityFor1Month + " бутылок");

        System.out.println("Задача 5");
        byte quantityTin = 120;
        byte for1ClassWhite = 2;
        byte for1ClassBrown = 4;
        int overallTinFor1Class = for1ClassWhite + for1ClassBrown;
        int overallClasses = quantityTin / overallTinFor1Class;
        int overallWhite = overallClasses * for1ClassWhite;
        int overallBrown = overallClasses * for1ClassBrown;
        System.out.println("В школе, где " + overallClasses + " классов, нужно " + overallWhite + " белой краски и " + overallBrown + " коричневой краски");

        System.out.println("Задача 6");
        byte bananas = 5;
        short bananaWeight = 80;
        short milk = 200;
        short ml100Weight = 105;
        byte iceCream = 2;
        byte briquetteWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        int bananasWeight = bananaWeight * bananas;
        int milkWeight = milk * (ml100Weight) / 100;
        int iceCreamWeight = iceCream * briquetteWeight;
        int eggsWeight = eggs * eggWeight;
        int overallWeightInGr = bananasWeight + iceCreamWeight + milkWeight + eggsWeight;
        float overallWeightInKg = overallWeightInGr / 1000f;
        System.out.println("Общий вес коктейля в граммах составляет " + overallWeightInGr + " грамм , а общий вес в килограммах равен " + overallWeightInKg + " килограмм");

        System.out.println("Задача 7");
        byte requiredWeight = 7;
        int inGr = requiredWeight * 1000;
        short min = 250;
        short max = 500;
        int maxDays = inGr / min;
        int minDays = inGr / max;
        int averageValue = (maxDays + minDays) / 2;
        System.out.println("Если следовать новому рациону, то минимальный срок похудения до нужного веса составит " + minDays + " дней(день), а максимум " + maxDays + " дней(день). В среднем спортсмен похудеет за " + averageValue + " дней(день)");

        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float yearsUp = 1.1f;
        float mashaUp = masha * yearsUp;
        float denisUp = denis * yearsUp;
        float kristinaUp = kristina * yearsUp;
        float differenceMasha = mashaUp * 12 - masha * 12;
        float differenceDenis = denisUp * 12 - denis * 12;
        float differenceKristina = kristinaUp * 12 - kristina * 12;
        System.out.println("Маша теперь получает " + mashaUp + " рублей(рубля). Годовой доход вырос на " + differenceMasha + " рублей(рубля)");
        System.out.println("Денис теперь получает " + denisUp + " рублей(рубля). Годовой доход вырос на " + differenceDenis + " рублей(рубля)");
        System.out.println("Кристина теперь получает " + kristinaUp + " рублей(рубля). Годовой доход вырос на " + differenceKristina + " рублей(рубля).");
    }
    }