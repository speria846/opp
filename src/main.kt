
fun main(){
    var n =Human("speria",21,60)
    println(n.eat(5))
    var speech="spare me or lord"
    println(speech)
    n.bd(1)
    println(n.age)
    var d = User("niwenyesiga","speria","speria@gmail.com",2455345,1345)
    println(d.email)
    println(d.firstname)


}
class Human(var name:String,var age:Int,var weight:Int){
fun eat(foodweight:Int): Int {
    println("i am eating $foodweight kgs of food")

    weight+=foodweight
    return weight
     }

fun speak(speech:String){
    println(speech)

}
fun bd(birthday:Int):Int{
    age += birthday
    return age
}
     }
data class User(var firstname:String,var lastname:String,var email:String,var phonenumber:Int,var password:Int)





