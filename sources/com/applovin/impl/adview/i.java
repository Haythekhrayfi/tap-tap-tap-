package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class i extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f8548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f8549b;

    public i(Context context) {
        super(context);
        this.f8549b = new PointF();
        if (f8548a == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f8548a = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.y.j("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f8548a = Boolean.FALSE;
            }
        }
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.f8549b;
        this.f8549b = new PointF();
        return pointF;
    }

    public PointF getLastClickLocation() {
        return this.f8549b;
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f8549b = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        if (f8548a.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
