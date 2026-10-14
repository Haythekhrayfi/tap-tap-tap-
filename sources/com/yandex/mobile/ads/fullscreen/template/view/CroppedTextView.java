package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class CroppedTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18741a;

    public CroppedTextView(Context context) {
        this(context, null);
    }

    public CroppedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CroppedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18741a = getMaxLines();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = getMeasuredHeight();
        int lineHeight = getLineHeight();
        int minLines = getMinLines();
        int maxLines = getMaxLines();
        if (lineHeight > 0) {
            int iMin = Math.min((Math.round(getLineHeight() * 0.05f) + measuredHeight) / lineHeight, this.f18741a);
            if (iMin == minLines && iMin == maxLines) {
                return;
            }
            setLines(iMin);
            TextUtils.TruncateAt ellipsize = getEllipsize();
            setEllipsize(null);
            setEllipsize(ellipsize);
        }
    }
}
