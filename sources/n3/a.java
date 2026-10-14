package n3;

import g3.u;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a<T> implements u<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f33614c;

    public a(T t10) {
        Objects.requireNonNull(t10, "Argument must not be null");
        this.f33614c = t10;
    }

    @Override // g3.u
    public void a() {
    }

    @Override // g3.u
    public Class<T> b() {
        return (Class<T>) this.f33614c.getClass();
    }

    @Override // g3.u
    public final T get() {
        return this.f33614c;
    }

    @Override // g3.u
    public final int getSize() {
        return 1;
    }
}
