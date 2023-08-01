package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int center;
        if (sideLength % 2 == 0) {
            center = sideLength / 2;
        } else {
            center = (sideLength + 1) / 2;
        }
            for (int i = 1; i <= sideLength; i++) {
                for (int j = 1; j <= sideLength; j++) {
                    if (i == center || j == center) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
    }

}
