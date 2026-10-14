package va;

import fd.j0;
import java.util.List;
import kc.t;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    public static final class a extends l implements uc.l<String, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f36780c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public CharSequence invoke(String str) {
            String str2 = str;
            j0.i(str2, "it");
            return str2;
        }
    }

    public final String booleanToString(boolean z10) {
        return z10 ? "true" : "false";
    }

    public final long calculateDuration(long j10, long j11) {
        if (j11 == 0 || j10 == 0) {
            return 0L;
        }
        return j10 - j11;
    }

    public final String listToCsv(List<String> list) {
        j0.i(list, "list");
        return t.w(list, null, null, null, 0, null, a.f36780c, 31);
    }
}
