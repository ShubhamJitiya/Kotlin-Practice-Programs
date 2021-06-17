fun main(args: Array<String>)
{
    println("Hello aliens")

    var tittu = Alien();

    tittu.name = "Harsh";
//    println("Name is : " + tittu.name) //First method to print
    println("Name is : ${tittu.name}") // Second method to print

    tittu = Alien();
    println("Name is : ${tittu.name}")
//    ---------------------------------------
//    We can create object of java file also
//    var telusco = Alien2();
//    telusco.name = "Navin"; //We don't have to call setters and gettters | Does auto
//    println(telusco.name)
}
//Use of val and var
//var - variable
    //in java - final
//val - constants - PI

//We can get source code of class file = upto 95%
//javadecompilers.com
//Converts kotlin class to java file
// ; is optional