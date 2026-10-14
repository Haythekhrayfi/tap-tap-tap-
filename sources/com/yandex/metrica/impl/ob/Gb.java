package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.ecommerce.ECommerceReferrer;

/* JADX INFO: loaded from: classes.dex */
public class Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hb f14088c;

    public Gb(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new Hb(eCommerceReferrer.getScreen()));
    }

    public Gb(String str, String str2, Hb hb2) {
        this.f14086a = str;
        this.f14087b = str2;
        this.f14088c = hb2;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ReferrerWrapper{type='");
        l1.c.a(sbA, this.f14086a, CoreConstants.SINGLE_QUOTE_CHAR, ", identifier='");
        l1.c.a(sbA, this.f14087b, CoreConstants.SINGLE_QUOTE_CHAR, ", screen=");
        sbA.append(this.f14088c);
        sbA.append('}');
        return sbA.toString();
    }
}
