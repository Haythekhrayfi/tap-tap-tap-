package com.yandex.metrica.ecommerce;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import java.util.List;
import java.util.Map;
import l1.c;

/* JADX INFO: loaded from: classes.dex */
public class ECommerceScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f13556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, String> f13558d;

    public List<String> getCategoriesPath() {
        return this.f13556b;
    }

    public String getName() {
        return this.f13555a;
    }

    public Map<String, String> getPayload() {
        return this.f13558d;
    }

    public String getSearchQuery() {
        return this.f13557c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f13556b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f13555a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f13558d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f13557c = str;
        return this;
    }

    public String toString() {
        StringBuilder sbA = a.a("ECommerceScreen{name='");
        c.a(sbA, this.f13555a, CoreConstants.SINGLE_QUOTE_CHAR, ", categoriesPath=");
        sbA.append(this.f13556b);
        sbA.append(", searchQuery='");
        c.a(sbA, this.f13557c, CoreConstants.SINGLE_QUOTE_CHAR, ", payload=");
        sbA.append(this.f13558d);
        sbA.append('}');
        return sbA.toString();
    }
}
