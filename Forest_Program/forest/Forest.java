package forest;

import java.util.ArrayList;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Graphics;

public class Forest extends Object
{

	/**
	 * 樹状整列したフォレスト（森）の領域（矩形）を記憶するフィールドです。
	 */
	private Rectangle bounds; // 

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
	}

	/**
	 * ブランチ（枝）を追加するメソッドです。
	 */
	public void addBranch(Branch aBranch)
	{
		branches.add(aBranch)
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
	 * 樹状整列する再帰レベル（N番階層）のメソッドです。
	 */
	protected Point arrange(Node aNode, Point aPoint, ForestModel aModel)
	{
		return null;
	}

	/**
	 * 樹状整列するセカンドレベル（二番階層）のメソッドです。
	 */
	public void arrange(ForestModel aModel)
	{
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
		aBranch.draw(aGraphics)
		aNode.draw(aGraphics)
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
	 * フォレストの根元（ルート）となるノード群を応答するメソッドです。
	 */
	public ArrayList<Node> rootNodes()
	{
		return null; // ノードの配列(foerest.txtやと3つのobject)
	}

	/**
	 * 引数で指定されたノード群をノード名でソート（並び替えを）するメソッドです。
	 */
	protected ArrayList<Node> sortNodes(ArrayList<Node> nodeCollection)
	{

		return null;
	}

	/**
	 * 引数で指定されたノードのサブノード群を応答するメソッドです。
	 */
	public ArrayList<Node> subNodes(Node aNode)
	{
		return null;  //　引数が与えられたらそれより下のnodeを判断する
	}

	/**
	 * 引数で指定されたノードのスーパーノード群を応答するメソッドです。
	 */
	public ArrayList<Node> superNodes(Node aNode)
	{
		
		}
		return null;
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
		int x = aPoint.x
		int y = aPoint.y

		for(Node aNode:nodes){
			int xBottomLeft = aNode.getLocation().x // ブランチの左下のx座標
			int yBottomLeft = aNode.getLocation().y // ブランチの左下のy座標
			int xUpperRight = xBottomLeft + aNode.stringHeight() // ブランチの右上のx座標
			int yUpperRight = yBottomLeft + aNode.stringWidth() // ブランチの右上のy座標

			if((xBottomLeft<=x) && (x<=xUpperRight)){
				if((yBottomLeft<=y) && (y<=yUpperRight)){
					return aNode
				}
			}
		}
		return null;
	}
}
