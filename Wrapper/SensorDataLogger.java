// SensorDataLogger.java
public class SensorDataLogger {
    public static void logTemperature(Double data) {
        System.out.println("Logged (Wrapper): " + data);
    }

    public static void logTemperature(double data) {
        System.out.println("Logged (Primitive): " + data);
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.6;
        Double wrapperTemp = 38.2;

        logTemperature(primitiveTemp); // Auto-boxing
        logTemperature(wrapperTemp);   // Auto-unboxing
    }
}
