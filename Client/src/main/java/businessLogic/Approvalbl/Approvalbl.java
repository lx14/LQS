package businessLogic.Approvalbl;

import businessLogic.Approvalbl.MockTest.MockReceipt;
import businessLogic.Userbl.User;
import businessLogicService.ApprovalblService.ApprovalblService;
import businessLogicService.ReceiptsblService.ReceiptsblService;
import po.ReceiptPO;

public class Approvalbl implements ApprovalblService {
	private ReceiptsblService rs;
	public Approvalbl(){
		rs = new MockReceipt(new User());
	}
	public void passReceipt(ReceiptPO po){
		
	}
	
	public void changeReceipt(ReceiptPO po){
		
	}
	public String getName(){
		return rs.getName();
	}
	public String getCreater(){
		return rs.getCreater();
	}

	public void showReceipt(ReceiptPO po){
		
	}

}
