package g5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30004a = new a(this, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f30005b = new a(this, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicMarkableReference<String> f30006c = new AtomicMarkableReference<>(null, false);

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference<b> f30007a;

        public a(g gVar, boolean z10) {
            new AtomicReference(null);
            this.f30007a = new AtomicMarkableReference<>(new b(64, z10 ? 8192 : 1024), false);
        }

        public Map<String, String> a() {
            Map<String, String> mapUnmodifiableMap;
            b reference = this.f30007a.getReference();
            synchronized (reference) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f29978a));
            }
            return mapUnmodifiableMap;
        }
    }

    public g(String str, k5.c cVar, f5.f fVar) {
        new d(cVar);
    }
}
