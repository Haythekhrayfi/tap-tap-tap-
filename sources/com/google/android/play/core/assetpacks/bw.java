package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f11992a = new com.google.android.play.core.internal.af("ExtractorLooper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cp f11993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt f11994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dv f11995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final df f11996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dj f11997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Cdo f11998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<w> f11999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final cs f12000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f12001j = new AtomicBoolean(false);

    public bw(cp cpVar, com.google.android.play.core.internal.cj<w> cjVar, bt btVar, dv dvVar, df dfVar, dj djVar, Cdo cdo, cs csVar) {
        this.f11993b = cpVar;
        this.f11999h = cjVar;
        this.f11994c = btVar;
        this.f11995d = dvVar;
        this.f11996e = dfVar;
        this.f11997f = djVar;
        this.f11998g = cdo;
        this.f12000i = csVar;
    }

    private final void a(int i10, Exception exc) {
        try {
            this.f11993b.d(i10);
            this.f11993b.a(i10);
        } catch (bv unused) {
            f11992a.b("Error during error handling: %s", exc.getMessage());
        }
    }

    public final void a() {
        com.google.android.play.core.internal.af afVar = f11992a;
        afVar.a("Run extractor loop", new Object[0]);
        if (!this.f12001j.compareAndSet(false, true)) {
            afVar.d("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            cr crVarA = null;
            try {
                crVarA = this.f12000i.a();
            } catch (bv e10) {
                f11992a.b("Error while getting next extraction task: %s", e10.getMessage());
                if (e10.f11991a >= 0) {
                    this.f11999h.a().a(e10.f11991a);
                    a(e10.f11991a, e10);
                }
            }
            if (crVarA == null) {
                this.f12001j.set(false);
                return;
            }
            try {
                if (crVarA instanceof bs) {
                    this.f11994c.a((bs) crVarA);
                } else if (crVarA instanceof du) {
                    this.f11995d.a((du) crVarA);
                } else if (crVarA instanceof de) {
                    this.f11996e.a((de) crVarA);
                } else if (crVarA instanceof dh) {
                    this.f11997f.a((dh) crVarA);
                } else if (crVarA instanceof dn) {
                    this.f11998g.a((dn) crVarA);
                } else {
                    f11992a.b("Unknown task type: %s", crVarA.getClass().getName());
                }
            } catch (Exception e11) {
                f11992a.b("Error during extraction task: %s", e11.getMessage());
                this.f11999h.a().a(crVarA.f12064j);
                a(crVarA.f12064j, e11);
            }
        }
    }
}
