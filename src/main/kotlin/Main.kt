const val APP = "Learn Kotlin"
const val VERSION = "0.0.1"

fun main(args: Array<String>) {
    //Variable: Place to save data
    //Mutable: Value can be changed
    var firstName:String = "Bruce"

    //Fun Fact! You don't need to tell Kotlin what is the data type, except when needed
    var lastName= "Kent"

    println(firstName)
    println(lastName)

    //Changing value inside variable
    lastName = "Wayne"
    println(lastName)

    //Immutable: Value can't be changed
    val firstRule:String = "Rule 1 - Can't eat at class"
    //firstRule = "There is no rule" -> Will cause error

    //In Kotlin, variable needed to be filled after declaration
    //If we want to leave the value nullable
    var registeredName:String?
    registeredName = null

    //Beware when using unfilled variable
    //println(registeredName.length) will cause error
    //The right way to access is
    println(registeredName?.length)
    //This line of code will give value when registeredName have value

    registeredName = "Bruce"
    println(registeredName?.length)


    //Constant variable
    //Must be declared outside of main and can be accessed globally
    println("Welcome to $APP version $VERSION")

}