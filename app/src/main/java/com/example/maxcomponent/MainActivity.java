package com.example.maxcomponent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.maxcomponent.DiffComponents.DateTimeCalenderActivity;
import com.example.maxcomponent.DiffComponents.DilogAlertActivity;
import com.example.maxcomponent.DiffComponents.EditTextActivity;
import com.example.maxcomponent.DiffComponents.GridViewActivityFirst;
import com.example.maxcomponent.DiffComponents.ListViewFirstActivity;
import com.example.maxcomponent.DiffComponents.SpineerAndDropDownWorldActivity;
import com.example.maxcomponent.DiffComponents.SwitchToggleRadioCheckBoxActivity;
import com.example.maxcomponent.DrawersPart1App.Drawer2nd;
import com.example.maxcomponent.DrawersPart1App.MenuActivity;
import com.example.maxcomponent.FragmentWorld.CommunicationFragActivity;
import com.example.maxcomponent.Intentfilter.IntentFilterActivityFirst;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
MaterialToolbar toolbar;
DrawerLayout drawerLayout;
NavigationView navigationView;
FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        frameLayout = findViewById(R.id.main_framelayout);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch ( item.getItemId())
        {
            case R.id.menuitemRecylerView:
                Intent intent1 = new Intent(MainActivity.this, IntentFilterActivityFirst.class);
             //   Intent intent1 = new Intent(MainActivity.this, EditTextActivity.class);

             //   Intent intent1 = new Intent(MainActivity.this, SwitchToggleRadioCheckBoxActivity.class);
             //   Intent intent1 = new Intent(MainActivity.this, DilogAlertActivity.class);
             //   Intent intent1 = new Intent(MainActivity.this, DateTimeCalenderActivity.class);
               // Intent intent1 = new Intent(MainActivity.this, GridViewActivityFirst.class);
                // Intent intent1 = new Intent(MainActivity.this, ListViewFirstActivity.class);
               // Intent intent1 = new Intent(MainActivity.this, SpineerAndDropDownWorldActivity.class);
               // Intent intent1 = new Intent(MainActivity.this, RecyclerViewActivity.class);
              //  Intent intent1 = new Intent(MainActivity.this, CommunicationFragActivity.class);
                startActivity(intent1);
                return  true;

            case R.id.menuitemMultiRecylerView:
                Intent intenta = new Intent(MainActivity.this, MultiRecyclerItemActivity.class);
                startActivity(intenta);
                return  true;
            case R.id.menuitemTabBarOption:
                Intent intentat = new Intent(MainActivity.this, TabBarActivity.class);
                startActivity(intentat);
                return  true;
            case R.id.menuitemBottomNavigationViewOption:
                Intent intentatg = new Intent(MainActivity.this, BottomNavigationActivity.class);
                startActivity(intentatg);
                return  true;
            case R.id.menuitemSideDrawerEX:
                Intent sideintent = new Intent(MainActivity.this, Drawer2nd.class);
                startActivity(sideintent);
                return  true;
            case R.id.menuitemMenuDifferent:
                Intent menueintent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(menueintent);
                return  true;

            case R.id.inbox:
                Toast.makeText(this,"Inbox Clicked",Toast.LENGTH_SHORT).show();
               // Intent intenta = new Intent(MainActivity.this, MultiRecyclerItemActivity.class);
              //  Intent intenta = new Intent(MainActivity.this, TabBarActivity.class);
                Intent inten = new Intent(MainActivity.this, BottomNavigationActivity.class);
                startActivity(inten);

                break;
            case R.id.home:
                Intent intent = new Intent(MainActivity.this, Drawer2nd.class);
                startActivity(intent);
                Toast.makeText(this,"Home Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.settings:
                Intent intent1E = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent1E);

                Toast.makeText(this,"Settings Clicked",Toast.LENGTH_SHORT).show();
                break;

        }

        return  true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu_first,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.firstopt:
                Intent intent1 = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent1);

                Toast.makeText(this,"firstopt",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.secondopt:

                Toast.makeText(this,"secondopt",Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return  true;

    }
}