package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FalseClick f24524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<u71> f24525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j80 f24526c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FalseClick f24527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<u71> f24528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private j80 f24529c;

        public final void a(FalseClick falseClick) {
            this.f24527a = falseClick;
        }

        public final void a(j80 j80Var) {
            this.f24529c = j80Var;
        }

        public final void a(List list) {
            this.f24528b = list;
        }
    }

    public ql(a aVar) {
        this.f24524a = aVar.f24527a;
        this.f24525b = aVar.f24528b;
        this.f24526c = aVar.f24529c;
    }

    public final FalseClick a() {
        return this.f24524a;
    }

    public final j80 b() {
        return this.f24526c;
    }

    public final List<u71> c() {
        return this.f24525b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ql.class != obj.getClass()) {
            return false;
        }
        ql qlVar = (ql) obj;
        FalseClick falseClick = this.f24524a;
        if (falseClick == null ? qlVar.f24524a != null : !falseClick.equals(qlVar.f24524a)) {
            return false;
        }
        j80 j80Var = this.f24526c;
        if (j80Var == null ? qlVar.f24526c != null : !j80Var.equals(qlVar.f24526c)) {
            return false;
        }
        List<u71> list = this.f24525b;
        List<u71> list2 = qlVar.f24525b;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public final int hashCode() {
        FalseClick falseClick = this.f24524a;
        int iHashCode = (falseClick != null ? falseClick.hashCode() : 0) * 31;
        List<u71> list = this.f24525b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        j80 j80Var = this.f24526c;
        return iHashCode2 + (j80Var != null ? j80Var.hashCode() : 0);
    }
}
