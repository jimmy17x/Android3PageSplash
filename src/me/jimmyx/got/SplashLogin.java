package me.jimmyx.got;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SplashLogin extends Fragment implements OnClickListener {

	public SplashLogin() {
		// Required empty public constructor
	}
	private View view ;
	private Button login ;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		view =  inflater.inflate(R.layout.splash_login, container, false);
	    login = (Button) view.findViewById(R.id.btn_login);
	    login.setOnClickListener(this);
		
		return view;
	}

	@Override
	public void onClick(View v) {
	    switch (v.getId()) {
	        case R.id.btn_login:
	        	Toast.makeText(getActivity(), "Hey", 1000).show();
	            break;
		
	    }
		
	}
}
