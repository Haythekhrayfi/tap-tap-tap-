package g2;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.g f29731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.b<j> f29732b;

    public class a extends j1.b<j> {
        public a(l lVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.f29729a;
            if (str == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, str);
            }
            String str2 = jVar2.f29730b;
            o1.e eVar = (o1.e) gVar;
            if (str2 == null) {
                eVar.f33885c.bindNull(2);
            } else {
                eVar.f33885c.bindString(2, str2);
            }
        }
    }

    public l(androidx.room.g gVar) {
        this.f29731a = gVar;
        this.f29732b = new a(this, gVar);
    }
}
