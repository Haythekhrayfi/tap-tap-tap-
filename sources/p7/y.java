package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34604a;

    public y(k kVar) {
        this.f34604a = kVar;
    }

    @Override // ic.a
    public Object get() {
        l9.h.b bVar = this.f34604a.f34549q;
        Objects.requireNonNull(bVar, "Cannot return null from a non-@Nullable @Provides method");
        return bVar;
    }
}
