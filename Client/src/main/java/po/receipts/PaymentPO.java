package po.receipts;

import po.ReceiptPO;

/**
 * Created by admin on 15/11/16.
 */
public class PaymentPO extends ReceiptPO {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String amount;

    public PaymentPO(String n, String c, String cd, String rs, String a){
        super(n, c, cd, rs, "付款单");
        this.amount=a;
    }

    public double getAmount(){
        return Double.parseDouble(amount);
    }

}

