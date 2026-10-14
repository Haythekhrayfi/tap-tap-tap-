package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.U2;
import defpackage.a;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public class ECommerceCartItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECommerceProduct f13535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f13536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ECommercePrice f13537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ECommerceReferrer f13538d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d10) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(U2.a(d10, 0.0d)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j10) {
        this(eCommerceProduct, eCommercePrice, U2.a(j10));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f13535a = eCommerceProduct;
        this.f13536b = bigDecimal;
        this.f13537c = eCommercePrice;
    }

    public ECommerceProduct getProduct() {
        return this.f13535a;
    }

    public BigDecimal getQuantity() {
        return this.f13536b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f13538d;
    }

    public ECommercePrice getRevenue() {
        return this.f13537c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f13538d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        StringBuilder sbA = a.a("ECommerceCartItem{product=");
        sbA.append(this.f13535a);
        sbA.append(", quantity=");
        sbA.append(this.f13536b);
        sbA.append(", revenue=");
        sbA.append(this.f13537c);
        sbA.append(", referrer=");
        sbA.append(this.f13538d);
        sbA.append('}');
        return sbA.toString();
    }
}
