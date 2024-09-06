package ordermanager.next.com.pt.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class StockMovement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private LocalDate creationDate;
	private Item item;
	private long quantity;

}
