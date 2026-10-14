package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.ecommerce.ECommerceScreen;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f14140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f14142d;

    public Hb(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), U2.a((Collection) eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), U2.c(eCommerceScreen.getPayload()));
    }

    public Hb(String str, List<String> list, String str2, Map<String, String> map) {
        this.f14139a = str;
        this.f14140b = list;
        this.f14141c = str2;
        this.f14142d = map;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ScreenWrapper{name='");
        l1.c.a(sbA, this.f14139a, CoreConstants.SINGLE_QUOTE_CHAR, ", categoriesPath=");
        sbA.append(this.f14140b);
        sbA.append(", searchQuery='");
        l1.c.a(sbA, this.f14141c, CoreConstants.SINGLE_QUOTE_CHAR, ", payload=");
        sbA.append(this.f14142d);
        sbA.append('}');
        return sbA.toString();
    }
}
