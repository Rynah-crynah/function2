fun main(){
    var institute = "akirachix"
    var char1 = institute[0]
    var char2 = institute[2]
    var char3 = institute[3]
    println(char1.toString() + char2 + char3)
    identity("Swabra", 21)

    var name ="Swabrina"
    println("The length of my name is "+ name.length)

    var name3 = "Ninah"
    if (name3 == "Ninah"){
        println("(That's me!")
    } else {
        println("I don't know who that is")
    }



}

fun identity(name2: String, age: Int): String{
    var add = ("Hi, my name is $name2 and I am $age years old.")
    println(add)
    return add

}





