## Задача. Консольное приложение “Калькулятор”
### 1. Описание: Приложение должно читать из консоли введенные пользователем строки, числа, арифметические операции, проводимые между ними и выводить в консоль результат их выполнения.
Реализуйте класс Main с методом public static String calc(String input). Метод должен принимать строку с арифметическим выражением между двумя числами и возвращать строку с результатом их выполнения. Вы можете добавлять свои импорты, классы и методы. 
Добавленные классы не должны иметь модификаторы доступа (public или другие).
### 2. Требования:
Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. 

Данные передаются в одну строку (смотрите пример)!

Input: 1 + 2

Output: 3

Решения, в которых каждое число и арифметическая операция передаются с новой строки считаются неверными.
Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
При вводе пользователем неподходящих чисел приложение выводит исключение и завершает свою работу.
При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выводит исключение и завершает свою работу.
Результатом операции деления является целое число, остаток отбрасывается. 
Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.

### 3. Решение
После запуска программа выводит короткое приветствие

Выход из программы по короткому слову 'quit'

### 4. Дополнение
Разработаны тесты для проверки работы программы в соответствии с заданием

Использованы Gradle 7.22, JUnit5, Java JDK 21.0.1

  - Запуск тестов и генерация отчета Allure. В командной строке выполните:

./gradlew clean test allureReport

 - Просмотр отчета Allure. В командной строке выполните:

./gradlew allureServe

Эта команда запустит локальный сервер и откроет отчет Allure в вашем браузере.

