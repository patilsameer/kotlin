import kotlinx.coroutines.*


fun main()=runBlocking{
  

    /*
    most simple future example using async and await, 
    here we are creating a future using async and then waiting for the result using await,
    this is a simple way to create a future in kotlin coroutines.
    await is Defferred.await() and it will wait for the result of the deferred and return it
    deferred is a futre promise that will be completed in the future, 
    
    */
    var job2=async{
        "i can return you the value"
    }
    var result=job2.await() //wa
    println(result)
}