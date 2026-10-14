package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.utils.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.a f9025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f9026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0120a f9027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.mediation.a.c f9028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9030f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0120a {
        void a(com.applovin.impl.mediation.a.c cVar);
    }

    public a(o oVar) {
        this.f9026b = oVar.F();
        this.f9025a = oVar.E();
    }

    public void a() {
        if (y.a()) {
            this.f9026b.b("AdActivityObserver", "Cancelling...");
        }
        this.f9025a.b(this);
        this.f9027c = null;
        this.f9028d = null;
        this.f9029e = 0;
        this.f9030f = false;
    }

    public void a(com.applovin.impl.mediation.a.c cVar, InterfaceC0120a interfaceC0120a) {
        if (y.a()) {
            y yVar = this.f9026b;
            StringBuilder sbA = defpackage.a.a("Starting for ad ");
            sbA.append(cVar.getAdUnitId());
            sbA.append("...");
            yVar.b("AdActivityObserver", sbA.toString());
        }
        a();
        this.f9027c = interfaceC0120a;
        this.f9028d = cVar;
        this.f9025a.a(this);
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f9030f) {
            this.f9030f = true;
        }
        this.f9029e++;
        if (y.a()) {
            this.f9026b.b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f9029e);
        }
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f9030f) {
            this.f9029e--;
            if (y.a()) {
                this.f9026b.b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f9029e);
            }
            if (this.f9029e <= 0) {
                if (y.a()) {
                    this.f9026b.b("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f9027c != null) {
                    if (y.a()) {
                        this.f9026b.b("AdActivityObserver", "Invoking callback...");
                    }
                    this.f9027c.a(this.f9028d);
                }
                a();
            }
        }
    }
}
