//gallons to liters conversion
public class GalToLit {
    public static void main(String[] args) {
//        double gallons=10,liters;
//        liters=gallons * 3.7854;
//        System.out.println(liters);

        // OR


        for(double i=1;i<101;i++){
            System.out.println(i+" gallons is "+i*3.7854+" liters");
            if(i%10==0){
                System.out.println("");
            }
        }

        // OR by using counter varibale
        int counter=0;
        for(double i=1;i<101;i++){
            System.out.println(i+" gallons is "+i*3.7854+" liters");
            counter++;
            if(counter==10){
                System.out.println("");
                counter=0;
            }
        }

    }

}
