package com.applovin.exoplayer2.j;

import android.util.Pair;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f7257a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f7259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f7260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ad[] f7261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f7262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f7263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ad f7264g;

        public a(String[] strArr, int[] iArr, ad[] adVarArr, int[] iArr2, int[][][] iArr3, ad adVar) {
            this.f7259b = strArr;
            this.f7260c = iArr;
            this.f7261d = adVarArr;
            this.f7263f = iArr3;
            this.f7262e = iArr2;
            this.f7264g = adVar;
            this.f7258a = iArr.length;
        }

        public int a() {
            return this.f7258a;
        }

        public int a(int i10) {
            return this.f7260c[i10];
        }

        public ad b(int i10) {
            return this.f7261d[i10];
        }
    }

    private static int a(as[] asVarArr, ac acVar, int[] iArr, boolean z10) throws p {
        int length = asVarArr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < asVarArr.length; i11++) {
            as asVar = asVarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < acVar.f6506a; i12++) {
                iMax = Math.max(iMax, as.c(asVar.a(acVar.a(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] a(as asVar, ac acVar) throws p {
        int[] iArr = new int[acVar.f6506a];
        for (int i10 = 0; i10 < acVar.f6506a; i10++) {
            iArr[i10] = asVar.a(acVar.a(i10));
        }
        return iArr;
    }

    private static int[] a(as[] asVarArr) throws p {
        int length = asVarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = asVarArr[i10].o();
        }
        return iArr;
    }

    public abstract Pair<at[], d[]> a(a aVar, int[][][] iArr, int[] iArr2, com.applovin.exoplayer2.h.p.a aVar2, ba baVar) throws p;

    @Override // com.applovin.exoplayer2.j.j
    public final k a(as[] asVarArr, ad adVar, com.applovin.exoplayer2.h.p.a aVar, ba baVar) throws p {
        int[] iArr = new int[asVarArr.length + 1];
        int length = asVarArr.length + 1;
        ac[][] acVarArr = new ac[length][];
        int[][][] iArr2 = new int[asVarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = adVar.f6511b;
            acVarArr[i10] = new ac[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrA = a(asVarArr);
        for (int i12 = 0; i12 < adVar.f6511b; i12++) {
            ac acVarA = adVar.a(i12);
            int iA = a(asVarArr, acVarA, iArr, u.e(acVarA.a(0).f8198l) == 5);
            int[] iArrA2 = iA == asVarArr.length ? new int[acVarA.f6506a] : a(asVarArr[iA], acVarA);
            int i13 = iArr[iA];
            acVarArr[iA][i13] = acVarA;
            iArr2[iA][i13] = iArrA2;
            iArr[iA] = iArr[iA] + 1;
        }
        ad[] adVarArr = new ad[asVarArr.length];
        String[] strArr = new String[asVarArr.length];
        int[] iArr3 = new int[asVarArr.length];
        for (int i14 = 0; i14 < asVarArr.length; i14++) {
            int i15 = iArr[i14];
            adVarArr[i14] = new ad((ac[]) ai.a(acVarArr[i14], i15));
            iArr2[i14] = (int[][]) ai.a(iArr2[i14], i15);
            strArr[i14] = asVarArr[i14].y();
            iArr3[i14] = asVarArr[i14].a();
        }
        a aVar2 = new a(strArr, iArr3, adVarArr, iArrA, iArr2, new ad((ac[]) ai.a(acVarArr[asVarArr.length], iArr[asVarArr.length])));
        Pair<at[], d[]> pairA = a(aVar2, iArr2, iArrA, aVar, baVar);
        return new k((at[]) pairA.first, (d[]) pairA.second, aVar2);
    }

    @Override // com.applovin.exoplayer2.j.j
    public final void a(Object obj) {
        this.f7257a = (a) obj;
    }
}
