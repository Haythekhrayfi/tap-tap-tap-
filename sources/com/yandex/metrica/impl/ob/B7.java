package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class B7 implements Object<C1776l7, Of> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C7 f13713a = new C7();

    public Object a(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Of[] b(List<C1776l7> list) {
        Of[] ofArr = new Of[list.size()];
        Iterator<C1776l7> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ofArr[i10] = this.f13713a.b(it.next());
            i10++;
        }
        return ofArr;
    }
}
