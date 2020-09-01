package metaProgramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main() {


    val classInfo = Transaction::class


    classInfo.memberProperties.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }
    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }
    getKotlinType(Transaction::class)
}


