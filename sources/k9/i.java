package k9;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DisplayMetrics f31952a = Resources.getSystem().getDisplayMetrics();

    public static final float a(float f10) {
        return f10 * f31952a.density;
    }

    public static final int b(int i10) {
        return xc.b.c(i10 * f31952a.density);
    }
}
