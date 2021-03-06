package forest;

import java.awt.event.MouseEvent;
import mvc.Controller;
import java.awt.Point;

/**
 * 樹状整列におけるMVCのコントローラ（C）を担うクラスになる。
 */
public class ForestControler extends Controller
{
	/**
	 * このクラスのインスタンスを生成するコンストラクタ。
	 */
	public ForestControler()
	{
		super();
	}

	/**
	 * マウスクリックしたときに動作するメソッド。
	 * クリックした位置からノードを割り出す。
	 */
	public void mouseClicked(MouseEvent aMouseEvent)
	{
		Point aPoint = aMouseEvent.getPoint();
		aPoint.translate(view.scrollAmount().x, view.scrollAmount().y);
		System.out.println(aPoint);
		return;
	}
}
