package h8;

import android.graphics.Canvas;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import fd.j0;
import y9.o7;
import y9.q7;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f30968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.d f30969b;

    public e(View view, v9.d dVar) {
        j0.i(view, "view");
        j0.i(dVar, "resolver");
        this.f30968a = view;
        this.f30969b = dVar;
    }

    @Override // h8.c
    public void a(Canvas canvas, Layout layout, int i10, int i11, int i12, int i13, q7 q7Var, o7 o7Var) {
        int iC = c(layout, i10);
        int iB = b(layout, i10);
        int iMin = Math.min(i12, i13);
        int iMax = Math.max(i12, i13);
        DisplayMetrics displayMetrics = this.f30968a.getResources().getDisplayMetrics();
        j0.h(displayMetrics, "view.resources.displayMetrics");
        a aVar = new a(displayMetrics, q7Var, o7Var, canvas, this.f30969b);
        aVar.a(aVar.f30958g, iMin, iC, iMax, iB);
    }
}
