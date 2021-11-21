class Dog: Animal
{
    constructor(food:String,location:String,numberOfCommands:Int):super(food,location){
        this.numberOfCommands = numberOfCommands;
    }
    public var numberOfCommands:Int =0;//количество известных команде собак
    override fun eat(){
        print("Собака ест");
    }
    override fun sleep(){
        print("Собаки спит")
    }

    override fun makeNoise() {
        print("Гав");
    }
}