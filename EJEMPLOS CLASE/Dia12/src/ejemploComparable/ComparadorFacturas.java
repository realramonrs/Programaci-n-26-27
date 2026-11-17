package ejemploComparable;

import java.util.Comparator;

public class ComparadorFacturas implements Comparator<Factura> {

	@Override
	public int compare(Factura o1, Factura o2) {
		// TODO Auto-generated method stub
		return o1.getCliente().compareTo(o2.getCliente());
	}

}
