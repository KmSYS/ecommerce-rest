package com.domain.ecommerce.customer.user;

import com.domain.ecommerce.customer.comment.Comment;
import com.domain.ecommerce.customer.item.Item;
import com.domain.ecommerce.customer.service.Service;
import com.domain.ecommerce.customer.user.User;

public interface UserService extends Service<User> {

	Iterable<User> getAll(boolean pendings);

	User getLogin(String userName, String password);

	int getNotActivatedCount();

}