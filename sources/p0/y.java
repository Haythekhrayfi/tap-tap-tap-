package p0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static PointerIcon a(Bitmap bitmap, float f10, float f11) {
        return PointerIcon.create(bitmap, f10, f11);
    }

    public static PointerIcon b(Context context, int i10) {
        return PointerIcon.getSystemIcon(context, i10);
    }

    public static PointerIcon c(Resources resources, int i10) {
        return PointerIcon.load(resources, i10);
    }
}
