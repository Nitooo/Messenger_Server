package messenger.ServiceAdapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import messenger.Domain.User;
import messenger.Service.ManageContactList;

@RestController
@RequestMapping("/manageContactList")
public class ManageContactListAdapter {

	@Autowired
	private ManageContactList manageContactListService;
	
	@RequestMapping(value = "/addContact", method = RequestMethod.GET)
	public boolean addContact(@RequestBody User user, @RequestBody User contact) {
		return manageContactListService.addContact(user, contact);
	}
	
	@RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
	public boolean deleteContact(@RequestBody User user, @RequestBody User contact) {
		return manageContactListService.deleteContact(user, contact);
	}
	
	@RequestMapping(value = "/getContactList", method = RequestMethod.GET)
	public List<User> getContactList(@RequestBody User user) {
		return manageContactListService.getContactList(user);
	}

}
