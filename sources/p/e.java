package p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f34334a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10;
        }
        return (float) (((1.0d - f34334a) * ((double) f11)) + ((double) f10));
    }

    public static float b(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        if (!z10) {
            return f12;
        }
        return (float) (((1.0d - f34334a) * ((double) f11)) + ((double) f12));
    }
}
