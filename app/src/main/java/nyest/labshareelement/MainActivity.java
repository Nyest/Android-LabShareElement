package nyest.labshareelement;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        setupView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }

    private void setupView() {
        RecyclerView mImageList = (RecyclerView) findViewById(R.id.imageList);

        mImageList.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
        mImageList.setAdapter(new ImageAdapter(this, getData()));
    }

    private ArrayList<ImageItem> getData() {
        ArrayList<ImageItem> arrayList = new ArrayList<ImageItem>();

        arrayList.add(new ImageItem("A", R.drawable.image_01));
        arrayList.add(new ImageItem("B", R.drawable.image_02));
        arrayList.add(new ImageItem("C", R.drawable.image_03));
        arrayList.add(new ImageItem("D", R.drawable.image_04));

        return arrayList;

    }




}
