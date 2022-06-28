package forest;

public class Forest extends Object {

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
	 * ブランチ（枝）を追加するメソッドです。
	 */
	public void addBranch(Branch aBranch) {

	}

	/**
	 * ノード（節）を追加するメソッドです。
	 */
	public void addNode(Node aNode) {

	}

	/**
	 * 樹状整列するトップ（一番上位）のメソッドです。
	 */
	public void arrange() {

	}

	/**
	 * 樹状整列する再帰レベル（N番階層）のメソッドです。
	 */
	protected Point arrange(Node aNode, Point aPoint, ForestModel aModel) {
		return null;
	}

	/**
	 * 樹状整列するセカンドレベル（二番階層）のメソッドです。
	 */
	public void arrange(ForestModel aModel) {

	}

	/**
	 * フォレスト（木・林・森・亜格子状の森）の領域（矩形）を応答するメソッドです。
	 */
	public Rectangle bounds() {
		return null;
	}

	public void draw(Graphics aGraphics) {

	}

	/**
	 * フォレスト（木・林・森・亜格子状の森）の領域（矩形）を水に流す（チャラにする）メソッドです。
	 */
	public void flushBounds() {

	}

	/**
	 * チックタックの間、スリープし、モデルが変化した、と騒ぐ（広める：放送する）メソッドです。
	 */
	protected void propagate(ForestModel aModel) {

	}

	/**
	 * フォレストの根元（ルート）となるノード群を応答するメソッドです。
	 */
	public ArrayList<Node> rootNodes() {
		return null;
	}

	/**
	 * 引数で指定されたノード群をノード名でソート（並び替えを）するメソッドです。
	 */
	protected ArrayList<Node> sortNodes(ArrayList<Node> nodeCollection) {
		return null;
	}

	/**
	 * 引数で指定されたノードのサブノード群を応答するメソッドです。
	 */
	public ArrayList<Node> subNodes(Node aNode) {
		return null;
	}

	/**
	 * 引数で指定されたノードのスーパーノード群を応答するメソッドです。
	 */
	public ArrayList<Node> superNodes(Node aNode) {
		return null;
	}

	/**
	 * 自分自身を文字列に変換するメソッドです。
	 */
	public String toString() {
		return null;
	}

	/**
	 * 指定された位置（座標）にノードが存在するかを調べるメソッドです。
	 */
	public Node whichOfNodes(Point aPoint) {
		return null;
	}

}