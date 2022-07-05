package forest;

import java.awt.Graphics;

/**
 * 樹状整列におけるブランチ（枝）を担うクラス。
 */
public class Branch extends Object {

	/**
	 * ブランチ（枝）の始点となるノードを記憶するフィールド。
	 */
	private Node start;

	private Node end;

	/**
	 * このクラスのインスタンスを生成するコンストラクタ。
	 */
	public Branch(Node from, Node to) {
	}

	/**
	 * ブランチ（枝）を描画するメソッド。
	 */
	public void draw(Graphics aGraphics) {
	}

	public Node end() {
		return null;
	}

	public Node start() {
		return null;
	}

	/**
	 * 自分自身を文字列に変換するメソッド。
	 */
	public String toString() {
		return null;
	}
}
