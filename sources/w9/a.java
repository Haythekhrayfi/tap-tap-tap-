package w9;

import fd.j0;
import java.util.Objects;
import u9.b;

/* JADX INFO: loaded from: classes2.dex */
public class a<T extends u9.b<?>> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f37192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e<? extends T> f37193c;

    public a(b<T> bVar, e<? extends T> eVar) {
        j0.i(bVar, "cacheProvider");
        j0.i(eVar, "fallbackProvider");
        this.f37192b = bVar;
        this.f37193c = eVar;
    }

    @Override // w9.e
    public T get(String str) {
        T t10 = (T) this.f37192b.get(str);
        if (t10 == null) {
            t10 = (T) this.f37193c.get(str);
            if (t10 == null) {
                return null;
            }
            b<T> bVar = this.f37192b;
            Objects.requireNonNull(bVar);
            bVar.f37194b.put(str, t10);
        }
        return t10;
    }
}
