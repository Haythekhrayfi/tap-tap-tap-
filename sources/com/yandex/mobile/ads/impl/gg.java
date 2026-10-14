package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gg implements km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dg f21015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21016b = 5242880;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21017c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private pm f21018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f21019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f21020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OutputStream f21021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private tx0 f21024j;

    public static final class a extends dg.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private dg f21025a;

        public final b a(dg dgVar) {
            this.f21025a = dgVar;
            return this;
        }

        public final gg a() {
            dg dgVar = this.f21025a;
            Objects.requireNonNull(dgVar);
            return new gg(dgVar);
        }
    }

    public gg(dg dgVar) {
        this.f21015a = (dg) pa.a(dgVar);
    }

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
    private void b(pm pmVar) throws IOException {
        long j10 = pmVar.f24107g;
        long jMin = j10 != -1 ? Math.min(j10 - this.f21023i, this.f21019e) : -1L;
        dg dgVar = this.f21015a;
        String str = pmVar.f24108h;
        int i10 = da1.f19803a;
        this.f21020f = dgVar.a(str, pmVar.f24106f + this.f21023i, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f21020f);
        OutputStream outputStream = fileOutputStream;
        if (this.f21017c > 0) {
            tx0 tx0Var = this.f21024j;
            if (tx0Var == null) {
                this.f21024j = new tx0(fileOutputStream, this.f21017c);
            } else {
                tx0Var.a(fileOutputStream);
            }
            outputStream = this.f21024j;
        }
        this.f21021g = outputStream;
        this.f21022h = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.km
    public final void a(pm pmVar) throws a {
        Objects.requireNonNull(pmVar.f24108h);
        if (pmVar.f24107g == -1 && pmVar.a(2)) {
            this.f21018d = null;
            return;
        }
        this.f21018d = pmVar;
        this.f21019e = pmVar.a(4) ? this.f21016b : RecyclerView.FOREVER_NS;
        this.f21023i = 0L;
        try {
            b(pmVar);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.km
    public final void close() throws a {
        if (this.f21018d == null) {
            return;
        }
        try {
            OutputStream outputStream = this.f21021g;
            if (outputStream == null) {
                return;
            }
            try {
                outputStream.flush();
                da1.a((Closeable) this.f21021g);
                this.f21021g = null;
                File file = this.f21020f;
                this.f21020f = null;
                this.f21015a.a(file, this.f21022h);
            } catch (Throwable th) {
                da1.a((Closeable) this.f21021g);
                this.f21021g = null;
                File file2 = this.f21020f;
                this.f21020f = null;
                file2.delete();
                throw th;
            }
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.km
    public final void write(byte[] bArr, int i10, int i11) throws a {
        pm pmVar = this.f21018d;
        if (pmVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f21022h == this.f21019e) {
                    OutputStream outputStream = this.f21021g;
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            da1.a((Closeable) this.f21021g);
                            this.f21021g = null;
                            File file = this.f21020f;
                            this.f21020f = null;
                            this.f21015a.a(file, this.f21022h);
                        } catch (Throwable th) {
                            da1.a((Closeable) this.f21021g);
                            this.f21021g = null;
                            File file2 = this.f21020f;
                            this.f21020f = null;
                            file2.delete();
                            throw th;
                        }
                    }
                    b(pmVar);
                }
                int iMin = (int) Math.min(i11 - i12, this.f21019e - this.f21022h);
                OutputStream outputStream2 = this.f21021g;
                int i13 = da1.f19803a;
                outputStream2.write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j10 = iMin;
                this.f21022h += j10;
                this.f21023i += j10;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }
}
