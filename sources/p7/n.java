package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34577a;

    public n(k kVar) {
        this.f34577a = kVar;
    }

    @Override // ic.a
    public Object get() {
        y7.a aVar = this.f34577a.f34548p;
        Objects.requireNonNull(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
