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
        int agePerson = 45;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в детский сад.");
        } else if (agePerson >= 7 && agePerson <= 18) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
        } else if (agePerson > 18 && agePerson < 24) {
                    System.out.println("Если возраст человека равен " + agePerson + " , то его место в Университете.");
                } else {
                    System.out.println("Если возраст человека равен " + agePerson + " , то ему пора на работу.");
                }
int childAge = 14;
        if (childAge < 5 ) {
            System.out.println( "Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        int totalCapacity = 102;
        int totalSeatingSeats = 60;
        int totalStandingSeats = totalCapacity - totalSeatingSeats;
        int usedSeats = 35;
        int usedStandingSeats = 40;
        int freeSeats = totalSeatingSeats - usedSeats;
        int freeStandingSeats = totalStandingSeats - usedStandingSeats;
        int totalFreeSeats = totalCapacity - (freeSeats + freeStandingSeats);
        if (totalFreeSeats == 0) {
            System.out.println("Вагон уже полностью забит.");
        } else  {
            System.out.println("В вагоне " + freeSeats + " свободных сидячих мест и " + freeStandingSeats + " свободных стоячих места.");

        }
    }
        }

