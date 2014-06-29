package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import fravier.com.quest.R;


public class O13 extends Fragment {
    Context ctx;
    private ImageView imageView1;
    private ImageView imageView2;
    private TextView textView;
    private SeekBar seekBar;
    private int imageWidth, imageHeight;

    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctx = container.getContext();
        View v = inflater.inflate(R.layout.fragment_o13, container, false);
//		imageView1 = (ImageView) v.findViewById(R.id.ImageView01);
//		imageView2 = (ImageView) v.findViewById(R.id.ImageView02);
//		textView = (TextView) v.findViewById(R.id.textView1);
//		//seekBar = (SeekBar) v.findViewById(R.id.SeekBar01);
//		seekBar.setMax(100);
//		seekBar.setProgress(50);
//
//		Drawable drawing1 = imageView1.getDrawable();
//		if (drawing1 == null) {
//			// return; // Checking for null & return, as suggested in comments
//		}
//		Bitmap bitmap1 = ((BitmapDrawable) drawing1).getBitmap();
//		bitmap1 = Bitmap.createScaledBitmap(bitmap1,
//				imageView1.getLayoutParams().width / 2,
//				imageView1.getLayoutParams().height / 2, false);
//		imageView1.setImageBitmap(bitmap1);
//
//		Bitmap bitmap2 = ((BitmapDrawable) drawing1).getBitmap();
//		bitmap2 = Bitmap.createScaledBitmap(bitmap2,
//				imageView2.getLayoutParams().width / 2,
//				imageView2.getLayoutParams().height / 2, false);
//		imageView2.setImageBitmap(bitmap2);
//
//		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
//			int progressChanged = 0;
//
//			@Override
//			public void onStopTrackingTouch(SeekBar seekBar) {
//				Toast.makeText(getActivity(),
//						"seek bar progress:" + progressChanged,
//						Toast.LENGTH_SHORT).show();
//
//			}
//
//			@Override
//			public void onStartTrackingTouch(SeekBar seekBar) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void onProgressChanged(SeekBar seekBar, int progress,
//					boolean fromUser) {
//				progressChanged = progress;
//
//
//				imageView1.setScaleX(1 + ((float) (progress - 50)) / 100.0f);
//				imageView1.setScaleY(1 + ((float) (progress - 50)) / 100.0f);
//
//				imageView2.setScaleX(1 + ((float) (50 - progress)) / 100.0f);
//				imageView2.setScaleY(1 + ((float) (50 - progress)) / 100.0f);
//
//
//			}
//		});
//
        return v;
    }

}
