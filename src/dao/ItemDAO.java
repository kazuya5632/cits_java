package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import logic.Item;

public class ItemDAO {
	// 商品追加
	public int addItem(Item item) throws DAOException {
		return 1;
	}

	// 全商品
	List<Item> findAll() throws DAOException {
		try {
			// JDBC
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "56325632");
			String sql = "select * from item order by code";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Item> list = new ArrayList<Item>();

			while (rs.next()) {
				int code = rs.getInt("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				Item item = new Item(code, name, price);
				list.add(item);
			}

			return list;

		} catch (Exception e) {
			throw new DAOException();

		}
	}

	// 商品削除

	// 商品修正

	// 商品名で検索
	List<Item> findByName(String itemName) throws DAOException {
		try {
			// JDBC
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "56325632");
			String sql = "select * from item where name like ? order by code";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + itemName + "%");
			ResultSet rs = ps.executeQuery();
			List<Item> list = new ArrayList<Item>();

			while (rs.next()) {
				int code = rs.getInt("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				Item item = new Item(code, name, price);
				list.add(item);
			}

			return list;

		} catch (Exception e) {
			throw new DAOException();
		}
	}

	// 主キーで検索
	Item findByPrimaryKey(int key) throws DAOException {
		try {
			// JDBC
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "56325632");
			String sql = "select * from item where code = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, key);
			ResultSet rs = ps.executeQuery();
			Item item = null;

			if (rs.next()) {
				int code = rs.getInt("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				item = new Item(code, name, price);
			}

			return item;

		} catch (Exception e) {
			throw new DAOException();
		}
	}

	// カテゴリで検索

}