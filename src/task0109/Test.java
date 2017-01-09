package task0109;

import java.util.List;

import logic.Item;

public class Test {

	public static void main(String[] args) throws DAOException {
		ItemLogic logic = new ItemLogic();

		// 商品追加テスト
		Item items = new Item();
		items.setCategory_code(1);
		items.setName("JAVAの応用");
		items.setPrice(10000);
		// logic.addItem(items);

		// 商品更新テスト
		Item items2 = new Item();
		items.setCode(1);
		items.setCategory_code(1);
		items.setName("JAVAの基本2");
		items.setPrice(3000);
		logic.updateItem(items2);

		// 主キー検索テスト
		Item item = logic.findByPrimaryKey(1);
		System.out.println("主キー検索テスト");
		System.out.println(item);

		// 商品名検索テスト
		List<Item> item2 = logic.findByName("な");
		System.out.println("商品名検索テスト");
		System.out.println(item2);

		// 全件検索テスト
		List<Item> item3 = logic.findAll();
		System.out.println("全件検索テスト");
		System.out.println(item3);

		// カテゴリ検索テスト
		List<Item> item4 = logic.findByCategory(2);
		System.out.println("カテゴリ検索テスト");
		System.out.println(item4);

		// 商品削除テスト
		// logic.deleteItem(11);

	}

}
