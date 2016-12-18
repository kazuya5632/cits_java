package task1215;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * メッセージ表示するときにいろいろなキャラクターで装飾することを考えます。 ・@@@HelloHello&&&&
 * ・!*!*!*おはようおはよう=)=)=)=) 講義中にお話したように、アルゴリズムをパターン化して抽象化します。 ここでは何かの飾り文字を 3
 * 回出力、メッセージを 2 回、終わりの飾り文字を4回と考え ます。
 * 飾り文字はリテラルの場合もあればファイル、XML、データベースなどに入っている場合もあります。
 * 現時点の知識でベストと思われるモジュール化(関数やクラス)を使ってプログラムしてください。
 * 
 */
public class Task1215_4 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
			
		convertXML();
	}

	//XMLファイル読み込み
	public static void convertXML() throws ParserConfigurationException, SAXException, IOException {
		// パーサを作成
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		// パース
		Document doc = db.parse("test.xml");
		// トップレベル要素の取得
		Element el = doc.getDocumentElement();
		// トップレベル要素名を表示
		System.out.println(el.getTextContent());
	}
	
	
}
