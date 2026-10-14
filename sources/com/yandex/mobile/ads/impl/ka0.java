package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ka0 extends bk<Void> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final nc0 f22309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f22310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final v61.d f22311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final v61.b f22312n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f22313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ja0 f22314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f22315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22317s;

    public static final class a extends bw {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Object f22318e = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f22319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f22320d;

        private a(v61 v61Var, Object obj, Object obj2) {
            super(v61Var);
            this.f22319c = obj;
            this.f22320d = obj2;
        }

        public static a a(bc0 bc0Var) {
            return new a(new b(bc0Var), v61.d.f25857r, f22318e);
        }

        public static a a(v61 v61Var, Object obj, Object obj2) {
            return new a(v61Var, obj, obj2);
        }

        @Override // com.yandex.mobile.ads.impl.bw, com.yandex.mobile.ads.impl.v61
        public final int a(Object obj) {
            Object obj2;
            v61 v61Var = this.f19333b;
            if (f22318e.equals(obj) && (obj2 = this.f22320d) != null) {
                obj = obj2;
            }
            return v61Var.a(obj);
        }

        public final a a(v61 v61Var) {
            return new a(v61Var, this.f22319c, this.f22320d);
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final v61.b a(int i10, v61.b bVar, boolean z10) {
            this.f19333b.a(i10, bVar, z10);
            if (da1.a(bVar.f25847b, this.f22320d) && z10) {
                bVar.f25847b = f22318e;
            }
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final v61.d a(int i10, v61.d dVar, long j10) {
            this.f19333b.a(i10, dVar, j10);
            if (da1.a(dVar.f25861a, this.f22319c)) {
                dVar.f25861a = v61.d.f25857r;
            }
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.bw, com.yandex.mobile.ads.impl.v61
        public final Object a(int i10) {
            Object objA = this.f19333b.a(i10);
            return da1.a(objA, this.f22320d) ? f22318e : objA;
        }
    }

    public static final class b extends v61 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bc0 f22321b;

        public b(bc0 bc0Var) {
            this.f22321b = bc0Var;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int a(Object obj) {
            return obj == a.f22318e ? 0 : -1;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final v61.b a(int i10, v61.b bVar, boolean z10) {
            bVar.a(z10 ? 0 : null, z10 ? a.f22318e : null, 0, -9223372036854775807L, 0L, c4.f19369g, true);
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final v61.d a(int i10, v61.d dVar, long j10) {
            dVar.a(v61.d.f25857r, this.f22321b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f25872l = true;
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final Object a(int i10) {
            return a.f22318e;
        }

        @Override // com.yandex.mobile.ads.impl.v61
        public final int b() {
            return 1;
        }
    }

    public ka0(nc0 nc0Var, boolean z10) {
        boolean z11;
        this.f22309k = nc0Var;
        if (z10) {
            Objects.requireNonNull(nc0Var);
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22310l = z11;
        this.f22311m = new v61.d();
        this.f22312n = new v61.b();
        Objects.requireNonNull(nc0Var);
        this.f22313o = a.a(nc0Var.getMediaItem());
    }

    @Override // com.yandex.mobile.ads.impl.bk
    public final nc0.b a(Void r10, nc0.b bVar) {
        Object obj = bVar.f22012a;
        if (this.f22313o.f22320d != null && this.f22313o.f22320d.equals(obj)) {
            obj = a.f22318e;
        }
        return bVar.b(obj);
    }

    @Override // com.yandex.mobile.ads.impl.bk, com.yandex.mobile.ads.impl.je
    public final void a(g81 g81Var) {
        super.a(g81Var);
        if (this.f22310l) {
            return;
        }
        this.f22315q = true;
        a((Object) null, this.f22309k);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void a(hc0 hc0Var) {
        ((ja0) hc0Var).c();
        if (hc0Var == this.f22314p) {
            this.f22314p = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ja0 a(nc0.b bVar, u8 u8Var, long j10) {
        ja0 ja0Var = new ja0(bVar, u8Var, j10);
        ja0Var.a(this.f22309k);
        if (this.f22316r) {
            Object obj = bVar.f22012a;
            if (this.f22313o.f22320d != null && obj.equals(a.f22318e)) {
                obj = this.f22313o.f22320d;
            }
            ja0Var.a(bVar.b(obj));
        } else {
            this.f22314p = ja0Var;
            if (!this.f22315q) {
                this.f22315q = true;
                a((Object) null, this.f22309k);
            }
        }
        return ja0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.bk
    /* JADX INFO: renamed from: b */
    public final void a(Void r19, nc0 nc0Var, v61 v61Var) {
        long j10;
        nc0.b bVarB;
        if (this.f22316r) {
            this.f22313o = this.f22313o.a(v61Var);
            ja0 ja0Var = this.f22314p;
            if (ja0Var != null) {
                long jA = ja0Var.a();
                ja0 ja0Var2 = this.f22314p;
                int iA = this.f22313o.a(ja0Var2.f22000b.f22012a);
                if (iA != -1) {
                    long j11 = this.f22313o.a(iA, this.f22312n, false).f25849d;
                    if (j11 != -9223372036854775807L && jA >= j11) {
                        jA = Math.max(0L, j11 - 1);
                    }
                    ja0Var2.a(jA);
                }
            }
        } else {
            if (!v61Var.c()) {
                v61Var.a(0, this.f22311m, 0L);
                v61.d dVar = this.f22311m;
                long j12 = dVar.f25873m;
                Object obj = dVar.f25861a;
                ja0 ja0Var3 = this.f22314p;
                if (ja0Var3 != null) {
                    long jB = ja0Var3.b();
                    this.f22313o.a(this.f22314p.f22000b.f22012a, this.f22312n);
                    j10 = this.f22312n.f25850e + jB;
                    if (j10 == this.f22313o.a(0, this.f22311m, 0L).f25873m) {
                        j10 = j12;
                    }
                } else {
                    j10 = j12;
                }
                Pair<Object, Long> pairA = v61Var.a(this.f22311m, this.f22312n, 0, j10);
                Object obj2 = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                a aVarA = this.f22317s ? this.f22313o.a(v61Var) : a.a(v61Var, obj, obj2);
                this.f22313o = aVarA;
                ja0 ja0Var4 = this.f22314p;
                if (ja0Var4 != null) {
                    int iA2 = aVarA.a(ja0Var4.f22000b.f22012a);
                    if (iA2 != -1) {
                        long j13 = this.f22313o.a(iA2, this.f22312n, false).f25849d;
                        if (j13 != -9223372036854775807L && jLongValue >= j13) {
                            jLongValue = Math.max(0L, j13 - 1);
                        }
                        ja0Var4.a(jLongValue);
                    }
                    nc0.b bVar = ja0Var4.f22000b;
                    Object obj3 = bVar.f22012a;
                    if (this.f22313o.f22320d != null && obj3.equals(a.f22318e)) {
                        obj3 = this.f22313o.f22320d;
                    }
                    bVarB = bVar.b(obj3);
                }
                this.f22317s = true;
                this.f22316r = true;
                a(this.f22313o);
                if (bVarB != null) {
                    ja0 ja0Var5 = this.f22314p;
                    Objects.requireNonNull(ja0Var5);
                    ja0Var5.a(bVarB);
                }
            }
            this.f22313o = this.f22317s ? this.f22313o.a(v61Var) : a.a(v61Var, v61.d.f25857r, a.f22318e);
        }
        bVarB = null;
        this.f22317s = true;
        this.f22316r = true;
        a(this.f22313o);
        if (bVarB != null) {
            ja0 ja0Var6 = this.f22314p;
            Objects.requireNonNull(ja0Var6);
            ja0Var6.a(bVarB);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bk, com.yandex.mobile.ads.impl.je
    public final void e() {
        this.f22316r = false;
        this.f22315q = false;
        super.e();
    }

    public final v61 f() {
        return this.f22313o;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final bc0 getMediaItem() {
        return this.f22309k.getMediaItem();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
