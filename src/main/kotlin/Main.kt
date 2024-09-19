package org.example

fun main() {


    val inventory = listOf(Weapon("Axe",100),
                            Weapon("Sword",200),
                            Protection("Helmet",50),
                            Protection("Shield",100))

    val player1 = Character("Jose",1000 , 100 ,100, inventory)
        println(inventory.filter { it is Weapon })
}