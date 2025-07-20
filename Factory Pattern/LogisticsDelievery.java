interface Logistics{
    void send();
}

class Air implements Logistics{
    @Override
    public void send(){
        System.out.println("Using air mode to send");
    }
}

class Ship implements Logistics{
    @Override
    public void send(){
        System.out.println("Using water mode to send");
    }
}
/*
 * If we directly use the Air class and Ship class and create it in the Logistics Service then it would violate
 * the SRP of SOLID PRINCIPLES
 * 
 * Therefore we create a new class that deals with the concrete class object creation and calling the 
 * transports based on the mode.
 */

class LogisticsFactory{
    public static Logistics getLogistics(String mode){
        if(mode.equalsIgnoreCase("air")){
            return new Air();
        }
        else return new Ship();
    }
}

class LogisticsService{ 
    public void collectOrderDetailsFromUser(String mode){
        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
        
    }
}

public class LogisticsDelievery {
    public static void main(String[] args) {
        LogisticsService logisticsService = new LogisticsService();

        logisticsService.collectOrderDetailsFromUser("Air");
    }    
}
