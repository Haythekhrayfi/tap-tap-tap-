package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Ra implements InterfaceC2131z8, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f14859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f14860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f14862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f14863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L8 f14864f;

    public class a extends C2046vn {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            HashMap map;
            synchronized (Ra.this.f14859a) {
                Ra.b(Ra.this);
                Ra.this.f14863e = true;
                Ra.this.f14859a.notifyAll();
            }
            while (c()) {
                synchronized (this) {
                    if (Ra.this.f14860b.size() == 0) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    map = new HashMap(Ra.this.f14860b);
                    Ra.this.f14860b.clear();
                }
                if (map.size() > 0) {
                    Ra.a(Ra.this, map);
                    map.clear();
                }
            }
        }
    }

    public Ra(C2056w8 c2056w8, String str) {
        this(str, new N8(c2056w8));
    }

    public Ra(String str, L8 l10) {
        this.f14859a = new HashMap();
        this.f14860b = new HashMap();
        this.f14864f = l10;
        this.f14861c = str;
        a aVar = new a(String.format(Locale.US, "YMM-DW-%s", Integer.valueOf(ThreadFactoryC2071wn.c())));
        this.f14862d = aVar;
        aVar.start();
    }

    public static void a(Ra ra2, Map map) {
        SQLiteDatabase sQLiteDatabaseA;
        int iValueOf;
        int i10;
        Objects.requireNonNull(ra2);
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put(Action.KEY_ATTRIBUTE, str);
            if (value == ra2) {
                contentValues.putNull("value");
            } else {
                if (value instanceof String) {
                    contentValues.put("value", (String) value);
                    i10 = 4;
                } else if (value instanceof Long) {
                    contentValues.put("value", (Long) value);
                    i10 = 3;
                } else if (value instanceof Integer) {
                    contentValues.put("value", (Integer) value);
                    i10 = 2;
                } else {
                    if (value instanceof Boolean) {
                        contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                        iValueOf = 1;
                    } else if (value instanceof Float) {
                        contentValues.put("value", (Float) value);
                        iValueOf = 5;
                    }
                    contentValues.put("type", iValueOf);
                }
                iValueOf = Integer.valueOf(i10);
                contentValues.put("type", iValueOf);
            }
            contentValuesArr[i11] = contentValues;
            i11++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = ra2.f14864f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i12 = 0; i12 < size; i12++) {
                        ContentValues contentValues2 = contentValuesArr[i12];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(ra2.f14861c, "key = ?", new String[]{contentValues2.getAsString(Action.KEY_ATTRIBUTE)});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(ra2.f14861c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
        }
        U2.a(sQLiteDatabaseA);
        ra2.f14864f.a(sQLiteDatabaseA);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void b(Ra ra2) {
        SQLiteDatabase sQLiteDatabaseA;
        Object objValueOf;
        Objects.requireNonNull(ra2);
        Cursor cursor = null;
        try {
            sQLiteDatabaseA = ra2.f14864f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    Cursor cursorQuery = sQLiteDatabaseA.query(ra2.f14861c, new String[]{Action.KEY_ATTRIBUTE, "value", "type"}, null, null, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(Action.KEY_ATTRIBUTE));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("value"));
                            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        objValueOf = Integer.valueOf(Integer.parseInt(string2));
                                    } else if (i10 == 3) {
                                        objValueOf = Long.valueOf(Long.parseLong(string2));
                                    } else if (i10 != 4) {
                                        if (i10 != 5) {
                                            objValueOf = string2;
                                            objValueOf = null;
                                        } else {
                                            try {
                                                objValueOf = string2;
                                                objValueOf = Float.valueOf(Float.parseFloat(string2));
                                            } catch (NumberFormatException unused) {
                                                objValueOf = string2;
                                                objValueOf = null;
                                            }
                                        }
                                    }
                                } else if ("true".equals(string2)) {
                                    objValueOf = Boolean.TRUE;
                                } else if ("false".equals(string2)) {
                                    objValueOf = Boolean.FALSE;
                                } else {
                                    objValueOf = string2;
                                    objValueOf = null;
                                }
                                if (objValueOf != null) {
                                    ra2.f14859a.put(string, objValueOf);
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    cursor = cursorQuery;
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
            sQLiteDatabaseA = null;
        }
        U2.a(cursor);
        ra2.f14864f.a(sQLiteDatabaseA);
    }

    private Object c(String str) {
        Object obj;
        synchronized (this.f14859a) {
            c();
            obj = this.f14859a.get(str);
        }
        return obj;
    }

    private void c() {
        if (this.f14863e) {
            return;
        }
        try {
            this.f14859a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public int a(String str, int i10) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public long a(String str, long j10) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public synchronized InterfaceC2131z8 a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public InterfaceC2131z8 a(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public Set<String> a() {
        HashSet hashSet;
        synchronized (this.f14859a) {
            hashSet = new HashSet(this.f14859a.keySet());
        }
        return hashSet;
    }

    public void a(String str, Object obj) {
        synchronized (this.f14859a) {
            c();
            this.f14859a.put(str, obj);
        }
        synchronized (this.f14862d) {
            this.f14860b.put(str, obj);
            this.f14862d.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f14859a) {
            c();
            zContainsKey = this.f14859a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public InterfaceC2131z8 b(String str) {
        synchronized (this.f14859a) {
            c();
            this.f14859a.remove(str);
        }
        synchronized (this.f14862d) {
            this.f14860b.put(str, this);
            this.f14862d.notifyAll();
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public synchronized InterfaceC2131z8 b(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public InterfaceC2131z8 b(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public String b(String str, String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public void b() {
        synchronized (this.f14862d) {
            this.f14862d.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2131z8
    public boolean b(String str, boolean z10) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14862d.c()) {
            this.f14862d.d();
        }
    }
}
