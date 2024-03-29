public class Quadrants {
    public static void main(String[] args){
        System.out.println();
        System.out.println(quadrant(0, 0));
    }
    public static String quadrant(double x, double y){
        if (x == 0.0 || y == 0.0){
            if (x == 0 && y == 0){
                return("The point is on the origin.");
            } else {
                return ("The point is on an axis.");
            }
        } else if (x > 0.0){
            if (y > 0.0){
                return("The point is in quadrant 1.");
            } else {
                return("The point is in quadrant 4.");
            }
        } else {
            if (y > 0.0){
                return("The point is in quadrant 2.");
            } else {
                return("The point is in quadrant 3.");
            }
        }
    }
}
