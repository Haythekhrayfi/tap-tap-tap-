package r1;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class v extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f35142c = true;

    @Override // r1.a0
    public void a(View view) {
    }

    @Override // r1.a0
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f35142c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f35142c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // r1.a0
    public void c(View view) {
    }

    @Override // r1.a0
    @SuppressLint({"NewApi"})
    public void e(View view, float f10) {
        if (f35142c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f35142c = false;
            }
        }
        view.setAlpha(f10);
    }
}
