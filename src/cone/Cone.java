package cone;

public class Cone {

	private float raio;
	private float altura;
	private double valor;
	
	public Cone(float raio, float altura, double valor) {
	setRaio(raio);
	setAltura(altura);
	setValor(valor);
		
		
}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	private double valor () {
		if (valor == 1)
			return 238.90;
		else if (valor == 2)
			return 467.98;
		else 
			return 758.34;
	}
	
	public double geratriz () {
		return Math.sqrt((raio*raio)+(altura*altura));
	}
	public double areacirculo () {
		return 3.14 * (raio * raio);
	}
	public double arealateral () {
		return 3.14*raio*geratriz();
	}
	public double areatotal () {
		return ((3.14*raio) * (raio+geratriz()));
	}
	public double totallitros() {
		return ((areacirculo()+arealateral()+areatotal())/2)*3.45;
	}
	public double totallatas() {
		return Math.ceil(totallitros()/18);
	}
 	public double valortotal() {
 		return (totallatas()*valor);
 	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [raio=");
		builder.append(raio);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", getRaio()=");
		builder.append(getRaio());
		builder.append(", getAltura()=");
		builder.append(getAltura());
		builder.append(", getValor()=");
		builder.append(getValor());
		builder.append(", valor()=");
		builder.append(valor());
		builder.append(", geratriz()=");
		builder.append(geratriz());
		builder.append(", areacirculo()=");
		builder.append(areacirculo());
		builder.append(", arealateral()=");
		builder.append(arealateral());
		builder.append(", areatotal()=");
		builder.append(areatotal());
		builder.append(", totallitros()=");
		builder.append(totallitros());
		builder.append(", totallatas()=");
		builder.append(totallatas());
		builder.append(", valortotal()=");
		builder.append(valortotal());
		builder.append("]");
		return builder.toString();
		
		
	}
 	
 	
}
