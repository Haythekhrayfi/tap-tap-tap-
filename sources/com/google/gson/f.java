package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends i implements Iterable<i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i> f12733c;

    public f() {
        this.f12733c = new ArrayList();
    }

    public f(int i10) {
        this.f12733c = new ArrayList(i10);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof f) && ((f) obj).f12733c.equals(this.f12733c));
    }

    public int hashCode() {
        return this.f12733c.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        return this.f12733c.iterator();
    }
}
