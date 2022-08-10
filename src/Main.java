public class Main {
    public static void main(String[] args){


        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.print("\n");
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");

        }
        System.out.print("\n");

        // задача 2

        for (int f = 3; f <= 31; f += 7) {
            System.out.println("Сегодня пятница," + f + "-е число. Необходимо подготовить отчет.");
        }

        System.out.print("\n");

        //задача 3

        int year = 0;
        for (year = 0; year <= 2122; year += 79) {
            for (year = 1896; year <= 2122; year += 79) {
                System.out.println(year);
            }
        }
    }
}
