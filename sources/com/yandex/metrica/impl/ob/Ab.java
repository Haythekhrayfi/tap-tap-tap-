package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public class Ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb f13633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f13634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Db f13635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gb f13636d;

    public Ab(ECommerceCartItem eCommerceCartItem) {
        this(new Eb(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Db(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Gb(eCommerceCartItem.getReferrer()));
    }

    public Ab(Eb eb2, BigDecimal bigDecimal, Db db2, Gb gb2) {
        this.f13633a = eb2;
        this.f13634b = bigDecimal;
        this.f13635c = db2;
        this.f13636d = gb2;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CartItemWrapper{product=");
        sbA.append(this.f13633a);
        sbA.append(", quantity=");
        sbA.append(this.f13634b);
        sbA.append(", revenue=");
        sbA.append(this.f13635c);
        sbA.append(", referrer=");
        sbA.append(this.f13636d);
        sbA.append('}');
        return sbA.toString();
    }
}
