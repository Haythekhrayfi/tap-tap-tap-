package com.google.android.gms.internal.ads;

import androidx.activity.j;
import androidx.fragment.app.w;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfuq<V> extends zzfxf implements zzfwm<V> {
    private static final Logger zzaZ;
    private static final zza zzba;
    private static final Object zzbd;
    public static final boolean zzd;

    @CheckForNull
    private volatile zzd listeners;

    @CheckForNull
    private volatile Object value;

    @CheckForNull
    private volatile zzk waiters;

    abstract class zza {
        public /* synthetic */ zza(zzfup zzfupVar) {
        }

        public abstract zzd zza(zzfuq zzfuqVar, zzd zzdVar);

        public abstract zzk zzb(zzfuq zzfuqVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzfuq zzfuqVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzfuq zzfuqVar, @CheckForNull Object obj, Object obj2);

        public abstract boolean zzg(zzfuq zzfuqVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2);
    }

    final class zzb {

        @CheckForNull
        public static final zzb zza;

        @CheckForNull
        public static final zzb zzb;
        public final boolean zzc;

        @CheckForNull
        public final Throwable zzd;

        static {
            if (zzfuq.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z10, @CheckForNull Throwable th) {
            this.zzc = z10;
            this.zzd = th;
        }
    }

    final class zzc {
        public static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfuq.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable zzb;

        public zzc(Throwable th) {
            Objects.requireNonNull(th);
            this.zzb = th;
        }
    }

    final class zzd {
        public static final zzd zza = new zzd();

        @CheckForNull
        public zzd next;

        @CheckForNull
        public final Runnable zzb;

        @CheckForNull
        public final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    final class zze extends zza {
        public final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        public final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        public final AtomicReferenceFieldUpdater<zzfuq, zzk> zzc;
        public final AtomicReferenceFieldUpdater<zzfuq, zzd> zzd;
        public final AtomicReferenceFieldUpdater<zzfuq, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final zzd zza(zzfuq zzfuqVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzfuqVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final zzk zzb(zzfuq zzfuqVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzfuqVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zze(zzfuq zzfuqVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfur.zza(this.zzd, zzfuqVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zzf(zzfuq zzfuqVar, @CheckForNull Object obj, Object obj2) {
            return zzfur.zza(this.zze, zzfuqVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zzg(zzfuq zzfuqVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfur.zza(this.zzc, zzfuqVar, zzkVar, zzkVar2);
        }
    }

    final class zzf<V> implements Runnable {
        public final zzfuq<V> zza;
        public final zzfwm<? extends V> zzb;

        public zzf(zzfuq zzfuqVar, zzfwm zzfwmVar) {
            this.zza = zzfuqVar;
            this.zzb = zzfwmVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfuq) this.zza).value != this) {
                return;
            }
            if (zzfuq.zzba.zzf(this.zza, this, zzfuq.zzf(this.zzb))) {
                zzfuq.zzy(this.zza, false);
            }
        }
    }

    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        public /* synthetic */ zzg(zzfus zzfusVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final zzd zza(zzfuq zzfuqVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzfuqVar) {
                zzdVar2 = zzfuqVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzfuqVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final zzk zzb(zzfuq zzfuqVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfuqVar) {
                zzkVar2 = zzfuqVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzfuqVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zze(zzfuq zzfuqVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfuqVar) {
                if (zzfuqVar.listeners != zzdVar) {
                    return false;
                }
                zzfuqVar.listeners = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zzf(zzfuq zzfuqVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzfuqVar) {
                if (zzfuqVar.value != obj) {
                    return false;
                }
                zzfuqVar.value = obj2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zzg(zzfuq zzfuqVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            synchronized (zzfuqVar) {
                if (zzfuqVar.waiters != zzkVar) {
                    return false;
                }
                zzfuqVar.waiters = zzkVar2;
                return true;
            }
        }
    }

    interface zzh<V> extends zzfwm<V> {
    }

    abstract class zzi<V> extends zzfuq<V> implements zzh<V> {
    }

    final class zzj extends zza {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfuq.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzfuq.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzfuq.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzfuq.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            } catch (RuntimeException e12) {
                throw e12;
            }
        }

        private zzj() {
            super(null);
        }

        public /* synthetic */ zzj(zzfuu zzfuuVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final zzd zza(zzfuq zzfuqVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzfuqVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzfuqVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final zzk zzb(zzfuq zzfuqVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfuqVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzfuqVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zze(zzfuq zzfuqVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzfut.zza(zza, zzfuqVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zzf(zzfuq zzfuqVar, @CheckForNull Object obj, Object obj2) {
            return zzfut.zza(zza, zzfuqVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfuq.zza
        public final boolean zzg(zzfuq zzfuqVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzfut.zza(zza, zzfuqVar, zzc, zzkVar, zzkVar2);
        }
    }

    final class zzk {
        public static final zzk zza = new zzk(false);

        @CheckForNull
        public volatile zzk next;

        @CheckForNull
        public volatile Thread thread;

        public zzk() {
            zzfuq.zzba.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzd = z10;
        zzaZ = Logger.getLogger(zzfuq.class.getName());
        Object[] objArr = 0;
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e10) {
            try {
                th2 = e10;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfuq.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfuq.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfuq.class, Object.class, "value"));
                th = null;
            } catch (Error | RuntimeException e11) {
                th = e11;
                th2 = e10;
                zzgVar = new zzg(objArr == true ? 1 : 0);
            }
        }
        zzba = zzgVar;
        if (th != null) {
            Logger logger = zzaZ;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbd = new Object();
    }

    private final void zzA(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                        }
                    } else if (!zzba.zzg(this, zzkVar2, zzkVar4)) {
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzbd) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzf(zzfwm zzfwmVar) {
        Throwable thZzm;
        if (zzfwmVar instanceof zzh) {
            Object zzbVar = ((zzfuq) zzfwmVar).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.zzc) {
                    Throwable th = zzbVar2.zzd;
                    zzbVar = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            Objects.requireNonNull(zzbVar);
            return zzbVar;
        }
        if ((zzfwmVar instanceof zzfxf) && (thZzm = ((zzfxf) zzfwmVar).zzm()) != null) {
            return new zzc(thZzm);
        }
        boolean zIsCancelled = zzfwmVar.isCancelled();
        if ((!zzd) && zIsCancelled) {
            zzb zzbVar3 = zzb.zzb;
            Objects.requireNonNull(zzbVar3);
            return zzbVar3;
        }
        try {
            Object objZzg = zzg(zzfwmVar);
            if (!zIsCancelled) {
                return objZzg == null ? zzbd : objZzg;
            }
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(zzfwmVar)));
        } catch (Error e10) {
            e = e10;
            return new zzc(e);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfwmVar)), e11)) : new zzb(false, e11);
        } catch (RuntimeException e12) {
            e = e12;
            return new zzc(e);
        } catch (ExecutionException e13) {
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfwmVar)), e13)) : new zzc(e13.getCause());
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    private final void zzv(StringBuilder sb2) {
        String hexString;
        String str = "]";
        try {
            Object objZzg = zzg(this);
            sb2.append("SUCCESS, result=[");
            if (objZzg == null) {
                hexString = "null";
            } else if (objZzg == this) {
                hexString = "this future";
            } else {
                sb2.append(objZzg.getClass().getName());
                sb2.append("@");
                hexString = Integer.toHexString(System.identityHashCode(objZzg));
            }
            sb2.append(hexString);
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

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private final void zzw(StringBuilder sb2) {
        String strConcat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (!(obj instanceof zzf)) {
            try {
                strConcat = zzfpw.zza(zza());
            } catch (RuntimeException | StackOverflowError e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null) {
                sb2.append(", info=[");
                sb2.append(strConcat);
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                zzv(sb2);
            }
        }
        sb2.append(", setFuture=[");
        zzx(sb2, ((zzf) obj).zzb);
        sb2.append("]");
        if (isDone()) {
            sb2.delete(length, sb2.length());
            zzv(sb2);
        }
    }

    private final void zzx(StringBuilder sb2, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzy(zzfuq zzfuqVar, boolean z10) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzkVarZzb = zzba.zzb(zzfuqVar, zzk.zza); zzkVarZzb != null; zzkVarZzb = zzkVarZzb.next) {
                Thread thread = zzkVarZzb.thread;
                if (thread != null) {
                    zzkVarZzb.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                zzfuqVar.zzr();
            }
            zzfuqVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZza = zzba.zza(zzfuqVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZza != null) {
                zzd zzdVar4 = zzdVarZza.next;
                zzdVarZza.next = zzdVar3;
                zzdVar3 = zzdVarZza;
                zzdVarZza = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                Objects.requireNonNull(runnable);
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzfuqVar = zzfVar.zza;
                    if (zzfuqVar.value == zzfVar) {
                        if (zzba.zzf(zzfuqVar, zzfVar, zzf(zzfVar.zzb))) {
                            z10 = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzz(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            zzaZ.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", w.a("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj instanceof zzf) && !(obj == null)) {
            return false;
        }
        if (zzd) {
            zzbVar = new zzb(z10, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z10 ? zzb.zza : zzb.zzb;
            Objects.requireNonNull(zzbVar);
        }
        zzfuq<V> zzfuqVar = this;
        boolean z11 = false;
        while (true) {
            if (zzba.zzf(zzfuqVar, obj, zzbVar)) {
                zzy(zzfuqVar, z10);
                if (obj instanceof zzf) {
                    zzfwm<? extends V> zzfwmVar = ((zzf) obj).zzb;
                    if (zzfwmVar instanceof zzh) {
                        zzfuqVar = (zzfuq) zzfwmVar;
                        obj = zzfuqVar.value;
                        if ((obj == null) | (obj instanceof zzf)) {
                            z11 = true;
                        }
                    } else {
                        zzfwmVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = zzfuqVar.value;
            if (!(obj instanceof zzf)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzB(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzba;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzA(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzB(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return zzB(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z10 = true;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzB(obj);
        }
        long j11 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                while (true) {
                    zza zzaVar = zzba;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzA(zzkVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzB(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzA(zzkVar2);
                        j11 = 0;
                        break;
                    }
                    zzkVar = this.waiters;
                    if (zzkVar == zzk.zza) {
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzB(obj3);
        }
        while (nanos > j11) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                return zzB(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
            j11 = 0;
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j12 = -nanos;
            long jConvert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z10 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z10) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z10) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(j.a(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb2);
        } else {
            zzw(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public void zzc(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfph.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzba.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzz(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (!zzba.zzf(this, null, obj)) {
            return false;
        }
        zzy(this, false);
        return true;
    }

    public boolean zze(Throwable th) {
        Objects.requireNonNull(th);
        if (!zzba.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzy(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    @CheckForNull
    public final Throwable zzm() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public void zzr() {
    }

    public final void zzs(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    public final boolean zzt(zzfwm zzfwmVar) {
        zzc zzcVar;
        Objects.requireNonNull(zzfwmVar);
        Object obj = this.value;
        if (obj == null) {
            if (zzfwmVar.isDone()) {
                if (!zzba.zzf(this, null, zzf(zzfwmVar))) {
                    return false;
                }
                zzy(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, zzfwmVar);
            if (zzba.zzf(this, null, zzfVar)) {
                try {
                    zzfwmVar.zzc(zzfVar, zzfvq.INSTANCE);
                } catch (Error | RuntimeException e10) {
                    try {
                        zzcVar = new zzc(e10);
                    } catch (Error | RuntimeException unused) {
                        zzcVar = zzc.zza;
                    }
                    zzba.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfwmVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }
}
