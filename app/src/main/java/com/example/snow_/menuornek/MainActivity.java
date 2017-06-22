package com.example.snow_.menuornek;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt,edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        edt=(EditText)findViewById(R.id.editText);
        edt1=(EditText)findViewById(R.id.editText3);
        this.registerForContextMenu(edt);
        this.registerForContextMenu(edt1);
    }
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
        switch (v.getId()){
            case R.id.editText:
                this.getMenuInflater().inflate(R.menu.renk_menu,menu);
                break;
            case R.id.editText3:
                this.getMenuInflater().inflate(R.menu.font_menu,menu);
                break;
        }
        super.onCreateContextMenu(menu,v,menuInfo);
    }
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.mnuBlue:
                edt.setTextColor(Color.BLUE);
                break;
            case R.id.mnuGreen:
                edt.setTextColor(Color.GREEN);
                break;
            case R.id.mnuRed:
                edt.setTextColor(Color.RED);
                break;
            case R.id.mnuBig:
                edt1.setTextSize(50);
                break;
            case R.id.mnuMedium:
                edt1.setTextSize(35);
                break;
            case R.id.mnuSmall:
                edt1.setTextSize(20);
                break;
        }
        return super.onContextItemSelected(item);
    }
}
