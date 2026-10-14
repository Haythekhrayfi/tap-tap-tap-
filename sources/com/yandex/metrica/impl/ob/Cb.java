package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Ab> f13769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f13770d;

    public Cb(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), U2.c(eCommerceOrder.getPayload()));
    }

    public Cb(String str, String str2, List<Ab> list, Map<String, String> map) {
        this.f13767a = str;
        this.f13768b = str2;
        this.f13769c = list;
        this.f13770d = map;
    }

    private static List<Ab> a(List<ECommerceCartItem> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ECommerceCartItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Ab(it.next()));
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("OrderWrapper{uuid='");
        l1.c.a(sbA, this.f13767a, CoreConstants.SINGLE_QUOTE_CHAR, ", identifier='");
        l1.c.a(sbA, this.f13768b, CoreConstants.SINGLE_QUOTE_CHAR, ", cartItems=");
        sbA.append(this.f13769c);
        sbA.append(", payload=");
        sbA.append(this.f13770d);
        sbA.append('}');
        return sbA.toString();
    }
}
