package action.UserAccount.impl;

import javax.servlet.http.HttpServletRequest;

import abstractaction.AbstractAction;
import constants.ViewConstants;

public class UserLoginAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return ViewConstants.LOGIN_VIEW;
	}
	
}
