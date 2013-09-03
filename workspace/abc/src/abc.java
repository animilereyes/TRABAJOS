public class abc {
	int dt=30,suel=700000;
	double fes=(0.0175*600000),noc=(0.0125*600000),dom=(0.0225*600000),he=2500+(2500*0.25),ts=fes+noc+dom+he;
	
	void sueldo(int dt,int suel){
		this.dt=dt;
		this.suel=suel;
	}
	void sueldo(double he,double fes,double noc,double dom,int dt,int suel){
		this.he=he;
		this.fes=fes;
		this.noc=noc;
		this.dom=dom;
		this.dt=dt;
		this.suel=suel;
	}
	int va,can,iva;
	void factura(int va,int can){
		this.va=va;
		this.can=can;
	}
	void factura(int va, int can, int iva){
		this.va=va;
		this.can=can;
		this.iva=iva;
	}
	int np,cs,dir,tel;
	void pedido(int np, int cs,int dir){
		this.np=np;
		this.cs=cs;
		this.dir=dir;
	}
	void pedido(int np, int cs){
		this.np=np;
		this.cs=cs;
	}
	void pedido(int np,int cs, int dir,int tel){
		this.np=np;
		this.cs=cs;
		this.dir=dir;
		this.tel=tel;
	}
	public static void main(String[] args) {
		

	}

}