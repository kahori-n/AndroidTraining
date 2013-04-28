package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {
	public MainFragment() {}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // LayoutInflater を利用して、レイアウトをリソースとして読み込む
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
    
    // 初期化専用のメソッド。Fragment に対する初期化用の引数はここで管理する
    public static Fragment createInstance(int hoge) {
        Fragment fragment = new MainFragment();
        // Fragment に渡す引数を詰めこむオブジェクト
        Bundle args = new Bundle();
        args.putInt("hoge", hoge);

        // 詰め込んだオブジェクトを Fragment に渡す
        fragment.setArguments(args);

        // 新しいインスタンスを返す
        return fragment;
    }

}