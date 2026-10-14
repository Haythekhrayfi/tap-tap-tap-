package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22839a;

    public m(String str) {
        this.f22839a = str;
    }

    public final String a() {
        return this.f22839a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f22839a.equals(((m) obj).f22839a);
    }

    public int hashCode() {
        return this.f22839a.hashCode();
    }
}
