package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class l00 implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f22582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f22583f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.f f22584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f22586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final iz.a f22587d;

    public static final class a {
        public static int a(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException(n1.c.a("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
        }

        public static Logger a() {
            return l00.f22582e;
        }
    }

    public static final class b implements qd.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qd.f f22588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f22593f;

        public b(qd.f fVar) {
            fd.j0.i(fVar, "source");
            this.f22588a = fVar;
        }

        public final int a() {
            return this.f22592e;
        }

        public final void a(int i10) {
            this.f22590c = i10;
        }

        public final void b(int i10) {
            this.f22592e = i10;
        }

        public final void c(int i10) {
            this.f22589b = i10;
        }

        @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        public final void d(int i10) {
            this.f22593f = i10;
        }

        public final void e(int i10) {
            this.f22591d = i10;
        }

        @Override // qd.a0
        public final long read(qd.c cVar, long j10) throws IOException {
            int i10;
            int i11;
            fd.j0.i(cVar, "sink");
            do {
                int i12 = this.f22592e;
                if (i12 != 0) {
                    long j11 = this.f22588a.read(cVar, Math.min(j10, i12));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f22592e -= (int) j11;
                    return j11;
                }
                this.f22588a.skip(this.f22593f);
                this.f22593f = 0;
                if ((this.f22590c & 4) != 0) {
                    return -1L;
                }
                i10 = this.f22591d;
                int iA = ea1.a(this.f22588a);
                this.f22592e = iA;
                this.f22589b = iA;
                int iA2 = ea1.a(this.f22588a.readByte());
                this.f22590c = ea1.a(this.f22588a.readByte());
                int i13 = l00.f22583f;
                if (a.a().isLoggable(Level.FINE)) {
                    Logger loggerA = a.a();
                    e00 e00Var = e00.f20014a;
                    int i14 = this.f22591d;
                    int i15 = this.f22589b;
                    int i16 = this.f22590c;
                    Objects.requireNonNull(e00Var);
                    loggerA.fine(e00.a(true, i14, i15, iA2, i16));
                }
                i11 = this.f22588a.readInt() & Integer.MAX_VALUE;
                this.f22591d = i11;
                if (iA2 != 9) {
                    throw new IOException(iA2 + " != TYPE_CONTINUATION");
                }
            } while (i11 == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // qd.a0
        public final qd.b0 timeout() {
            return this.f22588a.timeout();
        }
    }

    public interface c {
        void a();

        void a(int i10, int i11, qd.f fVar, boolean z10) throws IOException;

        void a(int i10, int i11, boolean z10);

        void a(int i10, long j10);

        void a(int i10, as asVar);

        void a(int i10, as asVar, qd.g gVar);

        void a(int i10, List list) throws IOException;

        void a(e11 e11Var);

        void a(boolean z10, int i10, List list);

        void b();
    }

    static {
        Logger logger = Logger.getLogger(e00.class.getName());
        fd.j0.h(logger, "getLogger(Http2::class.java.name)");
        f22582e = logger;
    }

    public l00(qd.f fVar, boolean z10) {
        fd.j0.i(fVar, "source");
        this.f22584a = fVar;
        this.f22585b = z10;
        b bVar = new b(fVar);
        this.f22586c = bVar;
        this.f22587d = new iz.a(bVar);
    }

    public final void a(c cVar) throws IOException {
        fd.j0.i(cVar, "handler");
        if (this.f22585b) {
            if (!a(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        qd.f fVar = this.f22584a;
        qd.g gVar = e00.f20015b;
        qd.g gVarD = fVar.d(gVar.c());
        Logger logger = f22582e;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder sbA = v60.a("<< CONNECTION ");
            sbA.append(gVarD.d());
            logger.fine(ea1.a(sbA.toString(), new Object[0]));
        }
        if (fd.j0.d(gVar, gVarD)) {
            return;
        }
        StringBuilder sbA2 = v60.a("Expected a connection header but was ");
        sbA2.append(gVarD.l());
        throw new IOException(sbA2.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22584a.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final boolean a(boolean z10, c cVar) throws IOException {
        qd.f fVar;
        long j10;
        fd.j0.i(cVar, "handler");
        try {
            this.f22584a.U(9L);
            int iA = ea1.a(this.f22584a);
            if (iA > 16384) {
                throw new IOException(u60.a("FRAME_SIZE_ERROR: ", iA));
            }
            int iA2 = ea1.a(this.f22584a.readByte());
            int iA3 = ea1.a(this.f22584a.readByte());
            int i10 = this.f22584a.readInt() & Integer.MAX_VALUE;
            Logger logger = f22582e;
            if (logger.isLoggable(Level.FINE)) {
                Objects.requireNonNull(e00.f20014a);
                logger.fine(e00.a(true, i10, iA, iA2, iA3));
            }
            if (z10 && iA2 != 4) {
                StringBuilder sbA = v60.a("Expected a SETTINGS frame but was ");
                Objects.requireNonNull(e00.f20014a);
                sbA.append(e00.a(iA2));
                throw new IOException(sbA.toString());
            }
            switch (iA2) {
                case 0:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z11 = (iA3 & 1) != 0;
                    if (((iA3 & 32) != 0) == true) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int iA4 = (iA3 & 8) != 0 ? ea1.a(this.f22584a.readByte()) : 0;
                    cVar.a(i10, a.a(iA, iA3, iA4), this.f22584a, z11);
                    fVar = this.f22584a;
                    j10 = iA4;
                    fVar.skip(j10);
                    return true;
                case 1:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z12 = (iA3 & 1) != 0;
                    int iA5 = (iA3 & 8) != 0 ? ea1.a(this.f22584a.readByte()) : 0;
                    if ((iA3 & 32) != 0) {
                        this.f22584a.readInt();
                        ea1.a(this.f22584a.readByte());
                        cVar.b();
                        iA -= 5;
                    }
                    this.f22586c.b(a.a(iA, iA3, iA5));
                    b bVar = this.f22586c;
                    bVar.c(bVar.a());
                    this.f22586c.d(iA5);
                    this.f22586c.a(iA3);
                    this.f22586c.e(i10);
                    this.f22587d.c();
                    cVar.a(z12, i10, this.f22587d.a());
                    return true;
                case 2:
                    if (iA != 5) {
                        throw new IOException(android.support.v4.media.j.a("TYPE_PRIORITY length: ", iA, " != 5"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    this.f22584a.readInt();
                    ea1.a(this.f22584a.readByte());
                    cVar.b();
                    return true;
                case 3:
                    if (iA != 4) {
                        throw new IOException(android.support.v4.media.j.a("TYPE_RST_STREAM length: ", iA, " != 4"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i11 = this.f22584a.readInt();
                    as asVarA = as.a.a(i11);
                    if (asVarA == null) {
                        throw new IOException(u60.a("TYPE_RST_STREAM unexpected error code: ", i11));
                    }
                    cVar.a(i10, asVarA);
                    return true;
                case 4:
                    if (i10 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((iA3 & 1) != 0) {
                        if (iA != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        cVar.a();
                    } else {
                        if (iA % 6 != 0) {
                            throw new IOException(u60.a("TYPE_SETTINGS length % 6 != 0: ", iA));
                        }
                        e11 e11Var = new e11();
                        bd.a aVarG = bd.e.g(bd.e.h(0, iA), 6);
                        int i12 = aVarG.f3515c;
                        int i13 = aVarG.f3516d;
                        int i14 = aVarG.f3517e;
                        if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                            while (true) {
                                int iA6 = ea1.a(this.f22584a.readShort());
                                int i15 = this.f22584a.readInt();
                                if (iA6 != 2) {
                                    if (iA6 == 3) {
                                        iA6 = 4;
                                    } else if (iA6 == 4) {
                                        iA6 = 7;
                                        if (i15 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                    } else if (iA6 == 5 && (i15 < 16384 || i15 > 16777215)) {
                                        throw new IOException(u60.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", i15));
                                    }
                                } else if (i15 != 0 && i15 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                e11Var.a(iA6, i15);
                                if (i12 != i13) {
                                    i12 += i14;
                                }
                            }
                        }
                        cVar.a(e11Var);
                    }
                    return true;
                case 5:
                    if (i10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int iA7 = (iA3 & 8) != 0 ? ea1.a(this.f22584a.readByte()) : 0;
                    int i16 = this.f22584a.readInt() & Integer.MAX_VALUE;
                    this.f22586c.b(a.a(iA - 4, iA3, iA7));
                    b bVar2 = this.f22586c;
                    bVar2.c(bVar2.a());
                    this.f22586c.d(iA7);
                    this.f22586c.a(iA3);
                    this.f22586c.e(i10);
                    this.f22587d.c();
                    cVar.a(i16, this.f22587d.a());
                    return true;
                case 6:
                    if (iA != 8) {
                        throw new IOException(u60.a("TYPE_PING length != 8: ", iA));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    cVar.a(this.f22584a.readInt(), this.f22584a.readInt(), (iA3 & 1) != 0);
                    return true;
                case 7:
                    if (iA < 8) {
                        throw new IOException(u60.a("TYPE_GOAWAY length < 8: ", iA));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i17 = this.f22584a.readInt();
                    int i18 = this.f22584a.readInt();
                    int i19 = iA - 8;
                    as asVarA2 = as.a.a(i18);
                    if (asVarA2 == null) {
                        throw new IOException(u60.a("TYPE_GOAWAY unexpected error code: ", i18));
                    }
                    qd.g gVarD = qd.g.f34893g;
                    if (i19 > 0) {
                        gVarD = this.f22584a.d(i19);
                    }
                    cVar.a(i17, asVarA2, gVarD);
                    return true;
                case 8:
                    if (iA != 4) {
                        throw new IOException(u60.a("TYPE_WINDOW_UPDATE length !=4: ", iA));
                    }
                    long jA = ea1.a(this.f22584a.readInt());
                    if (jA == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    cVar.a(i10, jA);
                    return true;
                default:
                    fVar = this.f22584a;
                    j10 = iA;
                    fVar.skip(j10);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }
}
