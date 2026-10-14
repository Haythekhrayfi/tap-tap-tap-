package r1;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class z extends y {
    @Override // r1.v, r1.a0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // r1.x, r1.a0
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // r1.v, r1.a0
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // r1.y, r1.a0
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // r1.w, r1.a0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // r1.w, r1.a0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
