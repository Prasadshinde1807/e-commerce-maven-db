package UserManagement;

import AddUser.AddUserScreen;
import DeleteUser.DeleteUserScreen;
import home.homeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserScreenController {
	@FXML
	Button AddUser;

	@FXML
	Button UpdateUser;

	@FXML
	Button SearchUser;

	@FXML
	Button DeleteUser;

	@FXML
	Button PrintUser;

	@FXML
	Button ExitUser;
	
	@FXML
	Button backButton;

	public void AddUserButtonClick() {
		System.out.println("Add User Button Clicked");
		new AddUserScreen().show();
	}

	public void UpdateUserButtonClick() {
		System.out.println("Update User Button Clicked");
	}

	public void SearchUserButtonClick() {
		System.out.println("Search User Button Clicked");
	}

	public void DeleteUserButtonClick() {
		System.out.println("Delete User Button Clicked");
		new DeleteUserScreen().show();
	}

	public void PrintUserButtonClick() {
		System.out.println("Print User Button Clicked");
	}

	public void ExitUserButtonClick() {
		System.out.println("Exit User Button Clicked");
	}
	public void backButtonClick() {
		System.out.println("back Button Clicked");
		new homeScreen().show();
	}
}