package org.example

fun main() {


    val inventory = listOf(Weapon("Axe",140),
                            Weapon("Sword",28),
                            Protection("Helmet",50),
                            Protection("Shield",100))

    val player1 = Character("Jose",1000 , 100 ,100, inventory)

    println(player1.Attack())
}


