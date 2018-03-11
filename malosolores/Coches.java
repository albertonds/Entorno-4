package malosolores;

public class Coches {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;		
	 public void Coche() {
		 matricula = "";
		 atrib = "";
		 modelo = "";
		 fabricante = "";
	 
	 public Coches(String m, String t, String m1, String f) { //Contructores repetido añado m1
		 matricula = m1;
		 atrib = t;
		 modelo = m;
		 fabricante = f;
	 }
	public String getModelo() {//Creo los getter and setter y los métodos correspondientes(A,B,C)
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int metodo1() {
		 int resultado = 0;
		 if(atrib == "Gasolina") {
			 resultado += 10;
			 resultado += metodoA(modelo,fabricante);
		 }else if (atrib == "Diesel") {
			 resultado += 10;
			 resultado += metodoB(modelo, fabricante);
		 }else if (atrib == "Híbrido") {
			 resultado += 10;
			 resultado += metodoC(modelo,fabricante);
		 }else {
			 resultado +=10;
		 }
		 return resultado;
		 
	 }
	private int metodoC(String modelo, String fabricante) {
		// TODO Auto-generated method stub
		return 0;
	}
	private int metodoB(String modelo, String fabricante) {
		// TODO Auto-generated method stub
		return 0;
	}
	private int metodoA(String modelo, String fabricante) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
}
