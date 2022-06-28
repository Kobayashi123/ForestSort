package forest;

/**
 * 樹状整列におけるMVCのモデル（M）を担うクラス。
 */
public class ForestModel extends view.Model {

	/**
	 * 樹状整列それ自身を記憶しておくフィールド。
	 */
	private ForestModel forest;

	/**
	 * ForestModelのインスタンスを生成するコンストラクタ
	 */
	public ForestModel(File aFile) {

	}

	/**
	 * アニメーションを行うメソッド。
	 */
	public void animate() {

	}

	public void arrange() {

	}

	/**
	 * 自分自身が変化したことを依存物たちに放送（updateを依頼）するメソッド。
	 */
	public void changed() {

	}

	public ForestModel forest() {
		return null;
	}

	/**
	 * 樹状整列データファイルから樹状整列それ自身を生成するメソッド。
	 */
	protected void read(File aFile) {

	}

	/**
	 * 樹状整列の根元（ルート）になるノードを探し出して応答するメソッド。
	 * ただし、見つからないときはnullを応答。
	 */
	public Node root() {
		return null;
	}

	/**
	 * 樹状整列の根元（ルート）になるノードたちを探し出して応答するメソッド。
	 * ただし、見つからないときは空リスト。
	 */
	public ArrayList<Node> roots() {
		return null;
	}

}
