package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g2.g;
import g2.h;
import g2.i;
import g2.k;
import g2.l;
import g2.p;
import g2.q;
import g2.r;
import g2.t;
import g2.u;
import g2.v;
import j1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l1.b;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3222a = m.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (p pVar : list) {
            g gVarA = ((i) hVar).a(pVar.f29740a);
            Integer numValueOf = gVarA != null ? Integer.valueOf(gVarA.f29725b) : null;
            String str = pVar.f29740a;
            l lVar = (l) kVar;
            Objects.requireNonNull(lVar);
            f fVarC = f.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                fVarC.g(1);
            } else {
                fVarC.h(1, str);
            }
            lVar.f29731a.b();
            Cursor cursorC = b.c(lVar.f29731a, fVarC, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    arrayList.add(cursorC.getString(0));
                }
                cursorC.close();
                fVarC.release();
                sb2.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f29740a, pVar.f29742c, numValueOf, pVar.f29741b.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((u) tVar).a(pVar.f29740a))));
            } catch (Throwable th) {
                cursorC.close();
                fVarC.release();
                throw th;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() throws Throwable {
        f fVar;
        h hVar;
        k kVar;
        t tVar;
        int i10;
        WorkDatabase workDatabase = y1.k.c(getApplicationContext()).f38010c;
        q qVarV = workDatabase.v();
        k kVarT = workDatabase.t();
        t tVarW = workDatabase.w();
        h hVarS = workDatabase.s();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        r rVar = (r) qVarV;
        Objects.requireNonNull(rVar);
        f fVarC = f.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        fVarC.e(1, jCurrentTimeMillis);
        rVar.f29760a.b();
        Cursor cursorC = b.c(rVar.f29760a, fVarC, false, null);
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
                    pVar.f29744e = c.a(cursorC.getBlob(iK13));
                    int i17 = i11;
                    pVar.f29745f = c.a(cursorC.getBlob(i17));
                    i11 = i17;
                    int i18 = iK12;
                    int i19 = iK15;
                    pVar.f29746g = cursorC.getLong(i19);
                    int i20 = iK13;
                    int i21 = iK16;
                    pVar.f29747h = cursorC.getLong(i21);
                    int i22 = iK10;
                    int i23 = iK17;
                    pVar.f29748i = cursorC.getLong(i23);
                    int i24 = iK18;
                    pVar.f29750k = cursorC.getInt(i24);
                    int i25 = iK19;
                    pVar.f29751l = v.b(cursorC.getInt(i25));
                    iK17 = i23;
                    int i26 = iK20;
                    pVar.f29752m = cursorC.getLong(i26);
                    int i27 = iK21;
                    pVar.f29753n = cursorC.getLong(i27);
                    iK21 = i27;
                    int i28 = iK22;
                    pVar.f29754o = cursorC.getLong(i28);
                    int i29 = iK23;
                    pVar.f29755p = cursorC.getLong(i29);
                    int i30 = iK24;
                    pVar.f29756q = cursorC.getInt(i30) != 0;
                    int i31 = iK25;
                    pVar.f29757r = v.d(cursorC.getInt(i31));
                    pVar.f29749j = bVar;
                    arrayList.add(pVar);
                    iK25 = i31;
                    iK13 = i20;
                    iK2 = i15;
                    iK16 = i21;
                    iK18 = i24;
                    iK23 = i29;
                    iK11 = i13;
                    iK24 = i30;
                    iK22 = i28;
                    iK15 = i19;
                    iK12 = i18;
                    iK9 = i12;
                    iK3 = i16;
                    iK = i14;
                    iK20 = i26;
                    iK10 = i22;
                    iK19 = i25;
                }
                cursorC.close();
                fVar.release();
                r rVar2 = (r) qVarV;
                List<p> listD = rVar2.d();
                List<p> listB = rVar2.b(200);
                if (arrayList.isEmpty()) {
                    hVar = hVarS;
                    kVar = kVarT;
                    tVar = tVarW;
                    i10 = 0;
                } else {
                    m mVarC = m.c();
                    String str = f3222a;
                    i10 = 0;
                    mVarC.d(str, "Recently completed work:\n\n", new Throwable[0]);
                    hVar = hVarS;
                    kVar = kVarT;
                    tVar = tVarW;
                    m.c().d(str, a(kVar, tVar, hVar, arrayList), new Throwable[0]);
                }
                if (!((ArrayList) listD).isEmpty()) {
                    m mVarC2 = m.c();
                    String str2 = f3222a;
                    mVarC2.d(str2, "Running work:\n\n", new Throwable[i10]);
                    m.c().d(str2, a(kVar, tVar, hVar, listD), new Throwable[i10]);
                }
                if (!((ArrayList) listB).isEmpty()) {
                    m mVarC3 = m.c();
                    String str3 = f3222a;
                    mVarC3.d(str3, "Enqueued work:\n\n", new Throwable[i10]);
                    m.c().d(str3, a(kVar, tVar, hVar, listB), new Throwable[i10]);
                }
                return new ListenableWorker.a.c();
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
}
