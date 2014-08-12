package Ui;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

public class UImainActivity {

	public CustomTableView[] mTableViews;
	private LayoutParams mTableParam;
	private LayoutParams mRowParam;

	Activity activity;

	public UImainActivity(Activity activity) {
		
		this.activity = activity;
		mTableViews = new CustomTableView[12];
		mTableParam = new LayoutParams(290,
				LayoutParams.WRAP_CONTENT, 25);

		mRowParam = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 33);

	}

	public void initCustomViews(LinearLayout layout) {

		/*
		 * add id to every table of month that has been created
		 * 
		 */
		
		layout.removeAllViews();

		LinearLayout a = new LinearLayout(activity.getApplicationContext());
		LinearLayout b = new LinearLayout(activity.getApplicationContext());
		LinearLayout c = new LinearLayout(activity.getApplicationContext());

		a.setLayoutParams(mRowParam);
		b.setLayoutParams(mRowParam);
		c.setLayoutParams(mRowParam);

		for (int i = 0; i < 4; i++) {
			mTableViews[i] = new CustomTableView(
					activity.getApplicationContext());
			mTableViews[i].setLayoutParams(mTableParam);
			mTableViews[i].setId(i);
			a.addView(mTableViews[i]);
		}

		for (int i = 4; i < 8; i++) {
			mTableViews[i] = new CustomTableView(
					activity.getApplicationContext());
			mTableViews[i].setLayoutParams(mTableParam);
			mTableViews[i].setId(i);

			b.addView(mTableViews[i]);
		}

		for (int i = 8; i < 12; i++) {
			mTableViews[i] = new CustomTableView(
					activity.getApplicationContext());
			mTableViews[i].setLayoutParams(mTableParam);
			mTableViews[i].setId(i);

			c.addView(mTableViews[i]);
		}

		layout.addView(a);
		layout.addView(b);
		layout.addView(c);
			

		
	}

	private void getChildren() {
		/*
		 * int childcount = ll.getChildCount(); for (int i=0; i < childcount;
		 * i++){ View v = ll.getChildAt(i); }
		 */
	}

	@SuppressWarnings("deprecation")
	private int getSize() {
		int height = 0;

		try {
			Display display = activity.getWindowManager().getDefaultDisplay();
			height = display.getHeight();
		} catch (Exception e) {

		}
		return height;

	}

}
