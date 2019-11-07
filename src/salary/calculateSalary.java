package salary;

public class calculateSalary {
	public float bonus;
	public float jobsDs;
	public float nalog;
	public float oklad;
	public float payFds;
	public float plan;
	public String salary;
	public float stavka;
	public float viruchka;
	public float percent;
	public float perOfV;
	//public String total;
	
	
	
	public calculateSalary (float b, float jds, float o, float pfd, float pl, float st, float v, float p, float n) {
		bonus = b;
		jobsDs =jds;
		nalog = n;
		
		payFds = pfd;
		plan = pl;
		
		stavka = st;
		viruchka = v;
		percent = p;
	}

	public String getSalary (float b, float jds, float o, float pfd, float pl, float st, float v, float p, float n) {
		
		salary = Float.toString(this.getZaSmeny(jds, pfd) + (this.getPercOfVir(v, p)*pl) + b - n);
		return salary;
		
	}
	
	
	public Float getZaSmeny (float jds, float pfd) {
		oklad = ((jds*pfd));
		return oklad;
	}
	
	public Float getPercOfVir (float v, float p) {
		perOfV = v* (p/100);
		return perOfV;
	}
	

	
	
}
