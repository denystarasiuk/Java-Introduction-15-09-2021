package ua.hillel.denys.hometask;

public class HomeTask5 {

    public static void main(String[] args) {

        /* Найти массу снеовика из 3-х шаров снега с радиусами R1 = 1(м), R2 = 0,5(м), R3 = 0,2(м),
        при плотности снежных шаров 0,7(кг/м3)
         */
        // V1 = (4/3) * π * R1^3 - Объём шара с радиусом 1м
        // V2 = (4/3) * π * R2^3 - Объём шара с радиусом 0,5м
        // V3 = (4/3) * π * R3^3 - Объём шара с радиусом 0,2м
        // V = V1 + V2 + V3 - Объём снеговика из 3-х шаров
        // M = V * ρ - Масса снеговика

        // Вносим исходные данные
        double R1 = 1;  // Снежный шар с радиусом 1м
        double R2 = 0.5;  // Снежный шар с радиусом 0,5м
        double R3 = 0.2;  // Снежный шар с радиусом 0,2м
        double density = 0.7;  // Плотность снега

        // Создаю постоянную "(4/3)*π" из формулы объёма шара V = (4/3) * π * R^3
        double Const = ((double)4/3)*Math.PI;  // 4.18879

        // Возвожу в степень R1, R2 и R3
        double powR1 = Math.pow(R1, 3);  // 1
        double powR2 = Math.pow(R2, 3);  // 0.125
        double powR3 = Math.pow(R3, 3);  // 0.008

        // Нахожу объём для снежных шаров R1, R2 и R3
        double V1 = Const * powR1;  // 4.18879
        double V2 = Const * powR2;  // 0.52359
        double V3 = Const * powR3;  // 0.03351

        // Нахожу объём снеговика
        double snowmanVolume = V1 + V2 + V3;  // 4.74589

        // Нахожу массу снеговика
        double snowmanWeight = snowmanVolume * density;
        System.out.println("Масса снеговика: " + snowmanWeight + " (кг)");

    }
}
