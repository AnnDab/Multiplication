package anna.homework.eight;

public class MultiplicationTable {
    public static void main(String[]args){
        int numberOfColumns = 10;
        printMultiplicationTable(numberOfColumns);
    }

    private static void printMultiplicationTable(int numberOfColumns) {
        System.out.format("    ");
        for(int i = 1; i <= numberOfColumns; i++){
            System.out.format("%5d",i);
        }
        System.out.println();
        System.out.println("=======================================================");

        for(int i = 1; i<= numberOfColumns; i++){
            System.out.format("%2d |",i);
            for(int j=1; j<=numberOfColumns;j++){
                System.out.format("%5d", i*j);
            }
            System.out.println();
        }
    }
}
