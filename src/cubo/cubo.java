package cubo;

public class cubo {

	private float area;
	private float rendimento;
	private double valor;

	public cubo(float area, float rendimento, double valor) {
		setArea(area);
		setRendimento(rendimento);
		setValor(valor);

	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		if (area > 0)
			this.area = area;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		if (rendimento > 0)
			this.rendimento = rendimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 0)
			this.valor = valor;
	}

	private double valor() {
		if (valor == 1)
			return 101.90;
		else if (valor == 2)
			return 212.45;
		else
			return 345.56;
	}

	public double areaBase() {
		return (area * area);
	}

	public double areaTotal() {
		return 6 * Math.pow(area, 2);
	}

	public double volumeTotal() {
		return Math.pow(area, 3);
	}

	public double diagonalCubo() {
		return area * Math.sqrt(3);
	}

	public double totalLitros() {
		return (areaTotal() / 2);
	}

	public double totalLatas() {
		return Math.ceil(totalLitros() / 18);
	}

	public double valortotal() {
		return (totalLatas() * valor());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cubo [area=");
		builder.append(area);
		builder.append(", rendimento=");
		builder.append(rendimento);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", getArea()=");
		builder.append(getArea());
		builder.append(", getRendimento()=");
		builder.append(getRendimento());
		builder.append(", getValor()=");
		builder.append(getValor());
		builder.append(", valor()=");
		builder.append(valor());
		builder.append(", areaBase()=");
		builder.append(areaBase());
		builder.append(", areaTotal()=");
		builder.append(areaTotal());
		builder.append(", volumeTotal()=");
		builder.append(volumeTotal());
		builder.append(", diagonalCubo()=");
		builder.append(diagonalCubo());
		builder.append(", totalLitros()=");
		builder.append(totalLitros());
		builder.append(", totallatas()=");
		builder.append(totalLatas());
		builder.append(", valortotal()=");
		builder.append(valortotal());
		builder.append("]");
		return builder.toString();
	}

}
