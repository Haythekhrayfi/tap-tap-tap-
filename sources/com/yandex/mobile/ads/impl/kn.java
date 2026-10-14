package com.yandex.mobile.ads.impl;

import android.os.Looper;
import android.util.SparseArray;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class kn implements w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ki f22455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v61.b f22456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v61.d f22457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f22458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<x8.a> f22459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r80<x8> f22460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private dr0 f22461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private my f22462h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v61.b f22463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.p<nc0.b> f22464b = com.yandex.mobile.ads.embedded.guava.collect.p.i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.yandex.mobile.ads.embedded.guava.collect.q<nc0.b, v61> f22465c = com.yandex.mobile.ads.embedded.guava.collect.q.h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private nc0.b f22466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private nc0.b f22467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private nc0.b f22468f;

        public a(v61.b bVar) {
            this.f22463a = bVar;
        }

        private static nc0.b a(dr0 dr0Var, com.yandex.mobile.ads.embedded.guava.collect.p<nc0.b> pVar, nc0.b bVar, v61.b bVar2) {
            v61 currentTimeline = dr0Var.getCurrentTimeline();
            int currentPeriodIndex = dr0Var.getCurrentPeriodIndex();
            Object objA = currentTimeline.c() ? null : currentTimeline.a(currentPeriodIndex);
            boolean z10 = false;
            int iA = (dr0Var.isPlayingAd() || currentTimeline.c()) ? -1 : currentTimeline.a(currentPeriodIndex, bVar2, false).a(da1.a(dr0Var.getCurrentPosition()) - bVar2.f25850e);
            int i10 = 0;
            while (true) {
                boolean z11 = true;
                if (i10 >= pVar.size()) {
                    if (pVar.isEmpty() && bVar != null) {
                        boolean zIsPlayingAd = dr0Var.isPlayingAd();
                        int currentAdGroupIndex = dr0Var.getCurrentAdGroupIndex();
                        int currentAdIndexInAdGroup = dr0Var.getCurrentAdIndexInAdGroup();
                        if (bVar.f22012a.equals(objA) && ((zIsPlayingAd && bVar.f22013b == currentAdGroupIndex && bVar.f22014c == currentAdIndexInAdGroup) || (!zIsPlayingAd && bVar.f22013b == -1 && bVar.f22016e == iA))) {
                            z10 = true;
                        }
                        if (z10) {
                            return bVar;
                        }
                    }
                    return null;
                }
                nc0.b bVar3 = pVar.get(i10);
                boolean zIsPlayingAd2 = dr0Var.isPlayingAd();
                int currentAdGroupIndex2 = dr0Var.getCurrentAdGroupIndex();
                int currentAdIndexInAdGroup2 = dr0Var.getCurrentAdIndexInAdGroup();
                if (!bVar3.f22012a.equals(objA) || ((!zIsPlayingAd2 || bVar3.f22013b != currentAdGroupIndex2 || bVar3.f22014c != currentAdIndexInAdGroup2) && (zIsPlayingAd2 || bVar3.f22013b != -1 || bVar3.f22016e != iA))) {
                    z11 = false;
                }
                if (z11) {
                    return bVar3;
                }
                i10++;
            }
        }

        private void a(com.yandex.mobile.ads.embedded.guava.collect.q.a<nc0.b, v61> aVar, nc0.b bVar, v61 v61Var) {
            if (bVar == null) {
                return;
            }
            if (v61Var.a(bVar.f22012a) == -1 && (v61Var = this.f22465c.get(bVar)) == null) {
                return;
            }
            aVar.a(bVar, v61Var);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0056  */
        private void a(v61 v61Var) {
            com.yandex.mobile.ads.embedded.guava.collect.q.a<nc0.b, v61> aVarA = com.yandex.mobile.ads.embedded.guava.collect.q.a();
            if (this.f22464b.isEmpty()) {
                a(aVarA, this.f22467e, v61Var);
                if (!sn0.a(this.f22468f, this.f22467e)) {
                    a(aVarA, this.f22468f, v61Var);
                }
                if (!sn0.a(this.f22466d, this.f22467e) && !sn0.a(this.f22466d, this.f22468f)) {
                    a(aVarA, this.f22466d, v61Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f22464b.size(); i10++) {
                    a(aVarA, this.f22464b.get(i10), v61Var);
                }
                if (!this.f22464b.contains(this.f22466d)) {
                    a(aVarA, this.f22466d, v61Var);
                }
            }
            this.f22465c = aVarA.a();
        }

        public final nc0.b a() {
            return this.f22466d;
        }

        public final v61 a(nc0.b bVar) {
            return this.f22465c.get(bVar);
        }

        public final void a(dr0 dr0Var) {
            this.f22466d = a(dr0Var, this.f22464b, this.f22467e, this.f22463a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(List<nc0.b> list, nc0.b bVar, dr0 dr0Var) {
            this.f22464b = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) list);
            if (!((AbstractCollection) list).isEmpty()) {
                this.f22467e = (nc0.b) list.get(0);
                Objects.requireNonNull(bVar);
                this.f22468f = bVar;
            }
            if (this.f22466d == null) {
                this.f22466d = a(dr0Var, this.f22464b, this.f22467e, this.f22463a);
            }
            a(dr0Var.getCurrentTimeline());
        }

        public final nc0.b b() {
            nc0.b next;
            nc0.b bVar;
            if (this.f22464b.isEmpty()) {
                return null;
            }
            com.yandex.mobile.ads.embedded.guava.collect.p<nc0.b> pVar = this.f22464b;
            if (!(pVar instanceof List)) {
                Iterator<nc0.b> it = pVar.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                bVar = next;
            } else {
                if (pVar.isEmpty()) {
                    throw new NoSuchElementException();
                }
                bVar = pVar.get(pVar.size() - 1);
            }
            return bVar;
        }

        public final void b(dr0 dr0Var) {
            this.f22466d = a(dr0Var, this.f22464b, this.f22467e, this.f22463a);
            a(dr0Var.getCurrentTimeline());
        }

        public final nc0.b c() {
            return this.f22467e;
        }

        public final nc0.b d() {
            return this.f22468f;
        }
    }

    public kn(ki kiVar) {
        this.f22455a = (ki) pa.a(kiVar);
        this.f22460f = new r80<>(da1.c(), kiVar, yn1.f26957q);
        v61.b bVar = new v61.b();
        this.f22456b = bVar;
        this.f22457c = new v61.d();
        this.f22458d = new a(bVar);
        this.f22459e = new SparseArray<>();
    }

    private x8.a a(nc0.b bVar) {
        Objects.requireNonNull(this.f22461g);
        v61 v61VarA = bVar == null ? null : this.f22458d.a(bVar);
        if (bVar != null && v61VarA != null) {
            return a(v61VarA, v61VarA.a(bVar.f22012a, this.f22456b).f25848c, bVar);
        }
        int currentMediaItemIndex = this.f22461g.getCurrentMediaItemIndex();
        v61 currentTimeline = this.f22461g.getCurrentTimeline();
        if (!(currentMediaItemIndex < currentTimeline.b())) {
            currentTimeline = v61.f25844a;
        }
        return a(currentTimeline, currentMediaItemIndex, (nc0.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(dr0 dr0Var, x8 x8Var, qv qvVar) {
        ((fc0) x8Var).a(dr0Var, new x8.b(qvVar, this.f22459e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(x8.a aVar, int i10, dr0.c cVar, dr0.c cVar2, x8 x8Var) {
        Objects.requireNonNull(x8Var);
        ((fc0) x8Var).a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(x8.a aVar, dc0 dc0Var, x8 x8Var) {
        ((fc0) x8Var).a(aVar, dc0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(x8.a aVar, v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10, x8 x8Var) {
        ((fc0) x8Var).a(dc0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(x8.a aVar, wf1 wf1Var, x8 x8Var) {
        ((fc0) x8Var).a(wf1Var);
        int i10 = wf1Var.f26269a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(x8.a aVar, wq0 wq0Var, x8 x8Var) {
        ((fc0) x8Var).a(wq0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(x8 x8Var, qv qvVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(x8.a aVar, int i10, long j10, long j11, x8 x8Var) {
        ((fc0) x8Var).a(aVar, i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(x8.a aVar, ym ymVar, x8 x8Var) {
        ((fc0) x8Var).a(ymVar);
    }

    private x8.a e() {
        return a(this.f22458d.d());
    }

    private x8.a e(int i10, nc0.b bVar) {
        Objects.requireNonNull(this.f22461g);
        if (bVar != null) {
            return this.f22458d.a(bVar) != null ? a(bVar) : a(v61.f25844a, i10, bVar);
        }
        v61 currentTimeline = this.f22461g.getCurrentTimeline();
        if (!(i10 < currentTimeline.b())) {
            currentTimeline = v61.f25844a;
        }
        return a(currentTimeline, i10, (nc0.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        x8.a aVarD = d();
        a(aVarD, 1028, new no1(aVarD, 3));
        this.f22460f.b();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    @RequiresNonNull({"player"})
    public final x8.a a(v61 v61Var, int i10, nc0.b bVar) {
        long jB;
        nc0.b bVar2 = v61Var.c() ? null : bVar;
        long jC = this.f22455a.c();
        boolean z10 = v61Var.equals(this.f22461g.getCurrentTimeline()) && i10 == this.f22461g.getCurrentMediaItemIndex();
        if (bVar2 != null && bVar2.a()) {
            if (z10 && this.f22461g.getCurrentAdGroupIndex() == bVar2.f22013b && this.f22461g.getCurrentAdIndexInAdGroup() == bVar2.f22014c) {
                jB = this.f22461g.getCurrentPosition();
            } else {
                jB = 0;
            }
        } else if (z10) {
            jB = this.f22461g.getContentPosition();
        } else if (v61Var.c()) {
            jB = 0;
        } else {
            jB = da1.b(v61Var.a(i10, this.f22457c, 0L).f25873m);
        }
        return new x8.a(jC, v61Var, i10, bVar2, jB, this.f22461g.getCurrentTimeline(), this.f22461g.getCurrentMediaItemIndex(), this.f22458d.a(), this.f22461g.getCurrentPosition(), this.f22461g.getTotalBufferedDuration());
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(int i10) {
        a aVar = this.f22458d;
        dr0 dr0Var = this.f22461g;
        Objects.requireNonNull(dr0Var);
        aVar.b(dr0Var);
        x8.a aVarD = d();
        a(aVarD, 0, new ro1(aVarD, i10, 3));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(int i10, long j10) {
        x8.a aVarA = a(this.f22458d.c());
        a(aVarA, 1021, new uo1(aVarA, j10, i10));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(int i10, long j10, long j11) {
        x8.a aVarE = e();
        a(aVarE, 1011, new so1(aVarE, i10, j10, j11, 0));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void a(int i10, nc0.b bVar) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1025, new no1(aVarE, 0));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void a(int i10, nc0.b bVar, int i11) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1022, new ro1(aVarE, i11, 0));
    }

    @Override // com.yandex.mobile.ads.impl.oc0
    public final void a(int i10, nc0.b bVar, dc0 dc0Var) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1004, new com.applovin.exoplayer2.a.e(aVarE, dc0Var));
    }

    @Override // com.yandex.mobile.ads.impl.oc0
    public final void a(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1002, new vo1(aVarE, v80Var, dc0Var, 0));
    }

    @Override // com.yandex.mobile.ads.impl.oc0
    public final void a(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var, IOException iOException, boolean z10) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1003, new com.applovin.exoplayer2.a.l(aVarE, v80Var, dc0Var, iOException, z10));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void a(int i10, nc0.b bVar, Exception exc) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1024, new zo1(aVarE, exc, 1));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(long j10) {
        x8.a aVarE = e();
        a(aVarE, 1010, new com.applovin.exoplayer2.a.m(aVarE, j10));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(Metadata metadata) {
        x8.a aVarD = d();
        a(aVarD, 28, new com.applovin.exoplayer2.a.e(aVarD, metadata));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(bc0 bc0Var, int i10) {
        x8.a aVarD = d();
        a(aVarD, 1, new tp1(aVarD, bc0Var, i10));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(cm cmVar) {
        x8.a aVarD = d();
        a(aVarD, 27, new com.applovin.exoplayer2.a.e(aVarD, cmVar));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(dp dpVar) {
        x8.a aVarD = d();
        a(aVarD, 29, new com.applovin.exoplayer2.a.e(aVarD, dpVar));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(dr0.a aVar) {
        x8.a aVarD = d();
        a(aVarD, 13, new com.applovin.exoplayer2.a.e(aVarD, aVar));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(dr0.c cVar, dr0.c cVar2, int i10) {
        a aVar = this.f22458d;
        dr0 dr0Var = this.f22461g;
        Objects.requireNonNull(dr0Var);
        aVar.a(dr0Var);
        x8.a aVarD = d();
        a(aVarD, 11, new com.applovin.exoplayer2.a.k(aVarD, i10, cVar, cVar2));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(dr0 dr0Var, Looper looper) {
        pa.b(this.f22461g == null || this.f22458d.f22464b.isEmpty());
        this.f22461g = dr0Var;
        this.f22462h = this.f22455a.a(looper, null);
        this.f22460f = this.f22460f.a(looper, new com.applovin.exoplayer2.a.e(this, dr0Var));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(e81 e81Var) {
        x8.a aVarD = d();
        a(aVarD, 2, new com.applovin.exoplayer2.a.e(aVarD, e81Var));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(ec0 ec0Var) {
        x8.a aVarD = d();
        a(aVarD, 14, new com.applovin.exoplayer2.a.e(aVarD, ec0Var));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(fc0 fc0Var) {
        this.f22460f.a(fc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(ns nsVar) {
        jc0 jc0Var;
        x8.a aVarD = (!(nsVar instanceof ns) || (jc0Var = nsVar.f23538h) == null) ? d() : a(new nc0.b(jc0Var));
        a(aVarD, 10, new wo1(aVarD, nsVar, 0));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(wf1 wf1Var) {
        x8.a aVarE = e();
        a(aVarE, 25, new com.applovin.exoplayer2.a.e(aVarE, wf1Var));
    }

    public final void a(x8.a aVar, int i10, r80.a<x8> aVar2) {
        this.f22459e.put(i10, aVar);
        r80<x8> r80Var = this.f22460f;
        r80Var.a(i10, aVar2);
        r80Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(ym ymVar) {
        x8.a aVarA = a(this.f22458d.c());
        a(aVarA, 1013, new xo1(aVarA, ymVar, 3));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(yv yvVar, cn cnVar) {
        x8.a aVarE = e();
        a(aVarE, 1009, new yo1(aVarE, yvVar, cnVar, 1));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(zq0 zq0Var) {
        x8.a aVarD = d();
        a(aVarD, 12, new com.applovin.exoplayer2.a.e(aVarD, zq0Var));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(Exception exc) {
        x8.a aVarE = e();
        a(aVarE, 1014, new zo1(aVarE, exc, 3));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(Object obj, long j10) {
        x8.a aVarE = e();
        a(aVarE, 26, new com.applovin.exoplayer2.a.h(aVarE, obj, j10));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(String str) {
        x8.a aVarE = e();
        a(aVarE, 1019, new oo1(aVarE, str, 0));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(String str, long j10, long j11) {
        x8.a aVarE = e();
        a(aVarE, 1016, new po1(aVarE, str, j11, j10, 1));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void a(List<nc0.b> list, nc0.b bVar) {
        a aVar = this.f22458d;
        dr0 dr0Var = this.f22461g;
        Objects.requireNonNull(dr0Var);
        aVar.a(list, bVar, dr0Var);
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(boolean z10, int i10) {
        x8.a aVarD = d();
        a(aVarD, 30, new to1(aVarD, i10, z10));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void b(int i10, long j10) {
        x8.a aVarA = a(this.f22458d.c());
        a(aVarA, 1018, new uo1(aVarA, i10, j10));
    }

    @Override // com.yandex.mobile.ads.impl.ad.a
    public final void b(int i10, long j10, long j11) {
        x8.a aVarA = a(this.f22458d.b());
        a(aVarA, 1006, new so1(aVarA, i10, j10, j11, 1));
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void b(int i10, nc0.b bVar) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1027, new no1(aVarE, 2));
    }

    @Override // com.yandex.mobile.ads.impl.oc0
    public final void b(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1001, new vo1(aVarE, v80Var, dc0Var, 2));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void b(ns nsVar) {
        jc0 jc0Var;
        x8.a aVarD = (!(nsVar instanceof ns) || (jc0Var = nsVar.f23538h) == null) ? d() : a(new nc0.b(jc0Var));
        a(aVarD, 10, new wo1(aVarD, nsVar, 1));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void b(ym ymVar) {
        x8.a aVarE = e();
        a(aVarE, 1007, new xo1(aVarE, ymVar, 1));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void b(yv yvVar, cn cnVar) {
        x8.a aVarE = e();
        a(aVarE, 1017, new yo1(aVarE, yvVar, cnVar, 0));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void b(Exception exc) {
        x8.a aVarE = e();
        a(aVarE, 1029, new zo1(aVarE, exc, 2));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void b(String str) {
        x8.a aVarE = e();
        a(aVarE, 1012, new oo1(aVarE, str, 1));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void b(String str, long j10, long j11) {
        x8.a aVarE = e();
        a(aVarE, 1008, new po1(aVarE, str, j11, j10, 0));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void c(int i10, nc0.b bVar) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1023, new no1(aVarE, 4));
    }

    @Override // com.yandex.mobile.ads.impl.oc0
    public final void c(int i10, nc0.b bVar, v80 v80Var, dc0 dc0Var) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1000, new vo1(aVarE, v80Var, dc0Var, 1));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void c(ym ymVar) {
        x8.a aVarA = a(this.f22458d.c());
        a(aVarA, 1020, new xo1(aVarA, ymVar, 2));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void c(Exception exc) {
        x8.a aVarE = e();
        a(aVarE, 1030, new zo1(aVarE, exc, 0));
    }

    public final x8.a d() {
        return a(this.f22458d.a());
    }

    @Override // com.yandex.mobile.ads.exo.drm.f
    public final void d(int i10, nc0.b bVar) {
        x8.a aVarE = e(i10, bVar);
        a(aVarE, 1026, new no1(aVarE, 1));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void d(ym ymVar) {
        x8.a aVarE = e();
        a(aVarE, 1015, new xo1(aVarE, ymVar, 0));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onCues(List<am> list) {
        x8.a aVarD = d();
        a(aVarD, 27, new com.applovin.exoplayer2.a.e(aVarD, list));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onIsLoadingChanged(boolean z10) {
        x8.a aVarD = d();
        a(aVarD, 3, new qo1(aVarD, z10, 2));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onIsPlayingChanged(boolean z10) {
        x8.a aVarD = d();
        a(aVarD, 7, new qo1(aVarD, z10, 1));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        x8.a aVarD = d();
        a(aVarD, 5, new to1(aVarD, z10, i10, 1));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onPlaybackStateChanged(int i10) {
        x8.a aVarD = d();
        a(aVarD, 4, new ro1(aVarD, i10, 1));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        x8.a aVarD = d();
        a(aVarD, 6, new ro1(aVarD, i10, 2));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onPlayerStateChanged(boolean z10, int i10) {
        x8.a aVarD = d();
        a(aVarD, -1, new to1(aVarD, z10, i10, 2));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onRenderedFirstFrame() {
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        x8.a aVarE = e();
        a(aVarE, 23, new qo1(aVarE, z10, 0));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onSurfaceSizeChanged(int i10, int i11) {
        x8.a aVarE = e();
        a(aVarE, 24, new com.applovin.exoplayer2.a.j(aVarE, i10, i11));
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onVolumeChanged(float f10) {
        x8.a aVarE = e();
        a(aVarE, 22, new com.applovin.exoplayer2.a.i(aVarE, f10));
    }

    @Override // com.yandex.mobile.ads.impl.w8
    public final void release() {
        ((my) pa.b(this.f22462h)).a(new pp1(this));
    }
}
