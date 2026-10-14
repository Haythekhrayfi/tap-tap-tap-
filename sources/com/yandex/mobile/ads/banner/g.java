package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.s;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.fh1;
import com.yandex.mobile.ads.impl.i01;
import com.yandex.mobile.ads.impl.nz0;
import com.yandex.mobile.ads.impl.qd;
import com.yandex.mobile.ads.impl.r90;
import com.yandex.mobile.ads.impl.t6;
import com.yandex.mobile.ads.impl.t90;
import com.yandex.mobile.ads.impl.u60;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.vh;
import com.yandex.mobile.ads.impl.w3;
import com.yandex.mobile.ads.impl.x60;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r90 f18141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t90 f18142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f18143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f18144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f18145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18147g;

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18141a = new r90();
        t90 t90Var = new t90(context);
        this.f18142b = t90Var;
        t90Var.a();
        this.f18145e = new ArrayList();
        w3 w3Var = new w3();
        d dVar = new d(context, w3Var);
        e eVarA = a(context, dVar, w3Var);
        this.f18143c = eVarA;
        dVar.a(eVarA.d());
        h hVarA = a();
        this.f18144d = hVarA;
        hVarA.a(context, this);
    }

    private h a() {
        return i.a(this, this.f18143c);
    }

    private void a(int i10) {
        x60.d(u60.a("onVisibilityChanged(), visibility = ", i10), new Object[0]);
        if (t6.a((vh) this.f18143c)) {
            return;
        }
        Iterator it = this.f18145e.iterator();
        while (it.hasNext()) {
            ((fh1) it.next()).a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequest adRequest) {
        this.f18143c.b(adRequest);
    }

    public abstract e a(Context context, d dVar, w3 w3Var);

    public void addVisibilityChangeListener(fh1 fh1Var) {
        this.f18145e.add(fh1Var);
    }

    public void destroy() {
        this.f18142b.a();
        this.f18141a.a();
        this.f18145e.clear();
        if (t6.a((vh) this.f18143c)) {
            return;
        }
        this.f18143c.x();
    }

    public AdSize getAdSize() {
        this.f18142b.a();
        SizeInfo sizeInfoA = qd.a(this.f18143c);
        if (sizeInfoA != null) {
            return new AdSize(sizeInfoA.e(), sizeInfoA.c(), sizeInfoA.d());
        }
        return null;
    }

    public int getHeightMeasureSpec() {
        return this.f18147g;
    }

    public VideoController getVideoController() {
        this.f18142b.a();
        return this.f18143c.z();
    }

    public int getWidthMeasureSpec() {
        return this.f18146f;
    }

    public void loadAd(AdRequest adRequest) {
        this.f18142b.a();
        this.f18141a.a(new s(this, adRequest));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sbA = v60.a("onAttachedToWindow(), clazz = ");
        sbA.append(getClass());
        x60.d(sbA.toString(), new Object[0]);
        h hVar = this.f18144d;
        getContext();
        hVar.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!t6.a((vh) this.f18143c)) {
            setVisibility(this.f18143c.w() ? 0 : 8);
        }
        x60.d("Ad view configuration is changed: %s", configuration.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder sbA = v60.a("onDetachedFromWindow(), clazz = ");
        sbA.append(getClass());
        x60.d(sbA.toString(), new Object[0]);
        h hVar = this.f18144d;
        getContext();
        hVar.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f18146f = i10;
        this.f18147g = i11;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z10 = false;
        x60.d("onVisibilityChanged(), changedView = %s,viewVisibility = %s", view, Integer.valueOf(i10));
        nz0 nz0VarA = i01.b().a(getContext());
        if (nz0VarA != null && nz0VarA.L()) {
            z10 = true;
        }
        if (!z10 || this == view) {
            a(i10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        x60.d("onWindowVisibilityChanged(), windowVisibility = %s, this.getVisibility = %s", Integer.valueOf(i10), Integer.valueOf(getVisibility()));
        a((i10 == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public void removeVisibilityChangeListener(fh1 fh1Var) {
        this.f18145e.remove(fh1Var);
    }

    public void setAdSize(AdSize adSize) {
        this.f18142b.a();
        this.f18143c.a(adSize.a());
    }

    public void setAdUnitId(String str) {
        this.f18142b.a();
        this.f18143c.a(str);
    }

    public void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        this.f18142b.a();
        this.f18143c.a(bannerAdEventListener);
    }

    public void setShouldOpenLinksInApp(boolean z10) {
        this.f18142b.a();
        this.f18143c.a(z10);
    }
}
