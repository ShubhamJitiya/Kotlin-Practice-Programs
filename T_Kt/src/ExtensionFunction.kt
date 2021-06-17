fun main() {
    var a1 = Alien3()
    a1.skills = "Java"
    a1.show()

    var a2 = Alien3()
    a2.skills = "SQL"
    a2.show()

//    var a3 = a1.plus(a2)
//    a3.show()
//---------------------------
    //Advantage
//     - user word infix
//     - Takes only one parameter

//    var a3 = a1 plus a2
//    a3.show()
//----------------------------
//    Operator overloading
//    - In c++ we have
//            - In java we don't
//    Supports only some - visit java doc
//     use keyword - operator before fn
    var a3 = a1 + a2
    a3.show()
}

//without touching class Alien3
//This fn belongs to Alien3 class - Externally
//
//fun Alien3.plus(a: Alien3): Alien3 {
//    var newAlien = Alien3()
//    newAlien.skills = this.skills + " " + a.skills //a1 is referred as this
//    return newAlien
//}

operator infix fun  Alien3.plus(a: Alien3): Alien3 {
    var newAlien = Alien3()
    newAlien.skills = this.skills + " " + a.skills //a1 is referred as this
    return newAlien
}