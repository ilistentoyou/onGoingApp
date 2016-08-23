package com.example.hima.ongoingapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv ;
    String ExternalFontPath;
    Typeface FontLoaderTypeface;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
// Get access to the custom title view
        TextView mTitle = (TextView) mToolbar.findViewById(R.id.text);
        Typeface tf =  Typeface.createFromAsset(getAssets(),"Pokemon Solid.ttf");
        mTitle.setTypeface(tf);

        Button b = (Button)findViewById(R.id.button);
        b.setTypeface(tf);

        TextView register = (TextView)findViewById(R.id.register);
        register.setTypeface(tf);



        /*ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        SpannableString st = new SpannableString(actionBar.getTitle());
        st.setSpan(new myTypeFace("",Typeface.createFromAsset(getAssets(),"Pokemon Solid.ttf")),0,
                st.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        actionBar.setTitle(st);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#40c8ca")));
       // actionBar.setTitle(Html.fromHtml("<font color='#f17304'>ActionBartitle </font>"));*/
    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent n = new Intent(getApplicationContext(),Pokemons.class);
            startActivity(n);

        }
    });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(getApplicationContext(),SignUp.class);
                startActivity(n);
            }
        });




    }
}


