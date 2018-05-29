public enum PlanetEnum {
	MERCURY(2l,10l),MARS(5l,13l),EARTH(6l,14l){
        public boolean hasLife() {
                return true;
            }

        }, VENUS(5L,16L);

	private long _mass;
    private long _distFromSun;


     PlanetEnum(long mass, long distFromSun) {
        _mass = mass;
        _distFromSun = distFromSun;
	}


	public long getMass() {
        return _mass;
    }

    public long getDistFromSun() {
            return _distFromSun;
    }

    public double calcPerimeter() {
        return 2*Math.PI*_distFromSun;
    }

    public boolean hasLife() {
        return false;
    }

}