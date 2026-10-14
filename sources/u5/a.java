package u5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f36031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f36032b;

    public a(Class<T> cls, T t10) {
        Objects.requireNonNull(cls);
        this.f36031a = cls;
        Objects.requireNonNull(t10);
        this.f36032b = t10;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f36031a, this.f36032b);
    }
}
