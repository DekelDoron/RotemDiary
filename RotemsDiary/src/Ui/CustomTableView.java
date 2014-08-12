package Ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rotemsdiary.R;

public class CustomTableView extends LinearLayout {

	private Context context;
	
	private TextView simpleTestTxt;
	private LinearLayout mLaoutContainer;
	private TextView mTitleTxt;
	private Button mAddBtn;

	
	public CustomTableView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		this.context = context;
		LayoutInflater mInflater;
		
		mInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mInflater.inflate(R.layout.view_table, this);
		
		mTitleTxt = (TextView) findViewById(R.id.titleMonth);
		mAddBtn = (Button) findViewById(R.id.Btn);
		mLaoutContainer = (LinearLayout)findViewById(R.id.month_text_view_container);
	}
	
	
	
	
	public void setTitle(String id)
	{
		String d;
		d = String.valueOf(id);
		mTitleTxt.setText(d);
	}

}
