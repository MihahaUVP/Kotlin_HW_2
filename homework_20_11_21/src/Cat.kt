class Cat:Animal {
    constructor(food:String,location:String,additionalFood:String):super(food,location){
        this.additionalFood =additionalFood;
    }
    var additionalFood:String;
    override fun eat() {
        print("Кошка ест")
    }

    override fun sleep() {
        print("Кошка спит")
    }

    override fun makeNoise() {
        print("Мяу")
    }
}