
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Service {
    
    List<Shirts> shirt=new ArrayList<>();
    Scanner sc=new Scanner(System.in);


    public void load(){
        shirt.add(new Shirts("Polo","Red",500,40));
        shirt.add(new Shirts("Levis","Blue",1000,42));
        shirt.add(new Shirts("Arrow","White",1500,38));
        shirt.add(new Shirts("Van Heusen","Black",2000,36));
        shirt.add(new Shirts("Park Avenue","Green",2500,44));
        shirt.add(new Shirts("Louis Philippe","Yellow",3000,46));
        shirt.add(new Shirts("Allen Solly","Pink",3500,48));
        shirt.add(new Shirts("Raymond","Purple",4000,50));
        shirt.add(new Shirts("John Players","Orange",4500,52));
        shirt.add(new Shirts("Flying Machine","Grey",5000,54));
    }

    //add shirt
    public void addShirt(){
        System.out.println("Enter Shirt Brand");
        String brand=sc.nextLine();
        System.out.println("Enter Shirt Color");
        String color=sc.nextLine();
        System.out.println("Enter Shirt Price");
        double price=Double.parseDouble(sc.nextLine());
        System.out.println("Enter Shirt Size");
        int size=Integer.parseInt(sc.nextLine());
        shirt.add(new Shirts(brand,color,price,size));
    }


    //view all shirt
    public void viewAllShirt(){
        for(Shirts s:shirt){
            System.out.println(s);
        }

    }

    //access all shirt on brand
    public void accessAllShirtOnBrand(){
        System.out.println("Enter Shirt Brand");
        String brand=sc.nextLine();
        for(Shirts s:shirt){
            if(s.brand.equalsIgnoreCase(brand)){
                System.out.println(s);
            }
        }
    }

    //access on brand and size
    public void accessShirtOnBrandAndSize(){
        System.out.println("Enter the brand Of the Shirt");
        String brand=sc.nextLine();
        System.out.println("Enter the size of the Shirt");
        int size=Integer.parseInt(sc.nextLine());

        boolean flag=false;
        for(Shirts s: shirt){
            if(s.brand.equalsIgnoreCase(brand) && s.size==size){
                    System.out.println(s);
                    flag=true;
            }
           

        }
         if(flag){
                System.out.println("Shirt is found " + brand + " of size " + size);
            }else{
                System.out.println("Shirt is not found");   
            }

    }

    //price in range
    public void accessShirtOnPriceRange(){
        System.out.println("Enter the minimum price of the Shirt");
        double minPrice=Double.parseDouble(sc.nextLine());
        System.out.println("Enter the maximum price of the Shirt");
        double maxPrice=Double.parseDouble(sc.nextLine());

        boolean flag=false;
        for(Shirts s: shirt){
            if(s.price>=minPrice && s.price<=maxPrice){
                    System.out.println(s);
                    flag=true;
            }
           

        }
         if(flag){
                System.out.println("Shirt is found in the price range " + minPrice + " to " + maxPrice);
            }else{
                System.out.println("Shirt is not found in the price range");   
            }

    }


    // access shirt on price range and size
    public void accessShirtOnPriceRangeAndSize(){
        System.out.println("Enter the minimum price of the Shirt");
        double minPrice=Double.parseDouble(sc.nextLine());
        System.out.println("Enter the maximum price of the Shirt");
        double maxPrice=Double.parseDouble(sc.nextLine());
        System.out.println("Enter the size of the Shirt");
        int size=Integer.parseInt(sc.nextLine());

        boolean flag=false;
        for(Shirts s: shirt){
            if(s.price>=minPrice && s.price<=maxPrice && s.size==size){
                    System.out.println(s);
                    flag=true;
            }
           

        }
         if(flag){
                System.out.println("Shirt is found in the price range " + minPrice + " to " + maxPrice + " and size " + size);
            }else{
                System.out.println("Shirt is not found in the price range and size");   
            }

    }


//shirt sort on size high to low
    public void sortShirtOnSizeHighToLow(){
        List<Shirts> temp = new ArrayList<>(shirt);
        temp.sort((Comparator.comparingInt((Shirts s)->s.size)).reversed());
        for(Shirts s:temp){
            System.out.println(s);
        }   
    }

//shirt sort on size low to high
    public void sortShirtOnSizeLowToHigh(){
        List<Shirts> temp = new ArrayList<>(shirt);
        temp.sort(Comparator.comparingInt((Shirts s)->s.size));
        for(Shirts s:temp){
            System.out.println(s);
        }

    }



    //TODO: sort shirt on price high to low and low to high

    //shirt sort on price high to low
    public void sortShirtOnPriceHighToLow(){
        List<Shirts> temp = new ArrayList<>(shirt);
        temp.sort((Comparator.comparingDouble((Shirts s)->s.price)).reversed());
        for(Shirts s:temp){
            System.out.println(s);
        }   
    }

    //shirt sort on price low to high
    public void sortShirtOnPriceLowToHigh(){
        List<Shirts> temp = new ArrayList<>(shirt);
        temp.sort(Comparator.comparingDouble((Shirts s)->s.price));
        for(Shirts s:temp){
            System.out.println(s);
        }

    }


    //sort shirt according to brand alphabetical
    public void sortBrandAlphabeticalLowToHigh(){
        List<Shirts> temp=new ArrayList<>(shirt);
        temp.sort(Comparator.comparing((Shirts s) -> s.brand));
        for(Shirts s: temp){
            System.out.println(s);
        }

    }

    public void sortBrandAlphabeticalHighToLow(){
        List<Shirts> temp=new ArrayList<>(shirt);
        temp.sort(Comparator.comparing((Shirts s) -> s.brand).reversed());
        for(Shirts s: temp){
            System.out.println(s);
        }

    }

    
}
