package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class NoStrikethroughSpan extends StrikethroughSpan {
    @Override // android.text.style.StrikethroughSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j0.i(textPaint, "ds");
        textPaint.setStrikeThruText(false);
    }
}
