package com.example.rotemsdiary;

import Data.MyData;
import Ui.CustomTableView;
import Ui.UImainActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	
	
	private UImainActivity mActivityUi; //hold all views in activity
	private MyData mData;				//hold data 
	private LinearLayout mMainLayout;	//main frame 
	private String[] mMonths;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        

        mActivityUi = new UImainActivity(this);
        mMainLayout = (LinearLayout)findViewById(R.id.MainActivity_main_layout);
        mData = new MyData();
       mActivityUi.initCustomViews(mMainLayout);
        init();        
    }
    
    
    private void init()
    {
    	mMonths = getResources().getStringArray(R.array.YearMonths);
    	
    	for (int i = 0; i < mActivityUi.mTableViews.length; i++) {
    		 
    		mActivityUi.mTableViews[i].setTitle(mMonths[i]);
    		
    		mActivityUi.mTableViews[i].setOnClickListener(new OnClickListener() {
    			
    			@Override
    			public void onClick(View v) {
    				// TODO Auto-generated method stub
    				Toast.makeText(getApplicationContext(), String.valueOf(v.getId()), Toast.LENGTH_SHORT).show();
    			}
    		});    	
		}

		
    }
    
    
}
