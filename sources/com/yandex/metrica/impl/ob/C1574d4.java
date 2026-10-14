package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.E4;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<CU>] */
/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1574d4<CU extends E4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<CU> f15911a = new CopyOnWriteArrayList();

    public List<CU> a() {
        return this.f15911a;
    }

    public void a(CU cu) {
        this.f15911a.add(cu);
    }

    public void b(CU cu) {
        this.f15911a.remove(cu);
    }
}
