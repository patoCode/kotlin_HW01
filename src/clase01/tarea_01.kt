package clase01
import kotlin.math.*
import kotlin.math.PI as PI1

/*
Si yo me emborracho con 2 Litros de cerveza y un vaso mide 6 cm de diámetro y 10 cm de altura.
¿Cuanto vasos debo tomar para emborracharme?
Sabiendo que la formula del volumen de un cilindro es V=πr2h. donde el radio es igual a r=d/2.
* */
fun main(){
    val limiteChela:Double = 2000.0
    var nroDeVasosQueDeboBeber = 0.0
    var yaBebi = 0.0

    val diametro = 6
    val altura = 10

    nroDeVasosQueDeboBeber = limiteChela / getVolumen(altura,diametro)

    /*while(yaBebi < limiteChela){
        yaBebi = yaBebi + getVolumen(altura,diametro)
        println(yaBebi)
        nroDeVasosQueDeboBeber++
    }*/
    println("Debo beber ${nroDeVasosQueDeboBeber.toInt()} vasos para estar yuca!")
}
fun getVolumen(altura:Int, diametro:Int):Double{
    return PI1*Math.pow(getRadio(diametro),2.0)*altura

}
fun getRadio(diametro:Int):Double{
    return (diametro/2).toDouble()
}