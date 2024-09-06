package ordermanager.next.com.pt.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Order {
	
	private long id;
	private LocalDate creationDate;
	private Item item;
	private long quantity;
	private User user;

}
