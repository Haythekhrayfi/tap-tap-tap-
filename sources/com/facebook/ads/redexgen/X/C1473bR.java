package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1473bR<ModelType, StateType> {
    public static byte[] A06;
    public static String[] A07 = {"K3IBH5IY5D9A1s0otTNJJ1EDvo1qLs", "HR7iyfZ1MOS5huP42RSdRpCkeBunQMOf", "", "bEqFTGguyIKgMYqaAFudqvCpFKGvMgpm", "3wGEEC73gwsSkVWXWqLxZk", "wIAJ3aMEmj6qTKsV0aDgjtipvoJzkW0C", "SCvpsyQDnQo4JnEbtI83SB", "GSqpB1BwT3x"};
    public static final C1473bR A08;
    public boolean A00;
    public final C1473bR A01;
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public final List<InterfaceC1476bU<ModelType, StateType>> A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{81, 89, 92, 96, 101};
    }

    static {
        A02();
        A08 = new C1473bR(null, null, A01(0, 5, 123), Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bR != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bS != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    public C1473bR(C1474bS<ModelType, StateType> c1474bS) {
        List listEmptyList;
        Object obj = c1474bS.A02;
        Object obj2 = c1474bS.A03;
        String str = c1474bS.A04;
        if (c1474bS.A01 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = c1474bS.A01;
        }
        this(obj, obj2, str, listEmptyList, c1474bS.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bR != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C1473bR(ModelType model, StateType state, String str, List<InterfaceC1476bU<ModelType, StateType>> list, C1473bR c1473bR) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
        this.A01 = c1473bR;
        this.A00 = false;
        this.A05 = list;
    }

    public static <ModelType, StateType> C1474bS<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C1474bS<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bR != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bU != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC1462bG interfaceC1462bG) {
        Iterator<InterfaceC1476bU<ModelType, StateType>> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().A5W(this, interfaceC1462bG);
        }
        EnumC1463bH enumC1463bHA89 = interfaceC1462bG.A89(this);
        String[] strArr = A07;
        if (strArr[1].charAt(23) == strArr[3].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "xMDdEaQw2xH";
        strArr2[2] = "";
        if (enumC1463bHA89 == EnumC1463bH.A02) {
            this.A00 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bR != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A00;
    }
}
