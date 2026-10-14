package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.migration.Migration;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;

    @Deprecated
    public List<b> mCallbacks;

    @Deprecated
    public volatile n1.b mDatabase;
    private n1.d mOpenHelper;
    private Executor mQueryExecutor;
    private Executor mTransactionExecutor;
    public boolean mWriteAheadLoggingEnabled;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private final Map<String, Object> mBackingFieldMap = new ConcurrentHashMap();
    private final androidx.room.d mInvalidationTracker = e();

    public static class a<T extends g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f2861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f2863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<b> f2864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Executor f2865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f2866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public n1.d.c f2867g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2868h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2871k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<Integer> f2873m;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c f2869i = c.AUTOMATIC;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2870j = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final d f2872l = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f2863c = context;
            this.f2861a = cls;
            this.f2862b = str;
        }

        public a<T> a(Migration... migrationArr) {
            if (this.f2873m == null) {
                this.f2873m = new HashSet();
            }
            for (Migration migration : migrationArr) {
                this.f2873m.add(Integer.valueOf(migration.startVersion));
                this.f2873m.add(Integer.valueOf(migration.endVersion));
            }
            d dVar = this.f2872l;
            Objects.requireNonNull(dVar);
            for (Migration migration2 : migrationArr) {
                int i10 = migration2.startVersion;
                int i11 = migration2.endVersion;
                TreeMap<Integer, k1.a> treeMap = dVar.f2874a.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    dVar.f2874a.put(Integer.valueOf(i10), treeMap);
                }
                k1.a aVar = treeMap.get(Integer.valueOf(i11));
                if (aVar != null) {
                    Log.w("ROOM", "Overriding migration " + aVar + " with " + migration2);
                }
                treeMap.put(Integer.valueOf(i11), migration2);
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x002c  */
        /* JADX WARN: Code duplicated, block: B:25:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0097  */
        /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: InstantiationException -> 0x00bb, IllegalAccessException -> 0x00d2, ClassNotFoundException -> 0x00e9, TryCatch #2 {ClassNotFoundException -> 0x00e9, IllegalAccessException -> 0x00d2, InstantiationException -> 0x00bb, blocks: (B:27:0x0091, B:31:0x00ad, B:30:0x0099), top: B:44:0x0091 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:30:0x0099, please report this as an issue */
        @SuppressLint({"RestrictedApi"})
        public T b() {
            Executor executor;
            Class<T> cls;
            String name;
            String canonicalName;
            String str;
            String str2;
            if (this.f2863c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f2861a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f2865e;
            try {
                if (executor2 != null || this.f2866f != null) {
                    if (executor2 != null && this.f2866f == null) {
                        this.f2866f = executor2;
                    } else if (executor2 == null && (executor = this.f2866f) != null) {
                    }
                    if (this.f2867g == null) {
                        this.f2867g = new o1.d();
                    }
                    Context context = this.f2863c;
                    androidx.room.a aVar = new androidx.room.a(context, this.f2862b, this.f2867g, this.f2872l, this.f2864d, this.f2868h, this.f2869i.resolve(context), this.f2865e, this.f2866f, false, this.f2870j, this.f2871k, null, null, null);
                    cls = this.f2861a;
                    name = cls.getPackage().getName();
                    canonicalName = cls.getCanonicalName();
                    if (!name.isEmpty()) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                    }
                    str = canonicalName.replace(CoreConstants.DOT, '_') + g.DB_IMPL_SUFFIX;
                    if (name.isEmpty()) {
                        str2 = str;
                    } else {
                        str2 = name + "." + str;
                    }
                    T t10 = (T) Class.forName(str2).newInstance();
                    t10.l(aVar);
                    return t10;
                }
                executor = k.a.f31887c;
                this.f2866f = executor;
                if (name.isEmpty()) {
                    str2 = str;
                } else {
                    str2 = name + "." + str;
                }
                T t11 = (T) Class.forName(str2).newInstance();
                t11.l(aVar);
                return t11;
            } catch (ClassNotFoundException unused) {
                StringBuilder sbA = defpackage.a.a("cannot find implementation for ");
                sbA.append(cls.getCanonicalName());
                sbA.append(". ");
                sbA.append(str);
                sbA.append(" does not exist");
                throw new RuntimeException(sbA.toString());
            } catch (IllegalAccessException unused2) {
                StringBuilder sbA2 = defpackage.a.a("Cannot access the constructor");
                sbA2.append(cls.getCanonicalName());
                throw new RuntimeException(sbA2.toString());
            } catch (InstantiationException unused3) {
                StringBuilder sbA3 = defpackage.a.a("Failed to create an instance of ");
                sbA3.append(cls.getCanonicalName());
                throw new RuntimeException(sbA3.toString());
            }
            this.f2865e = executor;
            if (this.f2867g == null) {
                this.f2867g = new o1.d();
            }
            Context context2 = this.f2863c;
            androidx.room.a aVar2 = new androidx.room.a(context2, this.f2862b, this.f2867g, this.f2872l, this.f2864d, this.f2868h, this.f2869i.resolve(context2), this.f2865e, this.f2866f, false, this.f2870j, this.f2871k, null, null, null);
            cls = this.f2861a;
            name = cls.getPackage().getName();
            canonicalName = cls.getCanonicalName();
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            str = canonicalName.replace(CoreConstants.DOT, '_') + g.DB_IMPL_SUFFIX;
        }
    }

    public static abstract class b {
        public void a(n1.b bVar) {
        }

        public void b(n1.b bVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public c resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap<Integer, TreeMap<Integer, k1.a>> f2874a = new HashMap<>();
    }

    public void a() {
        if (this.mAllowMainThreadQueries) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        n1.b writableDatabase = this.mOpenHelper.getWritableDatabase();
        this.mInvalidationTracker.g(writableDatabase);
        ((o1.a) writableDatabase).f33870c.beginTransaction();
    }

    public n1.g d(String str) {
        a();
        b();
        return new o1.f(((o1.a) this.mOpenHelper.getWritableDatabase()).f33870c.compileStatement(str));
    }

    public abstract androidx.room.d e();

    public abstract n1.d f(androidx.room.a aVar);

    @Deprecated
    public void g() {
        ((o1.a) this.mOpenHelper.getWritableDatabase()).f33870c.endTransaction();
        if (k()) {
            return;
        }
        androidx.room.d dVar = this.mInvalidationTracker;
        if (dVar.f2827e.compareAndSet(false, true)) {
            dVar.f2826d.j().execute(dVar.f2832j);
        }
    }

    public Lock h() {
        return this.mCloseLock.readLock();
    }

    public n1.d i() {
        return this.mOpenHelper;
    }

    public Executor j() {
        return this.mQueryExecutor;
    }

    public boolean k() {
        return ((o1.a) this.mOpenHelper.getWritableDatabase()).f33870c.inTransaction();
    }

    public void l(androidx.room.a aVar) {
        n1.d dVarF = f(aVar);
        this.mOpenHelper = dVarF;
        if (dVarF instanceof i) {
            ((i) dVarF).f2886h = aVar;
        }
        boolean z10 = aVar.f2812g == c.WRITE_AHEAD_LOGGING;
        dVarF.setWriteAheadLoggingEnabled(z10);
        this.mCallbacks = aVar.f2810e;
        this.mQueryExecutor = aVar.f2813h;
        this.mTransactionExecutor = new j1.h(aVar.f2814i);
        this.mAllowMainThreadQueries = aVar.f2811f;
        this.mWriteAheadLoggingEnabled = z10;
        if (aVar.f2815j) {
            androidx.room.d dVar = this.mInvalidationTracker;
            new e(aVar.f2807b, aVar.f2808c, dVar, dVar.f2826d.mQueryExecutor);
        }
    }

    public void m(n1.b bVar) {
        androidx.room.d dVar = this.mInvalidationTracker;
        synchronized (dVar) {
            if (dVar.f2828f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
            } else {
                ((o1.a) bVar).f33870c.execSQL("PRAGMA temp_store = MEMORY;");
                ((o1.a) bVar).f33870c.execSQL("PRAGMA recursive_triggers='ON';");
                ((o1.a) bVar).f33870c.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                dVar.g(bVar);
                dVar.f2829g = new o1.f(((o1.a) bVar).f33870c.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                dVar.f2828f = true;
            }
        }
    }

    public boolean n() {
        n1.b bVar = this.mDatabase;
        return bVar != null && ((o1.a) bVar).f33870c.isOpen();
    }

    public Cursor o(n1.f fVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null) {
            return ((o1.a) this.mOpenHelper.getWritableDatabase()).c(fVar);
        }
        o1.a aVar = (o1.a) this.mOpenHelper.getWritableDatabase();
        return aVar.f33870c.rawQueryWithFactory(new o1.b(aVar, fVar), fVar.b(), o1.a.f33869d, null, cancellationSignal);
    }

    @Deprecated
    public void p() {
        ((o1.a) this.mOpenHelper.getWritableDatabase()).f33870c.setTransactionSuccessful();
    }
}
