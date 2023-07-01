public class Patch {
    public static void build(int num) {
        int[][] myArr = new int[num][num];

        System.out.println("[");

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                myArr[i][j] = num;
            }
        }

        for(int i = 0; i < num; i++) {

            System.out.print("   [");

            for(int j = 0; j < num; j++) {
                if (j == num-1)
                    System.out.print(myArr[i][j]);
                else
                    System.out.print(myArr[i][j] + ", ");
            }

            if(i == num-1)
                System.out.println("]");
            else
                System.out.print("],\n");
        }

        System.out.println("]");
    }
}
