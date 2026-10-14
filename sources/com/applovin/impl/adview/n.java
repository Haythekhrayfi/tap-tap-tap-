package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class n extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f8581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8582b;

    public n(j.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        j jVarA = j.a(aVar, activity);
        this.f8581a = jVarA;
        addView(jVarA);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f8582b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f8581a.setLayoutParams(layoutParams2);
        this.f8581a.a(i10);
    }

    public void a(j.a aVar) {
        if (aVar == null || aVar == this.f8581a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f8581a.getLayoutParams();
        removeView(this.f8581a);
        j jVarA = j.a(aVar, getContext());
        this.f8581a = jVarA;
        addView(jVarA);
        this.f8581a.setLayoutParams(layoutParams);
        this.f8581a.a(this.f8582b);
    }
}
