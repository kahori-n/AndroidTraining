
package jp.mixi.practice.interaction.beg;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Login");
        menu.add("Refresh");
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 選択されたメニューに対応するイベント処理をここで実行する
    	Toast.makeText(getApplicationContext(), item.getTitle() , Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

}
