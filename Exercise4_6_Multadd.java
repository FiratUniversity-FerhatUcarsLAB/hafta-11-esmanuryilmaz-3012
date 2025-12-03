public class Exercise4_6_Multadd {

    // Görev 1: a * b + c işlemini yapan metot
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // Görev 2: x * e^-x + (1 - e^-x) işlemini yapan metot
    public static double expSum(double x) {
        double eNegX = Math.exp(-x); // İşlem tekrarı olmaması için değişkene atadık
        
        // Formül: x * eNegX + (1 - eNegX)
        // multadd yapısı (a * b + c) ile eşleşmesi:
        // a = x
        // b = eNegX
        // c = 1.0 - eNegX
        return multadd(x, eNegX, 1.0 - eNegX);
    }

    public static void main(String[] args) {
        // 1. Basit Test: 1 * 2 + 3
        double result1 = multadd(1.0, 2.0, 3.0);
        System.out.println("multadd(1.0, 2.0, 3.0) = " + result1);

        // 2. Trigonometri Testi: sin(pi/4) + cos(pi/4) / 2
        // Formül: 0.5 * cos(pi/4) + sin(pi/4)
        double sinCosResult = multadd(0.5, Math.cos(Math.PI / 4), Math.sin(Math.PI / 4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + sinCosResult);

        // 3. Logaritma Testi: log(10) + log(20)
        // Formül: 1.0 * log(10) + log(20)
        // Not: Math.log doğal logaritma (ln) alır. Taban 10 için Math.log10 kullanılabilir.
        // Soruda genelde standart log (ln) kastedilir.
        double logResult = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println("log(10) + log(20) = " + logResult);

        // 4. expSum Testi (Örnek olarak x=2 için)
        double expResult = expSum(2.0);
        System.out.println("expSum(2.0) = " + expResult);
    }
}
