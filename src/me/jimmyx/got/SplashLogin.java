package me.jimmyx.got;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SplashLogin extends Fragment implements OnClickListener {

	public SplashLogin() {
		// Required empty public constructor
	}

	private static View view;
	private static Button login, sighnup;
	private static EditText username, password;
	private static TextView got;
	private static Animation animFadeInRepetitive;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		view = inflater.inflate(R.layout.splash_login, container, false);
		login = (Button) view.findViewById(R.id.btn_login);
		sighnup = (Button) view.findViewById(R.id.btn_signup);
		username = (EditText) view.findViewById(R.id.et_username);
		password = (EditText) view.findViewById(R.id.et_password);
		got = (TextView) view.findViewById(R.id.tv_logo);
		animFadeInRepetitive = AnimationUtils.loadAnimation(getActivity(),
				R.anim.blink_shade);
		got.startAnimation(animFadeInRepetitive);

		username.setText("");
		password.setText("");
		login.setOnClickListener(this);
		sighnup.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_login:
			if (username.getText().toString().length() == 0
					|| password.getText().toString().length() == 0) {
				Toast.makeText(getActivity(), "Please fill all details", 1000)
						.show();
				break;
			}

			if (username.getText().toString().trim().equals("user")
					&& password.getText().toString().trim().equals("user")) {
				Toast.makeText(getActivity(), "Welcome to Game of Thrones",
						1000).show();
				Intent home = new Intent(getActivity(),Home.class);
				startActivity(home);
				
			} else {
				Toast.makeText(getActivity(),
						"wrong login credintals, try again", 1000).show();

			}
			break;
		case R.id.btn_signup:
			Toast.makeText(getActivity(),
					"You very well know the username n password", 1000).show();
			break;

		}

	}

}
