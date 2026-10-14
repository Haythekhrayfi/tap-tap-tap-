package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f8305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f8307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f8309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnClickListener f8310i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, PointF pointF);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.o oVar, com.applovin.impl.sdk.c.b<Integer> bVar, Context context, OnClickListener onClickListener) {
        this.f8302a = ((Long) oVar.a(com.applovin.impl.sdk.c.b.aZ)).longValue();
        this.f8303b = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.f10347ba)).intValue();
        this.f8304c = AppLovinSdkUtils.dpToPx(context, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.f10350bd)).intValue());
        this.f8305d = ClickRecognitionState.values()[((Integer) oVar.a(bVar)).intValue()];
        this.f8309h = context;
        this.f8310i = onClickListener;
    }

    private float a(float f10) {
        return f10 / this.f8309h.getResources().getDisplayMetrics().density;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f11 * f11) + (f10 * f10)));
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f8310i.onClick(view, new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
        this.f8308g = true;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f8304c <= 0) {
            return true;
        }
        Point pointA = com.applovin.impl.sdk.utils.h.a(this.f8309h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f8304c;
        return rawX >= ((float) i10) && rawY >= ((float) i10) && rawX <= ((float) (pointA.x - i10)) && rawY <= ((float) (pointA.y - i10));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f8308g && this.f8305d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f8308g && this.f8305d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f8305d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8306e;
                float fA = a(this.f8307f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f8308g) {
                    long j10 = this.f8302a;
                    if ((j10 < 0 || jElapsedRealtime < j10) && ((i10 = this.f8303b) < 0 || fA < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f8305d != ClickRecognitionState.ACTION_DOWN) {
            this.f8306e = SystemClock.elapsedRealtime();
            this.f8307f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f8308g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }
}
