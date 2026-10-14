package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<m> f22940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FalseClick f22941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22944e;

    public m80(List<m> list, FalseClick falseClick, String str, String str2, long j10) {
        this.f22940a = list;
        this.f22941b = falseClick;
        this.f22942c = str;
        this.f22943d = str2;
        this.f22944e = j10;
    }

    public final List<m> a() {
        return this.f22940a;
    }

    public final long b() {
        return this.f22944e;
    }

    public final FalseClick c() {
        return this.f22941b;
    }

    public final String d() {
        return this.f22942c;
    }

    public final String e() {
        return this.f22943d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m80.class != obj.getClass()) {
            return false;
        }
        m80 m80Var = (m80) obj;
        if (this.f22944e != m80Var.f22944e) {
            return false;
        }
        List<m> list = this.f22940a;
        if (list == null ? m80Var.f22940a != null : !list.equals(m80Var.f22940a)) {
            return false;
        }
        FalseClick falseClick = this.f22941b;
        if (falseClick == null ? m80Var.f22941b != null : !falseClick.equals(m80Var.f22941b)) {
            return false;
        }
        String str = this.f22942c;
        if (str == null ? m80Var.f22942c != null : !str.equals(m80Var.f22942c)) {
            return false;
        }
        String str2 = this.f22943d;
        String str3 = m80Var.f22943d;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public final int hashCode() {
        List<m> list = this.f22940a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        FalseClick falseClick = this.f22941b;
        int iHashCode2 = (iHashCode + (falseClick != null ? falseClick.hashCode() : 0)) * 31;
        String str = this.f22942c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f22943d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j10 = this.f22944e;
        return iHashCode4 + ((int) (j10 ^ (j10 >>> 32)));
    }
}
