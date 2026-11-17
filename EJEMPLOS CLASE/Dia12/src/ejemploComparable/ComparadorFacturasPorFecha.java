package ejemploComparable;

import java.util.Comparator;

public class ComparadorFacturasPorFecha implements Comparator<Factura> {

	@Override
	public int compare(Factura o1, Factura o2) {
		// TODO Auto-generated method stub
		return o1.getFechaEmision().compareTo(o2.getFechaEmision());
	}

}
