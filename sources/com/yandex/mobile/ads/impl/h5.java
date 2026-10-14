package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
final class h5 {
    public static TextView a(Context context) {
        TextView textView = new TextView(context, null, R.style.Widget.TextView);
        float fA = i5.f21599c.a(context);
        int i10 = eh1.f20253b;
        textView.setTextSize(0, y11.a(context, 1, fA));
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.SANS_SERIF);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setHorizontallyScrolling(false);
        textView.setHorizontalFadingEdgeEnabled(false);
        textView.setVerticalScrollBarEnabled(false);
        textView.setVerticalFadingEdgeEnabled(false);
        textView.setTextColor(context.getResources().getColor(R.color.primary_text_light));
        int iRound = Math.round(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        textView.setPadding(iRound, 0, iRound, 0);
        return textView;
    }

    public static ProgressBar b(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        progressBar.setProgressDrawable(f5.f20552b);
        progressBar.setProgress(0);
        progressBar.setMax(10000);
        return progressBar;
    }
}
