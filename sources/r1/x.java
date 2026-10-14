package r1;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class x extends w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f35145f = true;

    @Override // r1.a0
    @SuppressLint({"NewApi"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f35145f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f35145f = false;
            }
        }
    }
}
