package Ejercicio4;

public class Shape {
    public static final int SQUARE = 1;
    public static final int CIRCLE = 2;
    public static final int RIGHT_TRIANGLE = 3;

    private final int shapeType;
    private final double size;
    public Shape (int shapeType, double size) {
        this.shapeType = shapeType;
        this.size = size;
    }
    //... other methods...
    public double area() {
        return switch (shapeType) {
            case SQUARE -> size * size;
            case CIRCLE -> Math.PI * size * size / 4.0;
            case RIGHT_TRIANGLE -> size * size / 2.0;
            default -> 0;
        };
    }
    }
