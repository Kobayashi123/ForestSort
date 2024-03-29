package forest;

import java.awt.Graphics;

/**
 * 樹状整列におけるブランチ（枝）を担うクラス。
 */
public class Branch extends Object
{

	/**
	 * ブランチ（枝）の始点となるノードを記憶するフィールド。
	 */
	private Node start;

	/**
	 * ブランチ（枝）の終点となるノードを記憶するフィールド。
	 */
	private Node end;

	/**
	 * このクラスのインスタンスを生成するコンストラクタ。
	 */
	public Branch(Node from, Node to)
	{
		this.start = from;
		this.end = to;
	}

	/**
	 * ブランチ（枝）を描画するメソッド。
	 */
	public void draw(Graphics aGraphics)
	{
		int startpointx = this.start.getLocation().x + (this.start.getExtent().x / 2);
		int startpointy = this.start.getLocation().y;
		int endpointx = this.end.getLocation().x - (this.end.getExtent().x / 2);
		int endpointy = this.end.getLocation().y;

		aGraphics.drawLine(startpointx, startpointy, endpointx, endpointy);
	}

	/**
	 * ブランチ（枝）の始点となるノードを応答するメソッドです。
	 */
	public Node start()
	{
		return this.start;
	}

	/**
	 * ブランチ（枝）の終点となるノードを応答するメソッドです。
	 */
	public Node end()
	{
		return this.end;
	}

	/**
	 * 自分自身を文字列に変換するメソッド。
	 */
	public String toString()
	{
		return "start: " + this.start.toString() + "   "
		        + "end: " + this.end.toString();
	}
}
