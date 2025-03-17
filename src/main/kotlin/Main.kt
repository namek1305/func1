fun main() {
    // Практическая работа №1: Вывод информации
    println("Иван")
    println(35)
    println(true)

    // Практическая работа №2: Работа с переменными
    val intVar: Int = 5
    val charVar: Char = 'F'
    val stringVar: String = "Привет"
    val doubleVar: Double = 90.2
    val constVar: Int = 67
    println(stringVar)

    // Практическая работа №3: Разделение числа на символы
    print("Введите четырехзначное число: ")
    val number = readLine()?.toInt() ?: 0
    val thousands = number / 1000
    val hundreds = (number % 1000) / 100
    val tens = (number % 100) / 10
    val units = number % 10
    println("$thousands, $hundreds, $tens, $units")

    // Практическая работа №4: Работа с числами
    val days: Int = 2642
    val years = days / 365
    val remainingDays = days % 365
    val weeks = remainingDays / 7
    val finalDays = remainingDays % 7
    println("Лет: $years, недель: $weeks, дней: $finalDays")

    // Практическая работа №5: Нахождение числа
    print("Введите число: ")
    val n = readLine()!!
    val doubled = n.toInt() * 2
    println(n + doubled.toString())

    // Практическая работа №6: Работа с переменными
    print("Введите ваше имя: ")
    val name = readLine() ?: ""
    print("Введите ваш возраст: ")
    val age = readLine()?.toInt() ?: 0
    println("Привет, $name! Тебе уже $age")
}