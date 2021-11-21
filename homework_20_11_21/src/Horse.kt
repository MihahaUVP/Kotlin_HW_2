class Horse:Animal {
    constructor(food:String,location:String,color:String):super(food,location){
        this.color =color;
    }
    var color:String;
    override fun eat() {
        print("Лошадь ест")
    }

    override fun sleep() {
        print("Лошадь спит")
    }

    override fun makeNoise() {
        print("Игого")
    }
}