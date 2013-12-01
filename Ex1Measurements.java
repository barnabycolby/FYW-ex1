package ex1;
import fyw.turtles.*;

public class Ex1Measurements {
    
    /**
     * create an input frame
     * @param args strings from command line
     */
    public static void main(String[] args) {
        InputFrame theInputFrame = new InputFrame();
        
        /* Write your own code and comments within the area below
         *vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
         */
        
        //Get total number of inches and make sure it's positive
        int inches = theInputFrame.getInt();
        if(inches <= 0){
        	System.out.print("The supplied number of inches was not positive!!!");
        	return;
        }
        
        //Work out the number of inches within each measurement
        int foot = 12;
        int yard = 3 * foot;
        int chain = 22 * yard;
        int furlong = 10 * chain;
        int mile = 8 * furlong;
        
        //Initialise a variable that stores the remainding number of inches after
        //each division
        int remainder = inches;
        
        //Initialise variables that store the final numbers of each measurement
        int numberFoot = 0;
        int numberYard = 0;
        int numberChain = 0;
        int numberFurlong = 0;
        int numberMile = 0;
        
        //Work out the number of miles
        if(mile < remainder && remainder != 0){
        	numberMile = (int) Math.floor(remainder / mile);
        	remainder -= numberMile * mile;
        }
        
        //Work out the number of furlongs
        if(furlong < remainder && remainder != 0){
        	numberFurlong = (int) Math.floor(remainder / furlong);
        	remainder -= numberFurlong * furlong;
        }
        
        //Work out the number of chains
        if(chain < remainder && remainder != 0){
        	numberChain = (int) Math.floor(remainder / chain);
        	remainder -= numberChain * chain;
        }
        
        //Work out the number of yards
        if(yard < remainder && remainder != 0){
        	numberYard = (int) Math.floor(remainder / yard);
        	remainder -= numberYard * yard;
        }
        
        //Work out the number of feet
        if(foot < remainder && remainder != 0){
        	numberFoot = (int) Math.floor(remainder / foot);
        	remainder -= numberFoot * foot;
        }
        
        //Variable used to indicate whether anything has been printed yet
        //Used to decide whether or not a comma is needed before the print
        boolean printed = false;
        
        //Print initial number of inches
        System.out.print(inches + " inches = ");
        
        //Print number of miles
        if(numberMile > 0 && numberMile != 1){
        	System.out.print(numberMile + " miles");
        	printed = true;
        } else if (numberMile == 1){
        	System.out.print(numberMile + " mile");
        	printed = true;
        }
        
        //Print number of furlongs
        if(numberFurlong > 0 && numberFurlong != 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(numberFurlong + " furlongs");
        } else if (numberFurlong == 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(numberFurlong + " furlong");
        }
        
        //Print number of chains
        if(numberChain > 0 && numberChain != 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(numberChain + " chains");
        } else if (numberChain == 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(numberChain + " chain");
        }
        
      //Print number of yards
        if(numberYard > 0 && numberYard != 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(numberYard + " yards");
        } else if (numberYard == 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(numberYard + " yard");
        }
        
        //Print number of feet
        if(numberFoot > 0 && numberFoot != 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(numberFoot + " feet");
        } else if (numberFoot == 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(numberFoot + " foot");
        }
        
        //Print number of inches
        if(remainder > 0 && remainder != 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(remainder + " inches");
        } else if (remainder == 1){
        	if(!printed)
        		printed = true;
        	else
        		System.out.print(", ");
        	System.out.print(remainder + " inch");
        }
        
        //Print the full stop
        System.out.print(".");
        

        /* ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         * Write your own code and comments within the area above
         */
        
    }
    
}
