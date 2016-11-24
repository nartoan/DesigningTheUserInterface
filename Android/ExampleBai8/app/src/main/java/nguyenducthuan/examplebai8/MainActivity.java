package nguyenducthuan.examplebai8;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tao hinh
        int w = 200, h = 200;
        ShapeDrawable rec = new ShapeDrawable(new RectShape());
        rec.setIntrinsicHeight(h);
        rec.setIntrinsicWidth(w);
        rec.setAlpha(100);

        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageDrawable(rec);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(w,h);
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        params.addRule(RelativeLayout.CENTER_VERTICAL);

        imageView.setLayoutParams(params);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        relativeLayout.addView(imageView);
    }
}
