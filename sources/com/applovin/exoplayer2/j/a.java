package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.ad;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.exoplayer2.j.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.d f7155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f7156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f7157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f7158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f7159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f7160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final s<C0102a> f7161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f7162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f7163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.applovin.exoplayer2.h.b.b f7167p;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.j.a$a, reason: collision with other inner class name */
    public static final class C0102a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7169b;

        public C0102a(long j10, long j11) {
            this.f7168a = j10;
            this.f7169b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0102a)) {
                return false;
            }
            C0102a c0102a = (C0102a) obj;
            return this.f7168a == c0102a.f7168a && this.f7169b == c0102a.f7169b;
        }

        public int hashCode() {
            return (((int) this.f7168a) * 31) + ((int) this.f7169b);
        }
    }

    public static class b implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f7173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f7174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.d f7175f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, com.applovin.exoplayer2.l.d.f7613a);
        }

        public b(int i10, int i11, int i12, float f10, float f11, com.applovin.exoplayer2.l.d dVar) {
            this.f7170a = i10;
            this.f7171b = i11;
            this.f7172c = i12;
            this.f7173d = f10;
            this.f7174e = f11;
            this.f7175f = dVar;
        }

        public a a(ac acVar, int[] iArr, int i10, com.applovin.exoplayer2.k.d dVar, s<C0102a> sVar) {
            return new a(acVar, iArr, i10, dVar, this.f7170a, this.f7171b, this.f7172c, this.f7173d, this.f7174e, sVar, this.f7175f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.j.d.b
        public final d[] a(d.a[] aVarArr, com.applovin.exoplayer2.k.d dVar, p.a aVar, ba baVar) {
            s sVarB = a.b(aVarArr);
            d[] dVarArr = new d[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                d.a aVar2 = aVarArr[i10];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f7253b;
                    if (iArr.length != 0) {
                        dVarArr[i10] = iArr.length == 1 ? new e(aVar2.f7252a, iArr[0], aVar2.f7254c) : a(aVar2.f7252a, iArr, aVar2.f7254c, dVar, (s) sVarB.get(i10));
                    }
                }
            }
            return dVarArr;
        }
    }

    public a(ac acVar, int[] iArr, int i10, com.applovin.exoplayer2.k.d dVar, long j10, long j11, long j12, float f10, float f11, List<C0102a> list, com.applovin.exoplayer2.l.d dVar2) {
        super(acVar, iArr, i10);
        if (j12 < j10) {
            q.c("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f7155d = dVar;
        this.f7156e = j10 * 1000;
        this.f7157f = j11 * 1000;
        this.f7158g = j12 * 1000;
        this.f7159h = f10;
        this.f7160i = f11;
        this.f7161j = s.a((Collection) list);
        this.f7162k = dVar2;
        this.f7163l = 1.0f;
        this.f7165n = 0;
        this.f7166o = -9223372036854775807L;
    }

    private static s<Integer> a(long[][] jArr) {
        com.applovin.exoplayer2.common.a.ac acVarB = ad.a().b().b();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                int length = jArr[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double dLog = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        dLog = Math.log(jArr[i10][i11]);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    acVarB.a(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return s.a(acVarB.h());
    }

    private static void a(List<s.a<C0102a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            s.a<C0102a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0102a(j10, jArr[i10]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s<s<C0102a>> b(d.a[] aVarArr) {
        s.a aVarI;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10] == null || aVarArr[i10].f7253b.length <= 1) {
                aVarI = null;
            } else {
                aVarI = s.i();
                aVarI.a(new C0102a(0L, 0L));
            }
            arrayList.add(aVarI);
        }
        long[][] jArrC = c(aVarArr);
        int[] iArr = new int[jArrC.length];
        long[] jArr = new long[jArrC.length];
        for (int i11 = 0; i11 < jArrC.length; i11++) {
            jArr[i11] = jArrC[i11].length == 0 ? 0L : jArrC[i11][0];
        }
        a(arrayList, jArr);
        s<Integer> sVarA = a(jArrC);
        for (int i12 = 0; i12 < sVarA.size(); i12++) {
            int iIntValue = sVarA.get(i12).intValue();
            int i13 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i13;
            jArr[iIntValue] = jArrC[iIntValue][i13];
            a(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        a(arrayList, jArr);
        s.a aVarI2 = s.i();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            s.a aVar = (s.a) arrayList.get(i15);
            aVarI2.a(aVar == null ? s.g() : aVar.a());
        }
        return aVarI2.a();
    }

    private static long[][] c(d.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            d.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f7253b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f7253b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    jArr[i10][i11] = aVar.f7252a.a(iArr[i11]).f8194h;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void a() {
        this.f7166o = -9223372036854775807L;
        this.f7167p = null;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void a(float f10) {
        this.f7163l = f10;
    }

    @Override // com.applovin.exoplayer2.j.b, com.applovin.exoplayer2.j.d
    public void b() {
        this.f7167p = null;
    }

    @Override // com.applovin.exoplayer2.j.d
    public int c() {
        return this.f7164m;
    }
}
