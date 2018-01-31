public class Calculadora {
	private Integer num1, num2;

	public Calculadora(Integer a, Integer b) {
		num1 = a;
		num2 = b;
	}

	public Integer suma() {
		Integer resul = num1 + num2;
		return resul;
	}

	public Boolean resta2() {
		if (num1 >= num2) {
			return true;
		} else {
			return false;
		}
	}

	public Integer resta() {
		Integer result;
		if (resta2()) {
			result = num1 - num2;
		} else {
			result = num1 - num2;
		}
		return result;
	}

	public Integer multiplica() {
		Integer resul = num1 * num2;
		return resul;
	}

	public Integer divide2() {
		if (num2 == 0) {
			return null;
		}
		Integer result = num1 /num2;
		return result;
	}
	
	public Integer divide() {
		Integer resul = num1 / num2;
		return resul;
	}
}