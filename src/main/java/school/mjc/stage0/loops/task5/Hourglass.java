package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int top;
        int bottom = height / 2 - 1;
        if (height % 2 != 0) {
            top = height / 2 + 1;
        } else {
            top = height / 2;
        }
        for (int i = 0; i < top; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print(8);
            }
            for (int j = height; j >height - i  ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = bottom; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print(8);
            }
            for (int j = height; j >height - i  ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        }
}
