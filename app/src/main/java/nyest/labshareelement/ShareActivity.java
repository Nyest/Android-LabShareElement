package nyest.labshareelement;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageView ivItem = (ImageView) findViewById(R.id.ivItem);

        if(getIntent() != null) {
            int imageSrc = getIntent().getIntExtra("imageSrc", 0);

            if(imageSrc != 0) {
                ivItem.setImageResource(imageSrc);
            }
        }
    }
}
