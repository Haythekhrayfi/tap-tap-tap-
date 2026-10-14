package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class f00 implements Closeable {
    private static final e11 C;
    public static final /* synthetic */ int D = 0;
    private final d A;
    private final LinkedHashSet B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f20418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f20419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c61 f20424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b61 f20425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b61 f20426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b61 f20427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final du0 f20428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f20429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f20430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f20431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f20432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f20433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f20434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e11 f20435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e11 f20436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f20437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f20438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f20439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f20440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Socket f20441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final n00 f20442z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c61 f20444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f20445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f20446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public qd.f f20447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public qd.e f20448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f20449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private du0 f20450h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f20451i;

        public a(c61 c61Var) {
            fd.j0.i(c61Var, "taskRunner");
            this.f20443a = true;
            this.f20444b = c61Var;
            this.f20449g = c.f20452a;
            this.f20450h = du0.f19986a;
        }

        public final a a(c cVar) {
            fd.j0.i(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f20449g = cVar;
            return this;
        }

        public final a a(Socket socket, String str, qd.f fVar, qd.e eVar) throws IOException {
            String strA;
            fd.j0.i(socket, "socket");
            fd.j0.i(str, "peerName");
            fd.j0.i(fVar, "source");
            fd.j0.i(eVar, "sink");
            this.f20445c = socket;
            if (this.f20443a) {
                strA = ea1.f20137g + ' ' + str;
            } else {
                strA = fn1.a("MockWebServer ", str);
            }
            fd.j0.i(strA, "<set-?>");
            this.f20446d = strA;
            this.f20447e = fVar;
            this.f20448f = eVar;
            return this;
        }

        public final f00 a() {
            return new f00(this);
        }

        public final boolean b() {
            return this.f20443a;
        }

        public final String c() {
            String str = this.f20446d;
            if (str != null) {
                return str;
            }
            fd.j0.r("connectionName");
            throw null;
        }

        public final c d() {
            return this.f20449g;
        }

        public final int e() {
            return this.f20451i;
        }

        public final du0 f() {
            return this.f20450h;
        }

        public final qd.e g() {
            qd.e eVar = this.f20448f;
            if (eVar != null) {
                return eVar;
            }
            fd.j0.r("sink");
            throw null;
        }

        public final Socket h() {
            Socket socket = this.f20445c;
            if (socket != null) {
                return socket;
            }
            fd.j0.r("socket");
            throw null;
        }

        public final qd.f i() {
            qd.f fVar = this.f20447e;
            if (fVar != null) {
                return fVar;
            }
            fd.j0.r("source");
            throw null;
        }

        public final c61 j() {
            return this.f20444b;
        }

        public final a k() {
            this.f20451i = 0;
            return this;
        }
    }

    public static final class b {
        public static e11 a() {
            return f00.C;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20452a = new a();

        public static final class a extends c {
            @Override // com.yandex.mobile.ads.impl.f00.c
            public final void a(m00 m00Var) throws IOException {
                fd.j0.i(m00Var, "stream");
                m00Var.a(as.f19050f, (IOException) null);
            }
        }

        public void a(f00 f00Var, e11 e11Var) {
            fd.j0.i(f00Var, "connection");
            fd.j0.i(e11Var, "settings");
        }

        public abstract void a(m00 m00Var) throws IOException;
    }

    public final class d implements l00.c, uc.a<jc.w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l00 f20453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f00 f20454b;

        public static final class a extends y51 {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ f00 f20455e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ vc.a0 f20456f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, f00 f00Var, vc.a0 a0Var) {
                super(str, true);
                this.f20455e = f00Var;
                this.f20456f = a0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yandex.mobile.ads.impl.y51
            public final long e() {
                this.f20455e.e().a(this.f20455e, (e11) this.f20456f.f36988c);
                return -1L;
            }
        }

        public d(f00 f00Var, l00 l00Var) {
            fd.j0.i(l00Var, "reader");
            this.f20454b = f00Var;
            this.f20453a = l00Var;
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a() {
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a(int i10, int i11, qd.f fVar, boolean z10) throws IOException {
            fd.j0.i(fVar, "source");
            Objects.requireNonNull(this.f20454b);
            if (f00.b(i10)) {
                this.f20454b.a(i10, i11, fVar, z10);
                return;
            }
            m00 m00VarA = this.f20454b.a(i10);
            if (m00VarA == null) {
                this.f20454b.c(i10, as.f19047c);
                long j10 = i11;
                this.f20454b.b(j10);
                fVar.skip(j10);
                return;
            }
            m00VarA.a(fVar, i11);
            if (z10) {
                m00VarA.a(ea1.f20132b, true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a(int i10, int i11, boolean z10) {
            if (!z10) {
                this.f20454b.f20425i.a(new h00(this.f20454b.c() + " ping", this.f20454b, i10, i11), 0L);
                return;
            }
            f00 f00Var = this.f20454b;
            synchronized (f00Var) {
                try {
                    if (i10 == 1) {
                        f00Var.f20430n++;
                    } else if (i10 == 2) {
                        f00Var.f20432p++;
                    } else if (i10 == 3) {
                        f00Var.f20433q++;
                        f00Var.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a(int i10, long j10) {
            Object obj;
            if (i10 == 0) {
                f00 f00Var = this.f20454b;
                synchronized (f00Var) {
                    f00Var.f20440x = f00Var.j() + j10;
                    f00Var.notifyAll();
                    obj = f00Var;
                }
            } else {
                m00 m00VarA = this.f20454b.a(i10);
                if (m00VarA == null) {
                    return;
                }
                synchronized (m00VarA) {
                    m00VarA.a(j10);
                    obj = m00VarA;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a(int i10, as asVar) {
            fd.j0.i(asVar, "errorCode");
            Objects.requireNonNull(this.f20454b);
            if (f00.b(i10)) {
                this.f20454b.a(i10, asVar);
                return;
            }
            m00 m00VarC = this.f20454b.c(i10);
            if (m00VarC != null) {
                m00VarC.b(asVar);
            }
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a(int i10, as asVar, qd.g gVar) {
            int i11;
            Object[] array;
            fd.j0.i(asVar, "errorCode");
            fd.j0.i(gVar, "debugData");
            gVar.c();
            f00 f00Var = this.f20454b;
            synchronized (f00Var) {
                array = f00Var.i().values().toArray(new m00[0]);
                fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                f00Var.f20423g = true;
            }
            for (m00 m00Var : (m00[]) array) {
                if (m00Var.f() > i10 && m00Var.p()) {
                    m00Var.b(as.f19050f);
                    this.f20454b.c(m00Var.f());
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a(int i10, List list) {
            fd.j0.i(list, "requestHeaders");
            this.f20454b.a(i10, (List<py>) list);
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a(e11 e11Var) {
            fd.j0.i(e11Var, "settings");
            this.f20454b.f20425i.a(new i00(this.f20454b.c() + " applyAndAckSettings", this, e11Var), 0L);
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void a(boolean z10, int i10, List list) {
            fd.j0.i(list, "headerBlock");
            Objects.requireNonNull(this.f20454b);
            if (f00.b(i10)) {
                this.f20454b.a(i10, (List<py>) list, z10);
                return;
            }
            f00 f00Var = this.f20454b;
            synchronized (f00Var) {
                m00 m00VarA = f00Var.a(i10);
                if (m00VarA != null) {
                    m00VarA.a(ea1.a((List<py>) list), z10);
                    return;
                }
                if (f00Var.f20423g) {
                    return;
                }
                if (i10 <= f00Var.d()) {
                    return;
                }
                if (i10 % 2 == f00Var.f() % 2) {
                    return;
                }
                m00 m00Var = new m00(i10, f00Var, false, z10, ea1.a((List<py>) list));
                f00Var.d(i10);
                f00Var.i().put(Integer.valueOf(i10), m00Var);
                f00Var.f20424h.e().a(new g00(f00Var.c() + '[' + i10 + "] onStream", f00Var, m00Var), 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v2, types: [T, com.yandex.mobile.ads.impl.e11] */
        /* JADX WARN: Type inference failed for: r12v3 */
        public final void a(boolean z10, e11 e11Var) {
            ?? r12;
            long jB;
            int i10;
            m00[] m00VarArr;
            fd.j0.i(e11Var, "settings");
            vc.a0 a0Var = new vc.a0();
            n00 n00VarK = this.f20454b.k();
            f00 f00Var = this.f20454b;
            synchronized (n00VarK) {
                synchronized (f00Var) {
                    e11 e11VarH = f00Var.h();
                    if (z10) {
                        r12 = e11Var;
                    } else {
                        e11 e11Var2 = new e11();
                        e11Var2.a(e11VarH);
                        e11Var2.a(e11Var);
                        r12 = e11Var2;
                    }
                    a0Var.f36988c = r12;
                    jB = ((long) r12.b()) - ((long) e11VarH.b());
                    if (jB == 0 || f00Var.i().isEmpty()) {
                        m00VarArr = null;
                    } else {
                        Object[] array = f00Var.i().values().toArray(new m00[0]);
                        fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        m00VarArr = (m00[]) array;
                    }
                    f00Var.a((e11) a0Var.f36988c);
                    f00Var.f20427k.a(new a(f00Var.c() + " onSettings", f00Var, a0Var), 0L);
                }
                try {
                    f00Var.k().a((e11) a0Var.f36988c);
                } catch (IOException e10) {
                    f00.a(f00Var, e10);
                }
            }
            if (m00VarArr != null) {
                for (m00 m00Var : m00VarArr) {
                    synchronized (m00Var) {
                        m00Var.a(jB);
                    }
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.l00.c
        public final void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.as] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [jc.w] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // uc.a
        public final jc.w invoke() throws Throwable {
            as asVar;
            as asVar2;
            Object obj;
            ?? r10 = as.f19048d;
            IOException e10 = null;
            try {
                try {
                    this.f20453a.a(this);
                    while (this.f20453a.a(false, this)) {
                    }
                    as asVar3 = as.f19046b;
                    try {
                        this.f20454b.a(asVar3, as.f19051g, (IOException) null);
                        obj = asVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        as asVar4 = as.f19047c;
                        f00 f00Var = this.f20454b;
                        f00Var.a(asVar4, asVar4, e10);
                        obj = f00Var;
                    }
                } catch (Throwable th) {
                    asVar = obj;
                    th = th;
                    asVar2 = r10;
                    this.f20454b.a(asVar, asVar2, e10);
                    ea1.a(this.f20453a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                asVar = r10;
                asVar2 = r10;
                this.f20454b.a(asVar, asVar2, e10);
                ea1.a(this.f20453a);
                throw th;
            }
            ea1.a(this.f20453a);
            r10 = jc.w.f31842a;
            return r10;
        }
    }

    public static final class e extends y51 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f00 f20457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f20458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f20459g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, f00 f00Var, int i10, List list, boolean z10) {
            super(str, true);
            this.f20457e = f00Var;
            this.f20458f = i10;
            this.f20459g = list;
        }

        @Override // com.yandex.mobile.ads.impl.y51
        public final long e() {
            ((cu0) this.f20457e.f20428l).a(this.f20459g);
            try {
                this.f20457e.k().a(this.f20458f, as.f19051g);
                synchronized (this.f20457e) {
                    this.f20457e.B.remove(Integer.valueOf(this.f20458f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class f extends y51 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f00 f20460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f20461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f20462g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, f00 f00Var, int i10, List list) {
            super(str, true);
            this.f20460e = f00Var;
            this.f20461f = i10;
            this.f20462g = list;
        }

        @Override // com.yandex.mobile.ads.impl.y51
        public final long e() {
            ((cu0) this.f20460e.f20428l).b(this.f20462g);
            try {
                this.f20460e.k().a(this.f20461f, as.f19051g);
                synchronized (this.f20460e) {
                    this.f20460e.B.remove(Integer.valueOf(this.f20461f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class g extends y51 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f00 f20463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f20464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ as f20465g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, f00 f00Var, int i10, as asVar) {
            super(str, true);
            this.f20463e = f00Var;
            this.f20464f = i10;
            this.f20465g = asVar;
        }

        @Override // com.yandex.mobile.ads.impl.y51
        public final long e() {
            ((cu0) this.f20463e.f20428l).a(this.f20465g);
            synchronized (this.f20463e) {
                this.f20463e.B.remove(Integer.valueOf(this.f20464f));
            }
            return -1L;
        }
    }

    public static final class h extends y51 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f00 f20466e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, f00 f00Var) {
            super(str, true);
            this.f20466e = f00Var;
        }

        @Override // com.yandex.mobile.ads.impl.y51
        public final long e() {
            this.f20466e.a(2, 0, false);
            return -1L;
        }
    }

    public static final class i extends y51 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f00 f20467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f20468f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, f00 f00Var, long j10) {
            super(str);
            this.f20467e = f00Var;
            this.f20468f = j10;
        }

        @Override // com.yandex.mobile.ads.impl.y51
        public final long e() {
            boolean z10;
            synchronized (this.f20467e) {
                if (this.f20467e.f20430n < this.f20467e.f20429m) {
                    z10 = true;
                } else {
                    this.f20467e.f20429m++;
                    z10 = false;
                }
            }
            f00 f00Var = this.f20467e;
            if (!z10) {
                f00Var.a(1, 0, false);
                return this.f20468f;
            }
            as asVar = as.f19047c;
            f00Var.a(asVar, asVar, (IOException) null);
            return -1L;
        }
    }

    public static final class j extends y51 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f00 f20469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f20470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ as f20471g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f00 f00Var, int i10, as asVar) {
            super(str, true);
            this.f20469e = f00Var;
            this.f20470f = i10;
            this.f20471g = asVar;
        }

        @Override // com.yandex.mobile.ads.impl.y51
        public final long e() {
            try {
                this.f20469e.b(this.f20470f, this.f20471g);
                return -1L;
            } catch (IOException e10) {
                f00 f00Var = this.f20469e;
                as asVar = as.f19047c;
                f00Var.a(asVar, asVar, e10);
                return -1L;
            }
        }
    }

    public static final class k extends y51 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f00 f20472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f20473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f20474g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, f00 f00Var, int i10, long j10) {
            super(str, true);
            this.f20472e = f00Var;
            this.f20473f = i10;
            this.f20474g = j10;
        }

        @Override // com.yandex.mobile.ads.impl.y51
        public final long e() {
            try {
                this.f20472e.k().a(this.f20473f, this.f20474g);
                return -1L;
            } catch (IOException e10) {
                f00 f00Var = this.f20472e;
                as asVar = as.f19047c;
                f00Var.a(asVar, asVar, e10);
                return -1L;
            }
        }
    }

    static {
        e11 e11Var = new e11();
        e11Var.a(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        e11Var.a(5, Http2.INITIAL_MAX_FRAME_SIZE);
        C = e11Var;
    }

    public f00(a aVar) {
        fd.j0.i(aVar, "builder");
        boolean zB = aVar.b();
        this.f20417a = zB;
        this.f20418b = aVar.d();
        this.f20419c = new LinkedHashMap();
        String strC = aVar.c();
        this.f20420d = strC;
        this.f20422f = aVar.b() ? 3 : 2;
        c61 c61VarJ = aVar.j();
        this.f20424h = c61VarJ;
        b61 b61VarE = c61VarJ.e();
        this.f20425i = b61VarE;
        this.f20426j = c61VarJ.e();
        this.f20427k = c61VarJ.e();
        this.f20428l = aVar.f();
        e11 e11Var = new e11();
        if (aVar.b()) {
            e11Var.a(7, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.f20435s = e11Var;
        e11 e11Var2 = C;
        this.f20436t = e11Var2;
        this.f20440x = e11Var2.b();
        this.f20441y = aVar.h();
        this.f20442z = new n00(aVar.g(), zB);
        this.A = new d(this, new l00(aVar.i(), zB));
        this.B = new LinkedHashSet();
        if (aVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(aVar.e());
            b61VarE.a(new i(fn1.a(strC, " ping"), this, nanos), nanos);
        }
    }

    public static final void a(f00 f00Var, IOException iOException) {
        as asVar = as.f19047c;
        f00Var.a(asVar, asVar, iOException);
    }

    public static boolean b(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public static void l(f00 f00Var) throws IOException {
        c61 c61Var = c61.f19395h;
        fd.j0.i(c61Var, "taskRunner");
        f00Var.f20442z.a();
        f00Var.f20442z.b(f00Var.f20435s);
        int iB = f00Var.f20435s.b();
        if (iB != 65535) {
            f00Var.f20442z.a(0, iB - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        c61Var.e().a(new a61(f00Var.f20420d, f00Var.A), 0L);
    }

    public final synchronized m00 a(int i10) {
        return (m00) this.f20419c.get(Integer.valueOf(i10));
    }

    public final m00 a(ArrayList arrayList, boolean z10) throws IOException {
        boolean z11;
        int i10;
        m00 m00Var;
        fd.j0.i(arrayList, "requestHeaders");
        boolean z12 = !z10;
        synchronized (this.f20442z) {
            synchronized (this) {
                z11 = true;
                if (this.f20422f > 1073741823) {
                    as asVar = as.f19050f;
                    fd.j0.i(asVar, "statusCode");
                    synchronized (this.f20442z) {
                        vc.y yVar = new vc.y();
                        synchronized (this) {
                            if (!this.f20423g) {
                                this.f20423g = true;
                                int i11 = this.f20421e;
                                yVar.f37006c = i11;
                                this.f20442z.a(i11, asVar, ea1.f20131a);
                            }
                        }
                    }
                }
                if (this.f20423g) {
                    throw new mk();
                }
                i10 = this.f20422f;
                this.f20422f = i10 + 2;
                m00Var = new m00(i10, this, z12, false, null);
                if (z10 && this.f20439w < this.f20440x && m00Var.n() < m00Var.m()) {
                    z11 = false;
                }
                if (m00Var.q()) {
                    this.f20419c.put(Integer.valueOf(i10), m00Var);
                }
            }
            this.f20442z.a(i10, arrayList, z12);
        }
        if (z11) {
            this.f20442z.flush();
        }
        return m00Var;
    }

    public final void a(int i10, int i11, qd.f fVar, boolean z10) throws IOException {
        fd.j0.i(fVar, "source");
        qd.c cVar = new qd.c();
        long j10 = i11;
        fVar.U(j10);
        fVar.read(cVar, j10);
        this.f20426j.a(new j00(this.f20420d + '[' + i10 + "] onData", this, i10, cVar, i11, z10), 0L);
    }

    public final void a(int i10, int i11, boolean z10) {
        try {
            this.f20442z.a(i10, i11, z10);
        } catch (IOException e10) {
            as asVar = as.f19047c;
            a(asVar, asVar, e10);
        }
    }

    public final void a(int i10, long j10) {
        this.f20425i.a(new k(this.f20420d + '[' + i10 + "] windowUpdate", this, i10, j10), 0L);
    }

    public final void a(int i10, as asVar) {
        fd.j0.i(asVar, "errorCode");
        this.f20426j.a(new g(this.f20420d + '[' + i10 + "] onReset", this, i10, asVar), 0L);
    }

    public final void a(int i10, List<py> list) {
        fd.j0.i(list, "requestHeaders");
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i10))) {
                c(i10, as.f19047c);
                return;
            }
            this.B.add(Integer.valueOf(i10));
            this.f20426j.a(new f(this.f20420d + '[' + i10 + "] onRequest", this, i10, list), 0L);
        }
    }

    public final void a(int i10, List<py> list, boolean z10) {
        fd.j0.i(list, "requestHeaders");
        this.f20426j.a(new e(this.f20420d + '[' + i10 + "] onHeaders", this, i10, list, z10), 0L);
    }

    public final void a(int i10, boolean z10, qd.c cVar, long j10) throws IOException {
        long j11;
        long j12;
        int iMin;
        long j13;
        if (j10 == 0) {
            this.f20442z.a(z10, i10, cVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j11 = this.f20439w;
                        j12 = this.f20440x;
                        if (j11 >= j12) {
                            if (!this.f20419c.containsKey(Integer.valueOf(i10))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.f20442z.b());
                j13 = iMin;
                this.f20439w += j13;
            }
            j10 -= j13;
            this.f20442z.a(z10 && j10 == 0, i10, cVar, iMin);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0085, please report this as an issue */
    public final void a(as asVar, as asVar2, IOException iOException) {
        Object[] array;
        int i10;
        m00[] m00VarArr;
        fd.j0.i(asVar, "connectionCode");
        fd.j0.i(asVar2, "streamCode");
        if (ea1.f20136f && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        try {
            synchronized (this.f20442z) {
                vc.y yVar = new vc.y();
                synchronized (this) {
                    if (!this.f20423g) {
                        this.f20423g = true;
                        int i11 = this.f20421e;
                        yVar.f37006c = i11;
                        this.f20442z.a(i11, asVar, ea1.f20131a);
                    }
                }
                m00VarArr = (m00[]) array;
                if (m00VarArr != null) {
                    for (m00 m00Var : m00VarArr) {
                        try {
                            m00Var.a(asVar2, iOException);
                        } catch (IOException unused) {
                        }
                    }
                }
                try {
                    this.f20442z.close();
                } catch (IOException unused2) {
                }
                try {
                    this.f20441y.close();
                } catch (IOException unused3) {
                }
                this.f20425i.j();
                this.f20426j.j();
                this.f20427k.j();
            }
        } catch (IOException unused4) {
        }
        array = null;
        synchronized (this) {
            if (true ^ this.f20419c.isEmpty()) {
                array = this.f20419c.values().toArray(new m00[0]);
                fd.j0.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                this.f20419c.clear();
            }
            m00VarArr = (m00[]) array;
            if (m00VarArr != null) {
                while (i10 < r0) {
                    m00Var.a(asVar2, iOException);
                }
            }
            this.f20442z.close();
            this.f20441y.close();
            this.f20425i.j();
            this.f20426j.j();
            this.f20427k.j();
        }
    }

    public final void a(e11 e11Var) {
        fd.j0.i(e11Var, "<set-?>");
        this.f20436t = e11Var;
    }

    public final synchronized boolean a(long j10) {
        if (this.f20423g) {
            return false;
        }
        return this.f20432p >= this.f20431o || j10 < this.f20434r;
    }

    public final void b(int i10, as asVar) throws IOException {
        fd.j0.i(asVar, "statusCode");
        this.f20442z.a(i10, asVar);
    }

    public final synchronized void b(long j10) {
        long j11 = this.f20437u + j10;
        this.f20437u = j11;
        long j12 = j11 - this.f20438v;
        if (j12 >= this.f20435s.b() / 2) {
            a(0, j12);
            this.f20438v += j12;
        }
    }

    public final boolean b() {
        return this.f20417a;
    }

    public final synchronized m00 c(int i10) {
        m00 m00Var;
        m00Var = (m00) this.f20419c.remove(Integer.valueOf(i10));
        notifyAll();
        return m00Var;
    }

    public final String c() {
        return this.f20420d;
    }

    public final void c(int i10, as asVar) {
        fd.j0.i(asVar, "errorCode");
        this.f20425i.a(new j(this.f20420d + '[' + i10 + "] writeSynReset", this, i10, asVar), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(as.f19046b, as.f19051g, (IOException) null);
    }

    public final int d() {
        return this.f20421e;
    }

    public final void d(int i10) {
        this.f20421e = i10;
    }

    public final c e() {
        return this.f20418b;
    }

    public final int f() {
        return this.f20422f;
    }

    public final void flush() throws IOException {
        this.f20442z.flush();
    }

    public final e11 g() {
        return this.f20435s;
    }

    public final e11 h() {
        return this.f20436t;
    }

    public final LinkedHashMap i() {
        return this.f20419c;
    }

    public final long j() {
        return this.f20440x;
    }

    public final n00 k() {
        return this.f20442z;
    }

    public final void l() {
        synchronized (this) {
            long j10 = this.f20432p;
            long j11 = this.f20431o;
            if (j10 < j11) {
                return;
            }
            this.f20431o = j11 + 1;
            this.f20434r = System.nanoTime() + ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            this.f20425i.a(new h(androidx.activity.k.a(new StringBuilder(), this.f20420d, " ping"), this), 0L);
        }
    }
}
