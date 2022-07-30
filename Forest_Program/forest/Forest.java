package forest;

import java.util.ArrayList;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.util.Collections;

public class Forest extends Object
{
	/**
	 * 樹状整列したフォレスト（森）の領域（矩形）を記憶するフィールドです。
	 */
	private Rectangle bounds;

	/**
	 * ブランチ（枝）群（たち）を記憶するフィールドです。
	 */
	private ArrayList<Branch> branches;

	/**
	 * ノード（節）群（たち）を記憶するフィールドです。
	 */
	private ArrayList<Node> nodes;

	/**
	 * Forestのインスタンスを生成するコンストラクタ
	 */
	public Forest()
	{

		this.branches = new ArrayList<Branch>();
		this.nodes = new ArrayList<Node>();
	}

	/**
	 * ブランチ（枝）を追加するメソッドです。
	 */
	public void addBranch(Branch aBranch)
	{
		this.branches.add(aBranch);
	}

	/**
	 * ノード（節）を追加するメソッドです。
	 */
	public void addNode(Node aNode)
	{
		this.nodes.add(aNode);
	}

	/**
	 * 樹状整列するトップ（一番上位）のメソッドです。
	 */
	public void arrange()
	{
	}

	/**
	 * 樹状整列するセカンドレベル（二番階層）のメソッドです。
	 */

	public void arrange(ForestModel aModel)
	{
	}

	/**
	 * 樹状整列する再帰レベル（N番階層）のメソッドです。
	 */

	protected Point arrange(Node aNode, Point aPoint, ForestModel aModel)
	{
		if (aNode.getStatus() < 100){
			aNode.getLocation();
		}
		try
        {
            Thread.sleep(Constants.SleepTick);
        }
        catch (InterruptedException anException)
        {
            System.err.println(anException);
            throw new RuntimeException(anException.toString());
        }

		int aSubNode = aPoint.y;
		int count = 0;

		ArrayList<Node> subNodes = new ArrayList<Node>();
		subNodes = subNodes(aNode);

		// for(Node aSubNode : subNodes){

		// }



		aNode.setStatus(aNode.getStatus()+100); // satusに100足すことで訪れたかどうか判断する

		return null;
	}

	/**
	 * フォレスト（木・林・森・亜格子状の森）の領域（矩形）を応答するメソッドです。
	 */
	public Rectangle bounds()
	{
		return null;
	}

	public void draw(Graphics aGraphics)
	{
		// aBranch.draw(aGraphics);
		// aNode.draw(aGraphics);
	}

	/**
	 * フォレスト（木・林・森・亜格子状の森）の領域（矩形）を水に流す（チャラにする）メソッドです。
	 */
	public void flushBounds()
	{
	}

	/**
	 * チックタックの間、スリープし、モデルが変化した、と騒ぐ（広める：放送する）メソッドです。
	 */
	protected void propagate(ForestModel aModel)
	{
	}

	/**
	 * ノード（節）を応答するメソッドです。
	 */
	public ArrayList<Node> getNode()
	{
		return this.nodes;
	}

	/**
	 * フォレストの根元（ルート）となるノード群を応答するメソッドです。
	 */

	public ArrayList<Node> rootNodes()
	{
		ArrayList<Node> roots = new ArrayList<Node>();
		for (Branch aBranch : branches)
		{
			for (Node aNode : nodes)
			{
				if (aBranch.end().getStatus() == aNode.getStatus())
				{
					roots.add(aNode);
				}
			}
		}
		return roots; // ノードの配列(foerest.txtやと3つのobject)
	}

	/**
	 * 引数で指定されたノード群をノード名でソート（並び替えを）するメソッドです。
	 */
	protected ArrayList<Node> sortNodes(ArrayList<Node> nodeCollection)
	{

		ArrayList<String> nodeStrings = new ArrayList<String>();
		ArrayList<Node> sortNodes = new ArrayList<Node>();
		for (Node aNode : nodeCollection)
		{
			nodeStrings.add(aNode.getName());
		}
		Collections.sort(nodeStrings);

		for (String aStringNode : nodeStrings)
		{
			for (Node aNode : nodeCollection)
			{
				if (aStringNode.equals(aNode.getName()))
				{
					sortNodes.add(aNode);
				}
			}
		}
		return sortNodes;
	}

	/**
	 * 引数で指定されたノードのサブノード群を応答するメソッドです。
	 */
	public ArrayList<Node> subNodes(Node aNode)
	{
		ArrayList<Node> subNodes = new ArrayList<Node>();
		for(Branch aBranch : branches){
			if(aNode.getStatus() == aBranch.start().getStatus()){
				for(Node oneNode : nodes){
					if(aNode.getStatus() == aBranch.end().getStatus()){
						subNodes.add(oneNode);
					}
				}
			}
		}
		return subNodes; // 引数が与えられたらそれより下のnodeを判断する
	}

	/**
	 * 引数で指定されたノードのスーパーノード群を応答するメソッドです。
	 */
	public ArrayList<Node> superNodes(Node aNode)
	{

		ArrayList<Node> superNodes = new ArrayList<Node>();
		for (Branch aBranch : branches)
		{
			if (aBranch.end().getStatus().equals(aNode.getStatus()))
			{
				superNodes.add(aBranch.end());
				return this.superNodes(aBranch.end());
			}
		}
		return superNodes;
	}

	/**
	 * 自分自身を文字列に変換するメソッドです。
	 */
	public String toString()
	{
		return null;
	}

	/**
	 * 指定された位置（座標）にノードが存在するかを調べるメソッドです。
	 */
	public Node whichOfNodes(Point aPoint)
	{
		int x = aPoint.x;
		int y = aPoint.y;

		for (Node aNode : nodes)
		{
			int xBottomLeft = aNode.getLocation().x; // ブランチの左下のx座標
			int yBottomLeft = aNode.getLocation().y; // ブランチの左下のy座標

			int xUpperRight = xBottomLeft + aNode.stringHeight(aNode.getStatus()); // ブランチの右上のx座標
			int yUpperRight = yBottomLeft + aNode.stringWidth(aNode.getName());    // ブランチの右上のy座標

			if ((xBottomLeft <= x) && (x <= xUpperRight))
			{
				if ((yBottomLeft <= y) && (y <= yUpperRight))
				{
					return aNode;
				}
			}
		}
		return null;
	}
}
