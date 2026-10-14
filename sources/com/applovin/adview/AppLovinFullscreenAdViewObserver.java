package com.applovin.adview;

import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.q;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f3899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f3900b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f3901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f3902d;

    public AppLovinFullscreenAdViewObserver(i iVar, q qVar, com.applovin.impl.sdk.o oVar) {
        this.f3902d = qVar;
        this.f3899a = oVar;
        iVar.a(this);
    }

    @x(i.b.ON_DESTROY)
    public void onDestroy() {
        q qVar = this.f3902d;
        if (qVar != null) {
            qVar.a();
            this.f3902d = null;
        }
        a aVar = this.f3901c;
        if (aVar != null) {
            aVar.h();
            this.f3901c.k();
            this.f3901c = null;
        }
    }

    @x(i.b.ON_PAUSE)
    public void onPause() {
        a aVar = this.f3901c;
        if (aVar != null) {
            aVar.g();
            this.f3901c.e();
        }
    }

    @x(i.b.ON_RESUME)
    public void onResume() {
        a aVar;
        if (this.f3900b.getAndSet(false) || (aVar = this.f3901c) == null) {
            return;
        }
        aVar.f();
        this.f3901c.a(0L);
    }

    @x(i.b.ON_STOP)
    public void onStop() {
        a aVar = this.f3901c;
        if (aVar != null) {
            aVar.j();
        }
    }

    public void setPresenter(a aVar) {
        this.f3901c = aVar;
    }
}
