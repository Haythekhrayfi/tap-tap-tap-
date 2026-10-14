package com.zipoapps.blytics;

import android.app.Application;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import androidx.lifecycle.a0;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.x;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BLyticsEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f28208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f28209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f28210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ka.d f28211d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f28215h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<a> f28213f = Collections.emptyList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f28212e = new g(this);

    public BLyticsEngine(Application application) {
        this.f28208a = application;
        this.f28209b = new c(application);
        this.f28210c = new e(application);
    }

    public final void a(ka.b bVar) {
        String str;
        b bVar2;
        for (ka.a aVar : bVar.f31965d) {
            int i10 = aVar.f31959c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ka.a aVarB = this.f28209b.b(aVar);
                        if (aVarB != null && !DateUtils.isToday(aVarB.f31961e)) {
                            this.f28209b.d(aVarB);
                        }
                    }
                }
                str = aVar.f31958b;
                bVar2 = this.f28209b;
            } else {
                str = aVar.f31958b;
                bVar2 = this.f28211d;
            }
            bVar2.c(aVar);
            bVar.b(str, Integer.valueOf(aVar.f31960d));
        }
    }

    public final void b(ka.b bVar) {
        for (Pair<String, ka.a> pair : bVar.f31966e) {
            String str = (String) pair.first;
            ka.a aVar = (ka.a) pair.second;
            b bVar2 = this.f28209b;
            int i10 = 0;
            if (this.f28211d.b(aVar) != null) {
                bVar2 = this.f28211d;
            }
            ka.a aVarB = bVar2.b(aVar);
            if (aVarB != null && aVarB.f31959c == 3 && !DateUtils.isToday(aVarB.f31961e)) {
                bVar2.d(aVarB);
            }
            if (aVarB != null) {
                i10 = aVarB.f31960d;
            }
            bVar.b(str, Integer.valueOf(i10));
        }
    }

    public void c(ka.b bVar, boolean z10) {
        if (z10) {
            try {
                ka.a aVarA = this.f28209b.a("com.zipoapps.blytics#session", "session");
                if (aVarA != null) {
                    bVar.b("session", Integer.valueOf(aVarA.f31960d));
                }
                bVar.b("isForegroundSession", Boolean.valueOf(this.f28211d.f31972c));
            } catch (Throwable th) {
                xe.a.b("BLytics").d(th, "Failed to send event: %s", bVar.f31962a);
                return;
            }
        }
        a(bVar);
        b(bVar);
        for (ka.c cVar : bVar.f31967f) {
            String str = cVar.f31968a;
            bVar.c(str, ((e) this.f28210c).f28226a.getString(str, cVar.f31969b));
        }
        String str2 = bVar.f31962a;
        if (!TextUtils.isEmpty(this.f28214g) && bVar.f31963b) {
            str2 = this.f28214g + str2;
        }
        for (a aVar : this.f28213f) {
            try {
                aVar.h(str2, bVar.f31964c);
            } catch (Throwable th2) {
                xe.a.b("BLytics").d(th2, "Failed to send event: " + bVar.f31962a + " to platform " + aVar.toString(), new Object[0]);
            }
        }
    }

    public void d(p pVar) {
        a0 a0Var = a0.f2161k;
        final boolean z10 = true;
        if (this.f28215h == null) {
            o oVar = new o() { // from class: com.zipoapps.blytics.BLyticsEngine.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f28216c = false;

                @x(i.b.ON_STOP)
                public void onEnterBackground() {
                    if (this.f28216c) {
                        xe.a.b("BLytics").g("App is BACKGROUND", new Object[0]);
                        try {
                            BLyticsEngine bLyticsEngine = BLyticsEngine.this;
                            g gVar = bLyticsEngine.f28212e;
                            Handler handler = gVar.f28230d;
                            if (handler != null) {
                                handler.removeMessages(2);
                            }
                            gVar.quitSafely();
                            bLyticsEngine.f28212e = null;
                            Iterator<a> it = bLyticsEngine.f28213f.iterator();
                            while (it.hasNext()) {
                                it.next().d(bLyticsEngine.f28211d);
                            }
                        } catch (Throwable th) {
                            xe.a.b("Blytics").d(th, "Stop session failed", new Object[0]);
                        }
                        this.f28216c = false;
                    }
                }

                @x(i.b.ON_START)
                public void onEnterForeground() {
                    if (this.f28216c) {
                        return;
                    }
                    xe.a.b("BLytics").g("App is FOREGROUND", new Object[0]);
                    try {
                        BLyticsEngine.this.e(z10);
                    } catch (Throwable th) {
                        xe.a.b("Blytics").d(th, "Start session failed", new Object[0]);
                    }
                    this.f28216c = true;
                }
            };
            this.f28215h = oVar;
            a0Var.f2167h.a(oVar);
        }
    }

    public void e(boolean z10) {
        this.f28211d = new ka.d(z10);
        if (this.f28212e == null) {
            this.f28212e = new g(this);
        }
        if (z10) {
            b bVar = this.f28209b;
            ka.a aVarA = bVar.a("com.zipoapps.blytics#session", "session");
            if (aVarA == null) {
                aVarA = new ka.a("com.zipoapps.blytics#session", "session", 2);
            }
            bVar.c(aVarA);
        }
        g gVar = this.f28212e;
        if (gVar.getState() == Thread.State.NEW) {
            gVar.start();
        }
    }
}
