package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class u extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f1363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f1365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1368i;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.f1365f = null;
        this.f1366g = null;
        this.f1367h = false;
        this.f1368i = false;
        this.f1363d = seekBar;
    }

    @Override // androidx.appcompat.widget.r
    public void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, i10);
        Context context = this.f1363d.getContext();
        int[] iArr = d.a.f28465g;
        y0 y0VarR = y0.r(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1363d;
        p0.e0.p(seekBar, seekBar.getContext(), iArr, attributeSet, y0VarR.f1412b, i10, 0);
        Drawable drawableH = y0VarR.h(0);
        if (drawableH != null) {
            this.f1363d.setThumb(drawableH);
        }
        Drawable drawableG = y0VarR.g(1);
        Drawable drawable = this.f1364e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1364e = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this.f1363d);
            SeekBar seekBar2 = this.f1363d;
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            androidx.core.graphics.drawable.a.c.b(drawableG, p0.e0.e.d(seekBar2));
            if (drawableG.isStateful()) {
                drawableG.setState(this.f1363d.getDrawableState());
            }
            c();
        }
        this.f1363d.invalidate();
        if (y0VarR.p(3)) {
            this.f1366g = c0.d(y0VarR.j(3, -1), this.f1366g);
            this.f1368i = true;
        }
        if (y0VarR.p(2)) {
            this.f1365f = y0VarR.c(2);
            this.f1367h = true;
        }
        y0VarR.f1412b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1364e;
        if (drawable != null) {
            if (this.f1367h || this.f1368i) {
                Drawable drawableMutate = drawable.mutate();
                this.f1364e = drawableMutate;
                if (this.f1367h) {
                    androidx.core.graphics.drawable.a.b.h(drawableMutate, this.f1365f);
                }
                if (this.f1368i) {
                    androidx.core.graphics.drawable.a.b.i(this.f1364e, this.f1366g);
                }
                if (this.f1364e.isStateful()) {
                    this.f1364e.setState(this.f1363d.getDrawableState());
                }
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f1364e != null) {
            int max = this.f1363d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1364e.getIntrinsicWidth();
                int intrinsicHeight = this.f1364e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1364e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1363d.getWidth() - this.f1363d.getPaddingLeft()) - this.f1363d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1363d.getPaddingLeft(), this.f1363d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1364e.draw(canvas);
                    canvas.translate(width, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
