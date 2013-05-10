
package jp.mixi.assignment.res.string.beg;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1 個のものと、複数個のものの両方を並べて表示するため、両方用の TextView を取り出し、リソースへアクセスして表示する
        TextView one_text = (TextView) findViewById(R.id.PluralsTextForOne);
        TextView other_text = (TextView) findViewById(R.id.PluralsTextForOther);
        String one_quantity = getResources().getQuantityString(R.plurals.my_apples, 1, 1);
        String other_quantity = getResources().getQuantityString(R.plurals.my_apples, 2, 2);
        
        one_text.setText(one_quantity);
        other_text.setText(other_quantity);
    }
}