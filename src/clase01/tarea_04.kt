package clase01

import java.text.SimpleDateFormat
import java.util.*

/*
Escribí un programa que le solicite al usuario ingresar una fecha formada por 8 números, donde los primeros dos representan el día,
los siguientes dos el mes y los últimos cuatro el año (DDMMAAAA).
Este dato debe guardarse en una variable con tipo int (número entero).
Finalmente, mostrar al usuario la fecha con el formato DD / MM / AAAA.
* */

fun main(arg: Array<String>) {
    val fecha: Int?
    var dias: String?
    var mes: String?
    var anio: String?

    println("ingrese el una fecha")
    fecha = readLine()?.toInt()

    println("Ingresaste $fecha")

    dias = fecha!!.getChars(fecha,0,2)
    mes = fecha.getChars(fecha,2,4)
    anio = fecha.getChars(fecha,4,8)

    println("==========================================")
    println(dias+"/"+mes+"/"+anio)
    println("==========================================")
}

fun Int.getChars(value:Int,ini:Int,end:Int):String{
    var aux:String?
    aux = value.toString()
    if(aux.length < 8){
        aux = "0"+ aux
    }
    return aux.substring(ini,end)
}
/*
fun Int.splitDias(value:Int):String{
    var aux = value.toString()
    if(aux.length < 8){
        aux = "0"+aux[0]
    }else{
        aux = aux[0].toString()+aux[1].toString()
    }
    return aux
}
fun Int.splitMes(value:Int):String{
    var aux = value.toString()
    if(aux.length < 8){
        aux = aux[1].toString()+aux[2].toString()
    }else{
        aux = aux[2].toString()+aux[3].toString()
    }
    return aux
}
fun Int.splitAnio(value:Int):String{
    var aux = value.toString()
    if(aux.length < 8){
        aux = aux[3].toString()+aux[4].toString()+aux[5].toString()+aux[6].toString()
    }else{
        aux = aux[4].toString()+aux[5].toString()+aux[6].toString()+aux[7].toString()
    }
    return aux
}*/