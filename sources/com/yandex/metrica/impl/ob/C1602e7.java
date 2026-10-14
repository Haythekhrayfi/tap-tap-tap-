package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1602e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1801m7 f16025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C1801m7> f16026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16027c;

    public C1602e7(C1801m7 c1801m7, List<C1801m7> list, String str) {
        this.f16025a = c1801m7;
        this.f16026b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f16027c = str;
    }
}
