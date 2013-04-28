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
        // LayoutInflater �𗘗p���āA���C�A�E�g�����\�[�X�Ƃ��ēǂݍ���
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
    
    // ��������p�̃��\�b�h�BFragment �ɑ΂��鏉�����p�̈����͂����ŊǗ�����
    public static Fragment createInstance(int hoge) {
        Fragment fragment = new MainFragment();
        // Fragment �ɓn���������l�߂��ރI�u�W�F�N�g
        Bundle args = new Bundle();
        args.putInt("hoge", hoge);

        // �l�ߍ��񂾃I�u�W�F�N�g�� Fragment �ɓn��
        fragment.setArguments(args);

        // �V�����C���X�^���X��Ԃ�
        return fragment;
    }

}