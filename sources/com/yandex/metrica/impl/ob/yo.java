package com.yandex.metrica.impl.ob;

import com.yandex.metrica.Revenue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class yo implements uo<Revenue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uo<List<so>> f17947a = new to();

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(Revenue revenue) {
        return this.f17947a.a(Arrays.asList(new xo().a(revenue.quantity)));
    }
}
