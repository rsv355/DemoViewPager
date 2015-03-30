package beap.webmyne.com.demoviewpager;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public MyPagerAdapter1 adapter;
    public ViewPager view;
    private int imageArra[] = { R.drawable.antarticaone, R.drawable.antarticatwo,
            R.drawable.antarticathree, R.drawable.antarticafour,
            R.drawable.antarticafive, R.drawable.antarticasix,
            R.drawable.antarticaseven, R.drawable.antarticaeight};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   ViewPagerAdapter adapter = new ViewPagerAdapter(this, imageArra);
        view  = (ViewPager)findViewById(R.id.view);


        view.setPageMargin(-50);

      /*  int margin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20 * 2, getResources().getDisplayMetrics());
        view.setPageMargin(-margin);

     */   //view.setHorizontalFadingEdgeEnabled(true);
       // view.setFadingEdgeLength(30);

        adapter = new MyPagerAdapter1(getSupportFragmentManager());
        view.setAdapter(adapter);
       // view.setCurrentItem(0);






    }




}
 class MyPagerAdapter1 extends FragmentStatePagerAdapter {


    private final String[] TITLES = {"1","2"," 3","4","5"};



     public MyPagerAdapter1(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }


    @Override
    public int getCount() {
        return TITLES.length;
    }



    @Override
    public Fragment getItem(int position) {

        if (position == 0) {

            return BlankFragment1.newInstance("","");
        }


        else if (position == 1) {

            return BlankFragment2.newInstance("","");
        }
        else if (position == 2) {
            return BlankFragment3.newInstance("","");
        }
        else if (position == 3) {

            return BlankFragment4.newInstance("","");
        }
        else if (position == 4) {
            return BlankFragment5.newInstance("","");
        }

        else {
            return BlankFragment1.newInstance("","");
        }
    }
}
