package demo5.qz.com.demo5;

import android.graphics.Color;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VectorDrawableCompat a = VectorDrawableCompat.create(getResources(), R.drawable.ic_add_shopping_cart_black_24dp, getTheme());
        a.setTint(Color.RED); //设置单一的颜色

        DrawableCompat.setTint(a,Color.RED);
    }
}
