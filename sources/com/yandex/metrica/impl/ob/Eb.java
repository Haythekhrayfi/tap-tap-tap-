package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.ecommerce.ECommerceProduct;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f13897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f13898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Db f13899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Db f13900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f13901g;

    public Eb(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), U2.a((Collection) eCommerceProduct.getCategoriesPath()), U2.c(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Db(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Db(eCommerceProduct.getOriginalPrice()), U2.a((Collection) eCommerceProduct.getPromocodes()));
    }

    public Eb(String str, String str2, List<String> list, Map<String, String> map, Db db2, Db db3, List<String> list2) {
        this.f13895a = str;
        this.f13896b = str2;
        this.f13897c = list;
        this.f13898d = map;
        this.f13899e = db2;
        this.f13900f = db3;
        this.f13901g = list2;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ProductWrapper{sku='");
        l1.c.a(sbA, this.f13895a, CoreConstants.SINGLE_QUOTE_CHAR, ", name='");
        l1.c.a(sbA, this.f13896b, CoreConstants.SINGLE_QUOTE_CHAR, ", categoriesPath=");
        sbA.append(this.f13897c);
        sbA.append(", payload=");
        sbA.append(this.f13898d);
        sbA.append(", actualPrice=");
        sbA.append(this.f13899e);
        sbA.append(", originalPrice=");
        sbA.append(this.f13900f);
        sbA.append(", promocodes=");
        return l1.f.a(sbA, this.f13901g, '}');
    }
}
