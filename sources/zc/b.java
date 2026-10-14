package zc;

import fd.j0;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends zc.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f45274e = new a();

    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // zc.a
    public Random e() {
        Random random = this.f45274e.get();
        j0.h(random, "implStorage.get()");
        return random;
    }
}
