package me.jimmyx.got;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashC extends Fragment {
	private static Animation animFadeInRepetitive;
	private static ImageView c;
	private static View v;

	public SplashC() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.splash_c, container, false);
		animFadeInRepetitive = AnimationUtils.loadAnimation(getActivity(),
				R.anim.fadein_repeat);

		c = (ImageView) v.findViewById(R.id.iv_house);
		c.startAnimation(animFadeInRepetitive);
		return v;
	}
}
