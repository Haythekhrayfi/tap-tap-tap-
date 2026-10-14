package s6;

import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final k1.a MIGRATION_5_6 = new C0411a();
    private static final k1.a MIGRATION_6_7 = new b();
    private static final k1.a MIGRATION_7_8 = new c();

    /* JADX INFO: renamed from: s6.a$a, reason: collision with other inner class name */
    public static final class C0411a extends k1.a {
        public C0411a() {
            super(5, 6);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            j0.i(bVar, "database");
            ((o1.a) bVar).f33870c.execSQL("ALTER TABLE manual_settings ADD COLUMN oneFingerMode INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static final class b extends k1.a {
        public b() {
            super(6, 7);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            j0.i(bVar, "database");
            ((o1.a) bVar).f33870c.execSQL("ALTER TABLE record_settings ADD COLUMN playbackSpeed REAL NOT NULL DEFAULT 1");
        }
    }

    public static final class c extends k1.a {
        public c() {
            super(7, 8);
        }

        @Override // k1.a
        public void a(n1.b bVar) {
            j0.i(bVar, "database");
            ((o1.a) bVar).f33870c.execSQL("CREATE TABLE IF NOT EXISTS `combine_settings` (`name` TEXT NOT NULL, `recordings` TEXT NOT NULL, `updated` INTEGER NOT NULL, `timeBetweenRepeat` INTEGER NOT NULL, `orientation` INTEGER NOT NULL, `repeatCount` INTEGER NOT NULL, PRIMARY KEY(`name`))");
        }
    }

    public static final k1.a a() {
        return MIGRATION_5_6;
    }

    public static final k1.a b() {
        return MIGRATION_6_7;
    }

    public static final k1.a c() {
        return MIGRATION_7_8;
    }
}
