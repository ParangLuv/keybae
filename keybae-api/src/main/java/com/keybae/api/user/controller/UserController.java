package com.keybae.api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keybae.api.user.domain.User;
import com.keybae.api.user.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping(method = RequestMethod.GET)
	public Page<User> getUsers(@RequestParam Integer page){
		return this.us.findAll(page);
	}
	
//	@RequestMapping(method = RequestMethod.GET)
//	public User getUser(@PathVariable String userName){
//		return this.us.findByUserName(userName);
//	}
//	
//	@RequestMapping(method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    public User postUser(@RequestBody User user) {
//        return this.us.createUser(user);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
//    public User putUser(@PathVariable Long id, @RequestBody User user) {
//        user.setId(id);
//        user.setModDate(new Date());
//        return this.us.updateUser(user);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteUser(@PathVariable Long id) {
//        this.us.deleteUserById(id);
//    }
	
}
