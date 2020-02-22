
public class Average {
	public int mark1,mark2,mark3;
	
	public Average() {
		mark1=0;
		mark2=0;
		mark3=0;
	}
	
	public void setMarks(int m1,int m2,int m3) {
		this.mark1=m1;
		this.mark2=m2;
		this.mark3=m3;
	}
	
	public double getAverage() {
		return((mark1+mark2+mark3)/3.0);
	}
	
	
}
