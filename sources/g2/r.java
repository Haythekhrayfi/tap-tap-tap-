package g2;

import android.database.Cursor;
import android.os.Build;
import ch.qos.logback.classic.spi.CallerData;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.g f29760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.b<p> f29761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.g f29762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1.g f29763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j1.g f29764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1.g f29765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1.g f29766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1.g f29767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1.g f29768i;

    public class a extends j1.b<p> {
        public a(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Code duplicated, block: B:87:0x0219  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, p pVar) throws Throwable {
            int i10;
            int i11;
            Throwable th;
            ObjectOutputStream objectOutputStream;
            p pVar2 = pVar;
            String str = pVar2.f29740a;
            int i12 = 1;
            if (str == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, str);
            }
            o1.e eVar = (o1.e) gVar;
            eVar.f33885c.bindLong(2, v.f(pVar2.f29741b));
            String str2 = pVar2.f29742c;
            if (str2 == null) {
                eVar.f33885c.bindNull(3);
            } else {
                eVar.f33885c.bindString(3, str2);
            }
            String str3 = pVar2.f29743d;
            if (str3 == null) {
                eVar.f33885c.bindNull(4);
            } else {
                eVar.f33885c.bindString(4, str3);
            }
            byte[] bArrC = androidx.work.c.c(pVar2.f29744e);
            if (bArrC == null) {
                eVar.f33885c.bindNull(5);
            } else {
                eVar.f33885c.bindBlob(5, bArrC);
            }
            byte[] bArrC2 = androidx.work.c.c(pVar2.f29745f);
            if (bArrC2 == null) {
                eVar.f33885c.bindNull(6);
            } else {
                eVar.f33885c.bindBlob(6, bArrC2);
            }
            eVar.f33885c.bindLong(7, pVar2.f29746g);
            eVar.f33885c.bindLong(8, pVar2.f29747h);
            eVar.f33885c.bindLong(9, pVar2.f29748i);
            eVar.f33885c.bindLong(10, pVar2.f29750k);
            androidx.work.a aVar = pVar2.f29751l;
            int i13 = v.a.f29774b[aVar.ordinal()];
            if (i13 == 1) {
                i10 = 0;
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException("Could not convert " + aVar + " to int");
                }
                i10 = 1;
            }
            eVar.f33885c.bindLong(11, i10);
            eVar.f33885c.bindLong(12, pVar2.f29752m);
            eVar.f33885c.bindLong(13, pVar2.f29753n);
            eVar.f33885c.bindLong(14, pVar2.f29754o);
            eVar.f33885c.bindLong(15, pVar2.f29755p);
            eVar.f33885c.bindLong(16, pVar2.f29756q ? 1L : 0L);
            androidx.work.g gVar2 = pVar2.f29757r;
            int i14 = v.a.f29776d[gVar2.ordinal()];
            if (i14 == 1) {
                i11 = 0;
            } else {
                if (i14 != 2) {
                    throw new IllegalArgumentException("Could not convert " + gVar2 + " to int");
                }
                i11 = 1;
            }
            eVar.f33885c.bindLong(17, i11);
            x1.b bVar = pVar2.f29749j;
            if (bVar != null) {
                androidx.work.f fVar = bVar.f37380a;
                int i15 = v.a.f29775c[fVar.ordinal()];
                if (i15 == 1) {
                    i12 = 0;
                } else if (i15 != 2) {
                    if (i15 == 3) {
                        i12 = 2;
                    } else if (i15 == 4) {
                        i12 = 3;
                    } else if (i15 == 5) {
                        i12 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || fVar != androidx.work.f.TEMPORARILY_UNMETERED) {
                            throw new IllegalArgumentException("Could not convert " + fVar + " to int");
                        }
                        i12 = 5;
                    }
                }
                eVar.f33885c.bindLong(18, i12);
                eVar.f33885c.bindLong(19, bVar.f37381b ? 1L : 0L);
                eVar.f33885c.bindLong(20, bVar.f37382c ? 1L : 0L);
                eVar.f33885c.bindLong(21, bVar.f37383d ? 1L : 0L);
                eVar.f33885c.bindLong(22, bVar.f37384e ? 1L : 0L);
                eVar.f33885c.bindLong(23, bVar.f37385f);
                eVar.f33885c.bindLong(24, bVar.f37386g);
                x1.c cVar = bVar.f37387h;
                byte[] byteArray = null;
                objectOutputStream = null;
                ObjectOutputStream objectOutputStream2 = null;
                if (cVar.a() != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    try {
                                        objectOutputStream.writeInt(cVar.a());
                                        for (x1.c.a aVar2 : cVar.f37396a) {
                                            objectOutputStream.writeUTF(aVar2.f37397a.toString());
                                            objectOutputStream.writeBoolean(aVar2.f37398b);
                                        }
                                        objectOutputStream.close();
                                    } catch (IOException e10) {
                                        e = e10;
                                        objectOutputStream2 = objectOutputStream;
                                        e.printStackTrace();
                                        if (objectOutputStream2 != null) {
                                            objectOutputStream2.close();
                                        }
                                        byteArrayOutputStream.close();
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        if (byteArray != null) {
                                            eVar.f33885c.bindBlob(25, byteArray);
                                            return;
                                        }
                                        eVar.f33885c.bindNull(25);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (objectOutputStream != null) {
                                            try {
                                                objectOutputStream.close();
                                            } catch (IOException e11) {
                                                e11.printStackTrace();
                                            }
                                        }
                                        try {
                                            byteArrayOutputStream.close();
                                            throw th;
                                        } catch (IOException e12) {
                                            e12.printStackTrace();
                                            throw th;
                                        }
                                    }
                                    byteArrayOutputStream.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                }
                            } catch (IOException e14) {
                                e = e14;
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (Throwable th3) {
                            th = th3;
                            objectOutputStream = objectOutputStream2;
                        }
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                if (byteArray != null) {
                    eVar.f33885c.bindBlob(25, byteArray);
                    return;
                }
            } else {
                eVar.f33885c.bindNull(18);
                eVar.f33885c.bindNull(19);
                eVar.f33885c.bindNull(20);
                eVar.f33885c.bindNull(21);
                eVar.f33885c.bindNull(22);
                eVar.f33885c.bindNull(23);
                eVar.f33885c.bindNull(24);
            }
            eVar.f33885c.bindNull(25);
        }
    }

    public class b extends j1.g {
        public b(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class c extends j1.g {
        public c(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class d extends j1.g {
        public d(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class e extends j1.g {
        public e(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class f extends j1.g {
        public f(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class g extends j1.g {
        public g(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class h extends j1.g {
        public h(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class i extends j1.g {
        public i(r rVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.g gVar) {
        this.f29760a = gVar;
        this.f29761b = new a(this, gVar);
        this.f29762c = new b(this, gVar);
        this.f29763d = new c(this, gVar);
        this.f29764e = new d(this, gVar);
        this.f29765f = new e(this, gVar);
        this.f29766g = new f(this, gVar);
        this.f29767h = new g(this, gVar);
        this.f29768i = new h(this, gVar);
        new i(this, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(String str) {
        this.f29760a.b();
        n1.g gVarA = this.f29762c.a();
        if (str == null) {
            ((o1.e) gVarA).f33885c.bindNull(1);
        } else {
            ((o1.e) gVarA).f33885c.bindString(1, str);
        }
        this.f29760a.c();
        try {
            o1.f fVar = (o1.f) gVarA;
            fVar.a();
            this.f29760a.p();
            this.f29760a.g();
            this.f29762c.c(fVar);
        } catch (Throwable th) {
            this.f29760a.g();
            this.f29762c.c(gVarA);
            throw th;
        }
    }

    public List<p> b(int i10) throws Throwable {
        j1.f fVar;
        j1.f fVarC = j1.f.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        fVarC.e(1, i10);
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            int iK = androidx.activity.i.k(cursorC, "required_network_type");
            int iK2 = androidx.activity.i.k(cursorC, "requires_charging");
            int iK3 = androidx.activity.i.k(cursorC, "requires_device_idle");
            int iK4 = androidx.activity.i.k(cursorC, "requires_battery_not_low");
            int iK5 = androidx.activity.i.k(cursorC, "requires_storage_not_low");
            int iK6 = androidx.activity.i.k(cursorC, "trigger_content_update_delay");
            int iK7 = androidx.activity.i.k(cursorC, "trigger_max_content_delay");
            int iK8 = androidx.activity.i.k(cursorC, "content_uri_triggers");
            int iK9 = androidx.activity.i.k(cursorC, FacebookMediationAdapter.KEY_ID);
            int iK10 = androidx.activity.i.k(cursorC, "state");
            int iK11 = androidx.activity.i.k(cursorC, "worker_class_name");
            int iK12 = androidx.activity.i.k(cursorC, "input_merger_class_name");
            int iK13 = androidx.activity.i.k(cursorC, "input");
            int iK14 = androidx.activity.i.k(cursorC, "output");
            fVar = fVarC;
            try {
                int iK15 = androidx.activity.i.k(cursorC, "initial_delay");
                int iK16 = androidx.activity.i.k(cursorC, "interval_duration");
                int iK17 = androidx.activity.i.k(cursorC, "flex_duration");
                int iK18 = androidx.activity.i.k(cursorC, "run_attempt_count");
                int iK19 = androidx.activity.i.k(cursorC, "backoff_policy");
                int iK20 = androidx.activity.i.k(cursorC, "backoff_delay_duration");
                int iK21 = androidx.activity.i.k(cursorC, "period_start_time");
                int iK22 = androidx.activity.i.k(cursorC, "minimum_retention_duration");
                int iK23 = androidx.activity.i.k(cursorC, "schedule_requested_at");
                int iK24 = androidx.activity.i.k(cursorC, "run_in_foreground");
                int iK25 = androidx.activity.i.k(cursorC, "out_of_quota_policy");
                int i11 = iK14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iK9);
                    int i12 = iK9;
                    String string2 = cursorC.getString(iK11);
                    int i13 = iK11;
                    x1.b bVar = new x1.b();
                    int i14 = iK;
                    bVar.f37380a = v.c(cursorC.getInt(iK));
                    bVar.f37381b = cursorC.getInt(iK2) != 0;
                    bVar.f37382c = cursorC.getInt(iK3) != 0;
                    bVar.f37383d = cursorC.getInt(iK4) != 0;
                    bVar.f37384e = cursorC.getInt(iK5) != 0;
                    int i15 = iK2;
                    int i16 = iK3;
                    bVar.f37385f = cursorC.getLong(iK6);
                    bVar.f37386g = cursorC.getLong(iK7);
                    bVar.f37387h = v.a(cursorC.getBlob(iK8));
                    p pVar = new p(string, string2);
                    pVar.f29741b = v.e(cursorC.getInt(iK10));
                    pVar.f29743d = cursorC.getString(iK12);
                    pVar.f29744e = androidx.work.c.a(cursorC.getBlob(iK13));
                    int i17 = i11;
                    pVar.f29745f = androidx.work.c.a(cursorC.getBlob(i17));
                    i11 = i17;
                    int i18 = iK15;
                    pVar.f29746g = cursorC.getLong(i18);
                    int i19 = iK12;
                    int i20 = iK16;
                    pVar.f29747h = cursorC.getLong(i20);
                    int i21 = iK4;
                    int i22 = iK17;
                    pVar.f29748i = cursorC.getLong(i22);
                    int i23 = iK18;
                    pVar.f29750k = cursorC.getInt(i23);
                    int i24 = iK19;
                    pVar.f29751l = v.b(cursorC.getInt(i24));
                    iK17 = i22;
                    int i25 = iK20;
                    pVar.f29752m = cursorC.getLong(i25);
                    int i26 = iK21;
                    pVar.f29753n = cursorC.getLong(i26);
                    iK21 = i26;
                    int i27 = iK22;
                    pVar.f29754o = cursorC.getLong(i27);
                    int i28 = iK23;
                    pVar.f29755p = cursorC.getLong(i28);
                    int i29 = iK24;
                    pVar.f29756q = cursorC.getInt(i29) != 0;
                    int i30 = iK25;
                    pVar.f29757r = v.d(cursorC.getInt(i30));
                    pVar.f29749j = bVar;
                    arrayList.add(pVar);
                    iK25 = i30;
                    iK2 = i15;
                    iK12 = i19;
                    iK15 = i18;
                    iK16 = i20;
                    iK18 = i23;
                    iK23 = i28;
                    iK9 = i12;
                    iK11 = i13;
                    iK = i14;
                    iK24 = i29;
                    iK22 = i27;
                    iK3 = i16;
                    iK20 = i25;
                    iK4 = i21;
                    iK19 = i24;
                }
                cursorC.close();
                fVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                fVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fVar = fVarC;
        }
    }

    public List<p> c(int i10) throws Throwable {
        j1.f fVar;
        j1.f fVarC = j1.f.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        fVarC.e(1, i10);
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            int iK = androidx.activity.i.k(cursorC, "required_network_type");
            int iK2 = androidx.activity.i.k(cursorC, "requires_charging");
            int iK3 = androidx.activity.i.k(cursorC, "requires_device_idle");
            int iK4 = androidx.activity.i.k(cursorC, "requires_battery_not_low");
            int iK5 = androidx.activity.i.k(cursorC, "requires_storage_not_low");
            int iK6 = androidx.activity.i.k(cursorC, "trigger_content_update_delay");
            int iK7 = androidx.activity.i.k(cursorC, "trigger_max_content_delay");
            int iK8 = androidx.activity.i.k(cursorC, "content_uri_triggers");
            int iK9 = androidx.activity.i.k(cursorC, FacebookMediationAdapter.KEY_ID);
            int iK10 = androidx.activity.i.k(cursorC, "state");
            int iK11 = androidx.activity.i.k(cursorC, "worker_class_name");
            int iK12 = androidx.activity.i.k(cursorC, "input_merger_class_name");
            int iK13 = androidx.activity.i.k(cursorC, "input");
            int iK14 = androidx.activity.i.k(cursorC, "output");
            fVar = fVarC;
            try {
                int iK15 = androidx.activity.i.k(cursorC, "initial_delay");
                int iK16 = androidx.activity.i.k(cursorC, "interval_duration");
                int iK17 = androidx.activity.i.k(cursorC, "flex_duration");
                int iK18 = androidx.activity.i.k(cursorC, "run_attempt_count");
                int iK19 = androidx.activity.i.k(cursorC, "backoff_policy");
                int iK20 = androidx.activity.i.k(cursorC, "backoff_delay_duration");
                int iK21 = androidx.activity.i.k(cursorC, "period_start_time");
                int iK22 = androidx.activity.i.k(cursorC, "minimum_retention_duration");
                int iK23 = androidx.activity.i.k(cursorC, "schedule_requested_at");
                int iK24 = androidx.activity.i.k(cursorC, "run_in_foreground");
                int iK25 = androidx.activity.i.k(cursorC, "out_of_quota_policy");
                int i11 = iK14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iK9);
                    int i12 = iK9;
                    String string2 = cursorC.getString(iK11);
                    int i13 = iK11;
                    x1.b bVar = new x1.b();
                    int i14 = iK;
                    bVar.f37380a = v.c(cursorC.getInt(iK));
                    bVar.f37381b = cursorC.getInt(iK2) != 0;
                    bVar.f37382c = cursorC.getInt(iK3) != 0;
                    bVar.f37383d = cursorC.getInt(iK4) != 0;
                    bVar.f37384e = cursorC.getInt(iK5) != 0;
                    int i15 = iK2;
                    int i16 = iK3;
                    bVar.f37385f = cursorC.getLong(iK6);
                    bVar.f37386g = cursorC.getLong(iK7);
                    bVar.f37387h = v.a(cursorC.getBlob(iK8));
                    p pVar = new p(string, string2);
                    pVar.f29741b = v.e(cursorC.getInt(iK10));
                    pVar.f29743d = cursorC.getString(iK12);
                    pVar.f29744e = androidx.work.c.a(cursorC.getBlob(iK13));
                    int i17 = i11;
                    pVar.f29745f = androidx.work.c.a(cursorC.getBlob(i17));
                    i11 = i17;
                    int i18 = iK15;
                    pVar.f29746g = cursorC.getLong(i18);
                    int i19 = iK12;
                    int i20 = iK16;
                    pVar.f29747h = cursorC.getLong(i20);
                    int i21 = iK4;
                    int i22 = iK17;
                    pVar.f29748i = cursorC.getLong(i22);
                    int i23 = iK18;
                    pVar.f29750k = cursorC.getInt(i23);
                    int i24 = iK19;
                    pVar.f29751l = v.b(cursorC.getInt(i24));
                    iK17 = i22;
                    int i25 = iK20;
                    pVar.f29752m = cursorC.getLong(i25);
                    int i26 = iK21;
                    pVar.f29753n = cursorC.getLong(i26);
                    iK21 = i26;
                    int i27 = iK22;
                    pVar.f29754o = cursorC.getLong(i27);
                    int i28 = iK23;
                    pVar.f29755p = cursorC.getLong(i28);
                    int i29 = iK24;
                    pVar.f29756q = cursorC.getInt(i29) != 0;
                    int i30 = iK25;
                    pVar.f29757r = v.d(cursorC.getInt(i30));
                    pVar.f29749j = bVar;
                    arrayList.add(pVar);
                    iK25 = i30;
                    iK2 = i15;
                    iK12 = i19;
                    iK15 = i18;
                    iK16 = i20;
                    iK18 = i23;
                    iK23 = i28;
                    iK9 = i12;
                    iK11 = i13;
                    iK = i14;
                    iK24 = i29;
                    iK22 = i27;
                    iK3 = i16;
                    iK20 = i25;
                    iK4 = i21;
                    iK19 = i24;
                }
                cursorC.close();
                fVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                fVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fVar = fVarC;
        }
    }

    public List<p> d() throws Throwable {
        j1.f fVar;
        j1.f fVarC = j1.f.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            int iK = androidx.activity.i.k(cursorC, "required_network_type");
            int iK2 = androidx.activity.i.k(cursorC, "requires_charging");
            int iK3 = androidx.activity.i.k(cursorC, "requires_device_idle");
            int iK4 = androidx.activity.i.k(cursorC, "requires_battery_not_low");
            int iK5 = androidx.activity.i.k(cursorC, "requires_storage_not_low");
            int iK6 = androidx.activity.i.k(cursorC, "trigger_content_update_delay");
            int iK7 = androidx.activity.i.k(cursorC, "trigger_max_content_delay");
            int iK8 = androidx.activity.i.k(cursorC, "content_uri_triggers");
            int iK9 = androidx.activity.i.k(cursorC, FacebookMediationAdapter.KEY_ID);
            int iK10 = androidx.activity.i.k(cursorC, "state");
            int iK11 = androidx.activity.i.k(cursorC, "worker_class_name");
            int iK12 = androidx.activity.i.k(cursorC, "input_merger_class_name");
            int iK13 = androidx.activity.i.k(cursorC, "input");
            int iK14 = androidx.activity.i.k(cursorC, "output");
            fVar = fVarC;
            try {
                int iK15 = androidx.activity.i.k(cursorC, "initial_delay");
                int iK16 = androidx.activity.i.k(cursorC, "interval_duration");
                int iK17 = androidx.activity.i.k(cursorC, "flex_duration");
                int iK18 = androidx.activity.i.k(cursorC, "run_attempt_count");
                int iK19 = androidx.activity.i.k(cursorC, "backoff_policy");
                int iK20 = androidx.activity.i.k(cursorC, "backoff_delay_duration");
                int iK21 = androidx.activity.i.k(cursorC, "period_start_time");
                int iK22 = androidx.activity.i.k(cursorC, "minimum_retention_duration");
                int iK23 = androidx.activity.i.k(cursorC, "schedule_requested_at");
                int iK24 = androidx.activity.i.k(cursorC, "run_in_foreground");
                int iK25 = androidx.activity.i.k(cursorC, "out_of_quota_policy");
                int i10 = iK14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iK9);
                    int i11 = iK9;
                    String string2 = cursorC.getString(iK11);
                    int i12 = iK11;
                    x1.b bVar = new x1.b();
                    int i13 = iK;
                    bVar.f37380a = v.c(cursorC.getInt(iK));
                    bVar.f37381b = cursorC.getInt(iK2) != 0;
                    bVar.f37382c = cursorC.getInt(iK3) != 0;
                    bVar.f37383d = cursorC.getInt(iK4) != 0;
                    bVar.f37384e = cursorC.getInt(iK5) != 0;
                    int i14 = iK2;
                    int i15 = iK3;
                    bVar.f37385f = cursorC.getLong(iK6);
                    bVar.f37386g = cursorC.getLong(iK7);
                    bVar.f37387h = v.a(cursorC.getBlob(iK8));
                    p pVar = new p(string, string2);
                    pVar.f29741b = v.e(cursorC.getInt(iK10));
                    pVar.f29743d = cursorC.getString(iK12);
                    pVar.f29744e = androidx.work.c.a(cursorC.getBlob(iK13));
                    int i16 = i10;
                    pVar.f29745f = androidx.work.c.a(cursorC.getBlob(i16));
                    i10 = i16;
                    int i17 = iK15;
                    pVar.f29746g = cursorC.getLong(i17);
                    int i18 = iK13;
                    int i19 = iK16;
                    pVar.f29747h = cursorC.getLong(i19);
                    int i20 = iK4;
                    int i21 = iK17;
                    pVar.f29748i = cursorC.getLong(i21);
                    int i22 = iK18;
                    pVar.f29750k = cursorC.getInt(i22);
                    int i23 = iK19;
                    pVar.f29751l = v.b(cursorC.getInt(i23));
                    iK17 = i21;
                    int i24 = iK20;
                    pVar.f29752m = cursorC.getLong(i24);
                    int i25 = iK21;
                    pVar.f29753n = cursorC.getLong(i25);
                    iK21 = i25;
                    int i26 = iK22;
                    pVar.f29754o = cursorC.getLong(i26);
                    int i27 = iK23;
                    pVar.f29755p = cursorC.getLong(i27);
                    int i28 = iK24;
                    pVar.f29756q = cursorC.getInt(i28) != 0;
                    int i29 = iK25;
                    pVar.f29757r = v.d(cursorC.getInt(i29));
                    pVar.f29749j = bVar;
                    arrayList.add(pVar);
                    iK25 = i29;
                    iK2 = i14;
                    iK13 = i18;
                    iK15 = i17;
                    iK16 = i19;
                    iK18 = i22;
                    iK23 = i27;
                    iK9 = i11;
                    iK11 = i12;
                    iK = i13;
                    iK24 = i28;
                    iK22 = i26;
                    iK3 = i15;
                    iK20 = i24;
                    iK4 = i20;
                    iK19 = i23;
                }
                cursorC.close();
                fVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                fVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fVar = fVarC;
        }
    }

    public List<p> e() {
        j1.f fVar;
        j1.f fVarC = j1.f.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            int iK = androidx.activity.i.k(cursorC, "required_network_type");
            int iK2 = androidx.activity.i.k(cursorC, "requires_charging");
            int iK3 = androidx.activity.i.k(cursorC, "requires_device_idle");
            int iK4 = androidx.activity.i.k(cursorC, "requires_battery_not_low");
            int iK5 = androidx.activity.i.k(cursorC, "requires_storage_not_low");
            int iK6 = androidx.activity.i.k(cursorC, "trigger_content_update_delay");
            int iK7 = androidx.activity.i.k(cursorC, "trigger_max_content_delay");
            int iK8 = androidx.activity.i.k(cursorC, "content_uri_triggers");
            int iK9 = androidx.activity.i.k(cursorC, FacebookMediationAdapter.KEY_ID);
            int iK10 = androidx.activity.i.k(cursorC, "state");
            int iK11 = androidx.activity.i.k(cursorC, "worker_class_name");
            int iK12 = androidx.activity.i.k(cursorC, "input_merger_class_name");
            int iK13 = androidx.activity.i.k(cursorC, "input");
            int iK14 = androidx.activity.i.k(cursorC, "output");
            fVar = fVarC;
            try {
                int iK15 = androidx.activity.i.k(cursorC, "initial_delay");
                int iK16 = androidx.activity.i.k(cursorC, "interval_duration");
                int iK17 = androidx.activity.i.k(cursorC, "flex_duration");
                int iK18 = androidx.activity.i.k(cursorC, "run_attempt_count");
                int iK19 = androidx.activity.i.k(cursorC, "backoff_policy");
                int iK20 = androidx.activity.i.k(cursorC, "backoff_delay_duration");
                int iK21 = androidx.activity.i.k(cursorC, "period_start_time");
                int iK22 = androidx.activity.i.k(cursorC, "minimum_retention_duration");
                int iK23 = androidx.activity.i.k(cursorC, "schedule_requested_at");
                int iK24 = androidx.activity.i.k(cursorC, "run_in_foreground");
                int iK25 = androidx.activity.i.k(cursorC, "out_of_quota_policy");
                int i10 = iK14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iK9);
                    int i11 = iK9;
                    String string2 = cursorC.getString(iK11);
                    int i12 = iK11;
                    x1.b bVar = new x1.b();
                    int i13 = iK;
                    bVar.f37380a = v.c(cursorC.getInt(iK));
                    bVar.f37381b = cursorC.getInt(iK2) != 0;
                    bVar.f37382c = cursorC.getInt(iK3) != 0;
                    bVar.f37383d = cursorC.getInt(iK4) != 0;
                    bVar.f37384e = cursorC.getInt(iK5) != 0;
                    int i14 = iK2;
                    int i15 = iK3;
                    bVar.f37385f = cursorC.getLong(iK6);
                    bVar.f37386g = cursorC.getLong(iK7);
                    bVar.f37387h = v.a(cursorC.getBlob(iK8));
                    p pVar = new p(string, string2);
                    pVar.f29741b = v.e(cursorC.getInt(iK10));
                    pVar.f29743d = cursorC.getString(iK12);
                    pVar.f29744e = androidx.work.c.a(cursorC.getBlob(iK13));
                    int i16 = i10;
                    pVar.f29745f = androidx.work.c.a(cursorC.getBlob(i16));
                    i10 = i16;
                    int i17 = iK15;
                    pVar.f29746g = cursorC.getLong(i17);
                    int i18 = iK13;
                    int i19 = iK16;
                    pVar.f29747h = cursorC.getLong(i19);
                    int i20 = iK4;
                    int i21 = iK17;
                    pVar.f29748i = cursorC.getLong(i21);
                    int i22 = iK18;
                    pVar.f29750k = cursorC.getInt(i22);
                    int i23 = iK19;
                    pVar.f29751l = v.b(cursorC.getInt(i23));
                    iK17 = i21;
                    int i24 = iK20;
                    pVar.f29752m = cursorC.getLong(i24);
                    int i25 = iK21;
                    pVar.f29753n = cursorC.getLong(i25);
                    iK21 = i25;
                    int i26 = iK22;
                    pVar.f29754o = cursorC.getLong(i26);
                    int i27 = iK23;
                    pVar.f29755p = cursorC.getLong(i27);
                    int i28 = iK24;
                    pVar.f29756q = cursorC.getInt(i28) != 0;
                    int i29 = iK25;
                    pVar.f29757r = v.d(cursorC.getInt(i29));
                    pVar.f29749j = bVar;
                    arrayList.add(pVar);
                    iK25 = i29;
                    iK2 = i14;
                    iK13 = i18;
                    iK15 = i17;
                    iK16 = i19;
                    iK18 = i22;
                    iK23 = i27;
                    iK9 = i11;
                    iK11 = i12;
                    iK = i13;
                    iK24 = i28;
                    iK22 = i26;
                    iK3 = i15;
                    iK20 = i24;
                    iK4 = i20;
                    iK19 = i23;
                }
                cursorC.close();
                fVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                fVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fVar = fVarC;
        }
    }

    public androidx.work.h f(String str) {
        j1.f fVarC = j1.f.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            return cursorC.moveToFirst() ? v.e(cursorC.getInt(0)) : null;
        } finally {
            cursorC.close();
            fVarC.release();
        }
    }

    public List<String> g(String str) {
        j1.f fVarC = j1.f.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(cursorC.getString(0));
            }
            cursorC.close();
            fVarC.release();
            return arrayList;
        } catch (Throwable th) {
            cursorC.close();
            fVarC.release();
            throw th;
        }
    }

    public List<String> h(String str) {
        j1.f fVarC = j1.f.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(cursorC.getString(0));
            }
            cursorC.close();
            fVarC.release();
            return arrayList;
        } catch (Throwable th) {
            cursorC.close();
            fVarC.release();
            throw th;
        }
    }

    public p i(String str) {
        j1.f fVar;
        p pVar;
        j1.f fVarC = j1.f.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            int iK = androidx.activity.i.k(cursorC, "required_network_type");
            int iK2 = androidx.activity.i.k(cursorC, "requires_charging");
            int iK3 = androidx.activity.i.k(cursorC, "requires_device_idle");
            int iK4 = androidx.activity.i.k(cursorC, "requires_battery_not_low");
            int iK5 = androidx.activity.i.k(cursorC, "requires_storage_not_low");
            int iK6 = androidx.activity.i.k(cursorC, "trigger_content_update_delay");
            int iK7 = androidx.activity.i.k(cursorC, "trigger_max_content_delay");
            int iK8 = androidx.activity.i.k(cursorC, "content_uri_triggers");
            int iK9 = androidx.activity.i.k(cursorC, FacebookMediationAdapter.KEY_ID);
            int iK10 = androidx.activity.i.k(cursorC, "state");
            int iK11 = androidx.activity.i.k(cursorC, "worker_class_name");
            int iK12 = androidx.activity.i.k(cursorC, "input_merger_class_name");
            int iK13 = androidx.activity.i.k(cursorC, "input");
            int iK14 = androidx.activity.i.k(cursorC, "output");
            fVar = fVarC;
            try {
                int iK15 = androidx.activity.i.k(cursorC, "initial_delay");
                int iK16 = androidx.activity.i.k(cursorC, "interval_duration");
                int iK17 = androidx.activity.i.k(cursorC, "flex_duration");
                int iK18 = androidx.activity.i.k(cursorC, "run_attempt_count");
                int iK19 = androidx.activity.i.k(cursorC, "backoff_policy");
                int iK20 = androidx.activity.i.k(cursorC, "backoff_delay_duration");
                int iK21 = androidx.activity.i.k(cursorC, "period_start_time");
                int iK22 = androidx.activity.i.k(cursorC, "minimum_retention_duration");
                int iK23 = androidx.activity.i.k(cursorC, "schedule_requested_at");
                int iK24 = androidx.activity.i.k(cursorC, "run_in_foreground");
                int iK25 = androidx.activity.i.k(cursorC, "out_of_quota_policy");
                if (cursorC.moveToFirst()) {
                    String string = cursorC.getString(iK9);
                    String string2 = cursorC.getString(iK11);
                    x1.b bVar = new x1.b();
                    bVar.f37380a = v.c(cursorC.getInt(iK));
                    bVar.f37381b = cursorC.getInt(iK2) != 0;
                    bVar.f37382c = cursorC.getInt(iK3) != 0;
                    bVar.f37383d = cursorC.getInt(iK4) != 0;
                    bVar.f37384e = cursorC.getInt(iK5) != 0;
                    bVar.f37385f = cursorC.getLong(iK6);
                    bVar.f37386g = cursorC.getLong(iK7);
                    bVar.f37387h = v.a(cursorC.getBlob(iK8));
                    p pVar2 = new p(string, string2);
                    pVar2.f29741b = v.e(cursorC.getInt(iK10));
                    pVar2.f29743d = cursorC.getString(iK12);
                    pVar2.f29744e = androidx.work.c.a(cursorC.getBlob(iK13));
                    pVar2.f29745f = androidx.work.c.a(cursorC.getBlob(iK14));
                    pVar2.f29746g = cursorC.getLong(iK15);
                    pVar2.f29747h = cursorC.getLong(iK16);
                    pVar2.f29748i = cursorC.getLong(iK17);
                    pVar2.f29750k = cursorC.getInt(iK18);
                    pVar2.f29751l = v.b(cursorC.getInt(iK19));
                    pVar2.f29752m = cursorC.getLong(iK20);
                    pVar2.f29753n = cursorC.getLong(iK21);
                    pVar2.f29754o = cursorC.getLong(iK22);
                    pVar2.f29755p = cursorC.getLong(iK23);
                    pVar2.f29756q = cursorC.getInt(iK24) != 0;
                    pVar2.f29757r = v.d(cursorC.getInt(iK25));
                    pVar2.f29749j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                cursorC.close();
                fVar.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                fVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fVar = fVarC;
        }
    }

    public List<p.a> j(String str) {
        j1.f fVarC = j1.f.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29760a.b();
        Cursor cursorC = l1.b.c(this.f29760a, fVarC, false, null);
        try {
            int iK = androidx.activity.i.k(cursorC, FacebookMediationAdapter.KEY_ID);
            int iK2 = androidx.activity.i.k(cursorC, "state");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                p.a aVar = new p.a();
                aVar.f29758a = cursorC.getString(iK);
                aVar.f29759b = v.e(cursorC.getInt(iK2));
                arrayList.add(aVar);
            }
            cursorC.close();
            fVarC.release();
            return arrayList;
        } catch (Throwable th) {
            cursorC.close();
            fVarC.release();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public int k(String str) {
        this.f29760a.b();
        n1.g gVarA = this.f29765f.a();
        if (str == null) {
            ((o1.e) gVarA).f33885c.bindNull(1);
        } else {
            ((o1.e) gVarA).f33885c.bindString(1, str);
        }
        this.f29760a.c();
        try {
            o1.f fVar = (o1.f) gVarA;
            int iA = fVar.a();
            this.f29760a.p();
            this.f29760a.g();
            this.f29765f.c(fVar);
            return iA;
        } catch (Throwable th) {
            this.f29760a.g();
            this.f29765f.c(gVarA);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public int l(String str, long j10) {
        this.f29760a.b();
        n1.g gVarA = this.f29767h.a();
        ((o1.e) gVarA).f33885c.bindLong(1, j10);
        if (str == null) {
            ((o1.e) gVarA).f33885c.bindNull(2);
        } else {
            ((o1.e) gVarA).f33885c.bindString(2, str);
        }
        this.f29760a.c();
        try {
            int iA = ((o1.f) gVarA).a();
            this.f29760a.p();
            return iA;
        } finally {
            this.f29760a.g();
            this.f29767h.c(gVarA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public int m(String str) {
        this.f29760a.b();
        n1.g gVarA = this.f29766g.a();
        if (str == null) {
            ((o1.e) gVarA).f33885c.bindNull(1);
        } else {
            ((o1.e) gVarA).f33885c.bindString(1, str);
        }
        this.f29760a.c();
        try {
            o1.f fVar = (o1.f) gVarA;
            int iA = fVar.a();
            this.f29760a.p();
            this.f29760a.g();
            this.f29766g.c(fVar);
            return iA;
        } catch (Throwable th) {
            this.f29760a.g();
            this.f29766g.c(gVarA);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void n(String str, androidx.work.c cVar) throws Throwable {
        this.f29760a.b();
        n1.g gVarA = this.f29763d.a();
        byte[] bArrC = androidx.work.c.c(cVar);
        if (bArrC == null) {
            ((o1.e) gVarA).f33885c.bindNull(1);
        } else {
            ((o1.e) gVarA).f33885c.bindBlob(1, bArrC);
        }
        if (str == null) {
            ((o1.e) gVarA).f33885c.bindNull(2);
        } else {
            ((o1.e) gVarA).f33885c.bindString(2, str);
        }
        this.f29760a.c();
        try {
            o1.f fVar = (o1.f) gVarA;
            fVar.a();
            this.f29760a.p();
            this.f29760a.g();
            this.f29763d.c(fVar);
        } catch (Throwable th) {
            this.f29760a.g();
            this.f29763d.c(gVarA);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void o(String str, long j10) {
        this.f29760a.b();
        n1.g gVarA = this.f29764e.a();
        ((o1.e) gVarA).f33885c.bindLong(1, j10);
        if (str == null) {
            ((o1.e) gVarA).f33885c.bindNull(2);
        } else {
            ((o1.e) gVarA).f33885c.bindString(2, str);
        }
        this.f29760a.c();
        try {
            ((o1.f) gVarA).a();
            this.f29760a.p();
        } finally {
            this.f29760a.g();
            this.f29764e.c(gVarA);
        }
    }

    public int p(androidx.work.h hVar, String... strArr) {
        this.f29760a.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE workspec SET state=");
        sb2.append(CallerData.NA);
        sb2.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(CallerData.NA);
            if (i10 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        Closeable closeableD = this.f29760a.d(sb2.toString());
        long jF = v.f(hVar);
        o1.e eVar = (o1.e) closeableD;
        eVar.f33885c.bindLong(1, jF);
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                eVar.f33885c.bindNull(i11);
            } else {
                eVar.f33885c.bindString(i11, str);
            }
            i11++;
        }
        this.f29760a.c();
        try {
            int iA = ((o1.f) closeableD).a();
            this.f29760a.p();
            return iA;
        } finally {
            this.f29760a.g();
        }
    }
}
