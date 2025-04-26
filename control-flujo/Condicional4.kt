
fun main(){

    val pass1 = "kotlin1234"

    print("\n\t Escribe la contraseña: ")
    val pass2 : String = readln()

    if(pass1==pass2){
        print("\n\t Bienvenido al sistema...")
    }else{
        print("\n\t Acceso denegado, contraseña incorrecta...")
    }

}