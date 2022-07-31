# ForestSort
ソフトウェア工学Ⅱの長期課題「樹状整列」プログラムの開発を行う。

## クローン方法

git clone https://github.com/Kobayashi123/ForestSort.git<br>

## ローカルリポジトリとワーキングツリーの更新

git pull<br>

## ブランチの変更

ここでは、main ブランチから temp_branch に移動する。<br>
git branch temp_branch<br>
git switch temp_branch<br>

## プログラムを変更後

Programディレクトリで以下の操作を行う<br>
make format<br>
make test<br>

## 変更したファイルをインデックスに追加

ここでは、temp_file を編集しインデックスに追加<br>
git add temp_file<br>

全てのファイルをインデックスに追加<br>
git add .<br>

## ローカルリポジトリへコミット

git commit -m "コミット方法についての記述を追加"<br>

## リモートリポジトリへプッシュ(コミット)

git push origin HEAD<br>

## GitHub での操作

github 上で pull request を出す<br>
