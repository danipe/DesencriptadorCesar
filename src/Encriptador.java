
public class Encriptador {
	public String mensaje;
	public String mensajeCodificado;
	public String temporal;
	public int saltos;
	
	public Encriptador(String mensaje, int saltos){
		this.mensaje=mensaje;
		this.saltos=saltos;
	}
	
	public void encriptaMensaje(){
		temporal=mensaje;
		for(int i = 0;i<=saltos;i++){
			temporal=temporal.substring(1, temporal.length())+temporal.substring(0,1);
		}
		this.mensajeCodificado=temporal;
	}
	
	public void muestraMensaje(){
		System.out.println(this.mensajeCodificado);
	}
}
