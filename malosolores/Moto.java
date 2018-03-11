package malosolores;

public class Moto {
  String matricula;
	int cilindrada;
	String atrib;

	public Moto() {
		matricula = "";
		cilindrada  = 0;
		atrib = "";
	}
	
	public Moto(String m2, int c, String t) {
		matricula = m2;
		cilindrada = c;
		atrib = t;
	}
	
	public String getAtrib() {//Añado los getter a setter correspondientes
		return atrib;
	}

	public void setAtrib(String atrib) {
		this.atrib = atrib;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int metodo2() {
		 int resultado = 0;
		 if(atrib == "Gasolina") {
			 resultado += 10;
			 resultado += metodoA(cilindrada);
		 }else if (atrib == "Diesel") {
			 resultado += 10;
			 resultado += metodoB(cilindrada);
		 }else if (atrib == "Híbrido") {
			 resultado += 10;
			 resultado += metodoC(cilindrada);
		 }else {
			 resultado +=10;
		 }
		 return resultado;
	}
//Añado los metodos correspondientes
	private int metodoC(int cilindrada) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int metodoB(int cilindrada) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int metodoA(int cilindrada) {
		// TODO Auto-generated method stub
		return 0;
	}

}
