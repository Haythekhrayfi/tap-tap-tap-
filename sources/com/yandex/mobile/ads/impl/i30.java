package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i30 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f21581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zf f21582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f21583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View.OnClickListener f21584d;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = !i30.this.f21582b.isSelected();
            i30.this.f21582b.setSelected(z10);
            i30.this.f21583c.setVisibility(z10 ? 0 : 8);
        }
    }

    public i30(Context context) {
        super(context);
        this.f21584d = new a();
        this.f21581a = new hp();
        a(context);
    }

    private void a(Context context) {
        setOrientation(0);
        Objects.requireNonNull(this.f21581a);
        int iRound = Math.round(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        setPadding(iRound, iRound, iRound, iRound);
        zf zfVar = new zf(context, this.f21581a);
        this.f21582b = zfVar;
        zfVar.setOnClickListener(this.f21584d);
        addView(this.f21582b);
        this.f21583c = new TextView(context);
        Objects.requireNonNull(this.f21581a);
        int iRound2 = Math.round(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f21583c.setPadding(iRound2, iRound2, iRound2, iRound2);
        Objects.requireNonNull(this.f21581a);
        int iRound3 = Math.round(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(iRound3, -65536);
        this.f21583c.setBackgroundDrawable(gradientDrawable);
        addView(this.f21583c);
        Objects.requireNonNull(this.f21581a);
        int iRound4 = Math.round(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21583c.getLayoutParams();
        layoutParams.setMargins(iRound4, 0, iRound4, iRound4);
        this.f21583c.setLayoutParams(layoutParams);
        this.f21583c.setVisibility(8);
    }

    public void setDescription(String str) {
        this.f21583c.setText(str);
    }
}
