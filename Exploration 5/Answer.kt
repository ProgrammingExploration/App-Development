fun main() {
    var wallet = 100;
    var truck = Truck(wallet);
    truck.buy();
    truck.getMoney();
    truck.sell();
    truck.getMoney();
    truck.rent(12);
    truck.getMoney();
    truck.fix(200);
    truck.getMoney();
    truck.drive();
    truck.getMoney();
}

open class Vehicle(open var wallet: Int) {
    open var price: Int = 100;
    open var rentPrice: Int = 25;

    open fun buy() {
        wallet -= price;
    }

    open fun rent(months: Int) {
        var aboveMonth: Boolean = false;
        var i = 0;
        while(!aboveMonth) {
            i++
            if(i > months) {
                aboveMonth = true;
            }
            wallet -= rentPrice;
        }
    }

    open fun fix(cost: Int) {
        wallet -= cost; 
    }
    
    open fun sell() {
        wallet += price;
    }

    open fun getMoney(): Int {
        return price;
    }
} 

class Truck(override var wallet: Int) : Vehicle(wallet) {
    override var price: Int = 500;
    override var rentPrice: Int = 150;

    override fun fix(cost: Int) {
        super.fix(cost);
    }

    override fun buy() {
        super.buy();
    }

    override fun rent(months: Int) {
        super.rent(months);
    }

    override fun sell() {
        super.sell();
    }

    override fun getMoney(): Int {
        super.getMoney();
    }

    fun drive() {
        println("Drive");
    }
}