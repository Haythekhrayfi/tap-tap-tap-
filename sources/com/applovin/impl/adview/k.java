package com.applovin.impl.adview;

import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f8558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f8559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<b> f8560c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f8561d = new AtomicInteger();

    public interface a {
        void a();

        boolean b();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f8566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f8567c;

        private b(String str, long j10, a aVar) {
            this.f8565a = str;
            this.f8567c = j10;
            this.f8566b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f8565a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f8567c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a c() {
            return this.f8566b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            String str = this.f8565a;
            String str2 = ((b) obj).f8565a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            return str2 == null;
        }

        public int hashCode() {
            String str = this.f8565a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("CountdownProxy{identifier='");
            l1.c.a(sbA, this.f8565a, CoreConstants.SINGLE_QUOTE_CHAR, ", countdownStepMillis=");
            return o2.a.a(sbA, this.f8567c, '}');
        }
    }

    public k(Handler handler, com.applovin.impl.sdk.o oVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f8559b = handler;
        this.f8558a = oVar.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final b bVar, final int i10) {
        this.f8559b.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.k.1
            @Override // java.lang.Runnable
            public void run() {
                a aVarC = bVar.c();
                if (!aVarC.b()) {
                    com.applovin.impl.sdk.y unused = k.this.f8558a;
                    if (com.applovin.impl.sdk.y.a()) {
                        com.applovin.impl.sdk.y yVar = k.this.f8558a;
                        StringBuilder sbA = defpackage.a.a("Ending countdown for ");
                        sbA.append(bVar.a());
                        yVar.b("CountdownManager", sbA.toString());
                        return;
                    }
                    return;
                }
                if (k.this.f8561d.get() != i10) {
                    com.applovin.impl.sdk.y unused2 = k.this.f8558a;
                    if (com.applovin.impl.sdk.y.a()) {
                        com.applovin.impl.sdk.y yVar2 = k.this.f8558a;
                        StringBuilder sbA2 = defpackage.a.a("Killing duplicate countdown from previous generation: ");
                        sbA2.append(bVar.a());
                        yVar2.d("CountdownManager", sbA2.toString());
                        return;
                    }
                    return;
                }
                try {
                    aVarC.a();
                    k.this.a(bVar, i10);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y unused3 = k.this.f8558a;
                    if (com.applovin.impl.sdk.y.a()) {
                        com.applovin.impl.sdk.y yVar3 = k.this.f8558a;
                        StringBuilder sbA3 = defpackage.a.a("Encountered error on countdown step for: ");
                        sbA3.append(bVar.a());
                        yVar3.b("CountdownManager", sbA3.toString(), th);
                    }
                    k.this.b();
                }
            }
        }, bVar.b());
    }

    public void a() {
        HashSet<b> hashSet = new HashSet(this.f8560c);
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f8558a;
            StringBuilder sbA = defpackage.a.a("Starting ");
            sbA.append(hashSet.size());
            sbA.append(" countdowns...");
            yVar.b("CountdownManager", sbA.toString());
        }
        int iIncrementAndGet = this.f8561d.incrementAndGet();
        for (b bVar : hashSet) {
            if (com.applovin.impl.sdk.y.a()) {
                com.applovin.impl.sdk.y yVar2 = this.f8558a;
                StringBuilder sbA2 = defpackage.a.a("Starting countdown: ");
                sbA2.append(bVar.a());
                sbA2.append(" for generation ");
                sbA2.append(iIncrementAndGet);
                sbA2.append("...");
                yVar2.b("CountdownManager", sbA2.toString());
            }
            a(bVar, iIncrementAndGet);
        }
    }

    public void a(String str, long j10, a aVar) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.f8559b == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (com.applovin.impl.sdk.y.a()) {
            a0.a("Adding countdown: ", str, this.f8558a, "CountdownManager");
        }
        this.f8560c.add(new b(str, j10, aVar));
    }

    public void b() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f8558a.b("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f8560c.clear();
    }

    public void c() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f8558a.b("CountdownManager", "Stopping countdowns...");
        }
        this.f8561d.incrementAndGet();
        this.f8559b.removeCallbacksAndMessages(null);
    }
}
