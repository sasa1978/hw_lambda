public class Main1 {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        // Складываем 1 + 2 = 3
        int a = calc.plus.apply(1, 2);
        // Вычитаем 1 - 1 = 0
        int b = calc.minus.apply(1,1);
        // Попытка поделить результат первого сложения на результат второго вычитания
        // Дели 3 на 0 и программа падает
        int c = calc.devide.apply(a, b);

        // Сюда уже выполнение не доходит
        calc.println.accept(c);

        // Для решения задачи используем тернарный оператор в делении.
        // Если деление на 0, то возвращаем максимально возможный результат.
    }
}
