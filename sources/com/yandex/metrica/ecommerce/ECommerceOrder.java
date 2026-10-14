package com.yandex.metrica.ecommerce;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import java.util.List;
import java.util.Map;
import l1.c;

/* JADX INFO: loaded from: classes.dex */
public class ECommerceOrder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ECommerceCartItem> f13541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f13542c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f13540a = str;
        this.f13541b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f13541b;
    }

    public String getIdentifier() {
        return this.f13540a;
    }

    public Map<String, String> getPayload() {
        return this.f13542c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f13542c = map;
        return this;
    }

    public String toString() {
        StringBuilder sbA = a.a("ECommerceOrder{identifier='");
        c.a(sbA, this.f13540a, CoreConstants.SINGLE_QUOTE_CHAR, ", cartItems=");
        sbA.append(this.f13541b);
        sbA.append(", payload=");
        sbA.append(this.f13542c);
        sbA.append('}');
        return sbA.toString();
    }
}
