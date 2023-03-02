package projet;

import java.util.Objects;

public class Configuration {
	@Override
	public boolean equals(Object obj) {
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

	public double alpha = 0.85;
	public double epsilon = -1.0;
	public int indice = 150;
	public Mode mode = Mode.CREUSE;
	
	@Override public String toString() {
		return "alpha=" + alpha + ", epsilon=" + epsilon
			+ ", indice=" + indice + ", mode=" + mode;
	}
}
