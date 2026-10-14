package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k1.a f3132a = new C0048a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k1.a f3133b = new b(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k1.a f3134c = new c(4, 5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k1.a f3135d = new d(6, 7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static k1.a f3136e = new e(7, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static k1.a f3137f = new f(8, 9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static k1.a f3138g = new g(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    public class C0048a extends k1.a {
        public C0048a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            o1.a aVar = (o1.a) bVar;
            aVar.f33870c.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.f33870c.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aVar.f33870c.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class b extends k1.a {
        public b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    public class c extends k1.a {
        public c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ((o1.a) bVar).f33870c.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    public class d extends k1.a {
        public d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class e extends k1.a {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    public class f extends k1.a {
        public f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class g extends k1.a {
        public g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends k1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3139a;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f3139a = context;
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            if (this.endVersion >= 10) {
                ((o1.a) bVar).f33870c.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f3139a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class i extends k1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3140a;

        public i(Context context) {
            super(9, 10);
            this.f3140a = context;
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            ((o1.a) bVar).f33870c.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f3140a.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                o1.a aVar = (o1.a) bVar;
                aVar.f33870c.beginTransaction();
                try {
                    ((o1.a) bVar).f33870c.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                    ((o1.a) bVar).f33870c.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                    sharedPreferences.edit().clear().apply();
                    ((o1.a) bVar).f33870c.setTransactionSuccessful();
                    aVar.f33870c.endTransaction();
                } catch (Throwable th) {
                    aVar.f33870c.endTransaction();
                    throw th;
                }
            }
            SharedPreferences sharedPreferences2 = this.f3140a.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                o1.a aVar2 = (o1.a) bVar;
                aVar2.f33870c.beginTransaction();
                try {
                    ((o1.a) bVar).f33870c.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                    ((o1.a) bVar).f33870c.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                    sharedPreferences2.edit().clear().apply();
                    ((o1.a) bVar).f33870c.setTransactionSuccessful();
                } finally {
                    aVar2.f33870c.endTransaction();
                }
            }
        }
    }
}
