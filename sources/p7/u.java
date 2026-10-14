package p7;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34596a;

    public u(k kVar) {
        this.f34596a = kVar;
    }

    @Override // ic.a
    public Object get() {
        List<x7.c> list = this.f34596a.f34545m;
        Objects.requireNonNull(list, "Cannot return null from a non-@Nullable @Provides method");
        return list;
    }
}
