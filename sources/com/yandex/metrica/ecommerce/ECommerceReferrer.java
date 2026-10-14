package com.yandex.metrica.ecommerce;

import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import l1.c;

/* JADX INFO: loaded from: classes.dex */
public class ECommerceReferrer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ECommerceScreen f13554c;

    public String getIdentifier() {
        return this.f13553b;
    }

    public ECommerceScreen getScreen() {
        return this.f13554c;
    }

    public String getType() {
        return this.f13552a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f13553b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f13554c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f13552a = str;
        return this;
    }

    public String toString() {
        StringBuilder sbA = a.a("ECommerceReferrer{type='");
        c.a(sbA, this.f13552a, CoreConstants.SINGLE_QUOTE_CHAR, ", identifier='");
        c.a(sbA, this.f13553b, CoreConstants.SINGLE_QUOTE_CHAR, ", screen=");
        sbA.append(this.f13554c);
        sbA.append('}');
        return sbA.toString();
    }
}
