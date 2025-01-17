package po.receipts;

import java.util.List;

import Miscellaneous.FormType;
import po.ReceiptPO;

public class LoadingPO extends ReceiptPO {
	public final String date;
	public final String hallId;
	public final String id;
	public final String destination;
	public final String carId;
	public final String supervisor;
	public final String driver;
	public final List<String> order;
	public final String cost;

	public LoadingPO(long receiptId, String name, String creator,
					String date,String hallId, 
					String id, String destination, 
					 String carId, String supervisor, 
					 String driver, List<String> order,
					 String cost){
		super(FormType.装车单.name(),name,creator,date,receiptId);
		this.date = date;
		this.hallId = hallId;
		this.id = id;
		this.destination = destination;
		this.carId = carId;
		this.supervisor = supervisor;
		this.driver = driver;
		this.order = order;
		this.cost = cost;		
	}	

	public String getDate(){
		return date;
	}
	
	public String getHallId(){
		return hallId;
	}
	
	public String getId(){
		return id;
	}
	
	public String getDestination(){
		return destination;
	}
	
	public String getCarId(){
		return carId;
	}
	
	public String getSupervisor(){
		return supervisor;
	}
	
	public String getDriver(){
		return driver;
	}
	
	public List<String> getOrder(){
		return order;
	}
	
	
	public String getCost(){
		return cost;
	}
}

