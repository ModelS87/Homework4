public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println(" Он не достиг совершеннолетия, нужно немного подождать.");
        }

        int age1 = 10;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градуса , нужно надеть шапку");
        } else {
            System.out.println("Сегодня" + temp + "градуса , можно идти без шапки");

        }
        int speed = 20;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }
        int agePerson = 8;
                if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в детский сад.");
        } else if ( agePerson >=7 && agePerson <= 18 ) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
                } else if ( agePerson > 18 && agePerson < 24 ) {
                    System.out.println("Если возраст человека равен " + agePerson + " , то его место в Университете.");
                } else {
                    System.out.println("Если возраст человека равен " + agePerson + " , то ему пора на работу.");
                }
    }
}