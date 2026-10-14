package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34589a;

    public s(k kVar) {
        this.f34589a = kVar;
    }

    @Override // ic.a
    public Object get() {
        x9.a aVar = this.f34589a.f34538f;
        Objects.requireNonNull(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
