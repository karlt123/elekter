public class Proov1{
	public static void main(String[] arg){
		TakistusKomponent t=new Takisti220oomi();
		System.out.println(t.kysiTakistus());
		System.out.println("vool 9 voldi korral: "+t.vool(9));
		TakistusKomponent t2=new Takisti(3000);
		System.out.println(t2.kysiTakistus());
		System.out.println("vool 9 voldi korral: "+t2.vool(9));
	}
}