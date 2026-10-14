package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class t extends p0<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18392b;

    public t(Object obj) {
        this.f18392b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f18391a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18391a) {
            throw new NoSuchElementException();
        }
        this.f18391a = true;
        return this.f18392b;
    }
}
