package com.example.optionmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        registerForContextMenu(findViewById(android.R.id.content)); //문맥감지?context, 아이디값이 고정되어있음

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
       // menu.add(Menu.NONE, 1, 0, "menu1");
       // menu.add(Menu.NONE, 1, 1, "menu2");
       // menu.add(Menu.NONE, 2, 2, "menu3");

      //  SubMenu etc = menu.addSubMenu(Menu.NONE,3,3, "etc");
       // etc.add(Menu.NONE, 4,0, "submenu1" );
       // etc.add(Menu.NONE, 5,1, "submenu2" );
       // etc.add(Menu.NONE, 6,2, "submenu3" );
        getMenuInflater().inflate(R.menu.menu_main, menu); //xml을 객체로 만듬

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       int itemId = item.getItemId();

        System.out.println("===========> menu" + itemId + "selected");

        switch(itemId){

            case R.id.main_menu1:
                System.out.println("menu1 selected!");
                break;

            case R.id.main_menu2:
                System.out.println("menu2 selected!");
                break;

            case R.id.main_menu5:
                System.out.println("menu5 selected!");
                break;

            default:
                break;


        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_context, menu);


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        System.out.println("=================>" + itemId);

        return super.onContextItemSelected(item);
    }
}
