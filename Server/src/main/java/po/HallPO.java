package po;

import java.io.Serializable;

public class HallPO implements Serializable{
	public String name;
	public String location;
	public String id;
	public HallPO(String name, String location, String id){
		this.name = name;
		this.location = location;
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location=location;
	}
	public String getID(){
		return id;
	}
	public void setID(String name){
		this.id=id;
	}
}