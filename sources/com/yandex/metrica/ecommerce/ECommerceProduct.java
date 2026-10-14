package com.yandex.metrica.ecommerce;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import java.util.List;
import java.util.Map;
import l1.c;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public class ECommerceProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f13547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, String> f13548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ECommercePrice f13549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ECommercePrice f13550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f13551g;

    public ECommerceProduct(String str) {
        this.f13545a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f13549e;
    }

    public List<String> getCategoriesPath() {
        return this.f13547c;
    }

    public String getName() {
        return this.f13546b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f13550f;
    }

    public Map<String, String> getPayload() {
        return this.f13548d;
    }

    public List<String> getPromocodes() {
        return this.f13551g;
    }

    public String getSku() {
        return this.f13545a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f13549e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f13547c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f13546b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f13550f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f13548d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f13551g = list;
        return this;
    }

    public String toString() {
        StringBuilder sbA = a.a("ECommerceProduct{sku='");
        c.a(sbA, this.f13545a, CoreConstants.SINGLE_QUOTE_CHAR, ", name='");
        c.a(sbA, this.f13546b, CoreConstants.SINGLE_QUOTE_CHAR, ", categoriesPath=");
        sbA.append(this.f13547c);
        sbA.append(", payload=");
        sbA.append(this.f13548d);
        sbA.append(", actualPrice=");
        sbA.append(this.f13549e);
        sbA.append(", originalPrice=");
        sbA.append(this.f13550f);
        sbA.append(", promocodes=");
        return f.a(sbA, this.f13551g, '}');
    }
}
