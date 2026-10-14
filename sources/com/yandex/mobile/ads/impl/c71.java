package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class c71 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, dp0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f19407c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GestureDetector f19409e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f19405a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f19406b = new PointF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f19408d = 25.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile float f19410f = 3.1415927f;

    public interface a {
    }

    public c71(Context context, a aVar) {
        this.f19407c = aVar;
        this.f19409e = new GestureDetector(context, this);
    }

    @Override // com.yandex.mobile.ads.impl.dp0.a
    public final void a(float[] fArr, float f10) {
        this.f19410f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f19405a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f19405a.x) / this.f19408d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f19405a;
        float f12 = (y10 - pointF.y) / this.f19408d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f19410f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f19406b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        ((w31.a) this.f19407c).a(this.f19406b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return w31.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f19409e.onTouchEvent(motionEvent);
    }
}
