package y1;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class i extends androidx.room.g.b {
    @Override // androidx.room.g.b
    public void b(n1.b bVar) {
        ((o1.a) bVar).f33870c.beginTransaction();
        try {
            int i10 = WorkDatabase.f3122b;
            ((o1.a) bVar).f33870c.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f3121a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ((o1.a) bVar).f33870c.setTransactionSuccessful();
        } finally {
            ((o1.a) bVar).f33870c.endTransaction();
        }
    }
}
