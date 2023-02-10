fun main(){
greetperson("Susan")

    var x= modulus(22,5)
    println(x)
    var sum= addition(22,12,13,15)
    println(sum)
    aboutMefact("I love playing Basket Ball")

}

fun greetperson (name: String){
    println( "Hello $name")
}

fun modulus(num1:Int, num2:Int ):Int{
    var modulus= num1 % num2
    return modulus
}
fun addition (a:Int,m:Int,w:Int,x:Int):Int{
    var sum=a+m+w+x
    return sum
}
fun aboutMefact(fact:String){
    println("Interesting thing about me is: $fact.")
}
