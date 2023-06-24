// WORKING OF LONG PRIMITIVE TYPE
// Compute distance light travels using long variables.
class Main{
    public static void main(String args[]){
        int lightspeed;
        long days, seconds, distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        
        System.out.print("In " +days +" days light will travel about " +distance +" miles.");
    }
}
