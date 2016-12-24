
package dao;

import java.util.List;

import logic.Item;

public class TestDAO {

	public static void main(String[] args) {
		ItemDAO dao = new ItemDAO();
		try {
			/*
			List<Item> list = dao.findAll();
			for(Item item : list){
				System.out.println(item);
			}
			*/

			List<Item> list2 = dao.findByName("の");
			for (Item item : list2) {
				System.out.println(item);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

