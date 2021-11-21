fun main(){
    val arr:Array<Animal> = arrayOf(
        Dog("Мясо","Аргентина",5),
        Cat("Мышь","Англия","Корм"),
        Horse("Овёс","Россия","Чёрный")
    )
    var myVet:Vet=Vet()
    for(i in 0..(arr.size)-1){
        myVet.TreatAnimal(arr[i])
    }
}