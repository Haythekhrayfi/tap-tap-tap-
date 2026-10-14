package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0923Ho implements Comparator<C0924Hp> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0924Hp c0924Hp, C0924Hp c0924Hp2) {
        if (c0924Hp.A00 < c0924Hp2.A00) {
            return -1;
        }
        return c0924Hp2.A00 < c0924Hp.A00 ? 1 : 0;
    }
}
