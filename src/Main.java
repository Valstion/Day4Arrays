public class Main {
    public static void main(String[] args) {
        int[] number = {5, 3, 8, 20, 4};
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println(number);
        number[3] = 23;
        System.out.println(number[3]);
        System.out.println("___________________________________________________________");
        int[] numbers2 = new int[6];
        numbers2[0] = 43;
        numbers2[3] = 2;
        numbers2[4] = 2;
        numbers2[5] = 2;
        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);
        System.out.println(numbers2[3]);
        System.out.println(numbers2[4]);
        System.out.println(numbers2[5]);
        String[] names = {"Jonas", "Petras", "Adele", "A", "K"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        String[] surnames = new String[40];
        System.out.println(surnames[0]);
        int[][] arr2d = {{1, 2, 3}, {4, 3, 5}, {4, 3, 5}, {4, 3, 5}, {4, 3, 5}, {4, 3, 5}, {4, 3, 5}};
        System.out.println(arr2d[1][2]);
        System.out.println("___________________________________________________________");
        String[] names1 = {"Jonas", "Petras", "trys", "One", "two"};
        System.out.println(names1[0]);
        System.out.println(names1[1]);
        System.out.println(names1[2]);
        System.out.println(names1[3]);
        System.out.println(names1[4]);
        System.out.println("___________________________________________________________");
        for (int i = 0; i < names1.length; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Emaxer = " + i);
            System.out.println(names1[i]);
        }
        int count = 0;
        double sum = 0;
        while (true) {

            double rndNum = Math.random();
            count++;
            sum += rndNum;
            System.out.println(rndNum);
            if (rndNum >= 0.9) {
                break;
            }

        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(sum / count);
    }
}