package i2;

import androidx.activity.j;
import androidx.activity.k;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<V> implements t4.a<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f31185f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f31186g = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC0308b f31187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f31188i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f31189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f31190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile i f31191e;

    /* JADX INFO: renamed from: i2.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0308b {
        public AbstractC0308b(a aVar) {
        }

        public abstract boolean a(b<?> bVar, e eVar, e eVar2);

        public abstract boolean b(b<?> bVar, Object obj, Object obj2);

        public abstract boolean c(b<?> bVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f31192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f31193d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f31194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f31195b;

        static {
            if (b.f31185f) {
                f31193d = null;
                f31192c = null;
            } else {
                f31193d = new c(false, null);
                f31192c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th) {
            this.f31194a = z10;
            this.f31195b = th;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f31196b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f31197a;

        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            boolean z10 = b.f31185f;
            Objects.requireNonNull(th);
            this.f31197a = th;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f31198d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f31199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f31200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f31201c;

        public e(Runnable runnable, Executor executor) {
            this.f31199a = runnable;
            this.f31200b = executor;
        }
    }

    public static final class f extends AbstractC0308b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f31202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f31203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, i> f31204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, e> f31205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<b, Object> f31206e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f31202a = atomicReferenceFieldUpdater;
            this.f31203b = atomicReferenceFieldUpdater2;
            this.f31204c = atomicReferenceFieldUpdater3;
            this.f31205d = atomicReferenceFieldUpdater4;
            this.f31206e = atomicReferenceFieldUpdater5;
        }

        @Override // i2.b.AbstractC0308b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            return this.f31205d.compareAndSet(bVar, eVar, eVar2);
        }

        @Override // i2.b.AbstractC0308b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            return this.f31206e.compareAndSet(bVar, obj, obj2);
        }

        @Override // i2.b.AbstractC0308b
        public boolean c(b<?> bVar, i iVar, i iVar2) {
            return this.f31204c.compareAndSet(bVar, iVar, iVar2);
        }

        @Override // i2.b.AbstractC0308b
        public void d(i iVar, i iVar2) {
            this.f31203b.lazySet(iVar, iVar2);
        }

        @Override // i2.b.AbstractC0308b
        public void e(i iVar, Thread thread) {
            this.f31202a.lazySet(iVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b<V> f31207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t4.a<? extends V> f31208d;

        public g(b<V> bVar, t4.a<? extends V> aVar) {
            this.f31207c = bVar;
            this.f31208d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31207c.f31189c != this) {
                return;
            }
            if (b.f31187h.b(this.f31207c, this, b.f(this.f31208d))) {
                b.c(this.f31207c);
            }
        }
    }

    public static final class h extends AbstractC0308b {
        public h() {
            super(null);
        }

        @Override // i2.b.AbstractC0308b
        public boolean a(b<?> bVar, e eVar, e eVar2) {
            synchronized (bVar) {
                if (bVar.f31190d != eVar) {
                    return false;
                }
                bVar.f31190d = eVar2;
                return true;
            }
        }

        @Override // i2.b.AbstractC0308b
        public boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (bVar.f31189c != obj) {
                    return false;
                }
                bVar.f31189c = obj2;
                return true;
            }
        }

        @Override // i2.b.AbstractC0308b
        public boolean c(b<?> bVar, i iVar, i iVar2) {
            synchronized (bVar) {
                if (bVar.f31191e != iVar) {
                    return false;
                }
                bVar.f31191e = iVar2;
                return true;
            }
        }

        @Override // i2.b.AbstractC0308b
        public void d(i iVar, i iVar2) {
            iVar.f31211b = iVar2;
        }

        @Override // i2.b.AbstractC0308b
        public void e(i iVar, Thread thread) {
            iVar.f31210a = thread;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f31209c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f31210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile i f31211b;

        public i() {
            b.f31187h.e(this, Thread.currentThread());
        }

        public i(boolean z10) {
        }
    }

    static {
        AbstractC0308b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, i.class, "e"), AtomicReferenceFieldUpdater.newUpdater(b.class, e.class, "d"), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f31187h = hVar;
        if (th != null) {
            f31186g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f31188i = new Object();
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
    public static void c(b<?> bVar) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = bVar.f31191e;
            if (f31187h.c(bVar, iVar, i.f31209c)) {
                while (iVar != null) {
                    Thread thread = iVar.f31210a;
                    if (thread != null) {
                        iVar.f31210a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f31211b;
                }
                do {
                    eVar = bVar.f31190d;
                } while (!f31187h.a(bVar, eVar, e.f31198d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f31201c;
                    eVar3.f31201c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f31201c;
                    Runnable runnable = eVar2.f31199a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        bVar = gVar.f31207c;
                        if (bVar.f31189c == gVar) {
                            if (f31187h.b(bVar, gVar, f(gVar.f31208d))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, eVar2.f31200b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f31186g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(t4.a<?> aVar) {
        if (aVar instanceof b) {
            Object obj = ((b) aVar).f31189c;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f31194a) {
                return cVar.f31195b != null ? new c(false, cVar.f31195b) : c.f31193d;
            }
            return obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f31185f) && zIsCancelled) {
            return c.f31193d;
        }
        try {
            Object objG = g(aVar);
            return objG == null ? f31188i : objG;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V g(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    @Override // t4.a
    public final void a(Runnable runnable, Executor executor) {
        Objects.requireNonNull(runnable);
        Objects.requireNonNull(executor);
        e eVar = this.f31190d;
        if (eVar != e.f31198d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f31201c = eVar;
                if (f31187h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f31190d;
                }
            } while (eVar != e.f31198d);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        String str = "]";
        try {
            Object objG = g(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objG == this ? "this future" : String.valueOf(objG));
            sb2.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append(str);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f31189c;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f31185f) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f31192c : c.f31193d;
        }
        b<V> bVar = this;
        boolean z11 = false;
        while (true) {
            if (f31187h.b(bVar, obj, cVar)) {
                c(bVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                t4.a<? extends V> aVar = ((g) obj).f31208d;
                if (!(aVar instanceof b)) {
                    aVar.cancel(z10);
                    return true;
                }
                bVar = (b) aVar;
                obj = bVar.f31189c;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = bVar.f31189c;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            Throwable th = ((c) obj).f31195b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f31197a);
        }
        if (obj == f31188i) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f31189c;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return e(obj2);
        }
        i iVar = this.f31191e;
        if (iVar != i.f31209c) {
            i iVar2 = new i();
            do {
                AbstractC0308b abstractC0308b = f31187h;
                abstractC0308b.d(iVar2, iVar);
                if (abstractC0308b.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f31189c;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return e(obj);
                }
                iVar = this.f31191e;
            } while (iVar != i.f31209c);
        }
        return e(this.f31189c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        Object obj = this.f31189c;
        if (obj instanceof g) {
            StringBuilder sbA = defpackage.a.a("setFuture=[");
            t4.a<? extends V> aVar = ((g) obj).f31208d;
            return k.a(sbA, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sbA2 = defpackage.a.a("remaining delay=[");
        sbA2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sbA2.append(" ms]");
        return sbA2.toString();
    }

    public final void i(i iVar) {
        iVar.f31210a = null;
        while (true) {
            i iVar2 = this.f31191e;
            if (iVar2 == i.f31209c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f31211b;
                if (iVar2.f31210a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f31211b = iVar4;
                    if (iVar3.f31210a == null) {
                    }
                } else if (!f31187h.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31189c instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f31189c;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public String toString() {
        String string;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (!(this.f31189c instanceof c)) {
            if (isDone()) {
                b(sb2);
            } else {
                try {
                    string = h();
                } catch (RuntimeException e10) {
                    StringBuilder sbA = defpackage.a.a("Exception thrown from implementation: ");
                    sbA.append(e10.getClass());
                    string = sbA.toString();
                }
                if (string != null && !string.isEmpty()) {
                    v.e.a(sb2, "PENDING, info=[", string, "]");
                } else if (isDone()) {
                    b(sb2);
                } else {
                    str = "PENDING";
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
        str = "CANCELLED";
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f31189c;
        boolean z10 = true;
        if ((obj != null) && (!(obj instanceof g))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f31191e;
            if (iVar != i.f31209c) {
                i iVar2 = new i();
                while (true) {
                    AbstractC0308b abstractC0308b = f31187h;
                    abstractC0308b.d(iVar2, iVar);
                    if (abstractC0308b.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f31189c;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(iVar2);
                        break;
                    }
                    iVar = this.f31191e;
                    if (iVar == i.f31209c) {
                    }
                }
            }
            return e(this.f31189c);
        }
        while (nanos > 0) {
            Object obj3 = this.f31189c;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbA = i2.a.a("Waited ", j10, " ");
        sbA.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbA.toString();
        if (nanos + 1000 < 0) {
            String strA = i.f.a(string3, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z10 = false;
            }
            if (jConvert > 0) {
                String strA2 = strA + jConvert + " " + lowerCase;
                if (z10) {
                    strA2 = i.f.a(strA2, ",");
                }
                strA = i.f.a(strA2, " ");
            }
            if (z10) {
                strA = strA + nanos2 + " nanoseconds ";
            }
            string3 = i.f.a(strA, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(i.f.a(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(j.a(string3, " for ", string));
    }
}
