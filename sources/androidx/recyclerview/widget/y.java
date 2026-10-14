package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.o f2794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2795b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2796c = new Rect();

    public y(RecyclerView.o oVar, w wVar) {
        this.f2794a = oVar;
    }

    public static y a(RecyclerView.o oVar, int i10) {
        if (i10 == 0) {
            return new w(oVar);
        }
        if (i10 == 1) {
            return new x(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f2795b) {
            return 0;
        }
        return l() - this.f2795b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i10);
}
