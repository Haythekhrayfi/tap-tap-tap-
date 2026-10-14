package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends o6.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Writer f12843q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f12844r = new n("closed");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<i> f12845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f12846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f12847p;

    public static class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f12843q);
        this.f12845n = new ArrayList();
        this.f12847p = k.f12897a;
    }

    @Override // o6.c
    public o6.c C(Boolean bool) throws IOException {
        if (bool == null) {
            T(k.f12897a);
            return this;
        }
        T(new n(bool));
        return this;
    }

    @Override // o6.c
    public o6.c J(Number number) throws IOException {
        if (number == null) {
            T(k.f12897a);
            return this;
        }
        if (!this.f33990h) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        T(new n(number));
        return this;
    }

    @Override // o6.c
    public o6.c K(String str) throws IOException {
        if (str == null) {
            T(k.f12897a);
            return this;
        }
        T(new n(str));
        return this;
    }

    @Override // o6.c
    public o6.c O(boolean z10) throws IOException {
        T(new n(Boolean.valueOf(z10)));
        return this;
    }

    public final i R() {
        List<i> list = this.f12845n;
        return list.get(list.size() - 1);
    }

    public final void T(i iVar) {
        if (this.f12846o != null) {
            Objects.requireNonNull(iVar);
            if (!(iVar instanceof k) || this.f33993k) {
                l lVar = (l) R();
                String str = this.f12846o;
                Objects.requireNonNull(lVar);
                lVar.f12898a.put(str, iVar);
            }
            this.f12846o = null;
            return;
        }
        if (this.f12845n.isEmpty()) {
            this.f12847p = iVar;
            return;
        }
        i iVarR = R();
        if (!(iVarR instanceof f)) {
            throw new IllegalStateException();
        }
        f fVar = (f) iVarR;
        Objects.requireNonNull(fVar);
        if (iVar == null) {
            iVar = k.f12897a;
        }
        fVar.f12733c.add(iVar);
    }

    @Override // o6.c
    public o6.c b() throws IOException {
        f fVar = new f();
        T(fVar);
        this.f12845n.add(fVar);
        return this;
    }

    @Override // o6.c
    public o6.c c() throws IOException {
        l lVar = new l();
        T(lVar);
        this.f12845n.add(lVar);
        return this;
    }

    @Override // o6.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f12845n.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f12845n.add(f12844r);
    }

    @Override // o6.c, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // o6.c
    public o6.c g() throws IOException {
        if (this.f12845n.isEmpty() || this.f12846o != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof f)) {
            throw new IllegalStateException();
        }
        List<i> list = this.f12845n;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // o6.c
    public o6.c h() throws IOException {
        if (this.f12845n.isEmpty() || this.f12846o != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof l)) {
            throw new IllegalStateException();
        }
        List<i> list = this.f12845n;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // o6.c
    public o6.c i(String str) throws IOException {
        if (this.f12845n.isEmpty() || this.f12846o != null) {
            throw new IllegalStateException();
        }
        if (!(R() instanceof l)) {
            throw new IllegalStateException();
        }
        this.f12846o = str;
        return this;
    }

    @Override // o6.c
    public o6.c k() throws IOException {
        T(k.f12897a);
        return this;
    }

    @Override // o6.c
    public o6.c q(long j10) throws IOException {
        T(new n(Long.valueOf(j10)));
        return this;
    }
}
