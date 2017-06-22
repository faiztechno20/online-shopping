package com.faiz.spring.shoppingbackends.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.faiz.spring.shoppingbackends.dao.CategoryDAO;
import com.faiz.spring.shoppingbackends.dto.Category;



@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	
	  private static List<Category> categories= new ArrayList<>();
	  
	  
	  
	 static{
		  Category category=new Category();
		 category.setId(1);
		 category.setDscription("this is new samsung mobile");
		 category.setName("MOBILE");
		 category.setImageURL("cat_1.png");
		
		 
		 categories.add(category);
		 
		 category=new Category();
		 category.setId(2);
		 category.setDscription("this is new dell laptop");
		 category.setName("LAPTOP");
		 category.setImageURL("cat_2.png");
		 categories.add(category);
		 
		  category=new Category();
		 category.setId(3);
		 category.setDscription("this is new SONY television");
		 category.setName("TELEVISION");
		 category.setImageURL("cat_3.png");
		 categories.add(category);
	 }



	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}



	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		for(Category category:categories)
		{
			if(category.getId()== id )
				return category;
		}
		
		//here we have to return null to fulfill return condition 
		return null;
	}
	 
	 
	
}
