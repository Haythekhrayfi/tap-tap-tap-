package com.applovin.impl.mediation;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f9268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f9269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.f f9270d;

    public interface a {
        void c(com.applovin.impl.mediation.a.c cVar);
    }

    public c(o oVar, a aVar) {
        this.f9267a = oVar;
        this.f9268b = oVar.F();
        this.f9269c = aVar;
    }

    public void a() {
        if (y.a()) {
            this.f9268b.b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.sdk.utils.f fVar = this.f9270d;
        if (fVar != null) {
            fVar.a();
            this.f9270d = null;
        }
    }

    public void a(final com.applovin.impl.mediation.a.c cVar, long j10) {
        if (y.a()) {
            this.f9268b.b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f9270d = com.applovin.impl.sdk.utils.f.a(j10, this.f9267a, new Runnable() { // from class: com.applovin.impl.mediation.c.1
            @Override // java.lang.Runnable
            public void run() {
                y unused = c.this.f9268b;
                if (y.a()) {
                    c.this.f9268b.b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                c.this.f9269c.c(cVar);
            }
        });
    }
}
