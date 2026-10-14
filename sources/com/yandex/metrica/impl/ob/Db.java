package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import com.yandex.metrica.ecommerce.ECommercePrice;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2109yb f13806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C2109yb> f13807b;

    public Db(ECommercePrice eCommercePrice) {
        this(new C2109yb(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public Db(C2109yb c2109yb, List<C2109yb> list) {
        this.f13806a = c2109yb;
        this.f13807b = list;
    }

    public static List<C2109yb> a(List<ECommerceAmount> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ECommerceAmount eCommerceAmount : list) {
            linkedList.add(new C2109yb(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PriceWrapper{fiat=");
        sbA.append(this.f13806a);
        sbA.append(", internalComponents=");
        return l1.f.a(sbA, this.f13807b, '}');
    }
}
