import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        int a = 1000000;
        byte b = 120;
        short c = 20000;
        long l = 5000000000000L;
        float f = 0.7777777f;
        double d = 0.88888888;
        System.out.println("Значение переменной int с типом цельночисленные равно " + a);
        System.out.println("Значение переменной byte с типом цельночисленные равно " + b);
        System.out.println("Значение переменной short с типом цельночисленные равно " + c);
        System.out.println("Значение переменной long с типом цельночисленные равно " + l);
        System.out.println("Значение переменной float с типом с плавающей точкой равно " + f);
        System.out.println("Значение переменной double с типом с плавающей точкой равно " + d);

        System.out.println("ЗАДАЧА 2");
        float z = 27.12f;
        System.out.println(z);
        long x = 987678965549L;
        System.out.println(x);
        float v = 2.786f;
        System.out.println(v);
        short n = 569;
        System.out.println(n);
        short m = -159;
        System.out.println(m);
        short k = 27897;
        System.out.println(k);
        byte o = 67;
        System.out.println(o);

        System.out.println("ЗАДАЧА 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short list = 480;
        float all = (float) lp + (float) as + (float) ea;
        System.out.println(all);
        float listOne = list / all;
        System.out.println("На каждого ученика рассчитано " + listOne + " листов бумаги");

        System.out.println("ЗАДАЧА 4");
        byte bottle = 16;
        byte time = 2;
        int timeOneHour = (bottle / time) * 60;
        int timeTwentyMinutes = (bottle / time) * 20;
        System.out.println("За 20 минут машина произвела " + timeTwentyMinutes + " штук бутылок");
        int day = timeOneHour * 24;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        int month = day * 30;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        System.out.println("ЗАДАЧА 5");
        byte pot = 120;
        byte white = 2;
        byte brown = 4;
        int clas = pot /  (white + brown);
        System.out.println("В школе, где " + clas + " классов, нужно " + white + " банок белой краски и " + brown + "банок коричневой краски");

        System.out.println("ЗАДАЧА 6");
        int grPerKg = 1000;
        float banana = 5;
        float grBanana = banana * 80;
        float milk = 200;
        float grMilk = (milk / 100) * 5;
        float iceCream = 2;
        float grIceCream = iceCream * 100;
        float egg = 4;
        float grEgg = egg * 70;
        float mix = (float)grEgg + (float)grBanana + (float) grIceCream + (float) grMilk;
        System.out.println(mix + " грамм");
        float kgMix = mix / grPerKg;
        System.out.println(kgMix + " килограмм");

        System.out.println("ЗАДАЧА 7");
        byte kgReset = 7;
        float grReset = (float) kgReset * 1000;
        short gr500 = 500;
        short gr250 = 250;
        float resetGr500 = (float)grReset / gr500;
        System.out.println("По 500 грамм " + resetGr500 + " дней");
        float resetGr250 = (float)grReset / gr250;
        System.out.println("По 250 грамм " + resetGr250 + " дней");

        System.out.println("ЗАДАЧА 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float masha2 = (float) masha + ((float) masha * 10) / 100;
        float denis2 = (float) denis + ((float) denis * 10) / 100;
        float kristina2 = (float) kristina + ((float) kristina * 10) / 100;
        float mashaPlus = (((float) masha * 10) / 100) * 12;
        float denisPlus = (((float) denis * 10) / 100) * 12;
        float kristinaPlus = (((float) kristina * 10)) / 100 * 12;
        System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + mashaPlus + " рублей");
        System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + denisPlus + " рублей");
        System.out.println("Кристина теперь получает " + kristina2 + " рублей. Годовой доход вырос на " + kristinaPlus + " рублей");

































    }
}