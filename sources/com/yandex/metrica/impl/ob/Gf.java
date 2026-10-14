package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Gf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f14096c = {0, 1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<HashMap<String, C1511ag.a>> f14097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14098b;

    public Gf() {
        this(f14096c);
    }

    public Gf(int[] iArr) {
        this.f14097a = new SparseArray<>();
        this.f14098b = 0;
        for (int i10 : iArr) {
            this.f14097a.put(i10, new HashMap<>());
        }
    }

    public int a() {
        return this.f14098b;
    }

    public C1511ag.a a(int i10, String str) {
        return this.f14097a.get(i10).get(str);
    }

    public void a(C1511ag.a aVar) {
        this.f14097a.get(aVar.f15752c).put(new String(aVar.f15751b), aVar);
    }

    public void b() {
        this.f14098b++;
    }

    public C1511ag c() {
        C1511ag c1511ag = new C1511ag();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f14097a.size(); i10++) {
            SparseArray<HashMap<String, C1511ag.a>> sparseArray = this.f14097a;
            Iterator<C1511ag.a> it = sparseArray.get(sparseArray.keyAt(i10)).values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        c1511ag.f15749b = (C1511ag.a[]) arrayList.toArray(new C1511ag.a[arrayList.size()]);
        return c1511ag;
    }
}
