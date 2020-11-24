import kotlin.random.Random

fun main(){
    val bus1 = Bus()
    val bus2 = Bus()
    val barco1 =Barco()
    val barco2 = Barco()
    val FlotaDeLaEmpresa = listOf<>()

}

abstract class MedioDeTransporte(){
    abstract fun transladarse(origen: String, destino: String)
}

class Bus: MedioDeTransporte(){
    override fun trasladarse(origen: String,destino: String){

    }

    private fun descanso(){
        println("descanso...")

    }

    private fun llegarAdestino(){
        println("llegar a destino...")

    }

    private fun iniciarRuta(){
        println("Inicio la ruta...")
    }

    fun compreobarEstadoCarreteras(origen: String, destino: String) :

    return true

class Barco : MedioDeTransporte(){
    override fun trasladarse(origen: String, destino: String){


        private fun llegarAdestino(){
            println("llegar a destino...")

        }

        private fun iniciarRuta(){
            println("Inicio la ruta...")

        }


    }
    
}

}