package androidx.room;

import android.database.Cursor;
import androidx.activity.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class h extends n1.d.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.room.a f2875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2878e;

    public static abstract class a {
        public final int version;

        public a(int i10) {
            this.version = i10;
        }

        public abstract void a(n1.b bVar);

        public abstract void b(n1.b bVar);

        public abstract void c(n1.b bVar);

        public abstract void d(n1.b bVar);

        public void e(n1.b bVar) {
        }

        public void f(n1.b bVar) {
        }

        public b g(n1.b bVar) {
            h(bVar);
            return new b(true, null);
        }

        @Deprecated
        public void h(n1.b bVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2880b;

        public b(boolean z10, String str) {
            this.f2879a = z10;
            this.f2880b = str;
        }
    }

    public h(androidx.room.a aVar, a aVar2, String str) {
        this(aVar, aVar2, "", str);
    }

    public h(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.version);
        this.f2875b = aVar;
        this.f2876c = aVar2;
        this.f2877d = str;
        this.f2878e = str2;
    }

    @Override // n1.d.a
    public void b(n1.b bVar) {
    }

    @Override // n1.d.a
    public void c(n1.b bVar) {
        Cursor cursorB = ((o1.a) bVar).b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cursorB.moveToFirst() && cursorB.getInt(0) == 0) {
                z10 = true;
            }
            cursorB.close();
            this.f2876c.a(bVar);
            if (!z10) {
                b bVarG = this.f2876c.g(bVar);
                if (!bVarG.f2879a) {
                    StringBuilder sbA = defpackage.a.a("Pre-packaged database has an invalid schema: ");
                    sbA.append(bVarG.f2880b);
                    throw new IllegalStateException(sbA.toString());
                }
            }
            g(bVar);
            this.f2876c.c(bVar);
        } catch (Throwable th) {
            cursorB.close();
            throw th;
        }
    }

    @Override // n1.d.a
    public void d(n1.b bVar, int i10, int i11) {
        f(bVar, i10, i11);
    }

    @Override // n1.d.a
    public void e(n1.b bVar) {
        o1.a aVar = (o1.a) bVar;
        Cursor cursorB = aVar.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = cursorB.moveToFirst() && cursorB.getInt(0) != 0;
            cursorB.close();
            if (z10) {
                Cursor cursorC = aVar.c(new n1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorC.moveToFirst() ? cursorC.getString(0) : null;
                    cursorC.close();
                    if (!this.f2877d.equals(string) && !this.f2878e.equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorC.close();
                    throw th;
                }
            } else {
                b bVarG = this.f2876c.g(bVar);
                if (!bVarG.f2879a) {
                    StringBuilder sbA = defpackage.a.a("Pre-packaged database has an invalid schema: ");
                    sbA.append(bVarG.f2880b);
                    throw new IllegalStateException(sbA.toString());
                }
                this.f2876c.e(bVar);
                g(bVar);
            }
            this.f2876c.d(bVar);
            this.f2875b = null;
        } catch (Throwable th2) {
            cursorB.close();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:1: B:11:0x001e->B:66:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[LOOP:2: B:22:0x0044->B:71:?, LOOP_END, SYNTHETIC] */
    @Override // n1.d.a
    public void f(n1.b bVar, int i10, int i11) {
        List listEmptyList;
        TreeMap<Integer, k1.a> treeMap;
        Set<Integer> setKeySet;
        Iterator<Integer> it;
        boolean z10;
        int iIntValue;
        androidx.room.a aVar = this.f2875b;
        boolean z11 = true;
        if (aVar != null) {
            g.d dVar = aVar.f2809d;
            Objects.requireNonNull(dVar);
            if (i10 == i11) {
                listEmptyList = Collections.emptyList();
            } else {
                boolean z12 = i11 > i10;
                ArrayList arrayList = new ArrayList();
                int i12 = i10;
                while (true) {
                    if (z12) {
                        if (i12 < i11) {
                            treeMap = dVar.f2874a.get(Integer.valueOf(i12));
                            if (treeMap != null) {
                                if (z12) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z10 = false;
                                        break;
                                    }
                                    iIntValue = it.next().intValue();
                                    if (z12 ? !(iIntValue < i11 || iIntValue >= i12) : !(iIntValue > i11 || iIntValue <= i12)) {
                                        arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                        z10 = true;
                                        i12 = iIntValue;
                                        break;
                                    }
                                }
                                if (!z10) {
                                }
                            }
                            listEmptyList = null;
                        } else {
                            listEmptyList = arrayList;
                        }
                    } else if (i12 > i11) {
                        treeMap = dVar.f2874a.get(Integer.valueOf(i12));
                        if (treeMap != null) {
                            if (z12) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z10 = false;
                                    break;
                                    break;
                                }
                                iIntValue = it.next().intValue();
                                if (z12 ? !(iIntValue < i11 || iIntValue >= i12) : !(iIntValue > i11 || iIntValue <= i12)) {
                                    arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                    z10 = true;
                                    i12 = iIntValue;
                                    break;
                                    break;
                                }
                            }
                            if (!z10) {
                            }
                        }
                        listEmptyList = null;
                    } else {
                        listEmptyList = arrayList;
                    }
                }
            }
            if (listEmptyList != null) {
                this.f2876c.f(bVar);
                Iterator it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    ((k1.a) it2.next()).a(bVar);
                }
                b bVarG = this.f2876c.g(bVar);
                if (!bVarG.f2879a) {
                    StringBuilder sbA = defpackage.a.a("Migration didn't properly handle: ");
                    sbA.append(bVarG.f2880b);
                    throw new IllegalStateException(sbA.toString());
                }
                this.f2876c.e(bVar);
                g(bVar);
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        androidx.room.a aVar2 = this.f2875b;
        if (aVar2 == null || aVar2.a(i10, i11)) {
            throw new IllegalStateException(j1.e.a("A migration from ", i10, " to ", i11, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        this.f2876c.b(bVar);
        this.f2876c.a(bVar);
    }

    public final void g(n1.b bVar) {
        o1.a aVar = (o1.a) bVar;
        aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.f33870c.execSQL(j.a("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", this.f2877d, "')"));
    }
}
