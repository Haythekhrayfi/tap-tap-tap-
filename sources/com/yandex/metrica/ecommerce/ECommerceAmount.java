package com.yandex.metrica.ecommerce;

import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.impl.ob.U2;
import defpackage.a;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public class ECommerceAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f13533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13534b;

    public ECommerceAmount(double d10, String str) {
        this(new BigDecimal(U2.a(d10, 0.0d)), str);
    }

    public ECommerceAmount(long j10, String str) {
        this(U2.a(j10), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f13533a = bigDecimal;
        this.f13534b = str;
    }

    public BigDecimal getAmount() {
        return this.f13533a;
    }

    public String getUnit() {
        return this.f13534b;
    }

    public String toString() {
        StringBuilder sbA = a.a("ECommerceAmount{amount=");
        sbA.append(this.f13533a);
        sbA.append(", unit='");
        sbA.append(this.f13534b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
