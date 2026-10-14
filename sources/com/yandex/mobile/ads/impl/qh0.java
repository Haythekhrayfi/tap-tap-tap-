package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m80 f24499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<qa<?>> f24501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f24502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdImpressionData f24503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f24504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private cv f24505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private cv f24506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet f24507i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashSet f24508j = new HashSet();

    public final String a() {
        return this.f24502d;
    }

    public final void a(AdImpressionData adImpressionData) {
        this.f24503e = adImpressionData;
    }

    public final void a(cv cvVar) {
        this.f24505g = cvVar;
    }

    public final void a(g11 g11Var) {
        this.f24508j.add(g11Var);
    }

    public final void a(m80 m80Var) {
        this.f24499a = m80Var;
    }

    public final void a(String str) {
        this.f24507i.add(str);
    }

    public final void a(ArrayList arrayList) {
        this.f24507i.addAll(arrayList);
    }

    public final List<qa<?>> b() {
        return this.f24501c;
    }

    public final void b(cv cvVar) {
        this.f24506h = cvVar;
    }

    public final void b(String str) {
        this.f24502d = str;
    }

    public final void b(ArrayList arrayList) {
        this.f24508j.addAll(arrayList);
    }

    public final AdImpressionData c() {
        return this.f24503e;
    }

    public final void c(String str) {
        int i10 = 0;
        for (int i11 : a6.b(3)) {
            if (px0.a(i11).equals(str)) {
                i10 = i11;
                break;
            }
        }
        this.f24500b = i10;
    }

    public final void c(ArrayList arrayList) {
        this.f24501c = arrayList;
    }

    public final String d() {
        return this.f24504f;
    }

    public final void d(String str) {
        this.f24504f = str;
    }

    public final m80 e() {
        return this.f24499a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qh0.class != obj.getClass()) {
            return false;
        }
        qh0 qh0Var = (qh0) obj;
        m80 m80Var = this.f24499a;
        if (m80Var == null ? qh0Var.f24499a != null : !m80Var.equals(qh0Var.f24499a)) {
            return false;
        }
        if (this.f24500b != qh0Var.f24500b) {
            return false;
        }
        List<qa<?>> list = this.f24501c;
        if (list == null ? qh0Var.f24501c != null : !list.equals(qh0Var.f24501c)) {
            return false;
        }
        String str = this.f24502d;
        if (str == null ? qh0Var.f24502d != null : !str.equals(qh0Var.f24502d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f24503e;
        if (adImpressionData == null ? qh0Var.f24503e != null : !adImpressionData.equals(qh0Var.f24503e)) {
            return false;
        }
        String str2 = this.f24504f;
        if (str2 == null ? qh0Var.f24504f != null : !str2.equals(qh0Var.f24504f)) {
            return false;
        }
        cv cvVar = this.f24505g;
        if (cvVar == null ? qh0Var.f24505g != null : !cvVar.equals(qh0Var.f24505g)) {
            return false;
        }
        cv cvVar2 = this.f24506h;
        if (cvVar2 == null ? qh0Var.f24506h != null : !cvVar2.equals(qh0Var.f24506h)) {
            return false;
        }
        if (this.f24507i.equals(qh0Var.f24507i)) {
            return this.f24508j.equals(qh0Var.f24508j);
        }
        return false;
    }

    public final ArrayList f() {
        return new ArrayList(this.f24507i);
    }

    public final int g() {
        return this.f24500b;
    }

    public final ArrayList h() {
        return new ArrayList(this.f24508j);
    }

    public final int hashCode() {
        m80 m80Var = this.f24499a;
        int iHashCode = (m80Var != null ? m80Var.hashCode() : 0) * 31;
        int i10 = this.f24500b;
        int iA = (iHashCode + (i10 != 0 ? a6.a(i10) : 0)) * 31;
        List<qa<?>> list = this.f24501c;
        int iHashCode2 = (iA + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f24502d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f24503e;
        int iHashCode4 = (iHashCode3 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        String str2 = this.f24504f;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        cv cvVar = this.f24505g;
        int iHashCode6 = (iHashCode5 + (cvVar != null ? cvVar.hashCode() : 0)) * 31;
        cv cvVar2 = this.f24506h;
        return this.f24508j.hashCode() + ((this.f24507i.hashCode() + ((iHashCode6 + (cvVar2 != null ? cvVar2.hashCode() : 0)) * 31)) * 31);
    }
}
