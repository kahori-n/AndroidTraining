
package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FragmentManager ���Aandroid.support.v4.app.FragmentManager �𗘗p����
        FragmentManager manager = getSupportFragmentManager();
        // ���C�A�E�g���� Fragment �������o���ăC���X�^���X�𓾂�
        Fragment fragment = manager.findFragmentById(R.id.fragment_main);
    }

}
