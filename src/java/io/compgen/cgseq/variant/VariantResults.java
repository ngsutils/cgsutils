package io.compgen.cgseq.variant;

import java.util.HashMap;
import java.util.Map;

public class VariantResults {
	public final String majorCall;
	public final String minorCall;
	public final int rawDepth;
	public final Double qualVal;

	public Map<String, String> info = new HashMap<String, String>();
	public Map<String, String> format = new HashMap<String, String>();
	
	public VariantResults(String majorCall, String minorCall, int rawDepth, Double qualVal) {		
		this.majorCall = majorCall;
		this.minorCall = minorCall;
		this.rawDepth = rawDepth;
		this.qualVal = qualVal;
	}
	
	public void addInfo(String k, String v) {
		info.put(k,  v);
	}
	
	public void addFormat(String k, String v) {
		format.put(k,  v);
	}
	
	public void addInfo(String k, int v) {
		info.put(k,  ""+v);
	}
	
	public void addInfo(String k, double v) {
		info.put(k,  ""+v);
	}
	
	public void addInfo(String k) {
		info.put(k, null);
	}

	public void addFormat(String k, int v) {
		format.put(k, ""+v);
	}
	
	public void addFormat(String k, double v) {
		format.put(k, ""+v);
	}
	
	public void addFormat(String k) {
		format.put(k, null);
	}

	public String getInfo(String k) {
		return info.get(k);
	}
	
	public String getFormat(String k) {
		return format.get(k);
	}
	
	public boolean containsInfo(String k) {
		return info.containsKey(k);
	}
	
	public boolean containsFormat(String k) {
		return format.containsKey(k);
	}

	public Double getQual() {
		return qualVal;
	}


}
