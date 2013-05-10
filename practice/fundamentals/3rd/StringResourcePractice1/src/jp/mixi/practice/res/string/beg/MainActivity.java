
package jp.mixi.practice.res.string.beg;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String thanks = getString(R.string.thanks);
        String and = getString(R.string.and);
        String str_skyhigh = thanks + " " + and + " " + thanks;

        // 課題3の「動的に作る」をこの中でやると勘違いした。けどこのままでいいや。
        TextView skyhigh = (TextView) findViewById(R.id.skyhigh);
        skyhigh.setText(str_skyhigh);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
