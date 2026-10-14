package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1194a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f1197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f1198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0 f1199f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1196c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1195b = j.a();

    public e(View view) {
        this.f1194a = view;
    }

    public void a() {
        Drawable background = this.f1194a.getBackground();
        if (background != null) {
            boolean z10 = true;
            if (this.f1197d != null) {
                if (this.f1199f == null) {
                    this.f1199f = new w0();
                }
                w0 w0Var = this.f1199f;
                w0Var.f1389a = null;
                w0Var.f1392d = false;
                w0Var.f1390b = null;
                w0Var.f1391c = false;
                View view = this.f1194a;
                WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                ColorStateList colorStateListG = p0.e0.i.g(view);
                if (colorStateListG != null) {
                    w0Var.f1392d = true;
                    w0Var.f1389a = colorStateListG;
                }
                PorterDuff.Mode modeH = p0.e0.i.h(this.f1194a);
                if (modeH != null) {
                    w0Var.f1391c = true;
                    w0Var.f1390b = modeH;
                }
                if (w0Var.f1392d || w0Var.f1391c) {
                    j.f(background, w0Var, this.f1194a.getDrawableState());
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            w0 w0Var2 = this.f1198e;
            if (w0Var2 != null) {
                j.f(background, w0Var2, this.f1194a.getDrawableState());
                return;
            }
            w0 w0Var3 = this.f1197d;
            if (w0Var3 != null) {
                j.f(background, w0Var3, this.f1194a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        w0 w0Var = this.f1198e;
        if (w0Var != null) {
            return w0Var.f1389a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        w0 w0Var = this.f1198e;
        if (w0Var != null) {
            return w0Var.f1390b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i10) {
        Context context = this.f1194a.getContext();
        int[] iArr = d.a.A;
        y0 y0VarR = y0.r(context, attributeSet, iArr, i10, 0);
        View view = this.f1194a;
        p0.e0.p(view, view.getContext(), iArr, attributeSet, y0VarR.f1412b, i10, 0);
        try {
            if (y0VarR.p(0)) {
                this.f1196c = y0VarR.m(0, -1);
                ColorStateList colorStateListD = this.f1195b.d(this.f1194a.getContext(), this.f1196c);
                if (colorStateListD != null) {
                    g(colorStateListD);
                }
            }
            if (y0VarR.p(1)) {
                p0.e0.i.q(this.f1194a, y0VarR.c(1));
            }
            if (y0VarR.p(2)) {
                p0.e0.i.r(this.f1194a, c0.d(y0VarR.j(2, -1), null));
            }
        } finally {
            y0VarR.f1412b.recycle();
        }
    }

    public void e() {
        this.f1196c = -1;
        g(null);
        a();
    }

    public void f(int i10) {
        this.f1196c = i10;
        j jVar = this.f1195b;
        g(jVar != null ? jVar.d(this.f1194a.getContext(), i10) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1197d == null) {
                this.f1197d = new w0();
            }
            w0 w0Var = this.f1197d;
            w0Var.f1389a = colorStateList;
            w0Var.f1392d = true;
        } else {
            this.f1197d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f1198e == null) {
            this.f1198e = new w0();
        }
        w0 w0Var = this.f1198e;
        w0Var.f1389a = colorStateList;
        w0Var.f1392d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f1198e == null) {
            this.f1198e = new w0();
        }
        w0 w0Var = this.f1198e;
        w0Var.f1390b = mode;
        w0Var.f1391c = true;
        a();
    }
}
