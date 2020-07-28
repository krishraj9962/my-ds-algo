package ds.learning;

public class Counter {

	private int currentCount;
	private String counterName;

	public Counter(String name) {
		this.currentCount = 0;
		this.counterName = name;
	}
	
	public void increment() {
		this.currentCount++;
	}
	public void decrement() {
		this.currentCount--;
	}
	public int getCount() {
		return currentCount;
	}

}
