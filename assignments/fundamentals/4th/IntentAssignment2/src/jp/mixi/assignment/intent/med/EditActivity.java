package jp.mixi.assignment.intent.med;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class EditActivity extends Activity {
    public static final int REQUEST_CODE_HOGE = 1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        findViewById(R.id.Submit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO ここで、id が MyEdit の EditText からテキストを取得して、結果にセットする
            	EditText myEdit = (EditText) findViewById(R.id.MyEdit);
            	String str = myEdit.getText().toString();

            	Intent intent = getIntent();
            	intent.putExtra("result", str);
            	setResult(RESULT_OK, intent);
            	finish();
            }
        });
    }
}