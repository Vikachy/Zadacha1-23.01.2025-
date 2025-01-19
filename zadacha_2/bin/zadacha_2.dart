import 'dart:math';
import 'package:intl/intl.dart';

// Пользовательские классы исключений
class WeakPasswordException implements Exception {
  final String message;
  WeakPasswordException(this.message);
  @override
  String toString() => 'WeakPasswordException: $message';
}

class DateTimeParseException implements Exception {
  final String message;
  DateTimeParseException(this.message);
  @override
  String toString() => 'DateTimeParseException: $message';
}

// 1. Функция для нахождения максимума
int findMax(int a, int b) {
  if (a == b) {
    throw Exception("Числа равны.");
  }
  return a > b ? a : b;
}

// 2. Калькулятор деления
double divide(double a, double b) {
  if (b == 0) {
    throw Exception("Деление на ноль недопустимо.");
  }
  return a / b;
}

// 3. Конвертер строк в числа
int stringToInt(String str) {
  try {
    return int.parse(str);
  } catch (e) {
    throw FormatException(
        "Строка не может быть преобразована в целое число.");
  }
}

// 4. Проверка возраста
void checkAge(int age) {
  if (age < 0 || age > 150) {
    throw ArgumentError("Недопустимый возраст.");
  }
}

// 5. Нахождение корня
double findSquareRoot(double number) {
  if (number < 0) {
    throw ArgumentError("Нельзя извлечь корень из отрицательного числа.");
  }
  return sqrt(number);
}

// 6. Факториал
int factorial(int n) {
  if (n < 0) {
    throw Exception("Факториал не определен для отрицательных чисел.");
  }
  if (n == 0 || n == 1) {
    return 1;
  }
  int result = 1;
  for (int i = 2; i <= n; i++) {
    result *= i;
  }
  return result;
}

// 7. Проверка массива на нули
void checkArrayForZeros(List<int> array) {
  for (int num in array) {
    if (num == 0) {
      throw Exception("Массив содержит нули.");
    }
  }
}

// 8. Калькулятор возведения в степень
double power(double base, int exponent) {
  if (exponent < 0) {
    throw Exception("Отрицательная степень недопустима.");
  }
  return pow(base, exponent).toDouble();
}

// 9. Обрезка строки
String trimString(String str, int maxLength) {
  if (maxLength > str.length) {
    throw Exception("Число символов больше длины строки.");
  }
  return str.substring(0, maxLength);
}

// 10. Поиск элемента в массиве
int findElementInArray(List<int> array, int element) {
  for (int i = 0; i < array.length; i++) {
    if (array[i] == element) {
      return i;
    }
  }
  throw Exception("Элемент не найден.");
}

// 11. Конвертация в двоичную систему
String intToBinary(int number) {
  if (number < 0) {
    throw Exception(
        "Отрицательное число не может быть преобразовано в двоичную строку.");
  }
  return number.toRadixString(2);
}

// 12. Проверка делимости
bool isDivisible(int a, int b) {
  if (b == 0) {
    throw Exception("Делитель не может быть равен нулю.");
  }
  return a % b == 0;
}

// 13. Чтение элемента списка
int getElementFromList(List<int> list, int index) {
  if (index < 0 || index >= list.length) {
    throw RangeError("Индекс выходит за пределы списка.");
  }
  return list[index];
}

// 14. Парольная проверка
void checkPasswordComplexity(String password) {
  if (password.length < 8) {
    throw WeakPasswordException("Пароль должен содержать не менее 8 символов.");
  }
}

// 15. Проверка даты
void checkDate(String dateStr) {
  RegExp dateRegex = RegExp(r"^\d{2}\.\d{2}\.\d{4}$");
  if (!dateRegex.hasMatch(dateStr)) {
    throw DateTimeParseException(
        "Неверный формат даты. Ожидается формат 'dd.MM.yyyy'.");
  }
  try {
    DateFormat("dd.MM.yyyy").parseStrict(dateStr);
  } catch (e) {
    throw DateTimeParseException(
        "Неверный формат даты. Ожидается формат 'dd.MM.yyyy'.");
  }
}

// 16. Конкатенация строк
String concatenateStrings(String str1, String str2) {
  if(str1 == null || str2 == null){
    throw Exception("Одна из строк равна null");
  }
  return str1 + str2;
}

// 17. Остаток от деления
int remainder(int a, int b) {
  if (b == 0) {
    throw Exception("Делитель не может быть равен нулю.");
  }
  return a % b;
}

// 18. Квадратный корень
double squareRoot(double number) {
  if (number < 0) {
    throw Exception("Нельзя извлечь корень из отрицательного числа.");
  }
  return sqrt(number);
}

// 19. Конвертер температуры
double celsiusToFahrenheit(double celsius) {
  if (celsius < -273.15) {
    throw Exception("Температура ниже абсолютного нуля.");
  }
  return (celsius * 9 / 5) + 32;
}

