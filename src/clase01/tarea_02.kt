package clase01
/*
*2.- Escribir un programa que solicite al usuario dos números y los almacene en dos variables. En otra variable,
* almacenar el resultado de la suma de esos dos números y luego mostrar ese resultado en pantalla.
A continuación, el programa debe solicitar al usuario que ingrese un tercer número,
* el cual se debe almacenar en una nueva variable.
* Por último, mostrar en pantalla el resultado de la multiplicación de este nuevo número por el resultado de la suma anterior.
* La suma y la multiplicación deben ser con funciones de extensión.
*/
fun main(arg: Array<String>){
    val primer:Int?
    val segundo:Int?
    val tercero:Int?

    var suma = 0
    var prod = 0

    println("ingrese el primer numero ")
    primer = readLine()?.toInt()
    println("ingrese el segundo numero ")
    segundo = readLine()?.toInt()
    suma = segundo!!.let{segundo.suma(primer!!)}
    println("La sumatoria es $suma")

    println("ingrese un tercer numero ")
    tercero = readLine()?.toInt()

    prod = tercero!!.let{tercero.multiplicar(suma)}

    println("El producto de la sumatoria y el tercer numero es $prod")

}
fun Int.suma(numero:Int):Int{
    return this + numero
}

fun Int.multiplicar(numero:Int):Int{
    return this * numero
}
