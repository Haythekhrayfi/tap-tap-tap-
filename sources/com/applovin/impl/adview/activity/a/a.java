package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.n;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.o;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f8333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f8334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f8335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f8336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout.LayoutParams f8337e;

    public a(e eVar, Activity activity, o oVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f8337e = layoutParams;
        this.f8335c = eVar;
        this.f8333a = oVar;
        this.f8334b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f8336d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f8336d.removeView(view);
    }

    public void a(n nVar) {
        if (nVar == null || nVar.getParent() != null) {
            return;
        }
        a(this.f8335c.ac(), (this.f8335c.ag() ? 3 : 5) | 48, nVar);
    }

    public void a(e.c cVar, int i10, n nVar) {
        nVar.a(cVar.f10235a, cVar.f10239e, cVar.f10238d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(nVar.getLayoutParams());
        int i11 = cVar.f10237c;
        layoutParams.setMargins(i11, cVar.f10236b, i11, 0);
        layoutParams.gravity = i10;
        this.f8336d.addView(nVar, layoutParams);
    }
}
