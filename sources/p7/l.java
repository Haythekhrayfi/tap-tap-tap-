package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34574a;

    public l(k kVar) {
        this.f34574a = kVar;
    }

    @Override // ic.a
    public Object get() {
        j jVar = this.f34574a.f34534b;
        Objects.requireNonNull(jVar, "Cannot return null from a non-@Nullable @Provides method");
        return jVar;
    }
}
