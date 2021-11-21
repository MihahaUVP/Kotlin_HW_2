open class Animal {
    public var food: String =""
    public var location: String =""
    open fun makeNoise(){
        print("Животное издаёт звук");
    }
    open fun eat(){
        print("Животное ест");
    }
    open fun sleep(){
        print("Животное спит");
    }
    constructor(food:String,location:String){
        this.food = food;
        this.location = location;
    }
}