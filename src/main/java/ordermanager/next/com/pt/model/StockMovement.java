package ordermanager.next.com.pt.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StockMovement {
	
	private long id;
	private LocalDate creationDate;
	private Item item;
	private long quantity;

}
