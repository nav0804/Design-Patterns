interface Pizza{
    void makePizza();
}

class Margherita implements Pizza{
    @Override
    public void makePizza(){
        System.out.println("Making margherita pizza");
    }
}

class FarmFresh implements Pizza{
    @Override
    public void makePizza(){
        System.out.println("Making farm fresh pizza");
    }
}

class PizzaFactory{
    public static Pizza build(String name){
        if(name.equalsIgnoreCase("Margherita")){
            return new Margherita();
        }else if(name.equalsIgnoreCase("Farm Fresh")){
            return new FarmFresh();
        }
        return null;
    }
}

class PizzaService{
    public void send(String name){
        Pizza pizzaf = PizzaFactory.build(name);
        pizzaf.makePizza();
    }
}

public class PizzaShop {
    public static void main(String[] args) {
        PizzaService pizzaService = new PizzaService();
        pizzaService.send("margherita");
    }
}
