package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class ij1 implements h51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ej1> f21732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f21733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f21734c;

    public ij1(ArrayList arrayList) {
        this.f21732a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f21733b = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ej1 ej1Var = (ej1) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f21733b;
            jArr[i11] = ej1Var.f20262b;
            jArr[i11 + 1] = ej1Var.f20263c;
        }
        long[] jArr2 = this.f21733b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f21734c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ej1 ej1Var, ej1 ej1Var2) {
        return Long.compare(ej1Var.f20262b, ej1Var2.f20262b);
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a() {
        return this.f21734c.length;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a(long j10) {
        int iA = da1.a(this.f21734c, j10, false);
        if (iA < this.f21734c.length) {
            return iA;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final long a(int i10) {
        pa.a(i10 >= 0);
        pa.a(i10 < this.f21734c.length);
        return this.f21734c[i10];
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final List<am> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f21732a.size(); i10++) {
            long[] jArr = this.f21733b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                ej1 ej1Var = this.f21732a.get(i10);
                am amVar = ej1Var.f20261a;
                if (amVar.f18961e == -3.4028235E38f) {
                    arrayList2.add(ej1Var);
                } else {
                    arrayList.add(amVar);
                }
            }
        }
        Collections.sort(arrayList2, fo1.f20764e);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((ej1) arrayList2.get(i12)).f20261a.a().a(1, (-1) - i12).a());
        }
        return arrayList;
    }
}
