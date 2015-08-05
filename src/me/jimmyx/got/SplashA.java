package me.jimmyx.got;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashA extends Fragment {
	private static Animation animFadeInRepetitive;
	private static ImageView a;
	private static View v;

	public SplashA() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		v = inflater.inflate(R.layout.splash_a, container, false);
		animFadeInRepetitive = AnimationUtils.loadAnimation(getActivity(),
				R.anim.fadein_repeat);
		
		a = (ImageView) v.findViewById(R.id.iv_oberyn);
		a.startAnimation(animFadeInRepetitive);
		return v;
	}
}
