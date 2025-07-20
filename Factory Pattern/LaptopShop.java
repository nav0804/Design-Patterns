interface Laptop{
    void chipset();
}

class Intel implements Laptop{
    @Override
    public void chipset(){
        System.out.println("Intel chipset selected by user");
    }
}


class AppleSilicon implements Laptop{
    @Override
    public void chipset(){
        System.out.println("Apple Silicon chipset selected by user");
    }
}

class Ryzen implements Laptop{
    @Override
    public void chipset(){
        System.out.println("Ryzen chipset selected by user");
    }
}

class LaptopBuilder{
    public static Laptop buildLaptop(String chipset){
        if(chipset.equalsIgnoreCase("Intel")){
            return new Intel();
        }else if(chipset.equalsIgnoreCase("AppleSilicon")){
            return new AppleSilicon();
        }else if(chipset.equalsIgnoreCase("Ryzen")){
            return new Ryzen();
        }
        return null;
    }
}


class SalesMan{
    public void collectDetailsFromUser(String chipset){
        Laptop laptopBuild = LaptopBuilder.buildLaptop(chipset);
        laptopBuild.chipset();
    }

}

public class LaptopShop {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan();
        salesMan.collectDetailsFromUser("AppleSilicon");
    }
}
