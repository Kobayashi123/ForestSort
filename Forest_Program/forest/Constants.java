package forest;

/**
 * 定数たち。すべてパブリック＆スタティック＆ファイナルの宣言で、このクラスのクラス変数（フィールド）としてアクセス（読み取りが）できる。
 */
public class Constants extends Object {

	/**
	 * ノードを描く際のラベルの背景色を表します。
	 */
	public static Color BackgroundColor;

	/**
	 * ノードを描く際のラベルのフォントを表します。
	 */
	public static Font DefaultFont;

	/**
	 * ノードを描く際のラベルの文字色を表します。
	 */
	public static Color ForegroundColor;

	/**
	 * ノード群を樹状に整列させる際にノード同士の間隔を表します。
	 */
	public static Point Interval;

	/**
	 * ノードにおいてラベルを描く際の枠縁から余裕（マージン）を表します。
	 */
	public static Point Margin;

	/**
	 * 樹状整列アニメーションのチックタック：時間間隔：スピードを表します。
	 */
	public static Integer SleepTick;

	/**
	 * 樹状整列データファイル中のタグ「ブランチ」を表します。
	 */
	public static String TagOfBranches;

	/**
	 * 樹状整列データファイル中のタグ「ノード」を表します。
	 */
	public static String TagOfNodes;

	/**
	 * 樹状整列データファイル中のタグ「ツリー」を表します。
	 */
	public static String TagOfTrees;

	/**
	 * ノード群を深さ優先にたどる際の状態「未定」を表します。
	 */
	public static Integer UnKnown;

	/**
	 * ノード群を深さ優先にたどる際の状態「未訪問」を表します。
	 */
	public static Integer UnVisited;

	/**
	 * ノード群を深さ優先にたどる際の状態「訪問済」を表します。
	 */
	public static Integer Visited;

}
