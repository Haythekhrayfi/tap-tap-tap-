package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g2.b;
import g2.c;
import g2.e;
import g2.f;
import g2.h;
import g2.i;
import g2.k;
import g2.l;
import g2.n;
import g2.o;
import g2.q;
import g2.r;
import g2.t;
import g2.u;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import l1.d;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f3123j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile q f3124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b f3125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile t f3126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile h f3127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile k f3128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile n f3129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile e f3130i;

    public class a extends androidx.room.h.a {
        public a(int i10) {
            super(i10);
        }

        @Override // androidx.room.h.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            o1.a aVar = (o1.a) bVar;
            aVar.f33870c.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.f33870c.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.f33870c.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.f33870c.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f33870c.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f33870c.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.f33870c.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.f33870c.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.h.a
        public void b(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("DROP TABLE IF EXISTS `Dependency`");
            o1.a aVar = (o1.a) bVar;
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS `WorkName`");
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f3123j;
            List<g.b> list = workDatabase_Impl.mCallbacks;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.mCallbacks.get(i11));
                }
            }
        }

        @Override // androidx.room.h.a
        public void c(n1.b bVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f3123j;
            List<g.b> list = workDatabase_Impl.mCallbacks;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    WorkDatabase_Impl.this.mCallbacks.get(i11).a(bVar);
                }
            }
        }

        @Override // androidx.room.h.a
        public void d(n1.b bVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f3123j;
            workDatabase_Impl.mDatabase = bVar;
            ((o1.a) bVar).f33870c.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            List<g.b> list = WorkDatabase_Impl.this.mCallbacks;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    WorkDatabase_Impl.this.mCallbacks.get(i11).b(bVar);
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
        public androidx.room.h.b g(n1.b bVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new d.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            hashSet.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new d.C0333d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new d.C0333d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            d dVar = new d("Dependency", map, hashSet, hashSet2);
            d dVarA = d.a(bVar, "Dependency");
            if (!dVar.equals(dVarA)) {
                return new androidx.room.h.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + dVarA);
            }
            HashMap map2 = new HashMap(25);
            map2.put(FacebookMediationAdapter.KEY_ID, new d.a(FacebookMediationAdapter.KEY_ID, "TEXT", true, 1, null, 1));
            map2.put("state", new d.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new d.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new d.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new d.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new d.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new d.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new d.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new d.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new d.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new d.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new d.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new d.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new d.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new d.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new d.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new d.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new d.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new d.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new d.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new d.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new d.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new d.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new d.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new d.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new d.C0333d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new d.C0333d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            d dVar2 = new d("WorkSpec", map2, hashSet3, hashSet4);
            d dVarA2 = d.a(bVar, "WorkSpec");
            if (!dVar2.equals(dVarA2)) {
                return new androidx.room.h.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + dVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new d.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new d.C0333d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            d dVar3 = new d("WorkTag", map3, hashSet5, hashSet6);
            d dVarA3 = d.a(bVar, "WorkTag");
            if (!dVar3.equals(dVarA3)) {
                return new androidx.room.h.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + dVarA3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new d.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            d dVar4 = new d("SystemIdInfo", map4, hashSet7, new HashSet(0));
            d dVarA4 = d.a(bVar, "SystemIdInfo");
            if (!dVar4.equals(dVarA4)) {
                return new androidx.room.h.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + dVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new d.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new d.C0333d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            d dVar5 = new d("WorkName", map5, hashSet8, hashSet9);
            d dVarA5 = d.a(bVar, "WorkName");
            if (!dVar5.equals(dVarA5)) {
                return new androidx.room.h.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + dVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new d.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            d dVar6 = new d("WorkProgress", map6, hashSet10, new HashSet(0));
            d dVarA6 = d.a(bVar, "WorkProgress");
            if (!dVar6.equals(dVarA6)) {
                return new androidx.room.h.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + dVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put(Action.KEY_ATTRIBUTE, new d.a(Action.KEY_ATTRIBUTE, "TEXT", true, 1, null, 1));
            map7.put("long_value", new d.a("long_value", "INTEGER", false, 0, null, 1));
            d dVar7 = new d("Preference", map7, new HashSet(0), new HashSet(0));
            d dVarA7 = d.a(bVar, "Preference");
            if (dVar7.equals(dVarA7)) {
                return new androidx.room.h.b(true, null);
            }
            return new androidx.room.h.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + dVarA7);
        }
    }

    @Override // androidx.room.g
    public androidx.room.d e() {
        return new androidx.room.d(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.g
    public n1.d f(androidx.room.a aVar) {
        androidx.room.h hVar = new androidx.room.h(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = aVar.f2807b;
        String str = aVar.f2808c;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return aVar.f2806a.a(new n1.d.b(context, str, hVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public b q() {
        b bVar;
        if (this.f3125d != null) {
            return this.f3125d;
        }
        synchronized (this) {
            if (this.f3125d == null) {
                this.f3125d = new c(this);
            }
            bVar = this.f3125d;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e r() {
        e eVar;
        if (this.f3130i != null) {
            return this.f3130i;
        }
        synchronized (this) {
            if (this.f3130i == null) {
                this.f3130i = new f(this);
            }
            eVar = this.f3130i;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h s() {
        h hVar;
        if (this.f3127f != null) {
            return this.f3127f;
        }
        synchronized (this) {
            if (this.f3127f == null) {
                this.f3127f = new i(this);
            }
            hVar = this.f3127f;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k t() {
        k kVar;
        if (this.f3128g != null) {
            return this.f3128g;
        }
        synchronized (this) {
            if (this.f3128g == null) {
                this.f3128g = new l(this);
            }
            kVar = this.f3128g;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public n u() {
        n nVar;
        if (this.f3129h != null) {
            return this.f3129h;
        }
        synchronized (this) {
            if (this.f3129h == null) {
                this.f3129h = new o(this);
            }
            nVar = this.f3129h;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q v() {
        q qVar;
        if (this.f3124c != null) {
            return this.f3124c;
        }
        synchronized (this) {
            if (this.f3124c == null) {
                this.f3124c = new r(this);
            }
            qVar = this.f3124c;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t w() {
        t tVar;
        if (this.f3126e != null) {
            return this.f3126e;
        }
        synchronized (this) {
            if (this.f3126e == null) {
                this.f3126e = new u(this);
            }
            tVar = this.f3126e;
        }
        return tVar;
    }
}
