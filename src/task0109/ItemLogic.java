package task0109;

import java.util.List;

import logic.Item;

// 処理クラス
public class Logic {
	// データアクセスオブジェクト
	private ItemDAO dao = DaoFactory.createItemDAO();

	// 商品追加
	public void addItem(Item item) throws DAOException {
		dao.addItem(item);
	}

	// 商品削除
	public void deleteItem(int code) throws DAOException {
		dao.deleteItem(code);
	}

	// 商品更新
	public void updateItem(Item item) throws DAOException {
		dao.updateItem(item);
	}

	// 全件検索
	public List<Item> findAll() throws DAOException {
		return dao.findAll();
	}

	// 商品名検索
	public List<Item> findByName(String itemName) throws DAOException {
		return dao.findByName(itemName);
	}

	// 主キー検索
	public Item findByPrimaryKey(int key) throws DAOException {
		return dao.findByPrimaryKey(key);
	}

	// カテゴリ検索
	public List<Item> findByCategory(int category_code) throws DAOException {
		return dao.findByCategory(category_code);
	}
}
