package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ju extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f22152b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22154b;

        public a(String str, String str2) {
            this.f22153a = str;
            this.f22154b = str2;
        }

        public final String a() {
            return this.f22153a;
        }

        public final String b() {
            return this.f22154b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f22153a.equals(aVar.f22153a)) {
                return this.f22154b.equals(aVar.f22154b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f22154b.hashCode() + (this.f22153a.hashCode() * 31);
        }
    }

    public ju(String str, ArrayList arrayList) {
        super(str);
        this.f22152b = arrayList;
    }

    public final List<a> b() {
        return this.f22152b;
    }

    @Override // com.yandex.mobile.ads.impl.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ju.class == obj.getClass() && super.equals(obj)) {
            return this.f22152b.equals(((ju) obj).f22152b);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.m
    public final int hashCode() {
        return this.f22152b.hashCode() + (super.hashCode() * 31);
    }
}
