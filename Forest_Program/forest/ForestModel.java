package forest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ArrayList;

import mvc.Model;

/**
 * 樹状整列におけるMVCのモデル（M）を担うクラス。
 */
public class ForestModel extends Model
{

	private static List<String> collectionOfStrings = new ArrayList<String>();

	/**
	 * 樹状整列それ自身を記憶しておくフィールド。
	 */
	private ForestModel forest;

	/**
	 * ForestModelのインスタンスを生成するコンストラクタ
	 */
	public ForestModel(File aFile)
	{
		super();
		this.read(aFile);
	}

	/**
	 * アニメーションを行うメソッド。
	 */
	public void animate()
	{
	}

	/**
	 * 樹状整列を行うメソッド。
	 */
	public void arrange()
	{
	}

	/**
	 * 自分自身が変化したことを依存物たちに放送（updateを依頼）するメソッド。
	 */
	public void changed()
	{
	}

	/**
	 * 樹状整列それ自身を応答するメソッド。
	 *
	 * @return ForestModel
	 */
	public ForestModel forest()
	{
		return null;
	}

	/**
	 * 樹状整列データファイルから樹状整列それ自身を生成するメソッド。
	 */
	protected void read(File aFile)
	{
		try
		{
			FileInputStream fileInputStream = new FileInputStream(aFile);                          // バイト単位でアクセスするストリーム
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8"); // 文字単位でアクセス
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);                 // バッファを用いるリーダー
			String aString = null;
			while ((aString = bufferedReader.readLine()) != null) // 一行ずつ読み込みます。
			{
				ForestModel.collectionOfStrings.add(aString); // すべての行を記憶している配列リストに加えます。
			}
			bufferedReader.close();
		}
		catch (FileNotFoundException anException)
		{
			anException.printStackTrace();
		}
		catch (UnsupportedEncodingException anException)
		{
			anException.printStackTrace();
		}
		catch (IOException anException)
		{
			anException.printStackTrace();
		}

		for (String aString : ForestModel.collectionOfStrings)
		{
			System.out.println(aString); // 一行ずつ標準出力に書き出します。
		}
		System.out.println("aString.len() = " + collectionOfStrings.size());
	}

	/**
	 * 樹状整列の根元（ルート）になるノードを探し出して応答するメソッド。
	 * ただし、見つからないときはnullを応答。
	 *
	 * @return Node
	 */
	public Node root()
	{
		return null;
	}

	/**
	 * 樹状整列の根元（ルート）になるノードたちを探し出して応答するメソッド。
	 * ただし、見つからないときは空リスト。
	 */
	public ArrayList<Node> roots()
	{
		return null;
	}
}
