package x1;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f37411a = new b.c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0460b f37412b = new b.C0460b(null);

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f37413a;

            public a(Throwable th) {
                this.f37413a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f37413a.getMessage());
            }
        }

        /* JADX INFO: renamed from: x1.o$b$b, reason: collision with other inner class name */
        public static final class C0460b extends b {
            public C0460b(a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            public c() {
            }

            public c(a aVar) {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }
}
