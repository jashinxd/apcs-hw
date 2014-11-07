public class sarray {
    private int[] data;
    private int nextBlank;
    

    public sarray(int i) {
	//Start array at size 10
	data = new int[i];
	nextBlack = 0;
    }

    public void add(int i) {
	//Add int to the end
	while (data[nextBlank] != 0) {
	    nextBlank++;
	}
	data[nextBlank] = i;
	nextBlank++;
    }

    public void add(int index, int i) {
	//Add at index, shifts everything else down
	for (int x = data.length - 1; x > index; x = x - 1) {
	    data[x] = data[x - 1];
	}
	data[index] = i
    }

    public void get(int index) {
        //Get item at index
	
    }

    public void set(int index, int i) {
	//Set item at index to int t
    }

    public void size() {
	//return number of items in set
    }

    public void remove() {
	//must shift things over
