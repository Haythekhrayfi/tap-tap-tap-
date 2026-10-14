package w6;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.database.AppDatabase;
import fd.j0;
import fd.z;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends vc.l implements uc.l<ae.a, AppDatabase> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.a f37123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fe.a aVar) {
        super(1);
        this.f37123c = aVar;
    }

    @Override // uc.l
    public AppDatabase invoke(ae.a aVar) {
        AppDatabase appDatabase;
        j0.i(aVar, "it");
        AppDatabase.a aVar2 = AppDatabase.Companion;
        Context contextC = z.c(this.f37123c);
        Objects.requireNonNull(aVar2);
        j0.i(contextC, CoreConstants.CONTEXT_SCOPE_VALUE);
        synchronized (aVar2) {
            appDatabase = AppDatabase.INSTANCE;
            if (appDatabase == null) {
                androidx.room.g.a aVarA = androidx.room.f.a(contextC.getApplicationContext(), AppDatabase.class, "app.db");
                aVarA.a(s6.a.a());
                aVarA.a(s6.a.b());
                aVarA.a(s6.a.c());
                com.inscode.autoclicker.database.a aVar3 = new com.inscode.autoclicker.database.a();
                if (aVarA.f2864d == null) {
                    aVarA.f2864d = new ArrayList<>();
                }
                aVarA.f2864d.add(aVar3);
                androidx.room.g gVarB = aVarA.b();
                AppDatabase.INSTANCE = (AppDatabase) gVarB;
                appDatabase = (AppDatabase) gVarB;
            }
        }
        return appDatabase;
    }
}
