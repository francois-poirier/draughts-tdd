package es.urjccode.mastercloudapps.adcs.draughts.utils;

public class Range {
    private int min;
    private int max ;
	public Range(int min, int max) {
		assert min <= max;
		this.min = min;
		this.max = max;
	}
	public boolean contains(int element) {
		return min <= element && element <= max;
	}
}
