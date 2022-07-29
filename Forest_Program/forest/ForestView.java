package forest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import mvc.View;

/**
 * 樹状整列におけるMVCのビュー（V）を担うクラス。
 */
@SuppressWarnings("serial")
public class ForestView extends View
{

	/**
	 * このクラスのインスタンスを生成するコンストラクタ。
	 */
	public ForestView(ForestModel aModel)
	{
		super(aModel);
	}

	/**
	 * このパネル（ビュー）の描画が必要になったときに動作するメソッド。
	 */
	public void paintComponent(Graphics aGraphics)
	{
		aGraphics.setColor(Color.white);
		// ForestModel aForestModel = (ForestModel) (this.model);
	}

	/**
	 * 指定された位置（座標）にノードが存在するかを調べるメソッド。
	 * もしも見つからなかった場合には、nullを応答。
	 */
	public void whichOfNodes(Point aPoint)
	{
	}
}
