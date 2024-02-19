package org.example
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var player: String
    var computer: String
    while(true) {
        println("Введите вариант: 0 - Камень, 1 - Ножницы, 2 - Бумага")
        player = readln()
        when (player) {
            "0" -> println("Вы выбрали: Камень")
            "1" -> println("Вы выбрали: Ножницы")
            "2" -> println("Вы выбрали: Бумагу")
            else -> {
                println("Неверный ввод данных")
                break
            }
        }

        computer = Random.nextInt(0..2).toString()
        when (computer) {
            "0" -> println("Компьютер выбрал: Камень")
            "1" -> println("Компьютер выбрал: Ножницы")
            "2" -> println("Компьютер выбрал: Бумагу")
            else -> {
                println("Неверный ввод данных")
                break
            }
        }

        if(player.equals(computer)){
            println("Ничья")
        }else if(player.equals("0") && computer.equals("1")) {
            println("Вы выбрали: Камень, Компьютер выбрал: Ножницы")
            print("Вы выиграли!!!\n")
        }else if(player.equals("1") && computer.equals("2")){
            println("Вы выбрали: Ножницы, Компьютер выбрал: Бумагу")
            print("Вы выиграли!!!\n")
        }else if(player.equals("2") && computer.equals("0")){
            println("Вы выбрали: Бумагу, Компьютер выбрал: Камень")
            print("Вы выиграли!!!\n")
        }else {
            println("Компьютер победил(")
            println("В следующий раз получится!!!")
        }

        println("Хотите продолжить игру? Да/Нет")
        val answer = readln().lowercase()
        if(answer != "да"){
            break
        }
    }
}