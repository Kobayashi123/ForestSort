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

	/**
	 * 樹状整列それ自身を記憶しておくフィールド。
	 */
	private Forest forest;

	/**
	 * ForestModelのインスタンスを生成するコンストラクタ
	 */
	public ForestModel(File aFile)
	{
		super();
		forest = new Forest();
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
	 * @return Forest
	 */
	public Forest forest()
	{
		return this.forest;
	}

	/**
	 * 樹状整列データファイルから樹状整列それ自身を生成するメソッド。
	 */
	protected void read(File aFile)
	{
		// List<String> collectionOfStrings = new ArrayList<String>();
		try
		{
			FileInputStream fileInputStream = new FileInputStream(aFile);                          // バイト単位でアクセスするストリーム
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8"); // 文字単位でアクセス
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);                 // バッファを用いるリーダー
			String aString = null;

			int flag = 0;
			while ((aString = bufferedReader.readLine()) != null) // 一行ずつ読み込みます。
			{
				if (aString.equals("trees:"))
				{
					flag = 1;
					continue;
				}
				if (aString.equals("nodes:"))
				{
					flag = 2;
					continue;
				}
				if (aString.equals("branches:"))
				{
					flag = 3;
					continue;
				}
				if (flag == 1)
				{
					continue;
				}
				else if (flag == 2)
				{
					Node aNode = new Node(aString);
					forest.addNode(aNode);
				}
				else
				{
					// Branch aBranch = new Branch(forest., to)
					// forest.addBranch(aBranch);
				}
				// collectionOfStrings.add(aString); // すべての行を記憶している配列リストに加えます。
			}
			bufferedReader.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		/*
		 * for (String aString : collectionOfStrings)
		 * {
		 * System.out.println(aString); // 一行ずつ標準出力に書き出します。
		 * }
		 * System.out.println("aString.len() = " + collectionOfStrings.size());
		 */
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
