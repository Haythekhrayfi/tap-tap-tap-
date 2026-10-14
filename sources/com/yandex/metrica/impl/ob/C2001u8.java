package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2001u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2026v8 f17516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2081x8 f17517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.b f17518c;

    public C2001u8(C2026v8 c2026v8, C2081x8 c2081x8, E8.b bVar) {
        this.f17516a = c2026v8;
        this.f17517b = c2081x8;
        this.f17518c = bVar;
    }

    public E8 a() {
        HashMap map = new HashMap();
        map.put("binary_data", O8.b.f14621a);
        return this.f17518c.a("auto_inapp", this.f17516a.a(), this.f17516a.b(), new SparseArray<>(), new G8("auto_inapp", map));
    }

    public E8 b() {
        HashMap map = new HashMap();
        map.put("preferences", O8.c.f14622a);
        return this.f17518c.a("client storage", this.f17516a.c(), this.f17516a.d(), new SparseArray<>(), new G8("metrica.db", map));
    }

    public E8 c() {
        return this.f17518c.a("main", this.f17516a.e(), this.f17516a.f(), this.f17516a.l(), new G8("main", this.f17517b.a()));
    }

    public E8 d() {
        HashMap map = new HashMap();
        map.put("preferences", O8.c.f14622a);
        return this.f17518c.a("metrica_multiprocess.db", this.f17516a.g(), this.f17516a.h(), new SparseArray<>(), new G8("metrica_multiprocess.db", map));
    }

    public E8 e() {
        HashMap map = new HashMap();
        List<String> list = O8.c.f14622a;
        map.put("preferences", list);
        map.put("binary_data", O8.b.f14621a);
        map.put("startup", list);
        List<String> list2 = O8.a.f14616a;
        map.put("l_dat", list2);
        map.put("lbs_dat", list2);
        return this.f17518c.a("metrica.db", this.f17516a.i(), this.f17516a.j(), this.f17516a.k(), new G8("metrica.db", map));
    }
}
