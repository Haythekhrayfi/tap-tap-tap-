package r1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class w extends v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f35143d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f35144e = true;

    @Override // r1.a0
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f35143d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f35143d = false;
            }
        }
    }

    @Override // r1.a0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f35144e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f35144e = false;
            }
        }
    }
}
