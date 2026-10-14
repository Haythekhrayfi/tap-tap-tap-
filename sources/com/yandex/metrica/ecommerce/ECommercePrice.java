package com.yandex.metrica.ecommerce;

import defpackage.a;
import java.util.List;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public class ECommercePrice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECommerceAmount f13543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<ECommerceAmount> f13544b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f13543a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f13543a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f13544b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f13544b = list;
        return this;
    }

    public String toString() {
        StringBuilder sbA = a.a("ECommercePrice{fiat=");
        sbA.append(this.f13543a);
        sbA.append(", internalComponents=");
        return f.a(sbA, this.f13544b, '}');
    }
}
