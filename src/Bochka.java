public class Bochka {
    public static void main(String[] args) {
        int height = 0;
        while (height <= 10) {
            int width = 0;
            while (width <= 20) {
                if (height == 0 || height == 10) {
                    System.out.print("Б");
                } else if (width == 0 || width == 20) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}