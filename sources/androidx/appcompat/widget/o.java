package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f1310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0 f1311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1312c = 0;

    public o(ImageView imageView) {
        this.f1310a = imageView;
    }

    public void a() {
        w0 w0Var;
        Drawable drawable = this.f1310a.getDrawable();
        if (drawable != null) {
            c0.a(drawable);
        }
        if (drawable == null || (w0Var = this.f1311b) == null) {
            return;
        }
        j.f(drawable, w0Var, this.f1310a.getDrawableState());
    }

    public void b(AttributeSet attributeSet, int i10) {
        int iM;
        Context context = this.f1310a.getContext();
        int[] iArr = d.a.f28464f;
        y0 y0VarR = y0.r(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1310a;
        p0.e0.p(imageView, imageView.getContext(), iArr, attributeSet, y0VarR.f1412b, i10, 0);
        try {
            Drawable drawable = this.f1310a.getDrawable();
            if (drawable == null && (iM = y0VarR.m(1, -1)) != -1 && (drawable = e.a.b(this.f1310a.getContext(), iM)) != null) {
                this.f1310a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c0.a(drawable);
            }
            if (y0VarR.p(2)) {
                androidx.core.widget.e.c(this.f1310a, y0VarR.c(2));
            }
            if (y0VarR.p(3)) {
                androidx.core.widget.e.d(this.f1310a, c0.d(y0VarR.j(3, -1), null));
            }
        } finally {
            y0VarR.f1412b.recycle();
        }
    }

    public void c(int i10) {
        if (i10 != 0) {
            Drawable drawableB = e.a.b(this.f1310a.getContext(), i10);
            if (drawableB != null) {
                c0.a(drawableB);
            }
            this.f1310a.setImageDrawable(drawableB);
        } else {
            this.f1310a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.f1311b == null) {
            this.f1311b = new w0();
        }
        w0 w0Var = this.f1311b;
        w0Var.f1389a = colorStateList;
        w0Var.f1392d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.f1311b == null) {
            this.f1311b = new w0();
        }
        w0 w0Var = this.f1311b;
        w0Var.f1390b = mode;
        w0Var.f1391c = true;
        a();
    }
}
