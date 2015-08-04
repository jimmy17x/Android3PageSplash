package me.jimmyx.got;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends FragmentActivity {

	ViewPager viewPager = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_splash);
		viewPager = (ViewPager) findViewById(R.id.pager);
		FragmentManager fragmentManager = getSupportFragmentManager();
		viewPager.setAdapter(new MyAdapter(fragmentManager));
	}

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// // Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(R.menu.menu_splash, menu);
	// return true;
	// }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		// noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}

class MyAdapter extends FragmentPagerAdapter {

	public MyAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		Fragment fragment = null;

		if (i == 0) {
			fragment = new SplashA();
		}
		if (i == 1) {
			fragment = new SplashB();
		}
		if (i == 2) {
			fragment = new SplashC();
		}
		if (i == 3) {
			fragment = new SplashLogin();
		}
		return fragment;
	}

	@Override
	public int getCount() {
		return 4;
	}
}
