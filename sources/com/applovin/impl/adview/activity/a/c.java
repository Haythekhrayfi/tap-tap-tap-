package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.h;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.u;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.x;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    public c(e eVar, Activity activity, o oVar) {
        super(eVar, activity, oVar);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:24:0x0134  */
    /* JADX WARN: Code duplicated, block: B:26:0x0144  */
    /* JADX WARN: Code duplicated, block: B:27:0x014d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0186  */
    /* JADX WARN: Code duplicated, block: B:34:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x021c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0225  */
    /* JADX WARN: Code duplicated, block: B:49:0x026c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0291  */
    /* JADX WARN: Code duplicated, block: B:54:0x029b  */
    /* JADX WARN: Code duplicated, block: B:57:0x02de  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ef  */
    public void a(ImageView imageView, n nVar, final w wVar, com.applovin.impl.adview.a aVar, ProgressBar progressBar, h hVar, View view, AppLovinAdView appLovinAdView, v vVar, ImageView imageView2, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        com.applovin.impl.c.a aVar2;
        int i10;
        int i11;
        u uVarD;
        int height;
        int width;
        if (this.f8335c.aS() == e.d.TOP) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 48);
        } else {
            if (this.f8335c.aS() != e.d.BOTTOM) {
                if (this.f8335c.aS() == e.d.LEFT) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -1, 3);
                } else {
                    layoutParams = this.f8335c.aS() == e.d.RIGHT ? new FrameLayout.LayoutParams(-2, -1, 5) : this.f8337e;
                }
                if (this.f8335c.aP()) {
                    appLovinAdView.setLayoutParams(this.f8337e);
                    this.f8336d.addView(appLovinAdView);
                    View view2 = new View(this.f8334b);
                    view2.setLayoutParams(this.f8337e);
                    view2.setBackgroundColor(Color.argb(254, 0, 0, 0));
                    view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.activity.a.c.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view3, MotionEvent motionEvent) {
                            return true;
                        }
                    });
                    this.f8336d.addView(view2);
                    view.setLayoutParams(layoutParams);
                    this.f8336d.addView(view);
                } else {
                    view.setLayoutParams(layoutParams);
                    this.f8336d.addView(view);
                    appLovinAdView.setLayoutParams(this.f8337e);
                    this.f8336d.addView(appLovinAdView);
                    appLovinAdView.setVisibility(4);
                }
                if (wVar != null) {
                    uVarD = this.f8335c.D();
                    if (((Boolean) this.f8333a.a(com.applovin.impl.sdk.c.b.gP)).booleanValue()) {
                        LinearLayout linearLayout = new LinearLayout(this.f8334b);
                        linearLayout.setOrientation(1);
                        linearLayout.setWeightSum(100.0f);
                        linearLayout.setGravity(uVarD.d());
                        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                        LinearLayout linearLayout2 = new LinearLayout(this.f8334b);
                        linearLayout2.setOrientation(0);
                        linearLayout2.setWeightSum(100.0f);
                        linearLayout2.setGravity(uVarD.d());
                        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, 0, uVarD.b());
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1, uVarD.a());
                        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f8334b, uVarD.c());
                        layoutParams4.setMargins(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
                        linearLayout2.addView(wVar, layoutParams4);
                        linearLayout.addView(linearLayout2, layoutParams3);
                        this.f8336d.addView(linearLayout, layoutParams2);
                    } else {
                        double dA = ((double) uVarD.a()) / 100.0d;
                        double dB = ((double) uVarD.b()) / 100.0d;
                        if (viewGroup != null) {
                            width = viewGroup.getWidth();
                            height = viewGroup.getHeight();
                        } else {
                            Point pointA = com.applovin.impl.sdk.utils.h.a(this.f8334b);
                            int i12 = pointA.x;
                            height = pointA.y;
                            width = i12;
                        }
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) (((double) width) * dA), (int) (((double) height) * dB), uVarD.d());
                        int iDpToPx2 = AppLovinSdkUtils.dpToPx(this.f8334b, uVarD.c());
                        layoutParams5.setMargins(iDpToPx2, iDpToPx2, iDpToPx2, iDpToPx2);
                        this.f8336d.addView(wVar, layoutParams5);
                    }
                    if (uVarD.i() > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        wVar.setVisibility(4);
                        long jB = com.applovin.impl.sdk.utils.w.b(uVarD.i());
                        final long jG = uVarD.g();
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.adview.activity.a.c.2
                            @Override // java.lang.Runnable
                            public void run() {
                                x.a(wVar, jG, (Runnable) null);
                            }
                        }, jB);
                    }
                    if (uVarD.j() > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        long jB2 = com.applovin.impl.sdk.utils.w.b(uVarD.j());
                        final long jH = uVarD.h();
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.adview.activity.a.c.3
                            @Override // java.lang.Runnable
                            public void run() {
                                x.b(wVar, jH, null);
                            }
                        }, jB2);
                    }
                }
                if (nVar != null) {
                    if (this.f8335c.ah()) {
                        i10 = 48;
                        i11 = 3;
                    } else {
                        i10 = 48;
                        i11 = 5;
                    }
                    a(this.f8335c.ac(), i10 | i11, nVar);
                }
                if (imageView != null) {
                    int iDpToPx3 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cS)).intValue());
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cU)).intValue());
                    int iDpToPx4 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cT)).intValue());
                    layoutParams6.setMargins(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
                    this.f8336d.addView(imageView, layoutParams6);
                }
                if (aVar != null) {
                    this.f8336d.addView(aVar, this.f8337e);
                }
                if (hVar != null) {
                    int iDpToPx5 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cF)).intValue());
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(iDpToPx5, iDpToPx5, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cE)).intValue());
                    int iDpToPx6 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cD)).intValue());
                    layoutParams7.setMargins(iDpToPx6, iDpToPx6, iDpToPx6, iDpToPx6);
                    this.f8336d.addView(hVar, layoutParams7);
                }
                if (progressBar != null) {
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, 20, 80);
                    layoutParams8.setMargins(0, 0, 0, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cX)).intValue());
                    this.f8336d.addView(progressBar, layoutParams8);
                }
                if (imageView2 != null) {
                    aVar2 = (com.applovin.impl.c.a) this.f8335c;
                    if (aVar2.aX()) {
                        int iDpToPx7 = AppLovinSdkUtils.dpToPx(this.f8334b, aVar2.aW().c());
                        int iDpToPx8 = AppLovinSdkUtils.dpToPx(this.f8334b, aVar2.aW().d());
                        int iDpToPx9 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.fo)).intValue());
                        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(iDpToPx7, iDpToPx8, 83);
                        layoutParams9.setMargins(iDpToPx9, iDpToPx9, iDpToPx9, iDpToPx9);
                        this.f8336d.addView(imageView2, layoutParams9);
                    }
                }
                if (vVar != null) {
                    this.f8336d.addView(vVar, this.f8337e);
                }
                if (viewGroup != null) {
                    viewGroup.addView(this.f8336d);
                } else {
                    this.f8334b.setContentView(this.f8336d);
                }
            }
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        }
        if (this.f8335c.aP()) {
            appLovinAdView.setLayoutParams(this.f8337e);
            this.f8336d.addView(appLovinAdView);
            View view3 = new View(this.f8334b);
            view3.setLayoutParams(this.f8337e);
            view3.setBackgroundColor(Color.argb(254, 0, 0, 0));
            view3.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.activity.a.c.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view4, MotionEvent motionEvent) {
                    return true;
                }
            });
            this.f8336d.addView(view3);
            view.setLayoutParams(layoutParams);
            this.f8336d.addView(view);
        } else {
            view.setLayoutParams(layoutParams);
            this.f8336d.addView(view);
            appLovinAdView.setLayoutParams(this.f8337e);
            this.f8336d.addView(appLovinAdView);
            appLovinAdView.setVisibility(4);
        }
        if (wVar != null) {
            uVarD = this.f8335c.D();
            if (((Boolean) this.f8333a.a(com.applovin.impl.sdk.c.b.gP)).booleanValue()) {
                LinearLayout linearLayout3 = new LinearLayout(this.f8334b);
                linearLayout3.setOrientation(1);
                linearLayout3.setWeightSum(100.0f);
                linearLayout3.setGravity(uVarD.d());
                ViewGroup.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
                LinearLayout linearLayout4 = new LinearLayout(this.f8334b);
                linearLayout4.setOrientation(0);
                linearLayout4.setWeightSum(100.0f);
                linearLayout4.setGravity(uVarD.d());
                ViewGroup.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, 0, uVarD.b());
                LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(0, -1, uVarD.a());
                int iDpToPx10 = AppLovinSdkUtils.dpToPx(this.f8334b, uVarD.c());
                layoutParams12.setMargins(iDpToPx10, iDpToPx10, iDpToPx10, iDpToPx10);
                linearLayout4.addView(wVar, layoutParams12);
                linearLayout3.addView(linearLayout4, layoutParams11);
                this.f8336d.addView(linearLayout3, layoutParams10);
            } else {
                double dA2 = ((double) uVarD.a()) / 100.0d;
                double dB2 = ((double) uVarD.b()) / 100.0d;
                if (viewGroup != null) {
                    width = viewGroup.getWidth();
                    height = viewGroup.getHeight();
                } else {
                    Point pointA2 = com.applovin.impl.sdk.utils.h.a(this.f8334b);
                    int i13 = pointA2.x;
                    height = pointA2.y;
                    width = i13;
                }
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((int) (((double) width) * dA2), (int) (((double) height) * dB2), uVarD.d());
                int iDpToPx11 = AppLovinSdkUtils.dpToPx(this.f8334b, uVarD.c());
                layoutParams13.setMargins(iDpToPx11, iDpToPx11, iDpToPx11, iDpToPx11);
                this.f8336d.addView(wVar, layoutParams13);
            }
            if (uVarD.i() > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                wVar.setVisibility(4);
                long jB3 = com.applovin.impl.sdk.utils.w.b(uVarD.i());
                final long jG2 = uVarD.g();
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.adview.activity.a.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        x.a(wVar, jG2, (Runnable) null);
                    }
                }, jB3);
            }
            if (uVarD.j() > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                long jB4 = com.applovin.impl.sdk.utils.w.b(uVarD.j());
                final long jH2 = uVarD.h();
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.adview.activity.a.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        x.b(wVar, jH2, null);
                    }
                }, jB4);
            }
        }
        if (nVar != null) {
            if (this.f8335c.ah()) {
                i10 = 48;
                i11 = 3;
            } else {
                i10 = 48;
                i11 = 5;
            }
            a(this.f8335c.ac(), i10 | i11, nVar);
        }
        if (imageView != null) {
            int iDpToPx12 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cS)).intValue());
            FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(iDpToPx12, iDpToPx12, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cU)).intValue());
            int iDpToPx13 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cT)).intValue());
            layoutParams14.setMargins(iDpToPx13, iDpToPx13, iDpToPx13, iDpToPx13);
            this.f8336d.addView(imageView, layoutParams14);
        }
        if (aVar != null) {
            this.f8336d.addView(aVar, this.f8337e);
        }
        if (hVar != null) {
            int iDpToPx14 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cF)).intValue());
            FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(iDpToPx14, iDpToPx14, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cE)).intValue());
            int iDpToPx15 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cD)).intValue());
            layoutParams15.setMargins(iDpToPx15, iDpToPx15, iDpToPx15, iDpToPx15);
            this.f8336d.addView(hVar, layoutParams15);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, 20, 80);
            layoutParams16.setMargins(0, 0, 0, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.cX)).intValue());
            this.f8336d.addView(progressBar, layoutParams16);
        }
        if (imageView2 != null) {
            aVar2 = (com.applovin.impl.c.a) this.f8335c;
            if (aVar2.aX()) {
                int iDpToPx16 = AppLovinSdkUtils.dpToPx(this.f8334b, aVar2.aW().c());
                int iDpToPx17 = AppLovinSdkUtils.dpToPx(this.f8334b, aVar2.aW().d());
                int iDpToPx18 = AppLovinSdkUtils.dpToPx(this.f8334b, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.fo)).intValue());
                FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(iDpToPx16, iDpToPx17, 83);
                layoutParams17.setMargins(iDpToPx18, iDpToPx18, iDpToPx18, iDpToPx18);
                this.f8336d.addView(imageView2, layoutParams17);
            }
        }
        if (vVar != null) {
            this.f8336d.addView(vVar, this.f8337e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f8336d);
        } else {
            this.f8334b.setContentView(this.f8336d);
        }
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(n nVar) {
        super.a(nVar);
    }

    public void a(n nVar, v vVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        com.applovin.impl.sdk.utils.c.a(this.f8336d, view);
        if (nVar != null) {
            a(this.f8335c.ac(), (this.f8335c.ag() ? 3 : 5) | 48, nVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.f8333a.a(com.applovin.impl.sdk.c.b.dg)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f8333a.a(com.applovin.impl.sdk.c.b.dh)).intValue());
            this.f8336d.addView(progressBar, layoutParams);
        }
        if (vVar != null) {
            this.f8336d.addView(vVar, this.f8337e);
        }
    }
}
