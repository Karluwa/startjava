public class VariablesTheme {
    public static void main(String[] args) {
        byte ozu = 4;
        int dischargeProsessor = 64;
        long codeOfProduct = 1794041729l;
        float prosessorFrequency = 1.6f;
        double screen = 15.6;
        boolean goodFirma = true;
        char releaseWindows = '8';
        String computerName = "VAIO";
        System.out.println("Установленная память, Гб " + ozu);
        System.out.println("Количество разрядов процессора " + dischargeProsessor);
        System.out.println("Код продукта " + codeOfProduct);
        System.out.println("Частота процессора, ГГц " + prosessorFrequency);
        System.out.println("Размер экрана в дюймах " + screen);
        System.out.println("Ноутбук хорошей фирмы? " + goodFirma);
        System.out.println("Выпуск Windows " + releaseWindows);
        System.out.println("Имя компьютера " + computerName + "\n");

        int priceOfPen = 100;
        int priceOfBook = 200;
        double discount = 0.11;
        int totalPriceWithoutDiscount = priceOfPen + priceOfBook;
        double PriceOfDiscount = (priceOfPen + priceOfBook) * discount;
        double totalPriceWithDiscount = (priceOfPen + priceOfBook) - PriceOfDiscount;
        System.out.println("Общая цена товаров без скидки, руб. " + totalPriceWithoutDiscount);
        System.out.println("Сумма скидки, руб. " + PriceOfDiscount);
        System.out.println("Общая цена товвров со скидкой, руб. " + totalPriceWithDiscount + "\n");

        System.out.println("\t\t J\t" + "\t   a\t v\t\t\t v\t a");
        System.out.println("\t\t J" + "\t\t a  a\t  v" + "\t\t   v " + "  a " + "  a");
        System.out.println("J\t\t J\t" + "\t aaaaa\t   " + "V   V " + "  aaaaa" + "\n");

        byte mBite = 127;
        short mShort = 32767;
        int mInt = 2147483647;
        long mLong = 9223372036854775807l;
        System.out.println("первоначальное значение maxByte " + mBite + "\nзначение maxByte после инкремента на единицу "
                + mBite++ + "\nзначение maxByte после декремента на единицу " + mBite--+ "\n");
        System.out.println("первоначальное значение maxShort " + mShort + "\nзначение maxShort после инкремента на единицу "
                + mShort++ + "\nзначение maxShort после декремента на единицу " + mShort--+ "\n");
        System.out.println("первоначальное значение maxInt " + mInt + "\nзначение maxInt после инкремента на единицу "
                + mInt++ + "\nзначение maxInt после декремента на единицу " + mInt--+ "\n");
        System.out.println("первоначальное значение maxLong " + mLong + "\nзначение maxLong после инкремента на единицу "
                + mLong++ + "\nзначение maxLong после декремента на единицу " + mLong--+ "\n");

        int a = 2;
        int b = 5;
        int tmp;
        System.out.println("Перестановка значений переменных с помощью третьей переменной:");
        System.out.println("Исходное значения переменной а: " + a + "\tИсходное значения переменной b: " + b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новое значения переменной а: " + a + "\tНовое значения переменной b: " + b);
        System.out.println("Перестановка значений переменных с арифметической операции:");
        System.out.println("Исходное значения переменной а: " + a + "\tИсходное значения переменной b: " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("Новое значения переменной а: " + a + "\tНовое значения переменной b: " + b);
        System.out.println("Перестановка значений переменных с помощью битовой манипуляции:");
        System.out.println("Исходное значения переменной а: " + a + "\tИсходное значения переменной b: " + b);
        b = a ^ b;
        a = b ^ a;
        b = b ^ a;
        System.out.println("Новое значения переменной а: " + a + "\tНовое значения переменной b: " + b);

        System.out.println("Вывод символов и их кодов");
        char c1 = 35;
        int aC = c1;
        System.out.println("символ " + c1 + " имеет код ASCII " + aC);
        char a1 = 38;
        int aA = a1;
        System.out.println("символ " + a1 + " имеет код ASCII " + aA);
        char b1 = 64;
        int aB = b1;
        System.out.println("символ " + b1 + " имеет код ASCII " + aB);
        char d1 = 94;
        int aD = d1;
        System.out.println("символ " + d1 + " имеет код ASCII " + aD);
        char e1 = 95;
        int aE = c1;
        System.out.println("символ " + e1 + " имеет код ASCII " + aE);

        String s = "\\";
        String q = "/";
        String t = "_";
        String u = "(";
        String v = ")";
        System.out.println("\n\t\t " + q + " " + s);
        System.out.println("\t\t  " + q + "\t " + s);
        System.out.println("\t\t " + q + t + u + v + s);

        int num1 = 123;
        int num2 = num1/100;
        int num3 = num1%100/10;
        int num4 = num1%10;
        System.out.println("Число " + num1 + " содержит: " + num2 + " сотен " + num3 + " десятков " + num4 + " единиц");
        int num5 = num2 + num3 + num4;
        int num6 = num2 * num3 * num4;
        System.out.println("Сумма его цифр = " + num5 + " Произведение = " + num6);

        System.out.println("\t\tВывод времени:");
        int time = 86399;
        int hour = time/360;
        int min = time%360/60;
        int sec = min%60;
        System.out.println("\t\tЧЧ:" + hour + " ММ:" + min + " СС:" + sec);



    }
}