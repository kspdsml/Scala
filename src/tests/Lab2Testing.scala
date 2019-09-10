package tests

import org.scalatest._
import proj.Character


class Lab2Testing extends FunSuite {
  var character1: Character = new Character()
  var character2: Character = new Character()
  character1.takeDamage(character2.attackPower)

}
