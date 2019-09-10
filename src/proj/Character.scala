package proj

class Character {
  var attackPower: Int = 20
  var defense: Int = 10
  var magicAttack: Int = 25
  var magicDefense: Int = 10
  var maxHP: Int = 100
  var currentHP: Int = maxHP
  var maxMP: Int = 100
  var currentMP: Int = maxMP


def takeDamage(x: Int): Unit = {
  if (currentHP > x) {
    currentHP = currentHP-x
  } else {
    currentHP = 0
  }

  def physicalAttack(player2: Character): Unit = {
    player2.takeDamage(attackPower-player2.defense)
  }

  def magicalAttack(player2: Character): Unit = {
    if (currentMP < magicAttack) {
      player2.takeDamage(0)
    } else {
      player2.takeDamage(magicAttack-player2.magicDefense)
      currentMP = currentMP - magicAttack
    }

  }

}

}
