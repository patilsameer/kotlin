fun main(){
    var n=1

    try{
        if(n==1){
            throw Exception("information", Exception("checking exception"))
        }

    }catch (e:Exception){
        println(e.cause)
        println(e.message)
    }


    println("Hello World")
}