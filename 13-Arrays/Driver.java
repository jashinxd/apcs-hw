public class Driver {
    public static void main(String[] args) {
	Arrays a = new Arrays();	
	int[] testing = new int[3];
	testing[0] = 0;    
        testing[1] = 1;
        testing [2] = 13;
	int[] result = new int[2];
	result = a.frontPiece(testing);
	System.out.println(result);

	System.out.println(a.sum13(testing));
    }
}
