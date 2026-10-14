package g2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.g f29771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.b<s> f29772b;

    public class a extends j1.b<s> {
        public a(u uVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, s sVar) {
            s sVar2 = sVar;
            String str = sVar2.f29769a;
            if (str == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, str);
            }
            String str2 = sVar2.f29770b;
            o1.e eVar = (o1.e) gVar;
            if (str2 == null) {
                eVar.f33885c.bindNull(2);
            } else {
                eVar.f33885c.bindString(2, str2);
            }
        }
    }

    public u(androidx.room.g gVar) {
        this.f29771a = gVar;
        this.f29772b = new a(this, gVar);
    }

    public List<String> a(String str) {
        j1.f fVarC = j1.f.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29771a.b();
        Cursor cursorC = l1.b.c(this.f29771a, fVarC, false, null);
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
}
