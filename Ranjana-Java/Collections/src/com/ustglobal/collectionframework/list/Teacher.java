package com.ustglobal.collectionframework.list;

public class Teacher {
    int tid;
    String tname;
    String tsub;
	public Teacher(int tid, String tname, String tsub) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tsub = tsub;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tsub=" + tsub + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsub() {
		return tsub;
	}
	public void setTsub(String tsub) {
		this.tsub = tsub;
	}
    
}
