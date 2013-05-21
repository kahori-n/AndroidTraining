
package jp.mixi.assignment.intent.med;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button = findViewById(R.id.CallActivityForResult);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO EditText と ボタンを 1 つずつ持つ新しい Activity を呼び出し、ボタンを押した時に結果を返すように実装する
                // TODO 返ってきた結果を Toast で表示するところも実装すること
            	Intent intent = new Intent(MainActivity.this, EditActivity.class);
            	startActivityForResult(intent, EditActivity.REQUEST_CODE_HOGE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // super.onActivityResult(int, int, Intent) の呼び出しは、条件に関係なくすること
    	super.onActivityResult(requestCode, resultCode, data);
    	String result = data.getStringExtra("result");
    	Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
    }
}