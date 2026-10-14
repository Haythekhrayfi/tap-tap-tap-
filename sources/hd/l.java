package hd;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.locks.ReentrantLock;
import kd.f0;
import kd.z;

/* JADX INFO: loaded from: classes3.dex */
public class l<E> extends a<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f31105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f31106g;

    public l(uc.l<? super E, jc.w> lVar) {
        super(lVar);
        this.f31105f = new ReentrantLock();
        this.f31106g = b.f31080a;
    }

    @Override // hd.c
    public String d() {
        ReentrantLock reentrantLock = this.f31105f;
        reentrantLock.lock();
        try {
            return "(value=" + this.f31106g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // hd.c
    public final boolean h() {
        return false;
    }

    @Override // hd.c
    public final boolean i() {
        return false;
    }

    @Override // hd.c
    public Object j(E e10) {
        ReentrantLock reentrantLock = this.f31105f;
        reentrantLock.lock();
        try {
            i<?> iVarE = e();
            if (iVarE != null) {
                reentrantLock.unlock();
                return iVarE;
            }
            if (this.f31106g == b.f31080a) {
                while (true) {
                    s<E> sVarL = l();
                    if (sVarL == null) {
                        break;
                    }
                    if (sVarL instanceof i) {
                        reentrantLock.unlock();
                        return sVarL;
                    }
                    if (sVarL.h(e10, null) != null) {
                        reentrantLock.unlock();
                        sVarL.i(e10);
                        return sVarL.d();
                    }
                }
            }
            f0 f0VarY = y(e10);
            if (f0VarY != null) {
                throw f0VarY;
            }
            z zVar = b.f31081b;
            reentrantLock.unlock();
            return zVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // hd.a
    public boolean o(q<? super E> qVar) {
        ReentrantLock reentrantLock = this.f31105f;
        reentrantLock.lock();
        try {
            return super.o(qVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // hd.a
    public final boolean p() {
        return false;
    }

    @Override // hd.a
    public final boolean q() {
        ReentrantLock reentrantLock = this.f31105f;
        reentrantLock.lock();
        try {
            return this.f31106g == b.f31080a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // hd.a
    public void t(boolean z10) {
        ReentrantLock reentrantLock = this.f31105f;
        reentrantLock.lock();
        try {
            f0 f0VarY = y(b.f31080a);
            reentrantLock.unlock();
            super.t(z10);
            if (f0VarY != null) {
                throw f0VarY;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // hd.a
    public Object x() {
        ReentrantLock reentrantLock = this.f31105f;
        reentrantLock.lock();
        try {
            Object obj = this.f31106g;
            z zVar = b.f31080a;
            if (obj != zVar) {
                this.f31106g = zVar;
                return obj;
            }
            Object objE = e();
            if (objE == null) {
                objE = b.f31083d;
            }
            return objE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final f0 y(Object obj) {
        uc.l<E, jc.w> lVar;
        Object obj2 = this.f31106g;
        f0 f0VarA = null;
        if (obj2 != b.f31080a && (lVar = this.f31087c) != null) {
            f0VarA = kd.t.a(lVar, obj2, null);
        }
        this.f31106g = obj;
        return f0VarA;
    }
}
