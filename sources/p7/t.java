package p7;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34594a;

    public t(k kVar) {
        this.f34594a = kVar;
    }

    @Override // ic.a
    public Object get() {
        h1 h1Var = this.f34594a.f34540h;
        Objects.requireNonNull(h1Var, "Cannot return null from a non-@Nullable @Provides method");
        return h1Var;
    }
}
