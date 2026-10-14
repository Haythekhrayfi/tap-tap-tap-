package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f1262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1263b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1264c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1265d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1266e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1267f;

    public i(CompoundButton compoundButton) {
        this.f1262a = compoundButton;
    }

    public void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f1262a);
        if (drawableA != null) {
            if (this.f1265d || this.f1266e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f1265d) {
                    androidx.core.graphics.drawable.a.b.h(drawableMutate, this.f1263b);
                }
                if (this.f1266e) {
                    androidx.core.graphics.drawable.a.b.i(drawableMutate, this.f1264c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1262a.getDrawableState());
                }
                this.f1262a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b(AttributeSet attributeSet, int i10) {
        int iM;
        int iM2;
        Context context = this.f1262a.getContext();
        int[] iArr = d.a.f28471m;
        y0 y0VarR = y0.r(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f1262a;
        p0.e0.p(compoundButton, compoundButton.getContext(), iArr, attributeSet, y0VarR.f1412b, i10, 0);
        boolean z10 = true;
        try {
            if (!y0VarR.p(1) || (iM2 = y0VarR.m(1, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1262a;
                    compoundButton2.setButtonDrawable(e.a.b(compoundButton2.getContext(), iM2));
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10 && y0VarR.p(0) && (iM = y0VarR.m(0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f1262a;
                compoundButton3.setButtonDrawable(e.a.b(compoundButton3.getContext(), iM));
            }
            if (y0VarR.p(2)) {
                androidx.core.widget.b.c(this.f1262a, y0VarR.c(2));
            }
            if (y0VarR.p(3)) {
                androidx.core.widget.b.d(this.f1262a, c0.d(y0VarR.j(3, -1), null));
            }
        } finally {
            y0VarR.f1412b.recycle();
        }
    }
}
