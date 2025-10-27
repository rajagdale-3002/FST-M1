	
class CustomException extends Exception {
    private String message = null;
 
    public CustomException(String message) {
        this.message = message;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
}
public class Activity8 {
	public static void main(String[] args){
        try {
            // Method call with correct input
            Activity8.exceptionTest("Printed on the Console");
            // Method call with incorrect input
            Activity8.exceptionTest(null); 
            // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException exp) {
            System.out.println("Inside catch block: " + exp.getMessage());
        }
    }
 
    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("null String value");
        } else {
            System.out.println(str);
        }
    }

}
