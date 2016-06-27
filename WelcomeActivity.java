import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by Suvikielo on 6/27/2016.
 */
public class WelcomeActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    private int[] layouts;
    private Button btnNext, btnPrevious;
    private PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //Checking for first time launch
        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()){
            launchHomeScreen();
            finish();
        }

        //Making notification bar transparent
        if (Build.VERSION.SDK_INT >=21){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }
        setContentView(R.layout.activity_welcome);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        dotsLayout = (LinearLAyout) findViewById(R.id.layoutDots);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnPrevious = (Button) findViewById(R.id.btn_previous);

        // layouts of all welcome sliders
        layouts = new int[]{
                R.layout.welcome_slide1,
                R.layout.welcome_slide2,
                R.layout.welcome_slide3,
                R.layout.welcome_slide4};
        

    })

}
