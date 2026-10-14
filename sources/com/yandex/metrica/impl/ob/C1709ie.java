package com.yandex.metrica.impl.ob;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1709ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16346b;

    public C1709ie(String str, boolean z10) {
        this.f16345a = str;
        this.f16346b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1709ie.class != obj.getClass()) {
            return false;
        }
        C1709ie c1709ie = (C1709ie) obj;
        if (this.f16346b != c1709ie.f16346b) {
            return false;
        }
        return this.f16345a.equals(c1709ie.f16345a);
    }

    public int hashCode() {
        return (this.f16345a.hashCode() * 31) + (this.f16346b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("PermissionState{name='");
        l1.c.a(sbA, this.f16345a, CoreConstants.SINGLE_QUOTE_CHAR, ", granted=");
        return androidx.recyclerview.widget.s.a(sbA, this.f16346b, '}');
    }
}
