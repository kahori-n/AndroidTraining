package jp.mixi.practice.actionbar.beg;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.view.Menu;

public class MainActivity extends SherlockActivity implements TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // タブナビゲーションモードに設定
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // タブを作成して追加。タブの選択・解除・再選択をハンドリングするコールバックの TabListener をセットしないと実行時例外でクラッシュする
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab1").setTabListener(this));
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab2").setTabListener(this));
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab3").setTabListener(this));
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab4").setTabListener(this));
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab5").setTabListener(this));
        getSupportActionBar().addTab(getSupportActionBar().newTab().setText("Tab6").setTabListener(this));
    }

    // タブナビゲーションの Tab が選択された時のコールバック
    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        Toast.makeText(getApplicationContext(), tab.getText(), Toast.LENGTH_SHORT).show();
    }

    // タブナビゲーションの Tab が選択解除された時のコールバック
    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        
    }

    // タブナビゲーションの Tab が再度選択された時のコールバック
    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, (android.view.Menu) menu);
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