// 20. Проверка строки на пустоту
void checkStringNotEmpty(String str) {
  if (str == null || str.isEmpty) {
    throw Exception("Строка не может быть пустой или null.");
  }
}

void main() {
  // Задание 1: Функция для нахождения максимума
  print("--- Задание 1: Функция для нахождения максимума ---");
  try {
    print("Максимум из 10 и 5: ${findMax(10, 5)}");
    // print(findMax(5, 5)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 2: Калькулятор деления
  print("\n--- Задание 2: Калькулятор деления ---");
  try {
    print("10 / 2 = ${divide(10, 2)}");
    // print(divide(10, 0)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 3: Конвертер строк в числа
  print("\n--- Задание 3: Конвертер строк в числа ---");
  try {
    print("Строка '123' в число: ${stringToInt("123")}");
    // print(stringToInt("abc")); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 4: Проверка возраста
  print("\n--- Задание 4: Проверка возраста ---");
  try {
    checkAge(30);
    print("Возраст 30 - корректный");
    // checkAge(-10); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 5: Нахождение корня
  print("\n--- Задание 5: Нахождение корня ---");
  try {
    print("Корень из 16: ${findSquareRoot(16)}");
    // print(findSquareRoot(-16)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 6: Факториал
  print("\n--- Задание 6: Факториал ---");
  try {
    print("Факториал 5: ${factorial(5)}");
    // print(factorial(-5)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 7: Проверка массива на нули
  print("\n--- Задание 7: Проверка массива на нули ---");
  try {
    checkArrayForZeros([1, 2, 3, 4, 5]);
    print("Массив [1, 2, 3, 4, 5] не содержит нулей.");
    // checkArrayForZeros([1, 2, 0, 4, 5]); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 8: Калькулятор возведения в степень
  print("\n--- Задание 8: Калькулятор возведения в степень ---");
  try {
    print("2 в степени 3: ${power(2, 3)}");
    // print(power(2, -3)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 9: Обрезка строки
  print("\n--- Задание 9: Обрезка строки ---");
  try {
    print("Обрезка 'hello' до 3 символов: ${trimString("hello", 3)}");
    // print(trimString("hello", 10)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 10: Поиск элемента в массиве
  print("\n--- Задание 10: Поиск элемента в массиве ---");
  try {
    print("Индекс элемента 4 в массиве [1, 2, 3, 4, 5]: ${findElementInArray([1, 2, 3, 4, 5], 4)}");
    // print(findElementInArray([1,2,3,4,5], 10)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 11: Конвертация в двоичную систему
  print("\n--- Задание 11: Конвертация в двоичную систему ---");
  try{
    print("Число 10 в двоичной системе: ${intToBinary(10)}");
    // print(intToBinary(-10)); // Вызовет исключение
  } catch (e){
    print("Ошибка: $e");
  }

  // Задание 12: Проверка делимости
  print("\n--- Задание 12: Проверка делимости ---");
  try {
    print("10 делится на 2: ${isDivisible(10, 2)}");
    // print(isDivisible(10, 0)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 13: Чтение элемента списка
  print("\n--- Задание 13: Чтение элемента списка ---");
  try {
    print("Элемент по индексу 1 в списке [1, 2, 3]: ${getElementFromList([1, 2, 3], 1)}");
    // print(getElementFromList([1,2,3], 5)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 14: Парольная проверка
  print("\n--- Задание 14: Парольная проверка ---");
  try {
    checkPasswordComplexity("Abc12345");
    print("Пароль 'Abc12345' - корректный");
    // checkPasswordComplexity("Abc123"); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 15: Проверка даты
  print("\n--- Задание 15: Проверка даты ---");
  try {
    checkDate("12.01.2023");
    print("Дата '12.01.2023' - корректная");
    // checkDate("12-01-2023"); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 16: Конкатенация строк
  print("\n--- Задание 16: Конкатенация строк ---");
  try {
    print("Конкатенация 'Hello' и 'World': ${concatenateStrings("Hello", "World")}");
    // print(concatenateStrings(null, "World")); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 17: Остаток от деления
  print("\n--- Задание 17: Остаток от деления ---");
  try {
    print("Остаток от деления 10 на 3: ${remainder(10, 3)}");
    // print(remainder(10, 0)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 18: Квадратный корень
  print("\n--- Задание 18: Квадратный корень ---");
  try {
    print("Квадратный корень из 25: ${squareRoot(25)}");
    // print(squareRoot(-25)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 19: Конвертер температуры
  print("\n--- Задание 19: Конвертер температуры ---");
  try {
    print("25 градусов Цельсия в Фаренгейт: ${celsiusToFahrenheit(25)}");
    // print(celsiusToFahrenheit(-300)); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }

  // Задание 20: Проверка строки на пустоту
  print("\n--- Задание 20: Проверка строки на пустоту ---");
  try {
    checkStringNotEmpty("hello");
    print("Строка 'hello' не пустая.");
    // checkStringNotEmpty(""); // Вызовет исключение
  } catch (e) {
    print("Ошибка: $e");
  }
}