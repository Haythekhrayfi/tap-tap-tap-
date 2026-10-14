package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34602a;

    public x(k kVar) {
        this.f34602a = kVar;
    }

    @Override // ic.a
    public Object get() {
        y7.a aVar = this.f34602a.f34547o;
        Objects.requireNonNull(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
