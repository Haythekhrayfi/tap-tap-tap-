package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class m61 extends Spannable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f22922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22924c;

    public m61(Drawable drawable, int i10, int i11) {
        this.f22922a = drawable;
        this.f22923b = i10;
        this.f22924c = i11;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f22922a != null && this.f22923b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f22922a;
            int i10 = this.f22923b;
            drawable.setBounds(0, 0, i10, i10);
            s8 s8Var = new s8(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i11 = this.f22924c;
            colorDrawable.setBounds(0, 0, i11, i11);
            s8 s8Var2 = new s8(colorDrawable);
            spannableStringBuilder.setSpan(s8Var, 0, 1, 33);
            spannableStringBuilder.setSpan(s8Var2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
