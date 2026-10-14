package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
class m extends Dialog implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f8568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f8570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f8571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f8572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f8573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f8574g;

    public m(com.applovin.impl.sdk.ad.a aVar, d dVar, Activity activity, com.applovin.impl.sdk.o oVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f8569b = oVar;
        this.f8570c = oVar.F();
        this.f8568a = activity;
        this.f8571d = dVar;
        this.f8572e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f8568a, i10);
    }

    private void a(j.a aVar) {
        if (this.f8574g != null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f8570c.d("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        j jVarA = j.a(aVar, this.f8568a);
        this.f8574g = jVarA;
        jVarA.setVisibility(8);
        this.f8574g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.m.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m.this.d();
            }
        });
        this.f8574g.setClickable(false);
        int iA = a(((Integer) this.f8569b.a(com.applovin.impl.sdk.c.b.cm)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.o oVar = this.f8569b;
        com.applovin.impl.sdk.c.b<Boolean> bVar = com.applovin.impl.sdk.c.b.cp;
        layoutParams.addRule(((Boolean) oVar.a(bVar)).booleanValue() ? 9 : 11);
        this.f8574g.a(iA);
        int iA2 = a(((Integer) this.f8569b.a(com.applovin.impl.sdk.c.b.co)).intValue());
        int iA3 = a(((Integer) this.f8569b.a(com.applovin.impl.sdk.c.b.cn)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f8573f.addView(this.f8574g, layoutParams);
        this.f8574g.bringToFront();
        int iA4 = a(((Integer) this.f8569b.a(com.applovin.impl.sdk.c.b.cq)).intValue());
        View view = new View(this.f8568a);
        view.setBackgroundColor(0);
        int i10 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f8569b.a(bVar)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.m.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (m.this.f8574g.isClickable()) {
                    m.this.f8574g.performClick();
                }
            }
        });
        this.f8573f.addView(view, layoutParams2);
        view.bringToFront();
    }

    private void c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f8571d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f8568a);
        this.f8573f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f8573f.setBackgroundColor(-1157627904);
        this.f8573f.addView(this.f8571d);
        if (!this.f8572e.m()) {
            a(this.f8572e.n());
            e();
        }
        setContentView(this.f8573f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f8571d.a("javascript:al_onCloseTapped();");
        dismiss();
    }

    private void e() {
        this.f8568a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.m.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (m.this.f8574g == null) {
                        m.this.d();
                    }
                    m.this.f8574g.setVisibility(0);
                    m.this.f8574g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.m.5.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            m.this.f8574g.setClickable(true);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    m.this.f8574g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y unused = m.this.f8570c;
                    if (com.applovin.impl.sdk.y.a()) {
                        m.this.f8570c.b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    m.this.d();
                }
            }
        });
    }

    public com.applovin.impl.sdk.ad.a a() {
        return this.f8572e;
    }

    public d b() {
        return this.f8571d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.adview.l
    public void dismiss() {
        com.applovin.impl.sdk.d.d statsManagerHelper = this.f8571d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.e();
        }
        this.f8568a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.m.2
            @Override // java.lang.Runnable
            public void run() {
                m.this.f8573f.removeView(m.this.f8571d);
                m.super.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f8571d.a("javascript:al_onBackPressed();", new Runnable() { // from class: com.applovin.impl.adview.m.1
            @Override // java.lang.Runnable
            public void run() {
                m.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f8568a.getWindow().getAttributes().flags, this.f8568a.getWindow().getAttributes().flags);
                window.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else if (com.applovin.impl.sdk.y.a()) {
                this.f8570c.e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f8570c.b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }
}
