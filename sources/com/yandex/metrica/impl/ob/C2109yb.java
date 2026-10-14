package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2109yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f17901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17902b;

    public C2109yb(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public C2109yb(BigDecimal bigDecimal, String str) {
        this.f17901a = bigDecimal;
        this.f17902b = str;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AmountWrapper{amount=");
        sbA.append(this.f17901a);
        sbA.append(", unit='");
        sbA.append(this.f17902b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
