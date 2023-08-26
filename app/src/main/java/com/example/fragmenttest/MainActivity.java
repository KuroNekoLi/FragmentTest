package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SettingFragment settingFragment = new SettingFragment();
//
//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.fl_home,settingFragment)
//                .commit();
    }

//    @Override
//    public void onBackPressed() {
//        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.fl_home);
//
//        if (currentFragment instanceof SettingFragment) {
//            // 獲取子 FragmentManager
//            FragmentManager childFragmentManager = currentFragment.getChildFragmentManager();
//
//            // 檢查返回堆疊中是否有 Fragment
//            if (childFragmentManager.getBackStackEntryCount() > 0) {
//                // 移除最上面的 Fragment
//                childFragmentManager.popBackStack();
//            } else {
//                // 如果沒有子 Fragment，顯示 Toast
//                Toast.makeText(this, "quit?", Toast.LENGTH_SHORT).show();
//            }
//        } else {
//            // 如果當前的 Fragment 不是 SettingFragment，則調用超類的方法
//            super.onBackPressed();
//        }
//    }

}