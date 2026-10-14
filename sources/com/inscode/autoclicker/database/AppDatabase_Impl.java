package com.inscode.autoclicker.database;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l1.d;
import t6.b;
import t6.c;

/* JADX INFO: loaded from: classes2.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13043a = 0;
    private volatile b _combineSettingsDao;
    private volatile u6.b _manualSettingsDao;
    private volatile v6.b _recordSettingsDao;

    public class a extends h.a {
        public a(int i10) {
            super(i10);
        }

        @Override // androidx.room.h.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("CREATE TABLE IF NOT EXISTS `manual_settings` (`name` TEXT NOT NULL, `repeatInterval` INTEGER NOT NULL, `tapDuration` INTEGER NOT NULL, `swipeDuration` INTEGER NOT NULL, `randomizeActions` INTEGER NOT NULL, `repeatCount` INTEGER NOT NULL, `actionSets` TEXT NOT NULL, `updated` INTEGER NOT NULL, `oneFingerMode` INTEGER NOT NULL, `orientation` INTEGER NOT NULL, PRIMARY KEY(`name`))");
            o1.a aVar = (o1.a) bVar;
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS `record_settings` (`name` TEXT NOT NULL, `actionSets` TEXT NOT NULL, `updated` INTEGER NOT NULL, `timeBetweenRepeat` INTEGER NOT NULL, `orientation` INTEGER NOT NULL, `repeatCount` INTEGER NOT NULL, `playbackSpeed` REAL NOT NULL, PRIMARY KEY(`name`))");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS `combine_settings` (`name` TEXT NOT NULL, `recordings` TEXT NOT NULL, `updated` INTEGER NOT NULL, `timeBetweenRepeat` INTEGER NOT NULL, `orientation` INTEGER NOT NULL, `repeatCount` INTEGER NOT NULL, PRIMARY KEY(`name`))");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.f33870c.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '135e72d4febf57b6cf007764c770fae0')");
        }

        @Override // androidx.room.h.a
        public void b(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("DROP TABLE IF EXISTS `manual_settings`");
            o1.a aVar = (o1.a) bVar;
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS `record_settings`");
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS `combine_settings`");
        }

        @Override // androidx.room.h.a
        public void c(n1.b bVar) {
            AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
            int i10 = AppDatabase_Impl.f13043a;
            List<g.b> list = appDatabase_Impl.mCallbacks;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AppDatabase_Impl.this.mCallbacks.get(i11).a(bVar);
                }
            }
        }

        @Override // androidx.room.h.a
        public void d(n1.b bVar) {
            AppDatabase_Impl appDatabase_Impl = AppDatabase_Impl.this;
            int i10 = AppDatabase_Impl.f13043a;
            appDatabase_Impl.mDatabase = bVar;
            AppDatabase_Impl.this.m(bVar);
            List<g.b> list = AppDatabase_Impl.this.mCallbacks;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AppDatabase_Impl.this.mCallbacks.get(i11).b(bVar);
                }
            }
        }

        @Override // androidx.room.h.a
        public void e(n1.b bVar) {
        }

        @Override // androidx.room.h.a
        public void f(n1.b bVar) {
            l1.b.a(bVar);
        }

        @Override // androidx.room.h.a
        public void h(n1.b bVar) {
            HashMap map = new HashMap(10);
            map.put("name", new d.a("name", "TEXT", true, 1));
            map.put("repeatInterval", new d.a("repeatInterval", "INTEGER", true, 0));
            map.put("tapDuration", new d.a("tapDuration", "INTEGER", true, 0));
            map.put("swipeDuration", new d.a("swipeDuration", "INTEGER", true, 0));
            map.put("randomizeActions", new d.a("randomizeActions", "INTEGER", true, 0));
            map.put("repeatCount", new d.a("repeatCount", "INTEGER", true, 0));
            map.put("actionSets", new d.a("actionSets", "TEXT", true, 0));
            map.put("updated", new d.a("updated", "INTEGER", true, 0));
            map.put("oneFingerMode", new d.a("oneFingerMode", "INTEGER", true, 0));
            map.put("orientation", new d.a("orientation", "INTEGER", true, 0));
            d dVar = new d("manual_settings", map, new HashSet(0), new HashSet(0));
            d dVarA = d.a(bVar, "manual_settings");
            if (!dVar.equals(dVarA)) {
                throw new IllegalStateException("Migration didn't properly handle manual_settings(com.inscode.autoclicker.database.manual.ManualSettings).\n Expected:\n" + dVar + "\n Found:\n" + dVarA);
            }
            HashMap map2 = new HashMap(7);
            map2.put("name", new d.a("name", "TEXT", true, 1));
            map2.put("actionSets", new d.a("actionSets", "TEXT", true, 0));
            map2.put("updated", new d.a("updated", "INTEGER", true, 0));
            map2.put("timeBetweenRepeat", new d.a("timeBetweenRepeat", "INTEGER", true, 0));
            map2.put("orientation", new d.a("orientation", "INTEGER", true, 0));
            map2.put("repeatCount", new d.a("repeatCount", "INTEGER", true, 0));
            map2.put("playbackSpeed", new d.a("playbackSpeed", "REAL", true, 0));
            d dVar2 = new d("record_settings", map2, new HashSet(0), new HashSet(0));
            d dVarA2 = d.a(bVar, "record_settings");
            if (!dVar2.equals(dVarA2)) {
                throw new IllegalStateException("Migration didn't properly handle record_settings(com.inscode.autoclicker.database.record.RecordSettings).\n Expected:\n" + dVar2 + "\n Found:\n" + dVarA2);
            }
            HashMap map3 = new HashMap(6);
            map3.put("name", new d.a("name", "TEXT", true, 1));
            map3.put("recordings", new d.a("recordings", "TEXT", true, 0));
            map3.put("updated", new d.a("updated", "INTEGER", true, 0));
            map3.put("timeBetweenRepeat", new d.a("timeBetweenRepeat", "INTEGER", true, 0));
            map3.put("orientation", new d.a("orientation", "INTEGER", true, 0));
            map3.put("repeatCount", new d.a("repeatCount", "INTEGER", true, 0));
            d dVar3 = new d("combine_settings", map3, new HashSet(0), new HashSet(0));
            d dVarA3 = d.a(bVar, "combine_settings");
            if (dVar3.equals(dVarA3)) {
                return;
            }
            throw new IllegalStateException("Migration didn't properly handle combine_settings(com.inscode.autoclicker.database.combine.CombineSettings).\n Expected:\n" + dVar3 + "\n Found:\n" + dVarA3);
        }
    }

    @Override // androidx.room.g
    public androidx.room.d e() {
        return new androidx.room.d(this, new HashMap(0), new HashMap(0), "manual_settings", "record_settings", "combine_settings");
    }

    @Override // androidx.room.g
    public n1.d f(androidx.room.a aVar) {
        h hVar = new h(aVar, new a(8), "135e72d4febf57b6cf007764c770fae0", "f40ddac92cf0e65d69d6453c366d8e44");
        Context context = aVar.f2807b;
        String str = aVar.f2808c;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return aVar.f2806a.a(new n1.d.b(context, str, hVar, false));
    }

    @Override // com.inscode.autoclicker.database.AppDatabase
    public b s() {
        b bVar;
        if (this._combineSettingsDao != null) {
            return this._combineSettingsDao;
        }
        synchronized (this) {
            if (this._combineSettingsDao == null) {
                this._combineSettingsDao = new c(this);
            }
            bVar = this._combineSettingsDao;
        }
        return bVar;
    }

    @Override // com.inscode.autoclicker.database.AppDatabase
    public u6.b t() {
        u6.b bVar;
        if (this._manualSettingsDao != null) {
            return this._manualSettingsDao;
        }
        synchronized (this) {
            if (this._manualSettingsDao == null) {
                this._manualSettingsDao = new u6.c(this);
            }
            bVar = this._manualSettingsDao;
        }
        return bVar;
    }

    @Override // com.inscode.autoclicker.database.AppDatabase
    public v6.b u() {
        v6.b bVar;
        if (this._recordSettingsDao != null) {
            return this._recordSettingsDao;
        }
        synchronized (this) {
            if (this._recordSettingsDao == null) {
                this._recordSettingsDao = new v6.c(this);
            }
            bVar = this._recordSettingsDao;
        }
        return bVar;
    }
}
