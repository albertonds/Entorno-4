import java.util.Vector;
public class Pila {
	private int tamano;
	private Vector<Integer> pila;
	
	public Pila() {
		pila = new Vector<Integer>();
		tamano = 0;
	}
	
	public boolean pilaVacia () {
		if (tamano == 0) {
			return true;
		}
		return false;
	}
	
	public void apilar (Integer o) {
		pila.add(tamano, 0);
		tamano++;
	}
	
	public Integer desapilar() {
		try {
			if(pilaVacia()) {
				throw new ErrorPilaVacia();
			}
			else {
				return pila.get(--tamano);
			}
			catch(ErrorPilaVacia error) {
				System.out.println("ERROR: la pila está vacía");
				return null;
			}
	}
	public int getNumElementos() {
		return tamano;
		
	}
	class ErrorPilaVacia extends Exception{
		public ErrorPilaVacia() {
			super();
		}
	}
	
}
