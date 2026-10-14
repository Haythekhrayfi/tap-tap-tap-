package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1550c5<BaseHandler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<BaseHandler> f15872a;

    public C1550c5(List<BaseHandler> list) {
        this.f15872a = Collections.unmodifiableList(list);
    }

    public List<? extends BaseHandler> a() {
        return this.f15872a;
    }
}
