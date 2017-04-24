package net.mnn.shoppingbackend.dao;

import java.util.List;

import net.mnn.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
	
	
}
