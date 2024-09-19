package org.example

class Weapon(val name:String,val Damege:Int):Item {
    override fun Apply(player: Character): Int {
        return Damege
    }
}