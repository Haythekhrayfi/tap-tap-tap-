package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckedTextView f1227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1228b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1229c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1230d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1231e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1232f;

    public h(CheckedTextView checkedTextView) {
        this.f1227a = checkedTextView;
    }

    public void a() {
        Drawable checkMarkDrawable = this.f1227a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1230d || this.f1231e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1230d) {
                    androidx.core.graphics.drawable.a.b.h(drawableMutate, this.f1228b);
                }
                if (this.f1231e) {
                    androidx.core.graphics.drawable.a.b.i(drawableMutate, this.f1229c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1227a.getDrawableState());
                }
                this.f1227a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
