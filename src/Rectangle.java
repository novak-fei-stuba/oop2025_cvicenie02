public class Rectangle {
    public static void print(int width, int height) {
        // https://www.w3.org/TR/xml-entity-names/025.html
        final char TOP_LEFT = '\u250C';
        final char TOP_RIGHT = '\u2510';
        final char HORIZONTAL = '\u2500';
        final char VERTICAL = '\u2502';
        final char BOTTOM_LEFF = '\u2514';
        final char BOTTOM_RIGHT = '\u2518';
        final char SQUARE = '\u25A1';

        if (width == 0 || height == 0) {
            return;
        }
        if (width == 1 && height == 1) {
            System.out.println(SQUARE);
            return;
        }
        if (height == 1 ) {
            for (int i = 0; i < width; i++) {
                System.out.print(HORIZONTAL);
            }
            System.out.println();
            return;
        }
        if (width == 1) {
            for (int i = 0; i < height; i++) {
                System.out.println(VERTICAL);
            }
            return;
        }

        System.out.print(TOP_LEFT);
        for (int i = 0; i < width - 2; i ++) {
            System.out.print(HORIZONTAL);
        }
        System.out.println(TOP_RIGHT);

        for (int i = 0; i < height - 2; i ++) {
            System.out.print(VERTICAL);
            for (int j = 0; j < width - 2; j ++) {
                System.out.print(" ");
            }
            System.out.println(VERTICAL);
        }
        System.out.print(BOTTOM_LEFF);
        for (int i = 0; i < width - 2; i ++) {
            System.out.print(HORIZONTAL);
        }
        System.out.println(BOTTOM_RIGHT);





    }
}
