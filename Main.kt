//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    myFirstName("Faith")
    var x = modulas(7,4)
    println(x)
    var y = add(3,4,5,6)
    println(y)
    aboutMyself("I love football")


}
fun myFirstName(name:String){
    val name = ("Hello ${name}")
    println(name)

    }
    fun modulas(num1:Int,num2:Int):Int{
        var modulas=num1%num2
        return modulas
    }
fun add(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var add = num1+num2+num3+num4
    return add
}
fun aboutMyself(word:String){
    println(word)
}


