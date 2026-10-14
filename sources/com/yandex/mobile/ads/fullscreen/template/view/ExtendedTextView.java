package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.n9;
import com.yandex.mobile.ads.impl.q11;
import com.yandex.mobile.ads.impl.sa0;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sa0 f18742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n9 f18743b;

    public ExtendedTextView(Context context) {
        this(context, null);
    }

    public ExtendedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18742a = new q11();
        this.f18743b = new n9(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n9 n9Var;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((Build.VERSION.SDK_INT >= 27) || (n9Var = this.f18743b) == null) {
            return;
        }
        n9Var.a();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        sa0.a aVarA = this.f18742a.a(i10, i11);
        super.onMeasure(aVarA.f25006a, aVarA.f25007b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        n9 n9Var;
        super.onTextChanged(charSequence, i10, i11, i12);
        if ((Build.VERSION.SDK_INT >= 27) || (n9Var = this.f18743b) == null) {
            return;
        }
        n9Var.b();
    }

    public void setAutoSizeTextType(int i10) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        n9 n9Var = this.f18743b;
        if (n9Var != null) {
            n9Var.a(i10);
        }
    }

    public void setMeasureSpecProvider(sa0 sa0Var) {
        this.f18742a = sa0Var;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(i10, f10);
            return;
        }
        n9 n9Var = this.f18743b;
        if (n9Var != null) {
            n9Var.a(i10, f10);
        }
    }
}
