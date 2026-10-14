package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0802Cq {
    public final int A00;
    public final String A01;
    public final List<C0801Cp> A02;
    public final byte[] A03;

    public C0802Cq(int i10, String str, List<C0801Cp> list, byte[] bArr) {
        List<C0801Cp> listUnmodifiableList;
        this.A00 = i10;
        this.A01 = str;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = listUnmodifiableList;
        this.A03 = bArr;
    }
}
