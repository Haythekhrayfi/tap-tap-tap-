package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f10169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f10170c;

    public ac(View view, o oVar) {
        this.f10168a = oVar;
        this.f10169b = oVar.F();
        this.f10170c = view;
    }

    public long a(com.applovin.impl.mediation.a.e eVar) {
        if (y.a()) {
            this.f10169b.b("ViewabilityTracker", "Checking visibility...");
        }
        long j10 = 0;
        Point pointA = com.applovin.impl.sdk.utils.h.a(this.f10170c.getContext());
        if (!this.f10170c.isShown()) {
            if (y.a()) {
                this.f10169b.e("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        }
        if (this.f10170c.getAlpha() < eVar.R()) {
            if (y.a()) {
                this.f10169b.e("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f10170c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (y.a()) {
                this.f10169b.e("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f10170c.getParent() == null) {
            if (y.a()) {
                this.f10169b.e("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f10170c.getContext(), this.f10170c.getWidth());
        if (iPxToDp < Math.min(eVar.P(), pointA.x)) {
            if (y.a()) {
                this.f10169b.e("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f10170c.getContext(), this.f10170c.getHeight());
        if (iPxToDp2 < eVar.Q()) {
            if (y.a()) {
                this.f10169b.e("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Rect rect = new Rect(0, 0, pointA.x, pointA.y);
        int[] iArr = {-1, -1};
        this.f10170c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], this.f10170c.getWidth() + iArr[0], this.f10170c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (y.a()) {
                this.f10169b.e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity activityA = this.f10168a.E().a();
        if (activityA != null && !com.applovin.impl.sdk.utils.w.a(this.f10170c, activityA)) {
            if (y.a()) {
                this.f10169b.e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (y.a()) {
            y yVar = this.f10169b;
            StringBuilder sbA = defpackage.a.a("Returning flags: ");
            sbA.append(Long.toBinaryString(j10));
            yVar.b("ViewabilityTracker", sbA.toString());
        }
        return j10;
    }
}
