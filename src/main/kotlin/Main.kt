fun main() {
    val tesla= Car("tesla","Model Y", "KCG345P", 0)
    println(tesla.model)
    tesla.start()
    println(tesla.speed)
    tesla.acceletarate(50)
    tesla.acceletarate(20)
    println(tesla.speed)
    tesla.decelarate(15)
    println(tesla.speed)
    tesla.hoot()
    tesla.stop()
    println(tesla.speed)
     var myBook=Book("Born a crime","Trevor Noah",288,"John Monrew")
    println(myBook.title)
    println(myBook.author)


 }

class  Car(var make:String, var model:String, var registration:String, var speed:Int ){
    fun start(){
        println("Vroom vroom")
    }
    fun acceletarate(acceleration:Int){
        speed +=acceleration
        println()

    }
    fun decelarate(deceleration:Int){
        speed -=deceleration
    }
    fun hoot(){
        println("beep beep")
    }
    fun stop() {
        speed= 0
    }
}
data class Book(var title:String, var author:String, var pages:Int, var publisher:String)
data class AgeStats(var minAge:Int, var maxAge:Int, var avg:Double)
fun calculateAgeStatistics(ages:Array<Int>):AgeStats {

    val min = ages.min()
    val max = ages.max()
    val avg = ages.average()










