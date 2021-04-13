package Function;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	public UniqueList() {
		super();
	}

	public boolean contains(Object[] Object) {
		for (int Interation = 0; Interation < this.size(); Interation++) {
			Object[] Compare = (Object[]) this.get(Interation);
			if (Arrays.equals(Object, Compare)) {
				return true;
			}
		}
		return false;
	}
}
