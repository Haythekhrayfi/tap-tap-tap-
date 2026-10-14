package r1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class y extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f35146g = true;

    @Override // r1.a0
    @SuppressLint({"NewApi"})
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f35146g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f35146g = false;
            }
        }
    }
}
