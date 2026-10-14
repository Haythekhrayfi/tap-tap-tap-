package g2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.g f29718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.b<g2.a> f29719b;

    public class a extends j1.b<g2.a> {
        public a(c cVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, g2.a aVar) {
            g2.a aVar2 = aVar;
            String str = aVar2.f29716a;
            if (str == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, str);
            }
            String str2 = aVar2.f29717b;
            o1.e eVar = (o1.e) gVar;
            if (str2 == null) {
                eVar.f33885c.bindNull(2);
            } else {
                eVar.f33885c.bindString(2, str2);
            }
        }
    }

    public c(androidx.room.g gVar) {
        this.f29718a = gVar;
        this.f29719b = new a(this, gVar);
    }

    public List<String> a(String str) {
        j1.f fVarC = j1.f.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29718a.b();
        Cursor cursorC = l1.b.c(this.f29718a, fVarC, false, null);
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

    public boolean b(String str) {
        j1.f fVarC = j1.f.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29718a.b();
        boolean z10 = false;
        Cursor cursorC = l1.b.c(this.f29718a, fVarC, false, null);
        try {
            if (cursorC.moveToFirst()) {
                z10 = cursorC.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorC.close();
            fVarC.release();
        }
    }
}
