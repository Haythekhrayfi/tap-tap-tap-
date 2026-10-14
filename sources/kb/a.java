package kb;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import lb.g;
import pb.d;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T, C extends Collection<? super T>> extends lb.c<C> implements g<T, C> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final me.a<T> f31973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d<? super T> f31974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f31975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Callable<C> f31976g;

    /* JADX INFO: renamed from: kb.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0329a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31977a;

        static {
            int[] iArr = new int[c.values().length];
            f31977a = iArr;
            try {
                iArr[c.AFTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31977a[c.BEFORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b<T, C extends Collection<? super T>> implements sb.a<T>, me.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final me.b<? super C> f31978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d<? super T> f31979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f31980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Callable<C> f31981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C f31982g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public me.c f31983h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f31984i;

        public b(me.b<? super C> bVar, C c10, d<? super T> dVar, c cVar, Callable<C> callable) {
            this.f31978c = bVar;
            this.f31979d = dVar;
            this.f31980e = cVar;
            this.f31982g = c10;
            this.f31981f = callable;
        }

        @Override // me.b
        public void a(Throwable th) {
            if (this.f31982g == null) {
                dc.a.b(th);
            } else {
                this.f31982g = null;
                this.f31978c.a(th);
            }
        }

        @Override // lb.f, me.b
        public void c(me.c cVar) {
            if (ac.g.validate(this.f31983h, cVar)) {
                this.f31983h = cVar;
                this.f31978c.c(this);
            }
        }

        @Override // me.c
        public void cancel() {
            this.f31983h.cancel();
        }

        @Override // me.b
        public void d(T t10) {
            if (e(t10)) {
                return;
            }
            this.f31983h.request(1L);
        }

        @Override // sb.a
        public boolean e(T t10) {
            C c10 = this.f31982g;
            if (c10 != null) {
                try {
                    try {
                        boolean zE = this.f31979d.e(t10);
                        int i10 = C0329a.f31977a[this.f31980e.ordinal()];
                        if (i10 == 1) {
                            c10.add(t10);
                            if (!zE) {
                                this.f31984i++;
                                return false;
                            }
                            this.f31978c.d(c10);
                            try {
                                try {
                                    try {
                                        try {
                                            this.f31982g = this.f31981f.call();
                                            this.f31984i = 0;
                                        } catch (Throwable th) {
                                            th = th;
                                            c0.Q(th);
                                            this.f31983h.cancel();
                                            a(th);
                                            return true;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else if (i10 != 2) {
                            if (!zE) {
                                c10.add(t10);
                                this.f31984i++;
                                return false;
                            }
                            this.f31978c.d(c10);
                            try {
                                try {
                                    try {
                                        try {
                                            this.f31982g = this.f31981f.call();
                                            this.f31984i = 0;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c0.Q(th);
                                            this.f31983h.cancel();
                                            a(th);
                                            return true;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        } else {
                            if (zE) {
                                c10.add(t10);
                                this.f31984i++;
                                return false;
                            }
                            this.f31978c.d(c10);
                            try {
                                try {
                                    try {
                                        C cCall = this.f31981f.call();
                                        cCall.add(t10);
                                        this.f31982g = cCall;
                                        this.f31984i = 1;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        c0.Q(th);
                                        this.f31983h.cancel();
                                        a(th);
                                        return true;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        c0.Q(th);
                        this.f31983h.cancel();
                        this.f31982g = null;
                        this.f31978c.a(th);
                    }
                } catch (Throwable th13) {
                    th = th13;
                }
            }
            return true;
        }

        @Override // me.b
        public void onComplete() {
            C c10 = this.f31982g;
            if (c10 != null) {
                this.f31982g = null;
                if (this.f31984i != 0) {
                    this.f31978c.d(c10);
                }
                this.f31978c.onComplete();
            }
        }

        @Override // me.c
        public void request(long j10) {
            this.f31983h.request(j10);
        }
    }

    public enum c {
        BEFORE,
        AFTER,
        SPLIT
    }

    public a(me.a<T> aVar, d<? super T> dVar, c cVar, Callable<C> callable) {
        this.f31973d = aVar;
        this.f31974e = dVar;
        this.f31975f = cVar;
        this.f31976g = callable;
    }

    @Override // lb.c
    public void h(me.b<? super C> bVar) {
        try {
            C cCall = this.f31976g.call();
            Objects.requireNonNull(cCall, "The bufferSupplier returned a null buffer");
            this.f31973d.a(new b(bVar, cCall, this.f31974e, this.f31975f, this.f31976g));
        } catch (Throwable th) {
            c0.Q(th);
            ac.d.error(th, bVar);
        }
    }
}
