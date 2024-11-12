/*
 * TicTacToeのテスト
 */
package sample;//パッケージ名修正

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest { //ファイル名&クラス名修正

    @Test //アノテーションをつけてそのメソッド内でテストコードを書く
    void initializeTest(){
        TicTacToe ttt = new TicTacToe(); //まずはオブジェクトを用意
        ttt.initialize(); //検証したいメソッドを実行
        assertEquals(true, ttt.getTurn()); //oターンであることを検証
        assertEquals('e', ttt.getBoard()[0][0]);
        //assertEquals(正解, 実行結果)
 
    }

}
