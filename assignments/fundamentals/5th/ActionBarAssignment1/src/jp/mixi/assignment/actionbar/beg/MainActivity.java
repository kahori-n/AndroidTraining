
package jp.mixi.assignment.actionbar.beg;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
	public void onClick(View v) {
        // メッセージのオブジェクトとして Intent を作る
		Toast.makeText(getBaseContext(), "kiteru?", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,AppIconActivity.class);
        startActivity(intent);
	}
}
