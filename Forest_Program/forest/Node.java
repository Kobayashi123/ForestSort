package forest;

import java.awt.Point;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Node extends Component
{
	/**
	 * ノードの大きさ（幅と高さ）を記憶するフィールドです。
	 */
	private Point extent;

	/**
	 * ノードの場所（位置：座標）を記憶するフィールドです。
	 */
	private Point location;

	/**
	 * ノード名：ラベル文字列を記憶するフィールドです。
	 */
	private String name;

	/**
	 * 樹状整列する際のノードの状態を記憶するフィールドです。
	 */
	private Integer status;

	/**
	 * このクラスのインスタンスを生成するコンストラクタ。
	 */
	public Node(String aString)
	{
	}

	/**
	 * ノード（節）を描画するメソッドです。
	 */
	public void draw(Graphics aGraphics)
	{
	}

	/**
	 * ノード（節）の描画領域を応答するメソッドです。
	 */
	public Rectangle getBounds()
	{
		return null;
	}

	/**
	 * ノード（節）の大きさを応答するメソッドです。
	 */
	public Point getExtent()
	{
		return null;
	}

	/**
	 * ノード（節）の位置を応答するメソッドです。
	 */
	public Point getLocation()
	{
		return null;
	}

	/**
	 * ノード（節）の名前を応答するメソッドです。
	 */
	public String getName()
	{
		return null;
	}

	/**
	 * ノード（節）の状態を応答するメソッドです。
	 */
	public Integer getStatus()
	{
		return null;
	}

	/**
	 * ノード（節）の大きさを設定するメソッドです。
	 */
	public void setExtent(Point aPoint)
	{
	}

	/**
	 * ノード（節）の位置を設定するメソッドです。
	 */
	public void setLocation(Point aPoint)
	{
	}

	/**
	 * ノード（節）の名前を設定するメソッドです。
	 */
	public void setName(String aString)
	{
	}

	/**
	 * ノード（節）の状態を設定するメソッドです。
	 */
	public void setStatus(Integer anInteger)
	{
	}

	/**
	 * 文字列の高さを応答するメソッドです。
	 */
	protected int stringHeight(Integer anInteger)
	{
		return 0;
	}

	/**
	 * 文字列の幅を応答するメソッドです。
	 */
	protected int stringWidth(String string)
	{
		return 0;
	}

	/**
	 * 自分自身を文字列に変換するメソッドです。
	 */
	public String toString()
	{
		return null;
	}
}
