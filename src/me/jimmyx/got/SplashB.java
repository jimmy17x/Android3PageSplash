package me.jimmyx.got;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashB extends Fragment {
	private static Animation animFadeInRepetitive;
	private static ImageView b;
	private static View v;

	public SplashB() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.splash_b, container, false);
		animFadeInRepetitive = AnimationUtils.loadAnimation(getActivity(),
				R.anim.fadein_repeat);

		b = (ImageView) v.findViewById(R.id.iv_jon);
		b.startAnimation(animFadeInRepetitive);
		return v;
	}
}
