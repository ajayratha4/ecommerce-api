package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.common.Response;
import com.ecommerce.ecommerce.entity.User;

public interface LoginService {

	public Response signup(User user);

	public Response login(String username, String password);

}
