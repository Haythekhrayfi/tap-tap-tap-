package gb;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30412a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: gb.x$a$a, reason: collision with other inner class name */
        @oc.e(c = "com.zipoapps.premiumhelper.util.PHResult$Companion", f = "PHResult.kt", l = {14}, m = "suspendOf")
        public static final class C0280a<T> extends oc.c {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f30413c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f30415e;

            public C0280a(mc.d<? super C0280a> dVar) {
                super(dVar);
            }

            @Override // oc.a
            public final Object invokeSuspend(Object obj) {
                this.f30413c = obj;
                this.f30415e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a() {
        }

        public a(vc.g gVar) {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final <T> Object a(uc.l<? super mc.d<? super T>, ? extends Object> lVar, mc.d<? super x<? extends T>> dVar) {
            C0280a c0280a;
            if (dVar instanceof C0280a) {
                c0280a = (C0280a) dVar;
                int i10 = c0280a.f30415e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0280a.f30415e = i10 - Integer.MIN_VALUE;
                } else {
                    c0280a = new C0280a(dVar);
                }
            } else {
                c0280a = new C0280a(dVar);
            }
            Object objInvoke = c0280a.f30413c;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i11 = c0280a.f30415e;
            try {
                if (i11 == 0) {
                    h9.d.t(objInvoke);
                    c0280a.f30415e = 1;
                    objInvoke = lVar.invoke(c0280a);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h9.d.t(objInvoke);
                }
                return new c(objInvoke);
            } catch (Exception e10) {
                return new b(e10);
            }
        }
    }

    public static final class b extends x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Exception f30416b;

        public b(Exception exc) {
            super(null);
            this.f30416b = exc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && j0.d(this.f30416b, ((b) obj).f30416b);
        }

        public int hashCode() {
            Exception exc = this.f30416b;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Failure(error=");
            sbA.append(this.f30416b);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class c<T> extends x<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f30417b;

        public c(T t10) {
            super(null);
            this.f30417b = t10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && j0.d(this.f30417b, ((c) obj).f30417b);
        }

        public int hashCode() {
            T t10 = this.f30417b;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Success(value=");
            sbA.append(this.f30417b);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public x() {
    }

    public x(vc.g gVar) {
    }
}
