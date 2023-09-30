package com.xfruitman.myapplication;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

//공용 클래스 MainActivity 앱 호환성 작업 확장
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //요청된 방향 설정(스마트폰을 들고 있는 방향에 따라서 스마트폰 화면의 긴 쪽을 가로로 삼음)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        //콘텐츠 뷰 설정(res -> layout -> activity_main 사용)
        setContentView(R.layout.activity_main);
        //안테나, 인터넷 환경, 배터리 정보 등이 담긴 부분을 보이지 않도록 하고, 앱에서 사용함.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //서포트 액션바 숨김
        getSupportActionBar().hide();
    }
}