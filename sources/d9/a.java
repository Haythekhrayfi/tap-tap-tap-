package d9;

import b9.o;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f28905a;

    public a(b bVar) {
        j0.i(bVar, "histogramReporterDelegate");
        this.f28905a = bVar;
    }

    public static void a(a aVar, String str, long j10, String str2, String str3, o oVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            Objects.requireNonNull(o.f3394v1);
            oVar = o.a.f3396b;
        }
        Objects.requireNonNull(aVar);
        j0.i(oVar, "filter");
        if (oVar.e(null)) {
            aVar.f28905a.a(str, j10, str3);
        }
        if (str2 == null) {
            return;
        }
        String str4 = str2 + CoreConstants.DOT + str;
        if (oVar.e(str2)) {
            aVar.f28905a.a(str4, j10, str3);
        }
    }
}
