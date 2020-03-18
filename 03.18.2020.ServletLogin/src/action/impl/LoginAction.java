package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import abstractaction.AbstractAction;
import constants.PageConstants;
import constants.ViewConstants;
import domain.User;
import exception.IllegalObjectException;
import exception.PasswordNotValidException;
import exception.UsernameNotValidException;
import validator.impl.UserValidator;



public class LoginAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		
	return ViewConstants.LOGIN_VIEW;

}
}
