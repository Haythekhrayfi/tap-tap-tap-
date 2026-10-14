package com.yandex.div.core.view2.divs;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import fd.j0;
import y9.o7;
import y9.q7;

/* JADX INFO: loaded from: classes2.dex */
public final class DivBackgroundSpan extends UnderlineSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q7 f13419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o7 f13420d;

    public DivBackgroundSpan(q7 q7Var, o7 o7Var) {
        this.f13419c = q7Var;
        this.f13420d = o7Var;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j0.i(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}
