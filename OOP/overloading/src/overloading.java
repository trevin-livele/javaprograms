public class overloading {
    public static void main(String[] args {
    double centimetres = culcFeetAndInchesToCentimetres(6,0);
    if(centimetres <0.0) {
        System.out.println("invalid parametres")
    }
    culcFeetAndInchesToCentimetres(100);

}

    public static double culcFeetInchesToCentimeters(double feet,double inches){
        if((feet <0) || ((inches <0) || (inches >12))) {
            System.out.println("Invalid feet or inches parametres");
        }
        double centimetres = (feet * 12) * 2.54;
        Centimeters += inches * 2.54;
        System.out.println(feet + "feet," + inches +"inches= " + centimetres + "cm ");
        return Centimeters;
    }
    public static double culcFeetInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to" + feet + "feet and" + remainingInches + "inches");
        return culcFeetInchesToCentimetres(feet, remainingInches);
        }
}