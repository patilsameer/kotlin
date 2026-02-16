
/* here we are creating a thread using lambda expression and then starting it. 
The main thread will sleep for 2 seconds and then print "main ends here". */

fun main(){
    var t=Thread {


            println("Start")
        
    }

    t.start()
    Thread.sleep(2002)
    println("main ends here")
}