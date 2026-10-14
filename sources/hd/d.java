package hd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.concurrent.locks.ReentrantLock;
import kd.f0;
import kd.z;

/* JADX INFO: loaded from: classes3.dex */
public class d<E> extends hd.a<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f31092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f31093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object[] f31094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31095j;
    private volatile /* synthetic */ int size;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31096a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            f31096a = iArr;
        }
    }

    public d(int i10, e eVar, uc.l<? super E, jc.w> lVar) {
        super(lVar);
        this.f31091f = i10;
        this.f31092g = eVar;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("ArrayChannel capacity must be at least 1, but ", i10, " was specified").toString());
        }
        this.f31093h = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i10, 8)];
        kc.i.i(objArr, b.f31080a, 0, 0, 6);
        this.f31094i = objArr;
        this.size = 0;
    }

    @Override // hd.c
    public Object b(u uVar) {
        ReentrantLock reentrantLock = this.f31093h;
        reentrantLock.lock();
        try {
            return super.b(uVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // hd.c
    public String d() {
        StringBuilder sbA = defpackage.a.a("(buffer:capacity=");
        sbA.append(this.f31091f);
        sbA.append(",size=");
        return h0.f.a(sbA, this.size, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // hd.c
    public final boolean h() {
        return false;
    }

    @Override // hd.c
    public final boolean i() {
        return this.size == this.f31091f && this.f31092g == e.SUSPEND;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[Catch: all -> 0x0070, LOOP:0: B:25:0x0043->B:48:?, LOOP_START, TRY_ENTER, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0005, B:7:0x0011, B:9:0x0017, B:25:0x0043, B:28:0x004a, B:30:0x004e, B:33:0x0054, B:35:0x005a, B:38:0x0067, B:10:0x001c, B:17:0x0030, B:18:0x0035, B:19:0x0036, B:20:0x0039), top: B:44:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x004a A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0005, B:7:0x0011, B:9:0x0017, B:25:0x0043, B:28:0x004a, B:30:0x004e, B:33:0x0054, B:35:0x005a, B:38:0x0067, B:10:0x001c, B:17:0x0030, B:18:0x0035, B:19:0x0036, B:20:0x0039), top: B:44:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0070, TRY_ENTER, TryCatch #0 {all -> 0x0070, blocks: (B:3:0x0005, B:7:0x0011, B:9:0x0017, B:25:0x0043, B:28:0x004a, B:30:0x004e, B:33:0x0054, B:35:0x005a, B:38:0x0067, B:10:0x001c, B:17:0x0030, B:18:0x0035, B:19:0x0036, B:20:0x0039), top: B:44:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:25:0x0043->B:48:?, LOOP_END, SYNTHETIC] */
    @Override // hd.c
    public Object j(E e10) {
        z zVar;
        s<E> sVarL;
        ReentrantLock reentrantLock = this.f31093h;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            i<?> iVarE = e();
            if (iVarE != null) {
                reentrantLock.unlock();
                return iVarE;
            }
            if (i10 >= this.f31091f) {
                int i11 = a.f31096a[this.f31092g.ordinal()];
                if (i11 == 1) {
                    zVar = b.f31082c;
                } else if (i11 == 2) {
                    zVar = b.f31081b;
                } else if (i11 != 3) {
                    throw new jc.g();
                }
                if (zVar != null) {
                    reentrantLock.unlock();
                    return zVar;
                }
                if (i10 == 0) {
                    while (true) {
                        sVarL = l();
                        if (sVarL == null) {
                            break;
                        }
                        if (sVarL instanceof i) {
                            this.size = i10;
                            reentrantLock.unlock();
                            return sVarL;
                        }
                        if (sVarL.h(e10, null) != null) {
                            this.size = i10;
                            reentrantLock.unlock();
                            sVarL.i(e10);
                            return sVarL.d();
                        }
                    }
                }
                y(i10, e10);
                z zVar2 = b.f31081b;
                reentrantLock.unlock();
                return zVar2;
            }
            this.size = i10 + 1;
            zVar = null;
            if (zVar != null) {
                reentrantLock.unlock();
                return zVar;
            }
            if (i10 == 0) {
                while (true) {
                    sVarL = l();
                    if (sVarL == null) {
                        break;
                        break;
                    }
                    if (sVarL instanceof i) {
                        this.size = i10;
                        reentrantLock.unlock();
                        return sVarL;
                    }
                    if (sVarL.h(e10, null) != null) {
                        this.size = i10;
                        reentrantLock.unlock();
                        sVarL.i(e10);
                        return sVarL.d();
                    }
                }
            }
            y(i10, e10);
            z zVar3 = b.f31081b;
            reentrantLock.unlock();
            return zVar3;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // hd.a
    public boolean o(q<? super E> qVar) {
        ReentrantLock reentrantLock = this.f31093h;
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
        return this.size == 0;
    }

    @Override // hd.a
    public boolean s() {
        ReentrantLock reentrantLock = this.f31093h;
        reentrantLock.lock();
        try {
            return super.s();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // hd.a
    public void t(boolean z10) {
        uc.l<E, jc.w> lVar = this.f31087c;
        ReentrantLock reentrantLock = this.f31093h;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            f0 f0VarA = null;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = this.f31094i[this.f31095j];
                if (lVar != null && obj != b.f31080a) {
                    f0VarA = kd.t.a(lVar, obj, f0VarA);
                }
                Object[] objArr = this.f31094i;
                int i12 = this.f31095j;
                objArr[i12] = b.f31080a;
                this.f31095j = (i12 + 1) % objArr.length;
            }
            this.size = 0;
            reentrantLock.unlock();
            super.t(z10);
            if (f0VarA != null) {
                throw f0VarA;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // hd.a
    public Object x() {
        ReentrantLock reentrantLock = this.f31093h;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            if (i10 == 0) {
                Object objE = e();
                if (objE == null) {
                    objE = b.f31083d;
                }
                reentrantLock.unlock();
                return objE;
            }
            Object[] objArr = this.f31094i;
            int i11 = this.f31095j;
            Object obj = objArr[i11];
            u uVar = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            Object objX = b.f31083d;
            boolean z10 = false;
            if (i10 == this.f31091f) {
                u uVar2 = null;
                while (true) {
                    u uVarM = m();
                    if (uVarM == null) {
                        uVar = uVar2;
                        break;
                    }
                    if (uVarM.z(null) != null) {
                        objX = uVarM.x();
                        z10 = true;
                        uVar = uVarM;
                        break;
                    }
                    uVarM.A();
                    uVar2 = uVarM;
                }
            }
            if (objX != b.f31083d && !(objX instanceof i)) {
                this.size = i10;
                Object[] objArr2 = this.f31094i;
                objArr2[(this.f31095j + i10) % objArr2.length] = objX;
            }
            this.f31095j = (this.f31095j + 1) % this.f31094i.length;
            reentrantLock.unlock();
            if (z10) {
                j0.f(uVar);
                uVar.w();
            }
            return obj;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void y(int i10, E e10) {
        int i11 = this.f31091f;
        if (i10 >= i11) {
            Object[] objArr = this.f31094i;
            int i12 = this.f31095j;
            objArr[i12 % objArr.length] = null;
            objArr[(i10 + i12) % objArr.length] = e10;
            this.f31095j = (i12 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.f31094i;
        if (i10 >= objArr2.length) {
            int iMin = Math.min(objArr2.length * 2, i11);
            Object[] objArr3 = new Object[iMin];
            for (int i13 = 0; i13 < i10; i13++) {
                Object[] objArr4 = this.f31094i;
                objArr3[i13] = objArr4[(this.f31095j + i13) % objArr4.length];
            }
            kc.i.h(objArr3, b.f31080a, i10, iMin);
            this.f31094i = objArr3;
            this.f31095j = 0;
        }
        Object[] objArr5 = this.f31094i;
        objArr5[(this.f31095j + i10) % objArr5.length] = e10;
    }
}
