package com.therock.catloading;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.roger.catloadinglibrary.CatLoadingView;

public class MainActivity extends AppCompatActivity {
    private CatLoadingView cat_dialog;
    Button show_btn,dismiss_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        show_btn=findViewById( R.id.show_btn );
        dismiss_btn=findViewById( R.id.dismiss_btn );

        show_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cat_dialog = new CatLoadingView();
                cat_dialog.show( getSupportFragmentManager(), "1" );
            }
        } );
        dismiss_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cat_dialog.dismiss();
            }
        } );


    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}