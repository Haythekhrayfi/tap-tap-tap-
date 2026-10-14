package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class d7 extends ne {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ad f19769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ki f19770g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19772b;

        public a(long j10, long j11) {
            this.f19771a = j10;
            this.f19772b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19771a == aVar.f19771a && this.f19772b == aVar.f19772b;
        }

        public final int hashCode() {
            return (((int) this.f19771a) * 31) + ((int) this.f19772b);
        }
    }

    public static class b implements et.b {
        public b(int i10) {
            this((Object) null);
        }

        public b(Object obj) {
        }
    }

    public d7(h71 h71Var, int[] iArr, int i10, ad adVar, long j10, long j11, com.yandex.mobile.ads.embedded.guava.collect.p pVar, ki kiVar) {
        super(h71Var, iArr);
        if (j11 < j10) {
            p90.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f19769f = adVar;
        com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) pVar);
        this.f19770g = kiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.yandex.mobile.ads.embedded.guava.collect.p a(et.a[] aVarArr) {
        int i10;
        int[] iArr;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= aVarArr.length) {
                break;
            }
            et.a aVar2 = aVarArr[i12];
            if (aVar2 == null || aVar2.f20319b.length <= 1) {
                aVar = null;
            } else {
                int i13 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
                aVar = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
                aVar.b(new a(0L, 0L));
            }
            arrayList.add(aVar);
            i12++;
        }
        int length = aVarArr.length;
        long[][] jArr = new long[length][];
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            et.a aVar3 = aVarArr[i14];
            if (aVar3 == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[aVar3.f20319b.length];
                int i15 = 0;
                while (true) {
                    int[] iArr2 = aVar3.f20319b;
                    if (i15 >= iArr2.length) {
                        break;
                    }
                    jArr[i14][i15] = aVar3.f20318a.a(iArr2[i15]).f27111h;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        int[] iArr3 = new int[length];
        long[] jArr2 = new long[length];
        for (int i16 = 0; i16 < length; i16++) {
            long[] jArr3 = jArr[i16];
            jArr2[i16] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        hh0 hh0VarB = com.yandex.mobile.ads.embedded.guava.collect.z.a().a().b();
        int i17 = 0;
        while (i17 < length) {
            long[] jArr4 = jArr[i17];
            if (jArr4.length <= i10) {
                iArr = iArr3;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i18 = i11;
                while (true) {
                    long[] jArr5 = jArr[i17];
                    double dLog = 0.0d;
                    iArr = iArr3;
                    if (i18 >= jArr5.length) {
                        break;
                    }
                    long j10 = jArr5[i18];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i18] = dLog;
                    i18++;
                    iArr3 = iArr;
                }
                int i19 = length2 - 1;
                double d10 = dArr[i19] - dArr[i11];
                int i20 = i11;
                while (i20 < i19) {
                    double d11 = dArr[i20];
                    i20++;
                    hh0VarB.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i20]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i17));
                    i11 = 0;
                }
            }
            i17++;
            iArr3 = iArr;
            i11 = 0;
            i10 = 1;
        }
        int[] iArr4 = iArr3;
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a(hh0VarB.values());
        for (int i21 = 0; i21 < pVarA.size(); i21++) {
            int iIntValue = ((Integer) pVarA.get(i21)).intValue();
            int i22 = iArr4[iIntValue] + 1;
            iArr4[iIntValue] = i22;
            jArr2[iIntValue] = jArr[iIntValue][i22];
            a(arrayList, jArr2);
        }
        for (int i23 = 0; i23 < aVarArr.length; i23++) {
            if (arrayList.get(i23) != null) {
                jArr2[i23] = jArr2[i23] * 2;
            }
        }
        a(arrayList, jArr2);
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar4 = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            com.yandex.mobile.ads.embedded.guava.collect.p.a aVar5 = (com.yandex.mobile.ads.embedded.guava.collect.p.a) arrayList.get(i24);
            aVar4.b((Object) (aVar5 == null ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : aVar5.a()));
        }
        return aVar4.a();
    }

    private static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            com.yandex.mobile.ads.embedded.guava.collect.p.a aVar = (com.yandex.mobile.ads.embedded.guava.collect.p.a) arrayList.get(i10);
            if (aVar != null) {
                aVar.b(new a(j10, jArr[i10]));
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ne, com.yandex.mobile.ads.impl.et
    public final void a(float f10) {
    }

    @Override // com.yandex.mobile.ads.impl.ne, com.yandex.mobile.ads.impl.et
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.ne, com.yandex.mobile.ads.impl.et
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void e() {
    }
}
