import `class`.Company

fun main(args : Array<String>){
    val infosys = Company("Infosys",9,15)
    val capgemini = Company("Capgemini",7,25)
    val tcs = Company("TCS",10,20)

    infosys.createRandomEmployee(1)
    infosys.createRandomEmployee(2)
    capgemini.createRandomEmployee(1)
    capgemini.createRandomEmployee(2)
    tcs.createRandomEmployee(1)
    tcs.createRandomEmployee(2)

    for( i in infosys.employees){
        println(i.isPresent())
    }
    for( i in capgemini.employees){
        println(i.isPresent())
    }
    for( i in tcs.employees){
        println(i.isPresent())
    }
}