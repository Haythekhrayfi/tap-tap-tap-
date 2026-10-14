package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f14768a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f14769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f14771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f14772d;

        public a() {
            this(false, 0, 0, null, 15);
        }

        public a(boolean z10, int i10, int i11, String str) {
            this.f14769a = z10;
            this.f14770b = i10;
            this.f14771c = i11;
            this.f14772d = str;
        }

        public /* synthetic */ a(boolean z10, int i10, int i11, String str, int i12) {
            this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : str);
        }

        public final String a() {
            return this.f14772d;
        }

        public final int b() {
            return this.f14770b;
        }

        public final int c() {
            return this.f14771c;
        }

        public final boolean d() {
            return this.f14769a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14769a == aVar.f14769a && this.f14770b == aVar.f14770b && this.f14771c == aVar.f14771c && fd.j0.d(this.f14772d, aVar.f14772d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z10 = this.f14769a;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = ((((r10 * 31) + this.f14770b) * 31) + this.f14771c) * 31;
            String str = this.f14772d;
            return i10 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("RequestReport(success=");
            sbA.append(this.f14769a);
            sbA.append(", httpStatus=");
            sbA.append(this.f14770b);
            sbA.append(", size=");
            sbA.append(this.f14771c);
            sbA.append(", failureReason=");
            return androidx.activity.k.a(sbA, this.f14772d, ")");
        }
    }

    public Qb(C2011ui c2011ui, W0 w10) {
        this.f14768a = c2011ui.e() ? w10 : null;
    }

    public final void a() {
        W0 w10 = this.f14768a;
        if (w10 != null) {
            w10.d("egress_diagnostics", "Unable to open url connection, check config url.");
        }
    }

    public final void a(a aVar) {
        W0 w10 = this.f14768a;
        if (w10 != null) {
            jc.h[] hVarArr = new jc.h[3];
            hVarArr[0] = new jc.h("status", aVar.d() ? "OK" : "FAILED");
            hVarArr[1] = new jc.h("http_status", Integer.valueOf(aVar.b()));
            hVarArr[2] = new jc.h("size", Integer.valueOf(aVar.c()));
            Map mapF = kc.f0.f(hVarArr);
            String strA = aVar.a();
            if (strA != null) {
                mapF.put("reason", strA);
            }
            w10.reportEvent("egress_status", kc.f0.k(mapF));
        }
    }
}
