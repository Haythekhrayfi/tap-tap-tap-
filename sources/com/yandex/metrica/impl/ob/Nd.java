package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8 f14541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A8 f14542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kd f14543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Id f14544d;

    public Nd(Context context) {
        this(Qa.a(context).f(), Qa.a(context).e(), new Cc(context), new Jd(), new Hd());
    }

    public Nd(B8 b10, A8 a10, Cc cc2, Jd jd2, Hd hd2) {
        this(b10, a10, new Kd(cc2, jd2), new Id(cc2, hd2));
    }

    public Nd(B8 b10, A8 a10, Kd kd2, Id id2) {
        this.f14541a = b10;
        this.f14542b = a10;
        this.f14543c = kd2;
        this.f14544d = id2;
    }

    public Md a(int i10) {
        Map<Long, String> mapA = this.f14541a.a(i10);
        Map<Long, String> mapA2 = this.f14542b.a(i10);
        Uf uf = new Uf();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapA;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Uf.b bVarA = this.f14543c.a(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        uf.f15154b = (Uf.b[]) arrayList.toArray(new Uf.b[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mapA2;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Uf.a aVarA = this.f14544d.a(((Long) entry2.getKey()).longValue(), (String) entry2.getValue());
            if (aVarA != null) {
                arrayList2.add(aVarA);
            }
        }
        uf.f15155c = (Uf.a[]) arrayList2.toArray(new Uf.a[arrayList2.size()]);
        return new Md(mapA.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap.keySet())).longValue(), mapA2.isEmpty() ? -1L : ((Long) Collections.max(linkedHashMap2.keySet())).longValue(), uf);
    }

    public void a(Md md2) {
        long j10 = md2.f14500a;
        if (j10 >= 0) {
            this.f14541a.c(j10);
        }
        long j11 = md2.f14501b;
        if (j11 >= 0) {
            this.f14542b.c(j11);
        }
    }
}
