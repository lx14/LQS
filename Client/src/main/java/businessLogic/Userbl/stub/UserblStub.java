package businessLogic.Userbl.stub;

import vo.Authorities;
import vo.UserVO;
import businessLogicService.UserblService.UserblService;

public class UserblStub implements UserblService{
	int userid=0;
	String userpassword="";
	String userpersonalinfo="";
	String usercompetence="";
	
	public class UserView{
		
	}

	public boolean addUser(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getHallId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getHallName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasTheAuthority(Authorities one) {
		// TODO Auto-generated method stub
	if (one == Authorities.付款单||one == Authorities.经营情况) return true;
		return false;
	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getUserSex() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCompanyName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
