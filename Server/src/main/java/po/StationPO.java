package po;

import java.io.Serializable;
import java.util.ArrayList;

import po.receipts.ArriveReceiptPO;
import po.receipts.TransferReceiptPO;

public class StationPO implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String id;
    String name;
    String date;
	
	ArrayList<ArriveReceiptPO> arrive_list;
	ArrayList<TransferReceiptPO> transfer_list;
	
	public StationPO(String id, String name) {
		this.id = id;
		this.name = name;
		this.date ="";
		arrive_list = new ArrayList<ArriveReceiptPO>();
		transfer_list = new ArrayList<TransferReceiptPO>();
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void addArriveReceipt(ArriveReceiptPO po){
		arrive_list.add(po);
	}
	
	public void addTransferReceipt(TransferReceiptPO po){
		transfer_list.add(po);
	}
	
	public ArrayList<ArriveReceiptPO> getArriveList(){
		return arrive_list;
	}
	
	public ArrayList<TransferReceiptPO> getTransferList(){
		return transfer_list;
	}

}
