package vo;

import java.io.Serializable;
import java.util.Observable;

import businessLogicService.CommodityblService.ExpressType;
import Miscellaneous.ArrivalState;
import Miscellaneous.GoodsState;

public class OrderVO extends Observable implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String senderName;
	String senderAddress;
	String senderPost;
	String senderTel;
	String senderPhone;
	String receiverName;
	String receiverAddress;
	String receiverPost;
	String receiverTel;
	String receiverPhone;
	GoodsState goodsState = GoodsState.COMPLETE;
	int num;
	double weight;
	double volume;
	String goodsName;
	double size;
	double pkgCost;
	double totalCost;
	String id;
	ExpressType type;
	ArrivalState arrivalState;
	String expectedTime;
	String currentSpot;
	String Deliver="";
	
	

	public OrderVO(String sname,String saddress,String spost,String stel,String sphone,String rname,String raddress
			,String rpost,String rtel,String rphone,int num,double w,double v,String gname,double size,double pkgCost
			,double totalCost, String id,ExpressType fast,ArrivalState no,String expected,String currentSpot){
		this.senderName=sname;
		this.senderAddress=saddress;
		this.senderPost=spost;
		this.senderTel=stel;
		this.senderPhone=sphone;
		this.receiverName=rname;
		this.receiverAddress=raddress;
		this.receiverPost=rpost;
		this.receiverTel=rtel;
		this.receiverPhone=rphone;
		this.num=num;
		this.weight=w;
		this.volume=v;
		this.goodsName=gname;
		this.size=size;
		this.pkgCost=pkgCost;
		this.totalCost=totalCost;
		this.id=id;
		this.type=fast;
		this.arrivalState=no;
		this.expectedTime=expected;
		this.currentSpot=currentSpot;
		
	}
	
	public void addObserver(Object o){
		this.addObserver(o);
	}
	
	public void stateChanged(){
		setChanged();
		notifyObservers();
	}
	
	
	
	public void setCurrentSpot(String spot){
		this.currentSpot=spot;
		stateChanged();
	}
	
	public void setArrivalState(ArrivalState yes){
		this.arrivalState=yes;
		stateChanged();
	}
	
	public void setDeliver(String name){
		this.Deliver=name;
		stateChanged();
	}
	
	

	public String getSenderName(){
		return this.senderName;
	}

	public String getSenderAddress(){
		return this.senderAddress;
	}

	public String getSenderPost(){
		return this.senderPost;
	}

	public String getSenderTel(){
		return this.senderTel;
	}

	public String getSenderPhone(){
		return this.senderPhone;
	}

	public String getReceiverName(){
		return this.receiverName;
	}

	public String getReceiverAddress(){
		return this.receiverAddress;
	}

	public String getReceiverPost(){
		return this.receiverPost;
	}

	public String getReceiverTel(){
		return this.receiverTel;
	}

	public String getReceiverPhone(){
		return this.receiverPhone;
	}


	public int getNum(){
		return this.num;
	}

	public double getWeight(){
		return this.weight;
	}

	public double getVolume(){
		return this.volume;
	}

	public  String getGoodsName(){
		return this.goodsName;
	}

	public double getSize(){
		return this.size;
	}

	public double getPkgCost(){
		return this.pkgCost;
	}

	public double getTotalCost(){
		return this.totalCost;
	}

	public String getID(){
		return this.id;
	}

	public ExpressType getType(){
		return this.type;
	}

	public ArrivalState getState(){
		return this.arrivalState;
	}
	
	public String getExpectedTime(){
		return this.expectedTime;
	}
	
	public String getCurrentSpot(){
		return this.currentSpot;
	}
	
	public String getDeliver(){
		return this.Deliver;
	}

}
