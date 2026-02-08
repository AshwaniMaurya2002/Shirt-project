
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Service service=new Service();
        service.load();
        String choiceInput;
        do{
            System.out.println("Press 1 for===> Add Shirt");
            System.out.println("Press 2 for===> View all Shirt");
            System.out.println("Press 3 for===> Access all Shirt On brand");
            System.out.println("Press 4 for ===> Access all shirts by brand and size");
            System.out.println("Press 5 for ===> Access all shirts by price range");
            System.out.println("Press 6 for ===> Access all shirts by price range and size");
            System.out.println("Press 7 for ===> Sort all shirts by size high to low");
            System.out.println("Press 8 for ===> Sort all shirts by size low to high");
            System.out.println("Press 9 for ===> Sort all shirts by price high to low");
            System.out.println("Press 10 for ===> Sort all shirts by price low to high");
            System.out.println("Press 11 for ===> Sort all shirts by Brand low to high");
            System.out.println("Press 12 for ===> Sort all shirts by Brand  high to Low");
            


            System.out.println("press 0 for===> Exit Shirt Project");

            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    service.addShirt();
                    System.out.println("shirt added");
                    break;

                case 2:
                    service.viewAllShirt();
                    System.out.println("all shirts are viewed");
                    break;
                case 3:
                    service.accessAllShirtOnBrand();
                    System.out.println("all shirts are access on brand");
                    break;
                case 4:
                    service.accessShirtOnBrandAndSize();
                    System.out.println("all shirts are access on brand and size");
                    break;

                case 5:
                    service.accessShirtOnPriceRange();
                    System.out.println("all shirts are access on price range");
                    break;

                case 6:
                    service.accessShirtOnPriceRangeAndSize();
                    System.out.println("all shirts are access on price range and size");
                    break;
                case 7:
                    service.sortShirtOnSizeHighToLow();
                    System.out.println("all shirts are sort on size high to low");
                    break;
                case 8:
                    service.sortShirtOnSizeLowToHigh();
                    System.out.println("all shirts are sort on size low to high");
                    break;

                case 9:
                    service.sortShirtOnPriceHighToLow();
                    System.out.println("all shirts are sort on Price high to low ");
                    break;
                case 10:
                    service.sortShirtOnPriceLowToHigh();
                    System.out.println("all shirts are sort on Price low to high ");
                    break;

                case 11:
                    service.sortBrandAlphabeticalLowToHigh();
                    System.out.println("all shirts are sort on brand alphabetical");
                    break;

                case 12:
                    service.sortBrandAlphabeticalHighToLow();
                    break;

                    case 0:
                        System.exit(0);
                        break;
                default:
                    System.out.println("Thank You for using Shirt Project");
            }
            System.out.println("Do you Want to Continue??(yes/no)");
            choiceInput=sc.next();



        }while(choiceInput.equalsIgnoreCase("yes"));

        System.out.println(" Thanks you Application Ends");
    }
    
}
 