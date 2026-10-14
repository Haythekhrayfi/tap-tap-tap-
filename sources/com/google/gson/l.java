package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.r<String, i> f12898a = new com.google.gson.internal.r<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).f12898a.equals(this.f12898a));
    }

    public int hashCode() {
        return this.f12898a.hashCode();
    }
}
