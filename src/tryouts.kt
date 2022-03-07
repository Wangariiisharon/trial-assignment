fun main(){
    text("akirachix")
    var x =statement("Muhamed",20)
    println(x)
    var y = name()
    println(name().length)


}
fun text(text:String){
    var text="Akirachix"
    print(text[2])
    println(text[3])
}
fun statement(a:String,b:Int):String{
    var statement= "Hi my name is $a and I'm $b years old"
    return statement
}
fun name(): String {
    var name="Marina"
    return name
}
