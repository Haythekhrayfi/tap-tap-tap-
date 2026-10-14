package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i implements com.applovin.exoplayer2.i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f7127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f7128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f7129c;

    public i(List<e> list) {
        this.f7127a = Collections.unmodifiableList(new ArrayList(list));
        this.f7128b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f7128b;
            jArr[i11] = eVar.f7098b;
            jArr[i11 + 1] = eVar.f7099c;
        }
        long[] jArr2 = this.f7128b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f7129c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(e eVar, e eVar2) {
        return Long.compare(eVar.f7098b, eVar2.f7098b);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        int iB = ai.b(this.f7129c, j10, false, false);
        if (iB < this.f7129c.length) {
            return iB;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0);
        com.applovin.exoplayer2.l.a.a(i10 < this.f7129c.length);
        return this.f7129c[i10];
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f7127a.size(); i10++) {
            long[] jArr = this.f7128b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f7127a.get(i10);
                com.applovin.exoplayer2.i.a aVar = eVar.f7097a;
                if (aVar.f6742f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.applovin.exoplayer2.i.i.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i.a((e) obj, (e) obj2);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f7097a.a().a((-1) - i12, 1).e());
        }
        return arrayList;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.f7129c.length;
    }
}
