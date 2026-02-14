// /Users/sameerpatil/Documents/my_projects/kotlin/classes/class1.kt

class Person(val id: Int) {
    // name initialized later using lateinit
    lateinit var name: String

    // age will be initialized in init block
    var age: Int

    // gender will be initialized via secondary constructor
    lateinit var gender: String

    // init block initializes age (runs after primary constructor)
    init {
        age = 20 + id // example initialization logic
        println("Init block: id=$id, age set to $age")
    }

    // secondary constructor initializes gender and delegates to primary constructor
    constructor(id: Int, gender: String) : this(id) {
        this.gender = gender
        println("Secondary constructor: gender set to $gender for id=$id")
    }

    fun info() {
        val nameStr = if (::name.isInitialized) name else "<not initialized>"
        val genderStr = if (::gender.isInitialized) gender else "<not initialized>"
        println("Person(id=$id, name=$nameStr, age=$age, gender=$genderStr)")
    }
}

fun main() {
    // Using primary constructor: id initialized via primary constructor,
    // name via lateinit, age via init, gender remains uninitialized
    val p1 = Person(1)
    p1.name = "Alice" // initialize lateinit name
    p1.info()

    // Using secondary constructor: gender initialized via secondary constructor
    val p2 = Person(2, "Female")
    p2.name = "Bob"
    p2.info()
}
