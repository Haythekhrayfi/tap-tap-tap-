package se;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f35536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference<h> f35537b;

    public static class a extends h {
        @Override // se.h
        public void a() {
        }
    }

    public static class b extends h {
        @Override // se.h
        public void a() {
            Iterator it = ServiceLoader.load(i.class, i.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    i.d((i) it.next());
                } catch (ServiceConfigurationError e10) {
                    if (!(e10.getCause() instanceof SecurityException)) {
                        throw e10;
                    }
                }
            }
        }
    }

    static {
        new a();
        f35536a = new AtomicBoolean(false);
        f35537b = new AtomicReference<>();
    }

    public abstract void a();
}
