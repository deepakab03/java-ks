public enum CoffeeSize {
	BIG(10),HUGE(100),OVERWHELMING(1000);

	private int sizeDim;
	private CoffeeSize(int sizeDim) {
		this.sizeDim = sizeDim;
	}

	//rarely will you use
	public void setSize(int size) {
		this.sizeDim = size;
	}

	public String toString() {
		return super.toString() + " size: " + sizeDim;
	}
}