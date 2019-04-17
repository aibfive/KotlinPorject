package com.sandu.kotlinporject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * KotlinPorject
 *
 * @author lizewu
 * @date 2019/4/17
 */
public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new View(this).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        OuterClass outerClass = new OuterClass();
        outerClass.outer(outerClass.new NestedClass(){
            @Override
            public void nested() {
                super.nested();
            }
        });

    }
}
