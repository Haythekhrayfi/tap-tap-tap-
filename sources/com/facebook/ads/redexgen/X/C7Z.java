package com.facebook.ads.redexgen.X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7Z {
    public static byte[] A04;
    public static String[] A05 = {"qJOvsPrm5BQkhL6wLJahauzjA45r7dQz", "hfx8x2hkXgxq19RSFkkqiaOe1zMy03Qo", "bV5o7GaQth4ZZOPd4LFtWwXjKNVB8lua", "1EyYFmGpmEhL9EWyl0I1ptwRPtnJxpez", "F", IntegerTokenConverter.CONVERTER_KEY, "plO80lk7YnGQvaXazMopbLIwOg8MB0TR", "EzLFA06L6a2SQhX4934tm7serJXXg4XA"};
    public static final String A06;
    public static final Lock A07;
    public static final Lock A08;
    public static final ReentrantReadWriteLock A09;
    public SQLiteOpenHelper A00;
    public final C1336Xv A01;
    public final C1334Xt A03 = new C1334Xt(this);
    public final C1335Xu A02 = new C1335Xu(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[3].charAt(0) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "6YOEgEHO6bjbd5au9bSAefu6W5tI3Dak";
            strArr[6] = "kgOgsYcmlOEy6T8oxoaixHiO6WRSp1D2";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 115);
            i13++;
        }
    }

    public static void A07() {
        A04 = new byte[]{-31, -2, -31, -81, -51, -81, -50, -11, 22, 40, Ascii.CAN, -67, -29, -17, -20, -22, -67, -44, -2, 3, -3, 2, -44, -108, -64, -67, -63, -67, -56, -108, -106, -59, -60, -106, -35, 12, 15, 1, 2, 15, -35, -1, 22, -35, -42, 9, -5, 10, -42, -98, -43, -58, -61, -48, -61, -98, -49, -43, -46, -58, 11, 3, -54, -52, 22, 52, 65, 65, 66, 71, -13, 54, 52, 63, 63, -13, 58, 56, 71, 23, 52, 71, 52, 53, 52, 70, 56, -13, 57, 69, 66, 64, -13, 71, 59, 56, -13, 40, Ascii.FS, -13, 71, 59, 69, 56, 52, 55, -12, 33, 19, Ascii.SUB, 19, 17, 34, -18, 66, 61, 57, 51, 60, 65, -4, 39, 34, 22, 19, 38, 23, -14, 43, 40, 59, 40, 41, 40, 58, 44, 71, 88, 71, 80, 86, 85, -9, -14, -18, -24, -15, -10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i10 = 0; i10 < A0M().length; i10++) {
        }
        SQLiteOpenHelper sQLiteOpenHelper = this.A00;
        if (sQLiteOpenHelper != null) {
            sQLiteOpenHelper.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        StringBuilder sbAppend = new StringBuilder().append(A05(107, 14, 91)).append(C1334Xt.A02.A01);
        String strA05 = A05(58, 2, 51);
        StringBuilder sbAppend2 = sbAppend.append(strA05);
        String strA06 = A05(142, 6, 16);
        StringBuilder sbAppend3 = sbAppend2.append(strA06);
        String strA07 = A05(60, 1, 106);
        StringBuilder sbAppend4 = sbAppend3.append(strA07).append(C1334Xt.A01.A01).append(strA05);
        String strA08 = A05(SyslogConstants.LOG_LOCAL1, 6, 111);
        A06 = sbAppend4.append(strA08).append(strA07).append(C1335Xu.A04.A01).append(strA05).append(strA08).append(strA07).append(C1335Xu.A05.A01).append(strA05).append(strA08).append(strA07).append(C1335Xu.A0A.A01).append(strA05).append(strA08).append(strA07).append(C1335Xu.A08.A01).append(strA05).append(strA08).append(strA07).append(C1335Xu.A07.A01).append(strA05).append(strA08).append(strA07).append(C1335Xu.A06.A01).append(strA05).append(strA08).append(strA07).append(C1335Xu.A03.A01).append(strA05).append(strA08).append(strA07).append(C1335Xu.A02.A01).append(A05(11, 6, 42)).append(strA08).append(A05(17, 6, 65)).append(strA06).append(A05(30, 4, 3)).append(strA08).append(strA07).append(C1335Xu.A09.A01).append(A05(0, 3, 78)).append(strA06).append(strA07).append(C1334Xt.A02.A01).append(A05(34, 10, 74)).append(strA08).append(strA07).append(C1335Xu.A08.A01).append(A05(7, 4, 98)).toString();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        A09 = reentrantReadWriteLock;
        A07 = reentrantReadWriteLock.readLock();
        A08 = reentrantReadWriteLock.writeLock();
    }

    public C7Z(C1336Xv c1336Xv) {
        this.A01 = c1336Xv;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            final C1336Xv c1336Xv = this.A01;
            this.A00 = new SQLiteOpenHelper(c1336Xv, this) { // from class: com.facebook.ads.redexgen.X.7a
                public static byte[] A01;
                public static String[] A02 = {"JShIJu3JRfHt43ypO9GqFaXtQU", "Uet3LTw8rLJmru1DFWkYPrIPq9yjzQ4", "LBYTyoU1fD8w8O4ue", "ZxNu1nQjo2XkCjw5ERk40jWGoeLjYM9V", "VhJY3C97J7J84q76u4hEYHgB0g", "Ro8Wdk2EPx5GRn22XYsr1QjtSyjSX", "SdOPztDY16h0BPmxgfN82QFEWJhjV", "9YM807W9r6X84VXv6l9L7RtBJQk8UQ"};
                public static final String A03;
                public final C7Z A00;

                public static String A00(int i10, int i11, int i12) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                    for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                        bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 76);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A02() {
                    A01 = new byte[]{17, 1, 101, 100, 103, 96, 116, 109, 117, 1, 17, 48, 61, 37, 52, 35, 81, 37, 48, 51, 61, 52, 81, 20, 7, 20, Ascii.US, 5, 2, 81, 48, 53, 53, 81, 50, 62, 61, 36, 60, 63, 81, 90, Ascii.DEL, 95, 122, 111, 122, 121, 122, 104, 126, 83, 126, 119, 107, 126, 105, 59, 120, 122, 117, 59, 117, 116, 111, 59, 121, 126, 59, 117, 110, 119, 119, 33, 55, 42, 53, 69, 49, 36, 39, 41, 32, 69, 44, 35, 69, 32, 61, 44, 54, 49, 54, 69, 6, 23, 4, 22, 13, 0, 22, 88, 90, 73, 79, 69, 73, 40, 110, 103, 122, 109, 97, 111, 102, 87, 99, 109, 113, 123, 40, 53, 40, 71, 70, 51, 124, 121, 110, 56, 110, 51, 121, Ascii.DEL};
                }

                static {
                    A02();
                    A03 = C06757a.class.getSimpleName();
                }

                {
                    super(c1336Xv, A01(c1336Xv), (SQLiteDatabase.CursorFactory) null, 4);
                    if (this != null) {
                        this.A00 = this;
                        return;
                    }
                    throw new IllegalArgumentException(A00(41, 32, 87));
                }

                public static String A01(C1336Xv c1336Xv2) {
                    Locale locale = Locale.US;
                    Object[] objArr = {A00(0, 0, 95)};
                    String processName = A00(126, 8, 81);
                    String str = String.format(locale, processName, objArr);
                    if (!IN.A27(c1336Xv2)) {
                        return str;
                    }
                    String defaultDbName = c1336Xv2.getPackageName();
                    String processName2 = ProcessUtils.getProcessName(c1336Xv2);
                    if (!defaultDbName.equals(processName2) && !TextUtils.isEmpty(processName2)) {
                        String defaultDbName2 = '_' + processName2;
                        return String.format(Locale.US, processName, defaultDbName2);
                    }
                    return str;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                    for (AbstractC06777d abstractC06777d : this.A00.A0M()) {
                        abstractC06777d.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                    for (AbstractC06777d abstractC06777d : this.A00.A0M()) {
                        abstractC06777d.A08(sQLiteDatabase);
                        abstractC06777d.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) {
                    super.onOpen(sQLiteDatabase);
                    if (!sQLiteDatabase.isReadOnly()) {
                        sQLiteDatabase.execSQL(A00(101, 25, 68));
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                    if (i10 == 2 && i11 >= 3) {
                        String strA00 = A00(73, 28, 41);
                        if (A02[7].length() != 30) {
                            throw new RuntimeException();
                        }
                        A02[3] = "Uy0CZyDaBZXeJSQ63Y80hAJR5wsAelR7";
                        sQLiteDatabase.execSQL(strA00);
                    }
                    if (i10 <= 3 && i11 >= 4) {
                        C7X c7x = C1335Xu.A02;
                        sQLiteDatabase.execSQL(A00(11, 30, 61) + c7x.A01 + A00(0, 1, 125) + c7x.A02 + A00(1, 10, 109));
                    }
                }
            };
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e10 = null;
        for (int i10 = 0; i10 < 10; i10++) {
            try {
            } catch (SQLiteException e11) {
                e10 = e11;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A07().A9K(A05(128, 8, 84), C06937v.A0v, new C06947w(e10));
        throw e10;
        return A00();
    }

    public final int A08(int i10) {
        A08.lock();
        try {
            return A0E().delete(A05(SyslogConstants.LOG_LOCAL1, 6, 111), C1335Xu.A02.A01 + A05(3, 4, 28), new String[]{String.valueOf(i10 - 1)});
        } finally {
            A08.unlock();
        }
    }

    public final Cursor A09() {
        A07.lock();
        try {
            return this.A02.A0B();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0A() {
        A07.lock();
        try {
            return this.A02.A0C();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0B() {
        A07.lock();
        try {
            return this.A03.A0B();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0C(int i10) {
        A07.lock();
        try {
            return A0E().rawQuery(A06 + A05(23, 7, 1) + String.valueOf(i10), null);
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0D(String str) {
        A07.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A07.unlock();
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(64, 43, 96));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7c != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8Z != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(final C7c<T> c7c, final C8Z<T> c8z) {
        Executor executor = LT.A07;
        final C1336Xv c1336Xv = this.A01;
        return LQ.A00(executor, new AsyncTask<Void, Void, T>(c1336Xv, c7c, c8z) { // from class: com.facebook.ads.redexgen.X.7Y
            public static byte[] A04;
            public static String[] A05 = {"65r9CRdv0GoLRVNVjbjXzJK5P2ycj7FG", "0CWnyuhck9HOQgwCfxzQ09GVkx", "IEC2mc7xTTQi8lqWDODmms9jEFByhoZx", "6exEWFSZK9oTcnxcvUurXohDGqhdlb0H", "22QzghXqrFZ4DBGtDF", "dbvBYMdgslkBJuEWD9uCPJqFmtTt8cU5", "jZC4Ivj", "4jv2LQemXeCXPfpssPDUuPD2TleIiZzb"};
            public EnumC06767b A00;
            public final C1336Xv A01;
            public final C7c<T> A02;
            public final C8Z<T> A03;

            public static String A01(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    int i14 = (bArrCopyOfRange[i13] - i12) - 116;
                    if (A05[7].charAt(12) != 'P') {
                        throw new RuntimeException();
                    }
                    A05[6] = "VTML";
                    bArrCopyOfRange[i13] = (byte) i14;
                }
                return new String(bArrCopyOfRange);
            }

            public static void A02() {
                A04 = new byte[]{Ascii.US, Ascii.FS, 47, Ascii.FS, Ascii.GS, Ascii.FS, 46, 32};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7Y != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7c != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8Z != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
            {
                this.A02 = c7c;
                this.A03 = c8z;
                this.A01 = c1336Xv;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7Y != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            private final T A00(Void... voidArr) throws Throwable {
                if (C0979Jw.A02(this)) {
                    return null;
                }
                if (A05[6].length() == 11) {
                    throw new RuntimeException();
                }
                A05[2] = "4eGiZ19xQ4OxGjIavdFldPBRBlbWR0DL";
                T tA03 = null;
                try {
                    try {
                        tA03 = this.A02.A03();
                        this.A00 = this.A02.A00();
                        return tA03;
                    } catch (Exception e10) {
                        this.A01.A07().A9K(A01(0, 8, 71), C06937v.A0w, new C06947w(e10));
                        this.A00 = EnumC06767b.A09;
                        return tA03;
                    }
                } catch (Throwable th) {
                    C0979Jw.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7Y != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) throws Throwable {
                if (C0979Jw.A02(this)) {
                    return null;
                }
                try {
                    return A00(voidArr);
                } catch (Throwable th) {
                    C0979Jw.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7Y != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final void onPostExecute(T result) throws Throwable {
                if (C0979Jw.A02(this)) {
                    return;
                }
                try {
                    EnumC06767b enumC06767b = this.A00;
                    if (enumC06767b == null) {
                        this.A03.A02(result);
                    } else {
                        this.A03.A01(enumC06767b.A02(), this.A00.A03());
                    }
                } catch (Throwable th) {
                    C0979Jw.A00(th, this);
                }
            }
        }, new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8Z != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(String str, int i10, String str2, double d10, double d11, String str3, Map<String, String> data, C8Z<String> c8z) {
        return A0F(new C0827Du(this, str2, str, i10, d10, d11, str3, data), c8z);
    }

    public final void A0H() {
        A08.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A08.unlock();
        }
    }

    public final void A0I() {
        A08.lock();
        try {
            this.A03.A0D(this.A01);
        } finally {
            A08.unlock();
        }
    }

    public final boolean A0K(String str) {
        Lock lock = A08;
        lock.lock();
        try {
            boolean zA0F = this.A02.A0F(str);
            lock.unlock();
            String[] strArr = A05;
            if (strArr[7].charAt(23) != strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "8";
            strArr2[5] = "N";
            return zA0F;
        } catch (Throwable th) {
            A08.unlock();
            throw th;
        }
    }

    public final boolean A0L(String str) {
        boolean z10;
        A08.lock();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A05(121, 7, 95)).append(A05(SyslogConstants.LOG_LOCAL1, 6, 111)).append(A05(44, 5, 67)).append(C1335Xu.A02.A01).append(A05(61, 1, 83)).append(C1335Xu.A02.A01).append(A05(56, 2, 49)).append(A05(49, 7, 11)).append(C1335Xu.A04.A01).append(A05(62, 2, 26));
            A0E().execSQL(sb2.toString(), new String[]{str});
            z10 = true;
        } catch (SQLiteException unused) {
            z10 = false;
        }
        A08.unlock();
        String[] strArr = A05;
        if (strArr[0].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A05[2] = "LEhHmvsdsEQXOsQ0B1AVwqczGhJrofDk";
        return z10;
    }

    public final AbstractC06777d[] A0M() {
        return new AbstractC06777d[]{this.A03, this.A02};
    }
}
