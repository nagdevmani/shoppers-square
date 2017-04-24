package net.mnn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.mnn.shoppingbackend.dao.CategoryDAO;
import net.mnn.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	static{
		
		//adding first category
		Category category = new Category();
		category.setId(1);
		category.setName("Televisions");
		category.setDescription("This is some description for televisions!");
		category.setImageURL("CAT-1.png");
		category.setActive(true);
		
		categories.add(category);
		
	    //adding second category
		category = new Category();
		category.setId(2);
		category.setName("Mobiles");
		category.setDescription("This is some description for mobiles!");
		category.setImageURL("CAT-2.png");
		category.setActive(true);
		
		categories.add(category);
		
		//adding third category
		category = new Category();
		category.setId(3);
		category.setName("Laptops");
		category.setDescription("This is some description for laptops!");
		category.setImageURL("CAT-3.png");
		category.setActive(true);
				
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		
		for(Category category : categories){
			
			if(category.getId() == id) return category;  
		}
		
		return null;
	}

}
