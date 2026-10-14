package androidx.room;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.j;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f2822k = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, Integer> f2823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f2824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, Set<String>> f2825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f2826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicBoolean f2827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f2828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile n1.g f2829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f2830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    public final l.b<c, C0043d> f2831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f2832j;

    public class a implements Runnable {
        public a() {
        }

        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor cursorO = d.this.f2826d.o(new n1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            while (cursorO.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorO.getInt(0)));
                } catch (Throwable th) {
                    cursorO.close();
                    throw th;
                }
            }
            cursorO.close();
            if (!hashSet.isEmpty()) {
                ((o1.f) d.this.f2829g).a();
            }
            return hashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // java.lang.Runnable
        public void run() {
            ?? A;
            Lock lockH = d.this.f2826d.h();
            try {
                try {
                    lockH.lock();
                    if (!d.this.b()) {
                        lockH.unlock();
                        return;
                    }
                    if (!d.this.f2827e.compareAndSet(true, false)) {
                        lockH.unlock();
                        return;
                    }
                    if (d.this.f2826d.k()) {
                        lockH.unlock();
                        return;
                    }
                    g gVar = d.this.f2826d;
                    A = gVar.mWriteAheadLoggingEnabled;
                    if (A != 0) {
                        try {
                            n1.b writableDatabase = gVar.i().getWritableDatabase();
                            ((o1.a) writableDatabase).f33870c.beginTransaction();
                            try {
                                Set<Integer> setA = a();
                                try {
                                    ((o1.a) writableDatabase).f33870c.setTransactionSuccessful();
                                    ((o1.a) writableDatabase).f33870c.endTransaction();
                                    A = setA;
                                } catch (Throwable th) {
                                    th = th;
                                    ((o1.a) writableDatabase).f33870c.endTransaction();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                        } catch (IllegalStateException e11) {
                            e = e11;
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                        }
                    } else {
                        A = a();
                    }
                    lockH.unlock();
                    if (A != 0 || A.isEmpty()) {
                    }
                    synchronized (d.this.f2831i) {
                        Iterator<Map.Entry<c, C0043d>> it = d.this.f2831i.iterator();
                        while (true) {
                            l.b.e eVar = (l.b.e) it;
                            if (eVar.hasNext()) {
                                C0043d c0043d = (C0043d) ((Map.Entry) eVar.next()).getValue();
                                int length = c0043d.f2840a.length;
                                Set<String> hashSet = null;
                                for (int i10 = 0; i10 < length; i10++) {
                                    if (A.contains(Integer.valueOf(c0043d.f2840a[i10]))) {
                                        if (length == 1) {
                                            hashSet = c0043d.f2843d;
                                        } else {
                                            if (hashSet == null) {
                                                hashSet = new HashSet<>(length);
                                            }
                                            hashSet.add(c0043d.f2841b[i10]);
                                        }
                                    }
                                }
                                if (hashSet != null) {
                                    c0043d.f2842c.a(hashSet);
                                }
                            }
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    lockH.unlock();
                    throw th3;
                }
            } catch (SQLiteException | IllegalStateException e12) {
                e = e12;
                A = 0;
            }
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            lockH.unlock();
            if (A != 0) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f2834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f2835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f2836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2838e;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f2834a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f2835b = zArr;
            this.f2836c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.f2837d && !this.f2838e) {
                    int length = this.f2834a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f2838e = true;
                            this.f2837d = false;
                            return this.f2836c;
                        }
                        boolean z10 = this.f2834a[i10] > 0;
                        boolean[] zArr = this.f2835b;
                        if (z10 != zArr[i10]) {
                            int[] iArr = this.f2836c;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            this.f2836c[i10] = 0;
                        }
                        zArr[i10] = z10;
                        i10++;
                    }
                }
                return null;
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f2839a;

        public c(String[] strArr) {
            this.f2839a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void a(Set<String> set);
    }

    /* JADX INFO: renamed from: androidx.room.d$d, reason: collision with other inner class name */
    public static class C0043d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f2840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f2841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f2842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f2843d;

        public C0043d(c cVar, int[] iArr, String[] strArr) {
            Set<String> setUnmodifiableSet;
            this.f2842c = cVar;
            this.f2840a = iArr;
            this.f2841b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = null;
            }
            this.f2843d = setUnmodifiableSet;
        }

        public void a(String[] strArr) {
            Set<String> set = null;
            if (this.f2841b.length == 1) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase(this.f2841b[0])) {
                        set = this.f2843d;
                        break;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str2 : strArr) {
                    for (String str3 : this.f2841b) {
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f2842c.a(set);
            }
        }
    }

    public d(g gVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2827e = new AtomicBoolean(false);
        this.f2828f = false;
        this.f2831i = new l.b<>();
        this.f2832j = new a();
        this.f2826d = gVar;
        this.f2830h = new b(strArr.length);
        this.f2823a = new HashMap<>();
        this.f2825c = map2;
        new j1.c(gVar);
        int length = strArr.length;
        this.f2824b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f2823a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f2824b[i10] = str2.toLowerCase(locale);
            } else {
                this.f2824b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f2823a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f2823a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public d(g gVar, String... strArr) {
        this(gVar, new HashMap(), Collections.emptyMap(), strArr);
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        C0043d c0043dF;
        boolean z10;
        String[] strArr = cVar.f2839a;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f2825c.containsKey(lowerCase)) {
                hashSet.addAll(this.f2825c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        int length2 = strArr2.length;
        for (int i10 = 0; i10 < length2; i10++) {
            Integer num = this.f2823a.get(strArr2[i10].toLowerCase(Locale.US));
            if (num == null) {
                StringBuilder sbA = defpackage.a.a("There is no table with name ");
                sbA.append(strArr2[i10]);
                throw new IllegalArgumentException(sbA.toString());
            }
            iArr[i10] = num.intValue();
        }
        C0043d c0043d = new C0043d(cVar, iArr, strArr2);
        synchronized (this.f2831i) {
            c0043dF = this.f2831i.f(cVar, c0043d);
        }
        if (c0043dF == null) {
            b bVar = this.f2830h;
            synchronized (bVar) {
                z10 = false;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = iArr[i11];
                    long[] jArr = bVar.f2834a;
                    long j10 = jArr[i12];
                    jArr[i12] = 1 + j10;
                    if (j10 == 0) {
                        bVar.f2837d = true;
                        z10 = true;
                    }
                }
            }
            if (z10) {
                f();
            }
        }
    }

    public boolean b() {
        if (!this.f2826d.n()) {
            return false;
        }
        if (!this.f2828f) {
            this.f2826d.i().getWritableDatabase();
        }
        if (this.f2828f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public void c(c cVar) {
        C0043d c0043dG;
        boolean z10;
        synchronized (this.f2831i) {
            c0043dG = this.f2831i.g(cVar);
        }
        if (c0043dG != null) {
            b bVar = this.f2830h;
            int[] iArr = c0043dG.f2840a;
            synchronized (bVar) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = bVar.f2834a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        bVar.f2837d = true;
                        z10 = true;
                    }
                }
            }
            if (z10) {
                f();
            }
        }
    }

    public final void d(n1.b bVar, int i10) {
        o1.a aVar = (o1.a) bVar;
        aVar.f33870c.execSQL(j.a("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i10, ", 0)"));
        String str = this.f2824b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f2822k) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            j1.d.a(sb2, str, "_", str2, "`");
            j1.d.a(sb2, " AFTER ", str2, " ON `", str);
            j1.d.a(sb2, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            j1.d.a(sb2, " = 1", " WHERE ", "table_id", " = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            aVar.f33870c.execSQL(sb2.toString());
        }
    }

    public final void e(n1.b bVar, int i10) {
        String str = this.f2824b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f2822k) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            ((o1.a) bVar).f33870c.execSQL(w0.a.a(sb2, str, "_", str2, "`"));
        }
    }

    public void f() {
        if (this.f2826d.n()) {
            g(this.f2826d.i().getWritableDatabase());
        }
    }

    public void g(n1.b bVar) {
        if (((o1.a) bVar).f33870c.inTransaction()) {
            return;
        }
        while (true) {
            try {
                Lock lockH = this.f2826d.h();
                lockH.lock();
                try {
                    int[] iArrA = this.f2830h.a();
                    if (iArrA == null) {
                        lockH.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    ((o1.a) bVar).f33870c.beginTransaction();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArrA[i10];
                            if (i11 == 1) {
                                d(bVar, i10);
                            } else if (i11 == 2) {
                                e(bVar, i10);
                            }
                        } catch (Throwable th) {
                            ((o1.a) bVar).f33870c.endTransaction();
                            throw th;
                        }
                    }
                    ((o1.a) bVar).f33870c.setTransactionSuccessful();
                    ((o1.a) bVar).f33870c.endTransaction();
                    b bVar2 = this.f2830h;
                    synchronized (bVar2) {
                        bVar2.f2838e = false;
                    }
                    lockH.unlock();
                } catch (Throwable th2) {
                    lockH.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
