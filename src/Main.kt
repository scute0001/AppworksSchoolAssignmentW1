open class Human(val name: String) {
    var mana: Boolean = true
    open fun attack() {
        if(mana) {
            println("$name use Fist Attack!")
        } else {
            println("$name doesn't have enough Mana!")
        }
    }
}
class Mage(name: String): Human(name){
    override fun attack() {
        if(mana) {
            println("$name use Fireball!")
            mana = false
        } else {
            println("$name doesn't have enough Mana!")
        }
    }
}

fun main(args:Array<String>) {
    val firstHuman = Human("Nori")
    firstHuman.attack()
    firstHuman.attack()

    val firstMage = Mage("Magical-Nori")
    firstMage.attack()
    firstMage.attack()

}