package projet;

public class Configuration {

	protected double alpha = 0.85;
	protected double epsilon = -1.0;
	protected int indice = 150;
	protected Mode mode = Mode.CREUSE;
	
	@Override public String toString() {
		return "alpha=" + alpha + ", epsilon=" + epsilon
			+ ", indice=" + indice + ", mode=" + mode;
	}
	
	@Override public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuration other = (Configuration) obj;
		return Double.doubleToLongBits(alpha) == Double.doubleToLongBits(other.alpha)
				&& Double.doubleToLongBits(epsilon) == Double.doubleToLongBits(other.epsilon) && indice == other.indice
				&& mode == other.mode;
	}
}