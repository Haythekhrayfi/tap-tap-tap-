package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class g41 implements h51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<List<am>> f20943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Long> f20944b;

    public g41(ArrayList arrayList, ArrayList arrayList2) {
        this.f20943a = arrayList;
        this.f20944b = arrayList2;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a() {
        return this.f20944b.size();
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final int a(long j10) {
        int i10;
        List<Long> list = this.f20944b;
        Long lValueOf = Long.valueOf(j10);
        int i11 = da1.f19803a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(lValueOf) == 0);
            i10 = iBinarySearch;
        }
        if (i10 < this.f20944b.size()) {
            return i10;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final long a(int i10) {
        pa.a(i10 >= 0);
        pa.a(i10 < this.f20944b.size());
        return this.f20944b.get(i10).longValue();
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final List<am> b(long j10) {
        int i10;
        List<Long> list = this.f20944b;
        Long lValueOf = Long.valueOf(j10);
        int i11 = da1.f19803a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(lValueOf) == 0);
            i10 = iBinarySearch + 1;
        }
        return i10 == -1 ? Collections.emptyList() : this.f20943a.get(i10);
    }
}
