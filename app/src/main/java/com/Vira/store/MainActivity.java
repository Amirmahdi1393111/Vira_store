package com.vira.store;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // شبیه‌سازی سیستم انتشار و تفکیک (برنامه یا بازی؟)
        // این متد رو بعداً می‌تونیم به دکمه‌ی پنل ادمین وصل کنیم
    }

    /**
     * ربات/تابع هوشمند تفکیک‌کننده
     * موقع انتشار محتوا، نوع آن را مشخص می‌کند
     */
    public String classifyContent(boolean isGame, String appName) {
        if (isGame) {
            // انتقال به دسته‌بندی بازی‌ها
            return "بازی: " + appName + " با موفقیت در بخش گیم ثبت شد.";
        } else {
            // انتقال به دسته‌بندی برنامه‌ها
            return "برنامه: " + appName + " با موفقیت در بخش ابزارها ثبت شد.";
        }
    }
}
