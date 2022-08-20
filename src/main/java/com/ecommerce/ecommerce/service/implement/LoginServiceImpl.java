package com.ecommerce.ecommerce.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.ecommerce.ecommerce.common.Response;
import com.ecommerce.ecommerce.entity.User;
import com.ecommerce.ecommerce.repository.UserRepository;
import com.ecommerce.ecommerce.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Response signup(User user) {
		Response response = new Response();
		User data = userRepository.save(user);
		response.setData(data);
		response.setStatus(HttpStatus.OK.value());
		return response;
	}

	@Override
	public Response login(String username, String password) {
		Response response = new Response();
		User data = userRepository.findOneByUsernameAndPassword(username, password);
		if (data == null) {
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			response.setError("no user found");
			return response;
		} else {
			response.setData(data);
			response.setStatus(HttpStatus.OK.value());
			return response;
		}

	}

}
