package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class V9 extends GP {
    public static String[] A01 = {"JXADnguvwbjBsYgslHoSHgr2xxMnawNn", "", "jNEAQ3UZ70aM1hHDYV2CS20ieNSkmYbb", "bnkACY5tQbsoiCdyBJgaOjSRI0w0kmrQ", "gVGuKveDeddXJzh5PaouiQlIwgfOoZnh", "qzMEUGGJ0FpDLYRljtzJ24rj8XT6rBKz", "LijUR", "ZVB7ZDT4TSe2rtQPBLBW6RwhtV59NTLq"};
    public GK A00;

    public abstract Pair<C07409r[], GM[]> A0V(GK gk, int[][][] iArr, int[] iArr2) throws C9I;

    public static int A0Q(InterfaceC07399q[] interfaceC07399qArr, TrackGroup trackGroup) throws C9I {
        int formatSupportLevel = interfaceC07399qArr.length;
        int trackIndex = 0;
        for (int i10 = 0; i10 < bestRendererIndex; i10++) {
            InterfaceC07399q interfaceC07399q = interfaceC07399qArr[i10];
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC07399q.AFi(trackGroup.A01(bestFormatSupportLevel));
                int bestRendererIndex2 = bestRendererIndex & 7;
                if (bestRendererIndex2 > trackIndex) {
                    formatSupportLevel = i10;
                    trackIndex = bestRendererIndex2;
                    if (trackIndex == 4) {
                        return formatSupportLevel;
                    }
                }
            }
        }
        return formatSupportLevel;
    }

    public static int[] A0R(InterfaceC07399q interfaceC07399q, TrackGroup trackGroup) throws C9I {
        int[] iArr = new int[trackGroup.A01];
        for (int i10 = 0; i10 < trackGroup.A01; i10++) {
            iArr[i10] = interfaceC07399q.AFi(trackGroup.A01(i10));
        }
        return iArr;
    }

    public static int[] A0S(InterfaceC07399q[] interfaceC07399qArr) throws C9I {
        int[] iArr = new int[interfaceC07399qArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = interfaceC07399qArr[i10].AFk();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    @Override // com.facebook.ads.redexgen.X.GP
    public final GQ A0T(InterfaceC07399q[] interfaceC07399qArr, TrackGroupArray trackGroupArray) throws C9I {
        InterfaceC07399q interfaceC07399q;
        int[] iArrA0R;
        int[] iArr = new int[interfaceC07399qArr.length + 1];
        TrackGroup[][] trackGroupArr = new TrackGroup[interfaceC07399qArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC07399qArr.length + 1][][];
        for (int i10 = 0; i10 < trackGroupArr.length; i10++) {
            trackGroupArr[i10] = new TrackGroup[trackGroupArray.A01];
            iArr2[i10] = new int[trackGroupArray.A01][];
            if (A01[2].charAt(17) != 'V') {
                throw new RuntimeException();
            }
            A01[1] = "";
        }
        int[] iArrA0S = A0S(interfaceC07399qArr);
        for (int i11 = 0; i11 < trackGroupArray.A01; i11++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i11);
            int iA0Q = A0Q(interfaceC07399qArr, trackGroupA01);
            int groupIndex = interfaceC07399qArr.length;
            if (A01[4].charAt(3) != 'u') {
                A01[6] = "flHuZy9qfiSfYNp536tqdaojA4";
                if (iA0Q == groupIndex) {
                    iArrA0R = new int[trackGroupA01.A01];
                } else {
                    interfaceC07399q = interfaceC07399qArr[iA0Q];
                    if (A01[4].charAt(3) != 'u') {
                        iArrA0R = A0R(interfaceC07399q, trackGroupA01);
                    } else {
                        A01[1] = "";
                        iArrA0R = A0R(interfaceC07399q, trackGroupA01);
                    }
                }
            } else {
                String[] strArr = A01;
                strArr[7] = "D4rc1OneeydPNAn3BWDV4yQ6n9XdhHzA";
                strArr[3] = "1lNTPVAxZlA71NpHB66K3LVNnVnwQcNq";
                if (iA0Q == groupIndex) {
                    iArrA0R = new int[trackGroupA01.A01];
                } else {
                    interfaceC07399q = interfaceC07399qArr[iA0Q];
                    if (A01[4].charAt(3) != 'u') {
                        iArrA0R = A0R(interfaceC07399q, trackGroupA01);
                    } else {
                        A01[1] = "";
                        iArrA0R = A0R(interfaceC07399q, trackGroupA01);
                    }
                }
            }
            int i12 = iArr[iA0Q];
            trackGroupArr[iA0Q][i12] = trackGroupA01;
            iArr2[iA0Q][i12] = iArrA0R;
            iArr[iA0Q] = iArr[iA0Q] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[interfaceC07399qArr.length];
        int[] iArr3 = new int[interfaceC07399qArr.length];
        for (int i13 = 0; i13 < interfaceC07399qArr.length; i13++) {
            int i14 = iArr[i13];
            trackGroupArrayArr[i13] = new TrackGroupArray((TrackGroup[]) C0930Hv.A0k(trackGroupArr[i13], i14));
            iArr2[i13] = (int[][]) C0930Hv.A0k(iArr2[i13], i14);
            iArr3[i13] = interfaceC07399qArr[i13].A82();
        }
        GK gk = new GK(iArr3, trackGroupArrayArr, iArrA0S, iArr2, new TrackGroupArray((TrackGroup[]) C0930Hv.A0k(trackGroupArr[interfaceC07399qArr.length], iArr[interfaceC07399qArr.length])));
        Pair<C07409r[], GM[]> pairA0V = A0V(gk, iArr2, iArrA0S);
        return new GQ((C07409r[]) pairA0V.first, (GM[]) pairA0V.second, gk);
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final void A0U(Object obj) {
        this.A00 = (GK) obj;
    }
}
