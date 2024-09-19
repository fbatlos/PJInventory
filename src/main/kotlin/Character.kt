package org.example

import kotlin.math.roundToInt
import kotlin.time.times

class Character(val name:String,val MaxHitPoints:Int,val BaseDamega:Int,val BaseArmor:Int,val inventory:List<Item>) {
    fun Attack():Int{
        if (inventory.isEmpty()){
            return BaseDamega
        }else {
            return (BaseDamega + (DamageAllItem() / 10))
        }
    }

    fun Defense():List<Int>{
        return ArmorAllItem()
    }
//Have all damage from inventory if it is a weapon
    fun DamageAllItem():Int{

        var totalDamageItem = 0

        for (weapon in inventory.filter { it is Weapon } ){
            totalDamageItem +=weapon.Apply(this)
        }

        return totalDamageItem
    }

    fun ArmorAllItem():Int{

        var totalArmorItem = 0

        for (weapon in inventory.filter { it is Protection } ){
            totalArmorItem +=weapon.Apply(this)
        }

        return totalArmorItem
    }
}