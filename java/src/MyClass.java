class MyClass {
    public static double CoolFunction(double x, double y) {
        double z = 0;
        for (int i = 0; i < 3; i++) {
            z = (x + y/x) / 2;
            x = (x + y/x) / 2; }
        return z;}

    public static void main(String[] args) {
        System.out.print(CoolFunction(1.0, 2.0));
    }
}