package net.mnn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.mnn.shoppingbackend.dao.CategoryDAO;
import net.mnn.shoppingbackend.dto.Category;

public class  CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("net.mnn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	
	}	
/*	@Test
	public void testAddCategory(){
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is some description for laptops!");
		category.setImageURL("CAT_105.png");
		assertEquals("successfully added a category inside the table!", true,categoryDAO.add(category));
}
*/	
	


/*	@Test
	public void testGetCategory(){
		category = categoryDAO.get(5);
		assertEquals("successfully fetched a single category from the table!", "Televisions" ,category.getName());
*/		
	
/*	@Test
	public void testUpdateCategory(){
		category = categoryDAO.get(5);
		category.setName("TV");
		assertEquals("successfully updated a single category in the table!", true ,categoryDAO.update(category));
*/		
			

/*	@Test
	public void testDeleteCategory(){
		category = categoryDAO.get(5);
		
		assertEquals("successfully deleted a single category from the table!", true ,categoryDAO.delete(category));
*/

/*	@Test
	public void testListCategory(){
		
		assertEquals("successfully fetched the list of categories from the table!",1 ,categoryDAO.list().size());
*/
	

	@Test
	public void testCRUDCategory(){
		
		//add operation
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageURL("CAT-10.png");
		assertEquals("successfully added a category inside the table!", true,categoryDAO.add(category));
	
	
		
		category = new Category();
		category.setName("Televisions");
		category.setDescription("This is some description for televisions!");
		category.setImageURL("CAT-1.png");
		assertEquals("successfully added a category inside the table!", true,categoryDAO.add(category));
		
	//fetching and updating
		category = categoryDAO.get(2);
		category.setName("TV");
		assertEquals("successfully updated a single category from the table!", true ,categoryDAO.update(category));
		
		//delete the category
	
		assertEquals("successfully deleted a single category from the table!", true ,categoryDAO.delete(category));

		//fetching the list
		assertEquals("successfully fetched the list of categories from the table!",1 ,categoryDAO.list().size());
			
	
}	
}	
	
	
	
	
	





