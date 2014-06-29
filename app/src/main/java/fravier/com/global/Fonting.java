package fravier.com.global;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by francis on 6/29/2014.
 */
public class Fonting {
    public static int KEY_CONDENSED = 1;
    public static int KEY_LIGHT = 0;
    public static int KEY_REGULAR = 2;
    private static Typeface typeface;

    public static Typeface getFont(Context paramContext, int paramInt) {
        if (paramInt == 0) {
            typeface = Typeface.createFromAsset(paramContext.getAssets(), "fonts/Roboto-Light.ttf");
        } else if (paramInt == 1) {
            typeface = Typeface.createFromAsset(paramContext.getAssets(), "fonts/Roboto-Condensed.ttf");
        } else if (paramInt == 2) {
            typeface = Typeface.createFromAsset(paramContext.getAssets(), "fonts/Roboto-Regular.ttf");
        }
        return typeface;

    }

    public static void setTypeFaceForViewGroup(ViewGroup vg, Context ctx,
                                               int key) {

        for (int i = 0; i < vg.getChildCount(); i++) {

            if (vg.getChildAt(i) instanceof ViewGroup)
                setTypeFaceForViewGroup((ViewGroup) vg.getChildAt(i), ctx, key);

            else if (vg.getChildAt(i) instanceof TextView)
                ((TextView) vg.getChildAt(i)).setTypeface(getFont(ctx, key));

        }

    }
}
