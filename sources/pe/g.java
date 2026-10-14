package pe;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<g> f34685a = new AtomicReference<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f34686a;

        static {
            AtomicReference<g> atomicReference = g.f34685a;
            atomicReference.compareAndSet(null, new k());
            f34686a = atomicReference.get();
        }
    }

    public abstract String a(re.i iVar, long j10, l lVar, Locale locale);
}
