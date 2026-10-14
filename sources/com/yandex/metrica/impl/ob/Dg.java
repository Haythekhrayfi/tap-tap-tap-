package com.yandex.metrica.impl.ob;

import android.os.Handler;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

/* JADX INFO: loaded from: classes.dex */
public class Dg implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1821n2 f13818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F9 f13819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2098y0 f13820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1597e2 f13821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f13822f;

    public Dg(C1821n2 c1821n2, F9 f10, Handler handler) {
        this(c1821n2, f10, handler, f10.v());
    }

    private Dg(C1821n2 c1821n2, F9 f10, Handler handler, boolean z10) {
        this(c1821n2, f10, handler, z10, new C2098y0(z10), new C1597e2());
    }

    public Dg(C1821n2 c1821n2, F9 f10, Handler handler, boolean z10, C2098y0 c2098y0, C1597e2 c1597e2) {
        this.f13818b = c1821n2;
        this.f13819c = f10;
        this.f13817a = z10;
        this.f13820d = c2098y0;
        this.f13821e = c1597e2;
        this.f13822f = handler;
    }

    public void a() {
        if (this.f13817a) {
            return;
        }
        this.f13818b.a(new Gg(this.f13822f, this));
    }

    public synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            this.f13820d.a(deferredDeeplinkListener);
            this.f13819c.x();
        } catch (Throwable th) {
            this.f13819c.x();
            throw th;
        }
    }

    public synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.f13820d.a(deferredDeeplinkParametersListener);
            this.f13819c.x();
        } catch (Throwable th) {
            this.f13819c.x();
            throw th;
        }
    }

    @Override // com.yandex.metrica.impl.ob.Eg
    public void a(Fg fg) {
        String str = fg == null ? null : fg.f14000a;
        if (!this.f13817a) {
            synchronized (this) {
                this.f13820d.a(this.f13821e.a(str));
            }
        }
    }
}
