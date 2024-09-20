using ConsoleApp1;

public class Character(string name, int MaxHitPoints, int BaseDamage,int BaseArmor, List<IItem> _inventory)
{
    
    public int Attack()
    {
        if (_inventory.Count == 0)
        {
            return BaseDamage;
        }
        else
        {
            return BaseArmor + (DamegeAllItem(_inventory)/10);
        }
    }
    //
    int DamegeAllItem(List<IItem> _inventory)
    {
        int totalDamege = 0;
        foreach (var weapon in _inventory)
        {
            if (weapon is Weapon)
            {
                totalDamege += weapon.Apply(this);
            }
        }

        return totalDamege;
    }

    void Defend()
    {
        
    }

    void Heal(int amount)
    {
        
    }

    void ReceiveDamage(int damage)
    {
        
    }
    
}